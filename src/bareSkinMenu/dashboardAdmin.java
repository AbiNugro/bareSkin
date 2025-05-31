/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bareSkinMenu;

import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import config.koneksi;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;
import java.time.LocalDate;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;





public class dashboardAdmin extends javax.swing.JPanel {
    
    public dashboardAdmin() {
        
        initComponents();
        tampilStokMenipis();
        tampilItemTerlaris();
        tampilProdukExpiring();
        loadKeuangan();
        
        initComboBox();
        // Pasang listener
        cbJenisGrafik.setModel(new DefaultComboBoxModel<>(new String[]{"Line Chart", "Bar Chart", "Area Chart"}));
        cbJenisGrafik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateChart();
            }
        });
        cbBulan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateChart();
            }
        });
        cbMinggu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateChart();
            }
        });
        // Tampilkan chart pertama kali
        updateChart();
    }

    private void initComboBox() {
        // Inisialisasi bulan
        cbBulan.removeAllItems();
        String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni",
                          "Juli","Agustus","September","Oktober","November","Desember"};
        for (String b : bulan) {
            cbBulan.addItem(b);
        }
        // Inisialisasi minggu
        cbMinggu.removeAllItems();
        for (int i = 1; i <= 5; i++) {
            cbMinggu.addItem("Minggu ke-" + i);
        }
    }
    
    private void updateChart() {
    int bulanIndex = cbBulan.getSelectedIndex() + 1;
        int mingguKe = cbMinggu.getSelectedIndex() + 1;

        LocalDate awalBulan = LocalDate.of(LocalDate.now().getYear(), bulanIndex, 1);
        LocalDate mingguAwal = awalBulan.plusDays((mingguKe - 1) * 7);
        LocalDate mingguAkhir = mingguAwal.plusDays(6);

        String chartType = (String) cbJenisGrafik.getSelectedItem();
        String[] hariList = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        Map<String, Integer> pendapatanMap = new LinkedHashMap<>();
        Map<String, Integer> pengeluaranMap = new LinkedHashMap<>();
        Map<String, Integer> keuntunganMap = new LinkedHashMap<>();

        for (String hari : hariList) {
            pendapatanMap.put(hari, 0);
            pengeluaranMap.put(hari, 0);
            keuntunganMap.put(hari, 0);
        }

        try {
            Connection conn = koneksi.getConnection();

            String sqlPendapatan =
                "SELECT CASE DAYOFWEEK(tgl_penjualan) " +
                "WHEN 1 THEN 'Minggu' WHEN 2 THEN 'Senin' WHEN 3 THEN 'Selasa' " +
                "WHEN 4 THEN 'Rabu' WHEN 5 THEN 'Kamis' WHEN 6 THEN 'Jumat' WHEN 7 THEN 'Sabtu' END AS hari, " +
                "SUM(total_harga) AS total " +
                "FROM transaksi_penjualan " +
                "WHERE DATE(tgl_penjualan) BETWEEN ? AND ? " +
                "GROUP BY hari";
            PreparedStatement stmtPendapatan = conn.prepareStatement(sqlPendapatan);
            stmtPendapatan.setDate(1, java.sql.Date.valueOf(mingguAwal));
            stmtPendapatan.setDate(2, java.sql.Date.valueOf(mingguAkhir));
            ResultSet rsPendapatan = stmtPendapatan.executeQuery();
            while (rsPendapatan.next()) {
                String hari = rsPendapatan.getString("hari");
                int total = rsPendapatan.getInt("total");
                pendapatanMap.put(hari, total);
            }

            String sqlPengeluaran =
                "SELECT CASE DAYOFWEEK(tgl_pembelian) " +
                "WHEN 1 THEN 'Minggu' WHEN 2 THEN 'Senin' WHEN 3 THEN 'Selasa' " +
                "WHEN 4 THEN 'Rabu' WHEN 5 THEN 'Kamis' WHEN 6 THEN 'Jumat' WHEN 7 THEN 'Sabtu' END AS hari, " +
                "SUM(total_harga_pembelian) AS total " +
                "FROM transaksi_pembelian " +
                "WHERE DATE(tgl_pembelian) BETWEEN ? AND ? " +
                "GROUP BY hari";
            PreparedStatement stmtPengeluaran = conn.prepareStatement(sqlPengeluaran);
            stmtPengeluaran.setDate(1, java.sql.Date.valueOf(mingguAwal));
            stmtPengeluaran.setDate(2, java.sql.Date.valueOf(mingguAkhir));
            ResultSet rsPengeluaran = stmtPengeluaran.executeQuery();
            while (rsPengeluaran.next()) {
                String hari = rsPengeluaran.getString("hari");
                int total = rsPengeluaran.getInt("total");
                pengeluaranMap.put(hari, total);
            }

            for (String hari : hariList) {
                int pendapatan = pendapatanMap.getOrDefault(hari, 0);
                int pengeluaran = pengeluaranMap.getOrDefault(hari, 0);
                int keuntungan = Math.max(0, pendapatan - pengeluaran);
                keuntunganMap.put(hari, keuntungan);
            }

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (String hari : hariList) {
                dataset.addValue(pendapatanMap.get(hari), "Pendapatan", hari);
                dataset.addValue(pengeluaranMap.get(hari), "Pengeluaran", hari);
                dataset.addValue(keuntunganMap.get(hari), "Keuntungan", hari);
            }

            JFreeChart chart;
            switch (chartType) {
                case "Bar Chart":
                    chart = ChartFactory.createBarChart("Laporan Mingguan", "Hari", "Jumlah Rp.", dataset, PlotOrientation.VERTICAL, true, true, false);
                    break;
                case "Line Chart":
                    chart = ChartFactory.createLineChart("Laporan Mingguan", "Hari", "Jumlah (Rp 500.000)", dataset, PlotOrientation.VERTICAL, true, true, false);
                    break;
                default:
                    chart = ChartFactory.createAreaChart("Laporan Mingguan", "Hari", "Jumlah (Rp 500.000)", dataset, PlotOrientation.VERTICAL, true, true, false);
                    break;
            }

            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            if (chartType.equals("Area Chart")) {
                AreaRenderer renderer = new AreaRenderer();
                renderer.setSeriesPaint(0, Color.decode("#4B164C")); // Pendapatan - ungu
                renderer.setSeriesPaint(1, Color.decode("#FF66FF")); // Pengeluaran - pink
                renderer.setSeriesPaint(2, Color.decode("#F8E7F6")); // Keuntungan - putih
                plot.setRenderer(renderer);
            } else if (chartType.equals("Bar Chart")) {
                BarRenderer renderer = new BarRenderer();
                renderer.setSeriesPaint(0, Color.decode("#4B164C"));
                renderer.setSeriesPaint(1, Color.decode("#FF66FF"));
                renderer.setSeriesPaint(2, Color.decode("#F8E7F6"));
                plot.setRenderer(renderer);
            } else if (chartType.equals("Line Chart")) {
                LineAndShapeRenderer renderer = new LineAndShapeRenderer();
                renderer.setSeriesPaint(0, Color.decode("#4B164C"));
                renderer.setSeriesPaint(1, Color.decode("#FF66FF"));
                renderer.setSeriesPaint(2, Color.decode("#F8E7F6"));
                plot.setRenderer(renderer);
            }
            
            // CUSTOM WARNA YEAHG
            chart.setBackgroundPaint(Color.WHITE); // latar belakang chart
            plot.setBackgroundPaint(Color.WHITE);  // latar belakang area plot
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY); // garis grid vertikal
            plot.setRangeGridlinePaint(Color.LIGHT_GRAY);  // garis grid horizontal

            // Set font dan gaya judul
            chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, 16));
            chart.getTitle().setPaint(Color.decode("#4B164C")); // Ungu gelap

            // Pertegas garis sumbu X dan Y
            plot.getDomainAxis().setAxisLinePaint(Color.DARK_GRAY);
            plot.getRangeAxis().setAxisLinePaint(Color.DARK_GRAY);
            plot.getDomainAxis().setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
            plot.getRangeAxis().setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
            plot.getDomainAxis().setLabelFont(new Font("SansSerif", Font.BOLD, 13));
            plot.getRangeAxis().setLabelFont(new Font("SansSerif", Font.BOLD, 13));

            // Optional: Hilangkan outline bar agar tidak terlalu tajam
            if (chartType.equals("Bar Chart")) {
                BarRenderer renderer = (BarRenderer) plot.getRenderer();
                renderer.setDrawBarOutline(false); // hilangkan garis tepi bar
            }

            // Optional: Aktifkan garis halus pada Line Chart
            if (chartType.equals("Line Chart")) {
                LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
                renderer.setBaseShapesVisible(true); // titik pada line
                renderer.setBaseShapesFilled(true);
            }


            NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
            rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
            rangeAxis.setTickUnit(new NumberTickUnit(500_000));
            rangeAxis.setNumberFormatOverride(NumberFormat.getNumberInstance(new Locale("id", "ID")));
            rangeAxis.setLabel("Jumlah (Rp)");
            


            panelChart.removeAll();
            panelChart.setLayout(new BorderLayout());
            panelChart.add(new ChartPanel(chart), BorderLayout.CENTER);
            panelChart.revalidate();
            panelChart.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat grafik: " + e.getMessage());
        }
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        panelCustom1 = new custom.PanelCustom();
        panel1 = new custom.PanelCustom();
        panelPendapatan = new custom.PanelCustom();
        lblPendapatan = new javax.swing.JLabel();
        rp = new javax.swing.JLabel();
        nominalPendapatan = new javax.swing.JLabel();
        panelPengeluaran = new custom.PanelCustom();
        lblPengeluaran = new javax.swing.JLabel();
        nominalPengeluaran = new javax.swing.JLabel();
        rp2 = new javax.swing.JLabel();
        panelKeuntungan = new custom.PanelCustom();
        lblKeuntungan = new javax.swing.JLabel();
        nominalKeuntungan = new javax.swing.JLabel();
        rp3 = new javax.swing.JLabel();
        panel2 = new custom.PanelCustom();
        panelExpired = new custom.PanelCustom();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblExp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelGRAFIK = new custom.PanelCustom();
        jLabel3 = new javax.swing.JLabel();
        cbBulan = new javax.swing.JComboBox<>();
        cbMinggu = new javax.swing.JComboBox<>();
        panelChart = new javax.swing.JPanel();
        cbJenisGrafik = new javax.swing.JComboBox<>();
        panelStokMenipis = new custom.PanelCustom();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStokMenipis = new javax.swing.JTable();
        panelItemTerlaris = new custom.PanelCustom();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemTerlaris = new javax.swing.JTable();
        panelCustom2 = new custom.PanelCustom();
        tNamaMenu = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(248, 231, 246));
        panelView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopRight(20);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(75, 22, 76));
        panel1.setRoundBottomLeft(30);
        panel1.setRoundBottomRight(30);
        panel1.setRoundTopLeft(30);
        panel1.setRoundTopRight(30);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPendapatan.setBackground(new java.awt.Color(255, 255, 255));
        panelPendapatan.setRoundBottomLeft(30);
        panelPendapatan.setRoundBottomRight(30);
        panelPendapatan.setRoundTopLeft(30);
        panelPendapatan.setRoundTopRight(30);
        panelPendapatan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPendapatan.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblPendapatan.setText("Pendapatan");
        panelPendapatan.add(lblPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        rp.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        rp.setText("Rp. ");
        panelPendapatan.add(rp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        nominalPendapatan.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        nominalPendapatan.setText("Nominal");
        panelPendapatan.add(nominalPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 70, 220, -1));

        panel1.add(panelPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 130));

        panelPengeluaran.setBackground(new java.awt.Color(255, 255, 255));
        panelPengeluaran.setRoundBottomLeft(30);
        panelPengeluaran.setRoundBottomRight(30);
        panelPengeluaran.setRoundTopLeft(30);
        panelPengeluaran.setRoundTopRight(30);
        panelPengeluaran.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPengeluaran.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblPengeluaran.setText("Pengeluaran");
        panelPengeluaran.add(lblPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        nominalPengeluaran.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        nominalPengeluaran.setText("Nominal");
        panelPengeluaran.add(nominalPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, -1));

        rp2.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        rp2.setText("Rp. ");
        panelPengeluaran.add(rp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        panel1.add(panelPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 310, 130));

        panelKeuntungan.setBackground(new java.awt.Color(255, 255, 255));
        panelKeuntungan.setRoundBottomLeft(30);
        panelKeuntungan.setRoundBottomRight(30);
        panelKeuntungan.setRoundTopLeft(30);
        panelKeuntungan.setRoundTopRight(30);
        panelKeuntungan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKeuntungan.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblKeuntungan.setText("Keuntungan");
        panelKeuntungan.add(lblKeuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        nominalKeuntungan.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        nominalKeuntungan.setText("Nominal");
        panelKeuntungan.add(nominalKeuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, -1));

        rp3.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        rp3.setText("Rp. ");
        panelKeuntungan.add(rp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        panel1.add(panelKeuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 310, 130));

        panelCustom1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1100, 170));

        panel2.setBackground(new java.awt.Color(75, 22, 76));
        panel2.setRoundBottomLeft(30);
        panel2.setRoundBottomRight(30);
        panel2.setRoundTopLeft(30);
        panel2.setRoundTopRight(30);
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelExpired.setBackground(new java.awt.Color(255, 255, 255));
        panelExpired.setRoundBottomLeft(20);
        panelExpired.setRoundBottomRight(20);
        panelExpired.setRoundTopLeft(20);
        panelExpired.setRoundTopRight(20);
        panelExpired.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblExp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Produk", "Tanggal Expired"
            }
        ));
        jScrollPane3.setViewportView(tblExp);

        panelExpired.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 330, 710));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 22, 76));
        jLabel1.setText("Produk Mendekati Expired");
        panelExpired.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        panel2.add(panelExpired, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 820));

        panelCustom1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 420, 870));

        panelGRAFIK.setBackground(new java.awt.Color(75, 22, 76));
        panelGRAFIK.setRoundBottomLeft(30);
        panelGRAFIK.setRoundBottomRight(30);
        panelGRAFIK.setRoundTopLeft(30);
        panelGRAFIK.setRoundTopRight(30);
        panelGRAFIK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grafik Keuangan");
        panelGRAFIK.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });
        panelGRAFIK.add(cbBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 100, 50));

        cbMinggu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelGRAFIK.add(cbMinggu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 100, 50));

        panelChart.setBackground(new java.awt.Color(255, 255, 255));
        panelChart.setLayout(new java.awt.BorderLayout());
        panelGRAFIK.add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 640, 570));

        cbJenisGrafik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelGRAFIK.add(cbJenisGrafik, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 100, 50));

        panelCustom1.add(panelGRAFIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 670, 660));

        panelStokMenipis.setBackground(new java.awt.Color(75, 22, 76));
        panelStokMenipis.setRoundBottomLeft(30);
        panelStokMenipis.setRoundBottomRight(30);
        panelStokMenipis.setRoundTopLeft(30);
        panelStokMenipis.setRoundTopRight(30);
        panelStokMenipis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Stok Menipis");
        panelStokMenipis.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        tblStokMenipis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Produk", "Sisa Stok", "Satuan"
            }
        ));
        jScrollPane2.setViewportView(tblStokMenipis);

        panelStokMenipis.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 190));

        panelCustom1.add(panelStokMenipis, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 400, 290));

        panelItemTerlaris.setBackground(new java.awt.Color(75, 22, 76));
        panelItemTerlaris.setRoundBottomLeft(30);
        panelItemTerlaris.setRoundBottomRight(30);
        panelItemTerlaris.setRoundTopLeft(30);
        panelItemTerlaris.setRoundTopRight(30);
        panelItemTerlaris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Terlaris");
        panelItemTerlaris.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        tblItemTerlaris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Item", "Satuan", "Terjual"
            }
        ));
        jScrollPane1.setViewportView(tblItemTerlaris);

        panelItemTerlaris.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 240));

        panelCustom1.add(panelItemTerlaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 400, 340));

        panelView.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1600, 940));

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tNamaMenu.setBackground(new java.awt.Color(245, 245, 245));
        tNamaMenu.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        tNamaMenu.setForeground(new java.awt.Color(75, 22, 76));
        tNamaMenu.setText("MENU DASHBOARD");
        panelCustom2.add(tNamaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        panelView.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1600, 70));

        panelMain.add(panelView, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBulanActionPerformed
    private void tampilStokMenipis() {
        String query = "SELECT nama_product, stok_product, satuan " +
                       "FROM product " +
                       "WHERE stok_product <= 10 " +
                       "ORDER BY stok_product ASC";

        try {
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblStokMenipis.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_product"),
                    rs.getInt("stok_product"),
                    rs.getString("satuan")
                });
            }
        } catch (SQLException e) {
            System.err.println("Error tampilStokMenipis: " + e.getMessage());
        }
    }
    
    private void tampilItemTerlaris() {
        String query = "SELECT p.nama_product, p.satuan, SUM(dtp.jumlah_beli) AS total_terjual " +
                       "FROM detail_transaksi_penjualan dtp " +
                       "JOIN product p ON dtp.id_product = p.id_product " +
                       "GROUP BY p.nama_product, p.satuan " +
                       "ORDER BY total_terjual DESC LIMIT 10";

        try {
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblItemTerlaris.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_product"),
                    rs.getString("satuan"),
                    rs.getInt("total_terjual")
                });
            }
        } catch (SQLException e) {
            System.err.println("Error tampilItemTerlaris: " + e.getMessage());
        }
    }
    
    private void tampilProdukExpiring() {
        String query = "SELECT nama_product, tgl_expired " +
                       "FROM product " +
                       "WHERE tgl_expired BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 1 YEAR) " +
                       "ORDER BY tgl_expired ASC";

        try {
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblExp.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_product"),
                    rs.getDate("tgl_expired")
                });
            }
        } catch (SQLException e) {
            System.err.println("Error tampilProdukExpiring: " + e.getMessage());
        }
    }
    
    private void loadKeuangan() {
    try {
        Connection con = config.koneksi.getConnection(); // koneksi shared
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

        // PENDAPATAN HARI INI
        String sqlPendapatan = "SELECT SUM(total_harga) AS total FROM transaksi_penjualan WHERE DATE(tgl_penjualan) = CURDATE()";
        PreparedStatement pst1 = con.prepareStatement(sqlPendapatan);
        ResultSet rs1 = pst1.executeQuery();
        if (rs1.next()) {
            double pendapatan = rs1.getDouble("total");
            nominalPendapatan.setText(formatRupiah.format(pendapatan));
        }

        // PENGELUARAN HARI INI
        String sqlPengeluaran = "SELECT SUM(total_harga_pembelian) AS total FROM transaksi_pembelian WHERE DATE(tgl_pembelian) = CURDATE()";
        PreparedStatement pst2 = con.prepareStatement(sqlPengeluaran);
        ResultSet rs2 = pst2.executeQuery();
        if (rs2.next()) {
            double pengeluaran = rs2.getDouble("total");
            nominalPengeluaran.setText(formatRupiah.format(pengeluaran));
        }

        // KEUNTUNGAN HARI INI
        String sqlKeuntungan = "SELECT SUM(untung) AS total FROM transaksi_penjualan WHERE DATE(tgl_penjualan) = CURDATE()";
        PreparedStatement pst3 = con.prepareStatement(sqlKeuntungan);
        ResultSet rs3 = pst3.executeQuery();
        if (rs3.next()) {
            double keuntungan = rs3.getDouble("total");
            nominalKeuntungan.setText(formatRupiah.format(keuntungan));
        }

        // Tutup statement dan resultset (koneksi tetap terbuka)
        rs1.close(); pst1.close();
        rs2.close(); pst2.close();
        rs3.close(); pst3.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal memuat data keuangan harian\n" + e.getMessage());
    }
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JComboBox<String> cbJenisGrafik;
    private javax.swing.JComboBox<String> cbMinggu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblKeuntungan;
    private javax.swing.JLabel lblPendapatan;
    private javax.swing.JLabel lblPengeluaran;
    private javax.swing.JLabel nominalKeuntungan;
    private javax.swing.JLabel nominalPendapatan;
    private javax.swing.JLabel nominalPengeluaran;
    private custom.PanelCustom panel1;
    private custom.PanelCustom panel2;
    private javax.swing.JPanel panelChart;
    private custom.PanelCustom panelCustom1;
    private custom.PanelCustom panelCustom2;
    private custom.PanelCustom panelExpired;
    private custom.PanelCustom panelGRAFIK;
    private custom.PanelCustom panelItemTerlaris;
    private custom.PanelCustom panelKeuntungan;
    private javax.swing.JPanel panelMain;
    private custom.PanelCustom panelPendapatan;
    private custom.PanelCustom panelPengeluaran;
    private custom.PanelCustom panelStokMenipis;
    private javax.swing.JPanel panelView;
    private javax.swing.JLabel rp;
    private javax.swing.JLabel rp2;
    private javax.swing.JLabel rp3;
    private javax.swing.JLabel tNamaMenu;
    private javax.swing.JTable tblExp;
    private javax.swing.JTable tblItemTerlaris;
    private javax.swing.JTable tblStokMenipis;
    // End of variables declaration//GEN-END:variables
}
