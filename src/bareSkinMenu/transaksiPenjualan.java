/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bareSkinMenu;

import bareSkinDashboard.menuDashboardAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import menu.dataMember;
import config.koneksi;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import notification.Notification;
/**
 *
 * @author LENOVO
 */
public class transaksiPenjualan extends javax.swing.JPanel {
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private String id_user;
    private final Connection conn;
    
    
    public transaksiPenjualan(String id_user) {
        conn = koneksi.getConnection();
        this.id_user = id_user;
        initComponents();
        finishing();
        loadData();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        countHarga();
        pagination();
        btnCetak.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        pnMain = new custom.PanelCustom();
        btnCetak = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        panelCustom3 = new custom.PanelCustom();
        panelCustom6 = new custom.PanelCustom();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCustom7 = new custom.PanelCustom();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelCustom16 = new custom.PanelCustom();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelCustom17 = new custom.PanelCustom();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        iSearch = new javax.swing.JLabel();
        txtSearch = new custom.JTextFieldRounded();
        pnDetail = new custom.PanelCustom();
        databahan = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataDetail = new javax.swing.JTable();
        btnCloseDetail = new javax.swing.JButton();
        panelCustom1 = new custom.PanelCustom();
        btn_last = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_before = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        pnHeader = new custom.PanelCustom();
        tPenjualan = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        panelCustom8 = new custom.PanelCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataSementara = new javax.swing.JTable();
        panelCustom4 = new custom.PanelCustom();
        idTransaksi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        hargaTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNamaMember = new custom.JTextFieldRounded();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPoin = new custom.JTextFieldRounded();
        jLabel26 = new javax.swing.JLabel();
        txtDiskon = new custom.JTextFieldRounded();
        jLabel27 = new javax.swing.JLabel();
        txtAlamat = new custom.JTextFieldRounded();
        txtHargaJual = new custom.JTextFieldRounded();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtNamaProduct = new custom.JTextFieldRounded();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtJumlahBeli = new custom.JTextFieldRounded();
        btnSetProduct = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtHarga = new custom.JTextFieldRounded();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        jumlahBayar = new javax.swing.JLabel();
        txtJumlahBayar = new custom.JTextFieldRounded();
        kembalian = new javax.swing.JLabel();
        txtKembalian = new custom.JTextFieldRounded();
        btnSimpan = new rojerusan.RSMaterialButtonRectangle();
        btnSetMember = new javax.swing.JButton();
        txtIdProduct = new custom.JTextFieldRounded();
        txtIdMember = new custom.JTextFieldRounded();
        jhargaBeli = new javax.swing.JLabel();
        txtHargaBeli = new custom.JTextFieldRounded();
        untung = new javax.swing.JLabel();
        txtUntung = new custom.JTextFieldRounded();
        panelCustom14 = new custom.PanelCustom();
        tPenjualan2 = new javax.swing.JLabel();
        btnBack = new rojerusan.RSMaterialButtonRectangle();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(248, 231, 246));
        panelView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setRoundBottomLeft(20);
        pnMain.setRoundBottomRight(20);
        pnMain.setRoundTopLeft(20);
        pnMain.setRoundTopRight(20);
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCetak.setBackground(new java.awt.Color(75, 22, 76));
        btnCetak.setText("CETAK");
        btnCetak.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        pnMain.add(btnCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 60));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Nama Member", "Tgl Penjualan", "Total Harga", "Jumlah Bayar", "Kembalian", "Petugas"
            }
        ));
        tblData.setGridColor(new java.awt.Color(255, 255, 255));
        tblData.setSelectionBackground(new java.awt.Color(75, 22, 76));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        pnMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1210, 480));

        panelCustom3.setBackground(new java.awt.Color(75, 22, 76));
        panelCustom3.setRoundBottomLeft(20);
        panelCustom3.setRoundBottomRight(20);
        panelCustom3.setRoundTopLeft(20);
        panelCustom3.setRoundTopRight(20);
        panelCustom3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom6.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom6.setRoundBottomLeft(20);
        panelCustom6.setRoundBottomRight(20);
        panelCustom6.setRoundTopLeft(20);
        panelCustom6.setRoundTopRight(20);

        jLabel2.setBackground(new java.awt.Color(75, 22, 76));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setText("TONO");

        jLabel3.setBackground(new java.awt.Color(106, 106, 106));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("Nama Karyawan");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userr.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom6Layout = new javax.swing.GroupLayout(panelCustom6);
        panelCustom6.setLayout(panelCustom6Layout);
        panelCustom6Layout.setHorizontalGroup(
            panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(31, 31, 31))
        );
        panelCustom6Layout.setVerticalGroup(
            panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelCustom6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27))
        );

        panelCustom3.add(panelCustom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 110));

        panelCustom7.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom7.setRoundBottomLeft(20);
        panelCustom7.setRoundBottomRight(20);
        panelCustom7.setRoundTopLeft(20);
        panelCustom7.setRoundTopRight(20);

        jLabel6.setBackground(new java.awt.Color(75, 22, 76));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel6.setText("100.000");

        jLabel7.setBackground(new java.awt.Color(106, 106, 106));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel7.setText("Pendapatan");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/moneyy.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom7Layout = new javax.swing.GroupLayout(panelCustom7);
        panelCustom7.setLayout(panelCustom7Layout);
        panelCustom7Layout.setHorizontalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(28, 28, 28))
        );
        panelCustom7Layout.setVerticalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom7Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(panelCustom7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(27, 27, 27))
        );

        panelCustom3.add(panelCustom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 310, 110));

        panelCustom16.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom16.setRoundBottomLeft(20);
        panelCustom16.setRoundBottomRight(20);
        panelCustom16.setRoundTopLeft(20);
        panelCustom16.setRoundTopRight(20);

        jLabel8.setBackground(new java.awt.Color(75, 22, 76));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel8.setText("30 Agustus 2025");

        jLabel9.setBackground(new java.awt.Color(106, 106, 106));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setText("Tanggal");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/date.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom16Layout = new javax.swing.GroupLayout(panelCustom16);
        panelCustom16.setLayout(panelCustom16Layout);
        panelCustom16Layout.setHorizontalGroup(
            panelCustom16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom16Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(28, 28, 28))
        );
        panelCustom16Layout.setVerticalGroup(
            panelCustom16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom16Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelCustom16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(panelCustom16Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(27, 27, 27))
        );

        panelCustom3.add(panelCustom16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 310, 110));

        panelCustom17.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom17.setRoundBottomLeft(20);
        panelCustom17.setRoundBottomRight(20);
        panelCustom17.setRoundTopLeft(20);
        panelCustom17.setRoundTopRight(20);

        jLabel10.setBackground(new java.awt.Color(75, 22, 76));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel10.setText("100");

        jLabel11.setBackground(new java.awt.Color(106, 106, 106));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel11.setText("Total Transaksi");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/unduh.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom17Layout = new javax.swing.GroupLayout(panelCustom17);
        panelCustom17.setLayout(panelCustom17Layout);
        panelCustom17Layout.setHorizontalGroup(
            panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom17Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(27, 27, 27))
        );
        panelCustom17Layout.setVerticalGroup(
            panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom17Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(panelCustom17Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(27, 27, 27))
        );

        panelCustom3.add(panelCustom17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 310, 110));

        pnMain.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 330, 650));

        iSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        pnMain.add(iSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 50, 30, 30));

        txtSearch.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        pnMain.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 350, 50));

        pnDetail.setBackground(new java.awt.Color(75, 22, 76));
        pnDetail.setRoundBottomLeft(20);
        pnDetail.setRoundBottomRight(20);
        pnDetail.setRoundTopLeft(20);
        pnDetail.setRoundTopRight(20);

        databahan.setBackground(new java.awt.Color(255, 255, 255));
        databahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan.setForeground(new java.awt.Color(255, 255, 255));
        databahan.setText("Detail Transaksi Penjualan");

        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDataDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Nama Product", "Harga Beli", "Harga Jual", "Jumlah Beli", "Harga", "Untung"
            }
        ));
        tblDataDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataDetailMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDataDetail);

        btnCloseDetail.setForeground(new java.awt.Color(75, 22, 76));
        btnCloseDetail.setText("X");
        btnCloseDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseDetailMouseClicked(evt);
            }
        });
        btnCloseDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDetailLayout.createSequentialGroup()
                        .addComponent(btnCloseDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(databahan)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(databahan)
                    .addComponent(btnCloseDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnMain.add(pnDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 1560, 210));

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));

        btn_last.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_last.setForeground(new java.awt.Color(75, 22, 76));
        btn_last.setText("Last Page");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_next.setForeground(new java.awt.Color(75, 22, 76));
        btn_next.setText(">");

        cbx_data.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        cbx_data.setForeground(new java.awt.Color(75, 22, 76));
        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "20", "25" }));

        btn_before.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_before.setForeground(new java.awt.Color(75, 22, 76));
        btn_before.setText("<");

        btn_first.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_first.setForeground(new java.awt.Color(75, 22, 76));
        btn_first.setText("First Page");

        lb_halaman.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lb_halaman.setForeground(new java.awt.Color(75, 22, 76));
        lb_halaman.setText("Halaman Of Total Halaman");

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lb_halaman))
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addGap(9, 9, 9)
                        .addComponent(btn_before)
                        .addGap(7, 7, 7)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btn_next)
                        .addGap(7, 7, 7)
                        .addComponent(btn_last)))
                .addGap(384, 384, 384))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_halaman)
                .addGap(4, 4, 4)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_first)
                    .addComponent(btn_before)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(btn_last))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnMain.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1210, 70));

        btnTambah.setBackground(new java.awt.Color(75, 22, 76));
        btnTambah.setText("TAMBAH");
        btnTambah.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        pnMain.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 60));

        panelView.add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1600, 940));

        pnHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnHeader.setRoundBottomLeft(20);
        pnHeader.setRoundBottomRight(20);
        pnHeader.setRoundTopLeft(20);
        pnHeader.setRoundTopRight(20);
        pnHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tPenjualan.setBackground(new java.awt.Color(245, 245, 245));
        tPenjualan.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        tPenjualan.setForeground(new java.awt.Color(75, 22, 76));
        tPenjualan.setText("MENU TRANSAKSI PENJUALAN");
        pnHeader.add(tPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        panelView.add(pnHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1600, 70));

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(248, 231, 246));
        panelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom8.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom8.setRoundBottomLeft(20);
        panelCustom8.setRoundBottomRight(20);
        panelCustom8.setRoundTopLeft(20);
        panelCustom8.setRoundTopRight(20);
        panelCustom8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDataSementara.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblDataSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Product", "Nama Product", "Harga Beli", "Harga Jual", "Jumlah Beli", "Harga", "Untung"
            }
        ));
        tblDataSementara.setGridColor(new java.awt.Color(255, 255, 255));
        tblDataSementara.setSelectionBackground(new java.awt.Color(75, 22, 76));
        tblDataSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSementaraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataSementara);

        panelCustom8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 1540, 250));

        panelCustom4.setBackground(new java.awt.Color(75, 22, 76));
        panelCustom4.setRoundBottomLeft(20);
        panelCustom4.setRoundBottomRight(20);
        panelCustom4.setRoundTopLeft(20);
        panelCustom4.setRoundTopRight(20);

        idTransaksi.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        idTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        idTransaksi.setText("TRX0001");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID Transaksi :");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tgl. Transaksi :");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("15/01/2025");

        totalHarga.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        totalHarga.setForeground(new java.awt.Color(255, 255, 255));
        totalHarga.setText("Total Harga :");

        hargaTotal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        hargaTotal.setForeground(new java.awt.Color(255, 255, 255));
        hargaTotal.setText("999999");

        javax.swing.GroupLayout panelCustom4Layout = new javax.swing.GroupLayout(panelCustom4);
        panelCustom4.setLayout(panelCustom4Layout);
        panelCustom4Layout.setHorizontalGroup(
            panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom4Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(idTransaksi)
                .addGap(227, 227, 227)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(totalHarga)
                .addGap(18, 18, 18)
                .addComponent(hargaTotal)
                .addGap(205, 205, 205))
            .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCustom4Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel12)
                    .addContainerGap(1370, Short.MAX_VALUE)))
        );
        panelCustom4Layout.setVerticalGroup(
            panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTransaksi)))
                .addContainerGap())
            .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCustom4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelCustom8.add(panelCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1560, 60));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel22.setText("ID Member");
        panelCustom8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtNamaMember.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNamaMember.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtNamaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 50));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel23.setText("Nama Member");
        panelCustom8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel24.setText("Harga/pcs");
        panelCustom8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel25.setText("Poin");
        panelCustom8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        txtPoin.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtPoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, 50));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel26.setText("%");
        panelCustom8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        txtDiskon.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });
        panelCustom8.add(txtDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 60, 50));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel27.setText("Discount");
        panelCustom8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        txtAlamat.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 430, -1));

        txtHargaJual.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 140, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel28.setText("ID Product");
        panelCustom8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel29.setText("Nama Product");
        panelCustom8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        txtNamaProduct.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtNamaProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProductActionPerformed(evt);
            }
        });
        panelCustom8.add(txtNamaProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 430, 50));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel30.setText("Alamat");
        panelCustom8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel31.setText("Jumlah Beli");
        panelCustom8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        txtJumlahBeli.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtJumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 100, -1));

        btnSetProduct.setText("...");
        btnSetProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetProductActionPerformed(evt);
            }
        });
        panelCustom8.add(btnSetProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 50, 50));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel32.setText("Harga");
        panelCustom8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 110, -1, -1));

        txtHarga.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 230, -1));

        btnBatal.setBackground(new java.awt.Color(75, 22, 76));
        btnBatal.setText("BATAL");
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        panelCustom8.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 140, 60));

        btnHapus.setBackground(new java.awt.Color(75, 22, 76));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelCustom8.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 150, 60));

        jumlahBayar.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jumlahBayar.setText("Jumlah Bayar");
        panelCustom8.add(jumlahBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 220, -1, -1));

        txtJumlahBayar.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtJumlahBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 260, 430, -1));

        kembalian.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        kembalian.setText("Kembalian");
        panelCustom8.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 330, -1, -1));

        txtKembalian.setText("  ");
        txtKembalian.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, 430, -1));

        btnSimpan.setBackground(new java.awt.Color(75, 22, 76));
        btnSimpan.setText("TAMBAH");
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelCustom8.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 150, 60));

        btnSetMember.setText("...");
        btnSetMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetMemberActionPerformed(evt);
            }
        });
        panelCustom8.add(btnSetMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, 50));

        txtIdProduct.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductActionPerformed(evt);
            }
        });
        panelCustom8.add(txtIdProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 190, 50));

        txtIdMember.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtIdMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMemberActionPerformed(evt);
            }
        });
        panelCustom8.add(txtIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 50));

        jhargaBeli.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jhargaBeli.setText("Harga Beli");
        panelCustom8.add(jhargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        txtHargaBeli.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBeliActionPerformed(evt);
            }
        });
        panelCustom8.add(txtHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 140, -1));

        untung.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        untung.setText("Untung");
        panelCustom8.add(untung, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        txtUntung.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtUntung, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 140, -1));

        panelAdd.add(panelCustom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1600, 940));

        panelCustom14.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom14.setRoundBottomLeft(20);
        panelCustom14.setRoundBottomRight(20);
        panelCustom14.setRoundTopLeft(20);
        panelCustom14.setRoundTopRight(20);
        panelCustom14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tPenjualan2.setBackground(new java.awt.Color(245, 245, 245));
        tPenjualan2.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        tPenjualan2.setForeground(new java.awt.Color(75, 22, 76));
        tPenjualan2.setText("TAMBAH TRANSAKSI PENJUALAN");
        panelCustom14.add(tPenjualan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        btnBack.setBackground(new java.awt.Color(75, 22, 76));
        btnBack.setText("BACK");
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelCustom14.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 50));

        panelAdd.add(panelCustom14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1600, 70));

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        pnDetail.setVisible(true);
        
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        getDataDetail((DefaultTableModel) tblDataDetail.getModel(), id);
        btnCetak.setVisible(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSementaraMouseClicked
        dataTabelSementara();
        jumlahBayar.setVisible(false);
        txtJumlahBayar.setVisible(false);
        kembalian.setVisible(false);
        txtKembalian.setVisible(false);
        totalHarga.setVisible(false);
        btnSimpan.setText("UBAH");
    }//GEN-LAST:event_tblDataSementaraMouseClicked

    private void btnSetProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetProductActionPerformed
        setProduct();
    }//GEN-LAST:event_btnSetProductActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        deleteDataSementara();
        showPanel();
        loadData();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (btnSimpan.getText().equals("TAMBAH")) {
            insertDataSementara();
        } else if(btnSimpan.getText().equals("UBAH")){
            updateData();
        } else if (btnSimpan.getText().equals("SIMPAN")) {
            
        }
            
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnSetMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetMemberActionPerformed
        setMember();
    }//GEN-LAST:event_btnSetMemberActionPerformed

    private void tblDataDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataDetailMouseClicked

    private void btnCloseDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDetailMouseClicked
         showPanel();
         loadData();
    }//GEN-LAST:event_btnCloseDetailMouseClicked

    private void btnCloseDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseDetailActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        idTransaksi.setText(generateId());
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        loadDataSementara();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductActionPerformed

    private void txtIdMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMemberActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtNamaProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProductActionPerformed

    private void txtHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaBeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBack;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnCetak;
    private javax.swing.JButton btnCloseDetail;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private javax.swing.JButton btnSetMember;
    private javax.swing.JButton btnSetProduct;
    private rojerusan.RSMaterialButtonRectangle btnSimpan;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel hargaTotal;
    private javax.swing.JLabel iSearch;
    private javax.swing.JLabel idTransaksi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jhargaBeli;
    private javax.swing.JLabel jumlahBayar;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelAdd;
    private custom.PanelCustom panelCustom1;
    private custom.PanelCustom panelCustom14;
    private custom.PanelCustom panelCustom16;
    private custom.PanelCustom panelCustom17;
    private custom.PanelCustom panelCustom3;
    private custom.PanelCustom panelCustom4;
    private custom.PanelCustom panelCustom6;
    private custom.PanelCustom panelCustom7;
    private custom.PanelCustom panelCustom8;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private custom.PanelCustom pnDetail;
    private custom.PanelCustom pnHeader;
    private custom.PanelCustom pnMain;
    private javax.swing.JLabel tPenjualan;
    private javax.swing.JLabel tPenjualan2;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblDataSementara;
    private javax.swing.JLabel totalHarga;
    private custom.JTextFieldRounded txtAlamat;
    private custom.JTextFieldRounded txtDiskon;
    private custom.JTextFieldRounded txtHarga;
    private custom.JTextFieldRounded txtHargaBeli;
    private custom.JTextFieldRounded txtHargaJual;
    private custom.JTextFieldRounded txtIdMember;
    private custom.JTextFieldRounded txtIdProduct;
    private custom.JTextFieldRounded txtJumlahBayar;
    private custom.JTextFieldRounded txtJumlahBeli;
    private custom.JTextFieldRounded txtKembalian;
    private custom.JTextFieldRounded txtNamaMember;
    private custom.JTextFieldRounded txtNamaProduct;
    private custom.JTextFieldRounded txtPoin;
    private custom.JTextFieldRounded txtSearch;
    private custom.JTextFieldRounded txtUntung;
    private javax.swing.JLabel untung;
    // End of variables declaration//GEN-END:variables
    
    private void countHarga() {
        txtJumlahBeli.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String jumlahBeliText = txtJumlahBeli.getText();
                String hargaJualText = txtHargaJual.getText();
                String hargaBeliText = txtHargaBeli.getText();

                // Validasi awal: pastikan semua field sudah terisi dan berupa angka
                if (jumlahBeliText.isEmpty() || hargaJualText.isEmpty() || hargaBeliText.isEmpty()) {
                    txtHarga.setText("0");
                    txtUntung.setText("0");
                    return;
                }

                try {
                    int jumlahBeli = Integer.parseInt(jumlahBeliText);
                    int hargaJual = Integer.parseInt(hargaJualText);
                    int hargaBeli = Integer.parseInt(hargaBeliText);

                    int totalHarga = jumlahBeli * hargaJual;
                    int untung = totalHarga - (jumlahBeli * hargaBeli);

                    txtHarga.setText(String.valueOf(totalHarga));
                    txtUntung.setText(String.valueOf(untung));
                } catch (NumberFormatException ex) {
                    // Jika input bukan angka
                    txtHarga.setText("0");
                    txtUntung.setText("0");
                }
            }
        });
    }

    
    private String generateId() {
        SimpleDateFormat sdf = new SimpleDateFormat("mmHHddMM");
        String dateTime = sdf.format(new Date());
        return dateTime; 
    }
    
    private void fieldColor(JTextField field) {
        field.setOpaque(true);
        field.setEditable(false);
        field.setBackground(new Color(219, 219, 219));
    }

    private void finishing() {
        fieldColor(txtIdMember);
        fieldColor(txtNamaMember);
        fieldColor(txtAlamat);
        fieldColor(txtPoin);
        fieldColor(txtDiskon);
        fieldColor(txtIdProduct);
        fieldColor(txtNamaProduct);
        fieldColor(txtHargaJual);
        fieldColor(txtHarga);
        fieldColor(txtKembalian);
        btnCetak.setVisible(false);
        jhargaBeli.setVisible(false);
        hargaTotal.setVisible(false);
        totalHarga.setVisible(false);
        txtHargaBeli.setVisible(false);
        untung.setVisible(false);
        txtUntung.setVisible(false);
        jumlahBayar.setVisible(false);
        txtJumlahBayar.setVisible(false);
        kembalian.setVisible(false);
        txtKembalian.setVisible(false);
    }
    
    private void setProduct(){
        boolean closable = true;
        dataProduct product = new dataProduct(null, closable);
        product.setVisible(true);
        
        txtIdProduct.setText(product.getId_product());
        txtNamaProduct.setText(product.getNama_product());
        txtHargaBeli.setText(product.getHarga_beli());
        txtHargaJual.setText(product.getHarga_jual());
    }
    
    private void setMember(){
            
    
        boolean closable = true;
        dataMemberr member = new dataMemberr(null, closable);
        member.setVisible(true);
        
        txtIdMember.setText(member.getId_member());
        txtNamaMember.setText(member.getNama_member());
        txtAlamat.setText(member.getAlamat());
        txtPoin.setText(member.getPoin());
        
    }
    
    private void pagination() {
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
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new transaksiPenjualan(id_user));
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void calculateTotalPages(){
    int totalData = getTotalData(); // Ambil total data dari tabel
    totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }
    
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM transaksi_penjualan";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE,null, e);
        }
        return totalData;
    }
    
    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT t.id_transaksi, cu.nama_member, DATE(t.tgl_penjualan) AS tgl_penjualan, t.total_harga, t.jumlah_bayar, "
                   + "t.kembalian, us.nama AS nama_user FROM transaksi_penjualan t INNER JOIN member cu ON t.id_member = cu.id_member "
                   + "INNER JOIN user us ON t.id_user = us.id_user ORDER BY t.id_transaksi ASC LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idTransaksi = rs.getString("id_transaksi");
                    String namaMember = rs.getString("nama_member");
                    String tglPenjualan = rs.getString("tgl_penjualan");
                    int totalHarga = rs.getInt("total_harga");
                    int jumlahBayar = rs.getInt("jumlah_bayar");
                    int Kembalian = rs.getInt("kembalian");
                    String namaUser = rs.getString("nama_user");
                    

                    Object[] rowData = {idTransaksi, namaMember, tglPenjualan, 
                        totalHarga, jumlahBayar, Kembalian, namaUser};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT dt.id_detail, dt.id_transaksi, p.nama_product, p.harga_beli, p.harga_jual, dt.jumlah_beli, dt.harga, dt.untung"
                   + " FROM detail_transaksi_penjualan dt INNER JOIN product p ON dt.id_product = p.id_product WHERE dt.id_transaksi = '"+id+"'";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idTransaksi      = rs.getString("id_transaksi");
                    String namaProduct      = rs.getString("nama_product");
                    int hargaBeli           = rs.getInt("harga_beli");
                    int hargaJual           = rs.getInt("harga_jual");
                    int jumlahBeli          = rs.getInt("jumlah_beli");
                    int harga               = rs.getInt("harga");
                    int Untung              = rs.getInt("untung");
                    

                    Object[] rowData = {idTransaksi, namaProduct, hargaBeli, hargaJual, jumlahBeli, harga, Untung };
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    private void loadData() {
        calculateTotalPages();
        int totalData = getTotalData();
        lb_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));

        int startIndex = (halamanSaatIni - 1) * dataPerHalaman; // Indeks awal untuk pagination
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tblData.getModel());
        pnDetail.setVisible(false);
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail.getModel();
    }
    
    private void resetForm() {
        txtIdProduct.setText("");
        txtNamaProduct.setText("");
        txtHargaBeli.setText("");
        txtHargaJual.setText("");
        btnSetMember.setVisible(false);
        txtJumlahBeli.setText("");
        hargaTotal.setText("");
        txtUntung.setText("");
        txtHarga.setText("");
    }
    
    private void clickNoSementara() {
                btnSetMember.setVisible(false);
                btnSetProduct.setVisible(false);
                txtHargaBeli.setEnabled(false);
                txtUntung.setEnabled(false);
                txtJumlahBeli.setText("");
    }
    
    private int getTotalHarga(String idTransaksi) {
        int totalHarga = 0;

        try {
            String sql = "SELECT SUM(" + totalHarga + " + (harga_jual * jumlah_beli)) AS total FROM sementara_penjualan WHERE id_transaksi = ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idTransaksi);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalHarga = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalHarga;
    }
    
    private int getTotalUntung(String idTransaksi) {
        int totalUntung = 0;

        try {
            String sql = "SELECT SUM(" + totalUntung + " + untung ) AS total FROM sementara_penjualan WHERE id_transaksi = ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idTransaksi);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalUntung = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }

        return totalUntung;
    }
    
    private void insertDataSementara() {
    String idTransaksiPenjualan = idTransaksi.getText();
    String idProduct = txtIdProduct.getText();
    String namaProduct = txtNamaProduct.getText();
    String hargaBeli = txtHargaBeli.getText();
    String hargaJual = txtHargaJual.getText();
    String harga    = txtHarga.getText();
    String jumlahBeli = txtJumlahBeli.getText();
    String Untung = txtUntung.getText();

    if (idTransaksiPenjualan.isEmpty() || idProduct.isEmpty() || jumlahBeli.isEmpty() || Untung.isEmpty()) {
            // Menggunakan JOptionPane untuk menampilkan pesan peringatan
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di-isi", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

    try {
        String sql = "INSERT INTO sementara_penjualan (id_transaksi, id_product ,nama_product, harga_beli ,harga_jual, harga,"
                + "jumlah_beli, untung) VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksiPenjualan);
            st.setString(2, idProduct);
            st.setString(3, namaProduct);
            st.setString(4, hargaBeli);
            st.setString(5, hargaJual);
            st.setString(6, harga);
            st.setString(7, jumlahBeli);
            st.setString(8, Untung);
            st.executeUpdate();

            if (JOptionPane.showConfirmDialog(this, "Mau Beli Product Lain?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetForm();
            } else {
                resetForm();
                btnSimpan.requestFocus();
                clickNoSementara();
                
                
                txtKembalian.setEnabled(false);
                jumlahBayar.setVisible(true);
                txtJumlahBayar.setVisible(true);
                kembalian.setVisible(true);
                txtKembalian.setVisible(true);
                totalHarga.setVisible(true);
                hargaTotal.setVisible(true);
                btnSimpan.setText("SIMPAN");
            }
            int totalHarga = getTotalHarga(idTransaksiPenjualan);
            int totalUntung = getTotalUntung(idTransaksiPenjualan);
            
            /*
            if (txtDiscount.getText().equals("")) {
                txtHargaTotal.setText(String.valueOf(totalHarga));
                txtUntung.setText(String.valueOf(totalUntung));
            } else {
                int discount = Integer.parseInt(txtDiscount.getText());
                int countHarga = totalHarga - (totalHarga * discount / 100);
                totalUntung = totalUntung - (totalHarga * discount / 100);
                
                txtHargaTotal.setText(String.valueOf(countHarga));
                txtUntung.setText(String.valueOf(totalUntung));
            }
            */
            loadDataSementara();
        }
    } catch (Exception e) {
        Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
    }
}
    private void loadDataSementara() {
        int startIndex = 0; 
        int entriesPage = 10; 
        getDataSementara((DefaultTableModel) tblDataSementara.getModel(), startIndex, entriesPage);
    }
    
    public void getDataSementara(DefaultTableModel model, int startIndex, int entriesPage) {
        model.setRowCount(0);

        try {
           String sql = "SELECT * FROM sementara_penjualan LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();

               while (rs.next()) {
                    String idTransaksi = rs.getString("id_transaksi");
                    String idProduct = rs.getString("id_product");
                    String namaProduct = rs.getString("nama_product");
                    String hargaBeli = rs.getString("harga_beli");
                    String hargaJual = rs.getString("harga_jual");
                    String jumlahBeli = rs.getString("jumlah_beli");
                    String harga = rs.getString("harga");
                    String untung = rs.getString("untung");


                    Object[] rowData = {idTransaksi, idProduct, namaProduct ,hargaBeli, hargaJual, jumlahBeli, harga, untung};
                    model.addRow(rowData);
                }
           }
        } catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblDataSementara.getModel();
    }
    
    /*
    private boolean validateStockAndReduce() {
    String selectSQL = "SELECT id_product, jumlah_beli FROM sementara_penjualan";
    try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
         ResultSet rs = selectStmt.executeQuery()) {

        while (rs.next()) {
            String idProduct = rs.getString("id_product");
            int jumlahBeli = rs.getInt("jumlah_beli");

            // Validasi stok bahan
            String detailSQL = "SELECT id_product, jumlah_bahan FROM product WHERE id_product = ?";
            try (PreparedStatement detailStmt = conn.prepareStatement(detailSQL)) {
                detailStmt.setString(1, idProduct);

                try (ResultSet detailRs = detailStmt.executeQuery()) {
                    while (detailRs.next()) {
                        String idProduct = detailRs.getString("id_product");
                        int jumlahBahan = detailRs.getInt("jumlah_bahan");
                        int penguranganStok = jumlahBeli * jumlahBahan;

                        // Cek stok bahan
                        String checkStokSQL = "SELECT stok_bahan, nama_bahan, satuan FROM bahan WHERE id_bahan = ?";
                        try (PreparedStatement checkStokStmt = conn.prepareStatement(checkStokSQL)) {
                            checkStokStmt.setString(1, idBahan);
                            try (ResultSet stokRs = checkStokStmt.executeQuery()) {
                                if (stokRs.next()) {
                                    int stokBahan = stokRs.getInt("stok_bahan");
                                    String namaBahan = stokRs.getString("nama_bahan");
                                    String Satuan = stokRs.getString("satuan");
                                    if (stokBahan < penguranganStok) {
                                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                                        if (frame != null) {
                                            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.CENTER, namaBahan + " kurang, Dibutuhkan: " + penguranganStok + ", tersedia: " + stokBahan + " (" + Satuan + ")" );
                                            panel.showNotification();
                                        }
                                        return false; // Not enough stock
                                    }
                                }
                            }
                        }

                        // Update stok bahan
                        String updateSQL = "UPDATE bahan SET stok_bahan = stok_bahan - ? WHERE id_bahan = ?";
                        try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                            updateStmt.setInt(1, penguranganStok);
                            updateStmt.setString(2, idBahan);
                            updateStmt.executeUpdate();
                        }
                    }
                }
            }
        }
        return true; // All stock checks passed
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
        return false; // Error occurred
    }
    }
    */

    
    // main
    private boolean insertData() {
    String idTransaksiPenjualan = idTransaksi.getText();
    String idMember = txtIdMember.getText();
    String namaMember = txtNamaMember.getText();
    String totalHarga = hargaTotal.getText();
    String jumlahBayar = txtJumlahBayar.getText();
    String Kembalian = txtKembalian.getText();
    String Untung = txtUntung.getText();

    // Dapatkan waktu sekarang dalam format yang benar
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String tglPenjualan = LocalDateTime.now().format(formatter);

    if (jumlahBayar.isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di-isi", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return false;
    }

    try {
        String sql = "INSERT INTO transaksi_penjualan (id_transaksi, tgl_penjualan, total_harga, jumlah_bayar, kembalian, "
                + "untung, id_member, id_user) VALUES (?, ?, ?, ?, ?, ?, ?, ?)  "
                + "   ";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksiPenjualan);
            st.setString(2, tglPenjualan);
            st.setString(3, totalHarga);
            st.setString(4, jumlahBayar);
            st.setString(5, Kembalian);
            st.setString(6, Untung);
            st.setString(7, idMember);
            st.setString(8, id_user);

            int rowInserted = st.executeUpdate();
            return rowInserted > 0;
            
        }
    } catch (Exception e) {
        Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
        return false;
    }
}
    
    private boolean insertDataDetail() {
    String idTransaksiPenjualan = idTransaksi.getText();

    try {
        // Ambil data dari sementara_penjualan
        String selectSQL = "SELECT id_product, jumlah_beli FROM sementara_penjualan";
        try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
             ResultSet rs = selectStmt.executeQuery()) {

            while (rs.next()) {
                String idProduct = rs.getString("id_product");
                int jumlahBeli = rs.getInt("jumlah_beli");

                // Ambil stok dan info produk
                String checkProductSQL = "SELECT stok_product, nama_product, satuan FROM product WHERE id_product = ?";
                try (PreparedStatement checkProductStmt = conn.prepareStatement(checkProductSQL)) {
                    checkProductStmt.setString(1, idProduct);
                    try (ResultSet productRs = checkProductStmt.executeQuery()) {
                        if (productRs.next()) {
                            int stokProduct = productRs.getInt("stok_product");
                            String namaProduct = productRs.getString("nama_product");
                            String satuan = productRs.getString("satuan");

                            if (stokProduct < jumlahBeli) {
                                JOptionPane.showMessageDialog(this, 
                                    "Stok " + namaProduct + " kurang.\n" +
                                    "Dibutuhkan: " + jumlahBeli + " " + satuan + 
                                    ", tersedia: " + stokProduct + " " + satuan,
                                    "Peringatan", JOptionPane.WARNING_MESSAGE);
                                return false;
                            }

                            // Kurangi stok
                            String updateSQL = "UPDATE product SET stok_product = stok_product - ? WHERE id_product = ?";
                            try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                                updateStmt.setInt(1, jumlahBeli);
                                updateStmt.setString(2, idProduct);
                                updateStmt.executeUpdate();
                            }
                        }
                    }
                }
            }

            // Insert ke detail_transaksi_penjualan
            String insertSQL = "INSERT INTO detail_transaksi_penjualan (id_transaksi, id_product, jumlah_beli, harga, untung) " +
                               "SELECT ?, id_product, jumlah_beli, harga_beli, untung FROM sementara_penjualan";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
                insertStmt.setString(1, idTransaksiPenjualan);
                insertStmt.executeUpdate();
            }

            return true;

        }
    } catch (Exception e) {
        Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
        return false;
    }
}

    
    private void dataTabelSementara() {
        int row = tblDataSementara.getSelectedRow();
        
        if(row!=-1) {
            
        idTransaksi.setText(tblDataSementara.getValueAt(row, 0).toString());
        txtIdProduct.setText(tblDataSementara.getValueAt(row, 1).toString());
        txtNamaProduct.setText(tblDataSementara.getValueAt(row, 2).toString());
        txtHargaBeli.setText(tblDataSementara.getValueAt(row, 3).toString());
        txtHargaJual.setText(tblDataSementara.getValueAt(row, 4).toString());
        txtJumlahBeli.setText(tblDataSementara.getValueAt(row, 5).toString());
        txtHarga.setText(tblDataSementara.getValueAt(row, 6).toString());
        txtUntung.setText(tblDataSementara.getValueAt(row, 7).toString());
        
        }
    }
    
    
    private void updateData() {
        String idTransaksiPenjualan = idTransaksi.getText();
        String idProduct = txtIdProduct.getText();
        String namaProduct = txtNamaProduct.getText();
        String hargaBeli = txtHargaBeli.getText();
        String hargaJual = txtHargaJual.getText();
        String jumlahBeli = txtJumlahBeli.getText();
        String harga = txtHarga.getText();
        String untung = txtUntung.getText();

        if (idTransaksiPenjualan.isEmpty() || idProduct.isEmpty() || namaProduct.isEmpty()
                || hargaBeli.isEmpty() || hargaJual.isEmpty() || jumlahBeli.isEmpty() || untung.isEmpty() || harga.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "UPDATE sementara_penjualan SET id_transaksi=?, nama_product=?, harga_beli=?, harga_jual=?, jumlah_beli=?, harga=?, untung=? WHERE id_product=?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksiPenjualan);
            st.setString(2, namaProduct);
            st.setString(3, hargaBeli);
            st.setString(4, hargaJual);
            st.setString(5, jumlahBeli);
            st.setString(6, harga);
            st.setString(7, untung);
            st.setString(8, idProduct);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                // Update total harga dan total untung setelah perubahan
                int totalHarga = getTotalHarga(idTransaksiPenjualan);
                int totalUntung = getTotalUntung(idTransaksiPenjualan);

                hargaTotal.setText(String.valueOf(totalHarga));
                txtUntung.setText(String.valueOf(totalUntung));

                resetForm();
                loadDataSementara();

                // Reset tampilan input pembayar

                txtJumlahBayar.setVisible(true);
                jumlahBayar.setVisible(true);
                txtKembalian.setVisible(true);
                kembalian.setVisible(true);

                txtKembalian.setEnabled(false);
                btnSimpan.setText("SIMPAN");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengubah data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void deleteData() {
        int selectedRow = tblDataSementara.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Ambil ID dari kolom pertama (indeks 0)
            String id = tblDataSementara.getValueAt(selectedRow, 1).toString();

            try {
                String sql = "DELETE FROM sementara_penjualan WHERE id_product=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);

                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                        int totalHarga = getTotalHarga(idTransaksi.getText());
                        int totalUntung = getTotalUntung(idTransaksi.getText());

                        hargaTotal.setText(String.valueOf(totalHarga));
                        txtUntung.setText(String.valueOf(totalUntung));

                        loadDataSementara();
                        btnSetMember.setVisible(false);
                        txtJumlahBeli.setText("");
                        txtJumlahBeli.setEnabled( false);
                        txtJumlahBayar.setVisible(true);
                        txtKembalian.setVisible(true);
                        txtKembalian.setEnabled(false);
                        jumlahBayar.setVisible(true);
                        kembalian.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

            } catch (Exception e) {
                Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadDataSementara();
    }

    private void deleteDataSementara(){
        try {
            String sql =  "DELETE FROM sementara_penjualan";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }   
        } catch (Exception e) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}

