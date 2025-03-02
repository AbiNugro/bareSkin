/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menu;

import java.sql.PreparedStatement;
import java.sql.Connection;
import config.koneksi;
import custom.JTextFieldRounded;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import notification.Notification;

/**
 *
 * @author user
 */
public class menuLaporanVarian extends javax.swing.JPanel {

    /**
     * Creates new form menuBahan
     */
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 20;
    private int totalPages;
    
    private final Connection conn;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Date tanggalMulai;
    private Date tanggalAkhir;
    
    public menuLaporanVarian() {
        initComponents();
        
        conn = koneksi.getConnection();
        setTabelModel();
        paginationVarian();
        lb_halaman.setVisible(false);
        btn_first.setVisible(false);
        btn_before.setVisible(false);
        cbx_data.setVisible(false);
        btn_next.setVisible(false);
        btn_last.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser2 = new com.raven.datechooser.DateChooser();
        dateChooser3 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new custom.JTextFieldRounded();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        databahan1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_first = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        txtTanggalMulai = new custom.JTextFieldRounded();
        databahan2 = new javax.swing.JLabel();
        txtTanggalAkhir = new custom.JTextFieldRounded();
        databahan3 = new javax.swing.JLabel();
        btnCetak = new rojerusan.RSMaterialButtonRectangle();

        dateChooser2.setTextRefernce(txtTanggalMulai);

        dateChooser3.setTextRefernce(txtTanggalAkhir);

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pembelian", "Tgl Pembelian", "Nama Varian", "Jumlah", "Satuan", "Harga Beli", "Petugas"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btnAdd.setText("TAMPILKAN");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        databahan1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan1.setForeground(new java.awt.Color(102, 102, 102));
        databahan1.setText("Menu Laporan Pembelian Varian");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_first.setText("First Page");

        btn_before.setText("<");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20", "25", "30" }));

        btn_next.setText(">");

        btn_last.setText("Last Page");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        lb_halaman.setText("Halaman Of Total Halaman");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lb_halaman))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addGap(9, 9, 9)
                        .addComponent(btn_before)
                        .addGap(7, 7, 7)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btn_next)
                        .addGap(7, 7, 7)
                        .addComponent(btn_last)))
                .addGap(277, 277, 277))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_halaman)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_first)
                    .addComponent(btn_before)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(btn_last))
                .addContainerGap())
        );

        txtTanggalMulai.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalMulai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTanggalMulaiKeyTyped(evt);
            }
        });

        databahan2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        databahan2.setText("Tanggal Mulai");

        txtTanggalAkhir.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalAkhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTanggalAkhirKeyTyped(evt);
            }
        });

        databahan3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        databahan3.setText("Tanggal Sampai");

        btnCetak.setBackground(new java.awt.Color(0, 153, 153));
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(databahan1))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(databahan2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(databahan3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(databahan1)
                .addGap(28, 28, 28)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(databahan2)
                        .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(databahan3)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        panelMain.add(panelView, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
        // Format untuk input pengguna
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        // Mengambil tanggal dari text field
        String tanggalMulaiStr = txtTanggalMulai.getText();
        String tanggalAkhirStr = txtTanggalAkhir.getText();
        
        // Parsing tanggal dari format dd-MM-yyyy ke Date
        this.tanggalMulai = inputFormat.parse(tanggalMulaiStr);
        this.tanggalAkhir = inputFormat.parse(tanggalAkhirStr);
        
        // Validasi tanggal
        if (this.tanggalMulai.after(this.tanggalAkhir)) {
            JOptionPane.showMessageDialog(this, "Tanggal mulai tidak boleh lebih besar dari tanggal akhir.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        loadData();
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Format tanggal tidak valid. Harap masukkan dalam format dd-MM-yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked

        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lastActionPerformed

    private void txtTanggalMulaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTanggalMulaiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalMulaiKeyTyped

    private void txtTanggalAkhirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTanggalAkhirKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalAkhirKeyTyped

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
    try {
            String tanggalMulai = txtTanggalMulai.getText();
            String tanggalAkhir = txtTanggalAkhir.getText();
            String reportPath = "src/report/varianLaporan.jasper"; 
            
            // Validasi input
            if (tanggalMulai == null || tanggalAkhir == null || tanggalMulai.isEmpty() || tanggalAkhir.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong.");
                return;
            }

            // Parsing tanggal dari format "dd MMMM yyyy"
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date tglMulai = inputFormat.parse(tanggalMulai);
            Date tglAkhir = inputFormat.parse(tanggalAkhir);

            // Format tanggal ke "yyyy-MM-dd"
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedTanggalMulai = outputFormat.format(tglMulai);
            String formattedTanggalAkhir = outputFormat.format(tglAkhir);

            HashMap<String, Object> parameters = new HashMap<>();
            // Konversi ke java.sql.Date
            parameters.put("TanggalMulai", new java.sql.Date(tglMulai.getTime()));
            parameters.put("TanggalAkhir", new java.sql.Date(tglAkhir.getTime()));
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);

            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            viewer.setVisible(true);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Format tanggal salah! Gunakan format dd MMMM yyyy.");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        }


    }//GEN-LAST:event_btnCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnCetak;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan1;
    private javax.swing.JLabel databahan2;
    private javax.swing.JLabel databahan3;
    private com.raven.datechooser.DateChooser dateChooser2;
    private com.raven.datechooser.DateChooser dateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tblData;
    private custom.JTextFieldRounded txtSearch;
    private custom.JTextFieldRounded txtTanggalAkhir;
    private custom.JTextFieldRounded txtTanggalMulai;
    // End of variables declaration//GEN-END:variables
    
    
    private void paginationVarian() {
        btn_first.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = 1;
                loadData();
            }
            
        });
        
        btn_before.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni > 1)
                {
                    halamanSaatIni--;
                    loadData();
                }
            }
            
        });
        
        cbx_data.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPerHalaman = Integer.parseInt(cbx_data.getSelectedItem().toString());
                halamanSaatIni = 1;
                loadData();
            }
            
        });
        
        btn_next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni < totalPages) {
                    halamanSaatIni++;
                    loadData();
                }
            }
            
        });
        
        btn_last.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = totalPages;
                loadData();
            }
            
        });
    }
    
    private void calculateTotalPages(){
    int totalData = getTotalData(); // Ambil total data dari tabel
    totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }
    
    private int getTotalData(){
        int totalData = 0;
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Mengonversi tanggal ke format yang sesuai untuk database
        String tanggalMulaiStr = outputFormat.format(this.tanggalMulai);
        String tanggalAkhirStr = outputFormat.format(this.tanggalAkhir);
        try {
            String sql = "SELECT COUNT(*) AS total FROM pembelian_varian WHERE tgl_pembelian BETWEEN ? AND ?\n";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                                st.setDate(1, java.sql.Date.valueOf(tanggalMulaiStr));
                st.setDate(2, java.sql.Date.valueOf(tanggalAkhirStr));
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(menuLaporanVarian.class.getName()).log(Level.SEVERE,null, e);
        }
        return totalData;
    }
    
    private void loadData() {
    calculateTotalPages();
    int totalData = getTotalData();
    lb_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));
    
    int startIndex = (halamanSaatIni - 1) * dataPerHalaman; // Indeks awal untuk pagination
    getData(startIndex, dataPerHalaman, (DefaultTableModel) tblData.getModel());
}
    
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }
    
    

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
    model.setRowCount(0);
    
    try {
        // Format untuk output ke database
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Mengonversi tanggal ke format yang sesuai untuk database
        String tanggalMulaiStr = outputFormat.format(this.tanggalMulai);
        String tanggalAkhirStr = outputFormat.format(this.tanggalAkhir);
        
        String sql = "SELECT \n" +
                     "    pv.id_pembelian_varian,\n" +
                     "    pv.tgl_pembelian,\n" +
                     "    v.nama_varian,\n" +
                     "    dpv.jumlah,\n" +
                     "    dpv.satuan,\n" +
                     "    dpv.harga_beli,\n" +
                     "    u.nama AS petugas\n" +
                     "FROM detail_pembelian_varian dpv\n" +
                     "INNER JOIN pembelian_varian pv ON pv.id_pembelian_varian = dpv.id_pembelian_varian\n" +
                     "INNER JOIN varian v ON v.id_varian = dpv.id_varian\n" +
                     "INNER JOIN user u ON u.id_user = pv.id_user\n" +
                     "WHERE pv.tgl_pembelian BETWEEN ? AND ?\n" +
                     "ORDER BY pv.id_pembelian_varian ASC \n" +
                     "LIMIT ?,?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setDate(1, java.sql.Date.valueOf(tanggalMulaiStr));
            st.setDate(2, java.sql.Date.valueOf(tanggalAkhirStr));
            st.setInt(3, startIndex);
            st.setInt(4, entriesPage);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String idPembelianVarian = rs.getString("id_pembelian_varian");
                String tanggalPembelian = rs.getString("tgl_pembelian");
                String namaVarian = rs.getString("nama_varian");
                String jumlah = rs.getString("jumlah");
                String satuan = rs.getString("satuan");
                String hargaBeli = rs.getString("harga_beli");
                String namaPetugas = rs.getString("petugas");

                Object[] rowData = {idPembelianVarian, tanggalPembelian, namaVarian, jumlah, satuan, hargaBeli, namaPetugas};
                model.addRow(rowData);
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuLaporanVarian.class.getName()).log(Level.SEVERE, null, e);
    }
}


    private void searchData() {
    String kataKunci = txtSearch.getText().trim(); // Menghapus spasi di awal/akhir input

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0); // Menghapus data sebelumnya

    try {
        String sql = "SELECT \n" +
                     "    pv.id_pembelian_varian,\n" +
                     "    pv.tgl_pembelian,\n" +
                     "    v.nama_varian,\n" +
                     "    dpv.jumlah,\n" +
                     "    dpv.satuan,\n" +
                     "    dpv.harga_beli,\n" +
                     "    u.nama AS petugas\n" +
                     "FROM detail_pembelian_varian dpv\n" +
                     "INNER JOIN pembelian_varian pv ON pv.id_pembelian_varian = dpv.id_pembelian_varian\n" +
                     "INNER JOIN varian v ON v.id_varian = dpv.id_varian\n" +
                     "INNER JOIN user u ON u.id_user = pv.id_user\n" +
                     "WHERE pv.id_pembelian_varian LIKE ? OR pv.tgl_pembelian LIKE ? OR v.nama_bahan LIKE ? OR\n" +
                     "dpv.jumlah LIKE ? OR dpv.satuan LIKE ? OR dpv.harga_beli LIKE ? OR u.nama LIKE ?" +
                     "ORDER BY pv.id_pembelian_varian ASC";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter query untuk semua kolom
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            st.setString(3, "%" + kataKunci + "%");
            st.setString(4, "%" + kataKunci + "%");
            st.setString(5, "%" + kataKunci + "%");
            st.setString(6, "%" + kataKunci + "%");
            st.setString(7, "%" + kataKunci + "%");

            ResultSet rs = st.executeQuery();

            if (!rs.isBeforeFirst()) { // Cek jika tidak ada hasil
                JOptionPane.showMessageDialog(this, "Tidak ada data yang ditemukan.", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                while (rs.next()) {
                    String idPembelianVarian = rs.getString("id_pembelian_varian");
                    String tanggalPembelian = rs.getString("tgl_pembelian");
                    String namaVarian = rs.getString("nama_varian");
                    String jumlah = rs.getString("jumlah");
                    String satuan = rs.getString("satuan");
                    String hargaBeli = rs.getString("harga_beli");
                    String namaPetugas = rs.getString("petugas");

                    Object[] rowData = {idPembelianVarian, tanggalPembelian, namaVarian, jumlah, satuan, hargaBeli, namaPetugas};
                    model.addRow(rowData);
                }
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuLaporanVarian.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencari data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}


