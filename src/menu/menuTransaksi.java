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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import notification.Notification;

/**
 *
 * @author user
 */
public class menuTransaksi extends javax.swing.JPanel {

    /**
     * Creates new form menuBahan
     */
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private String id_user;

    private final Connection conn;
    public menuTransaksi(String id_user) {
        initComponents();
        
        conn = koneksi.getConnection();
        this.id_user = id_user;
        loadData();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        countHargaPembelian();
        paginationVarian();
        enabledFalse();
        
        
        btnCancel1.setVisible(false);
        txtDiscount.setEnabled(false);
        
        txtUntung.setEnabled(false);
        txtTanggalPenjualan.setEnabled(false);
        txtJumlahBayar.setVisible(false);
        txtKembalian.setVisible(false);
        jumlahBayar.setVisible(false); 
        Kembalian.setVisible(false);
        txtKembalian.setEnabled(false);
        // btnBatal.setVisible(false);
        btnCetak.setVisible(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser2 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new custom.JTextFieldRounded();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        databahan1 = new javax.swing.JLabel();
        pnDetail = new javax.swing.JPanel();
        databahan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataDetail = new javax.swing.JTable();
        btnCloseDetail = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_first = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        btnCetak = new rojerusan.RSMaterialButtonRectangle();
        panelAdd = new javax.swing.JPanel();
        menubahan = new javax.swing.JLabel();
        namabahan = new javax.swing.JLabel();
        stokbahan = new javax.swing.JLabel();
        txtNamaMember = new custom.JTextFieldRounded();
        txtIdMember = new custom.JTextFieldRounded();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        batal2 = new rojerusan.RSMaterialButtonRectangle();
        stokbahan1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtId = new custom.JTextFieldRounded();
        stokbahan2 = new javax.swing.JLabel();
        txtHargaTotal = new custom.JTextFieldRounded();
        harga = new javax.swing.JLabel();
        hargaJual1 = new javax.swing.JLabel();
        txtTanggalPenjualan = new custom.JTextFieldRounded();
        btnSetMember = new javax.swing.JButton();
        txtNoTelepon = new custom.JTextFieldRounded();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataSementara = new javax.swing.JTable();
        btnUbah = new rojerusan.RSMaterialButtonRectangle();
        btnDelete = new rojerusan.RSMaterialButtonRectangle();
        btnCancel1 = new rojerusan.RSMaterialButtonRectangle();
        untung = new javax.swing.JLabel();
        txtAlamat = new custom.JTextFieldRounded();
        stokbahan9 = new javax.swing.JLabel();
        stokbahan11 = new javax.swing.JLabel();
        namabahan2 = new javax.swing.JLabel();
        stokbahan12 = new javax.swing.JLabel();
        stokbahan13 = new javax.swing.JLabel();
        txtHargaJual = new custom.JTextFieldRounded();
        txtHargaResep = new custom.JTextFieldRounded();
        txtNamaResep = new custom.JTextFieldRounded();
        txtIdResep = new custom.JTextFieldRounded();
        btnSetResep = new javax.swing.JButton();
        txtKembalian = new custom.JTextFieldRounded();
        jumlahBeli = new javax.swing.JLabel();
        txtJumlahBeli = new custom.JTextFieldRounded();
        txtUntung = new custom.JTextFieldRounded();
        Kembalian = new javax.swing.JLabel();
        stokbahan10 = new javax.swing.JLabel();
        txtDiscount = new custom.JTextFieldRounded();
        stokbahan15 = new javax.swing.JLabel();
        jumlahBayar = new javax.swing.JLabel();
        txtJumlahBayar = new custom.JTextFieldRounded();

        dateChooser2.setTextRefernce(txtTanggalPenjualan);

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Member", "Nama Member", "Tanggal Penjualan", "Total Harga", "Jumlah Bayar", "Kembalian", "Petugas"
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

        btnAdd.setText("TAMBAH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        databahan1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan1.setForeground(new java.awt.Color(102, 102, 102));
        databahan1.setText("Menu Transaksi Penjualan");

        pnDetail.setBackground(new java.awt.Color(255, 255, 255));

        databahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan.setForeground(new java.awt.Color(102, 102, 102));
        databahan.setText("Detail Transaksi Penjualan");

        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDataDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Resep", "Nama Resep", "Harga Resep", "Harga Jual", "Jumlah Beli"
            }
        ));
        tblDataDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataDetail);

        btnCloseDetail.setForeground(new java.awt.Color(102, 102, 102));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addContainerGap(1222, Short.MAX_VALUE)
                .addComponent(btnCloseDetail)
                .addContainerGap())
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(databahan))
                    .addContainerGap()))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addComponent(btnCloseDetail)
                .addGap(0, 208, Short.MAX_VALUE))
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDetailLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(databahan)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_first.setText("First Page");

        btn_before.setText("<");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "20", "25" }));

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
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
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
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lb_halaman)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_first)
                        .addComponent(btn_before)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_next)
                        .addComponent(btn_last))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
                .addGap(31, 31, 31)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(databahan1))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(databahan1)
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        menubahan.setForeground(new java.awt.Color(102, 102, 102));
        menubahan.setText("Tambah Transaksi Penjualan");
        panelAdd.add(menubahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        namabahan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        namabahan.setForeground(new java.awt.Color(102, 102, 102));
        namabahan.setText("Nama");
        panelAdd.add(namabahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 37));

        stokbahan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan.setText("Member");
        panelAdd.add(stokbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        panelAdd.add(txtNamaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 182, -1));

        txtIdMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMemberActionPerformed(evt);
            }
        });
        panelAdd.add(txtIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 182, 40));

        btnSave.setText("SIMPAN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelAdd.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 95, 49));

        batal2.setBackground(new java.awt.Color(255, 102, 0));
        batal2.setText("BATAL");
        batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal2ActionPerformed(evt);
            }
        });
        panelAdd.add(batal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 95, 49));

        stokbahan1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan1.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan1.setText("Alamat");
        panelAdd.add(stokbahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        stokbahan2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan2.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan2.setText("ID");

        txtHargaTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtHargaTotal.setText("Enter after input jumlah beli");

        harga.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        harga.setForeground(new java.awt.Color(102, 102, 102));
        harga.setText(" Harga");

        hargaJual1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        hargaJual1.setForeground(new java.awt.Color(102, 102, 102));
        hargaJual1.setText("Tanggal Penjualan");

        txtTanggalPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalPenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(stokbahan2)
                .addGap(90, 90, 90)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(hargaJual1)
                .addGap(18, 18, 18)
                .addComponent(txtTanggalPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(harga)
                .addGap(18, 18, 18)
                .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga)
                    .addComponent(stokbahan2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaJual1)
                    .addComponent(txtTanggalPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAdd.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1230, 50));

        btnSetMember.setText("...");
        btnSetMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetMemberActionPerformed(evt);
            }
        });
        panelAdd.add(btnSetMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 38, 40));
        panelAdd.add(txtNoTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, -1));

        tblDataSementara.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDataSementara.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID Transaksi", "ID Resep", "Nama Resep", "Harga Resep", "Harga Jual", "Jumlah Beli", "Untung"
            }
        ));
        tblDataSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSementaraMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDataSementara);

        panelAdd.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 1240, 140));

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        panelAdd.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 95, 49));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelAdd.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 95, 49));

        btnCancel1.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel1.setText("BATAL");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        panelAdd.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 95, 49));

        untung.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        untung.setForeground(new java.awt.Color(102, 102, 102));
        untung.setText("Untung");
        panelAdd.add(untung, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, -1, -1));
        panelAdd.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 182, -1));

        stokbahan9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan9.setText("%");
        panelAdd.add(stokbahan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        stokbahan11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan11.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan11.setText("Resep");
        panelAdd.add(stokbahan11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        namabahan2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        namabahan2.setForeground(new java.awt.Color(102, 102, 102));
        namabahan2.setText("Nama");
        panelAdd.add(namabahan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 37));

        stokbahan12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan12.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan12.setText("Harga Resep");
        panelAdd.add(stokbahan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        stokbahan13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan13.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan13.setText("Harga Jual");
        panelAdd.add(stokbahan13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));
        panelAdd.add(txtHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 182, -1));
        panelAdd.add(txtHargaResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 182, -1));
        panelAdd.add(txtNamaResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 182, -1));

        txtIdResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdResepActionPerformed(evt);
            }
        });
        panelAdd.add(txtIdResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 182, 40));

        btnSetResep.setText("...");
        btnSetResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetResepActionPerformed(evt);
            }
        });
        panelAdd.add(btnSetResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 38, 40));

        txtKembalian.setForeground(new java.awt.Color(153, 153, 153));
        txtKembalian.setText("Enter after input jumlah bayar");
        panelAdd.add(txtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 310, 182, -1));

        jumlahBeli.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jumlahBeli.setText("Jumlah Beli");
        panelAdd.add(jumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));
        panelAdd.add(txtJumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 182, -1));

        txtUntung.setForeground(new java.awt.Color(153, 153, 153));
        txtUntung.setText("Enter after input jumlah beli");
        panelAdd.add(txtUntung, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, 182, -1));

        Kembalian.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Kembalian.setForeground(new java.awt.Color(153, 153, 153));
        Kembalian.setText("Kembalian");
        panelAdd.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, -1, -1));

        stokbahan10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan10.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan10.setText("No Telepon");
        panelAdd.add(stokbahan10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        panelAdd.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 40, -1));

        stokbahan15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan15.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan15.setText("Discount");
        panelAdd.add(stokbahan15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jumlahBayar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jumlahBayar.setText("Jumlah Bayar");
        panelAdd.add(jumlahBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, -1, -1));

        txtJumlahBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBayarActionPerformed(evt);
            }
        });
        panelAdd.add(txtJumlahBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 260, 182, -1));

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txtId.setText(setIdTransaksi());
        btnUbah.setText("SIMPAN");
        btnDelete.setVisible(false);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void batal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal2ActionPerformed
        deleteDataSementara();
        showPanel();
        loadData();
    }//GEN-LAST:event_batal2ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        pnDetail.setVisible(true);
        
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        getDataDetail((DefaultTableModel) tblDataDetail.getModel(), id);
        // btnBatal.setVisible(true);
        btnCetak.setVisible(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataDetailMouseClicked

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btnSetMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetMemberActionPerformed
        setMember();
        if (!txtNamaMember.getText().equals("Non Member") && txtTanggalPenjualan.getText().equals("12-12-2024") || txtTanggalPenjualan.getText().equals("05-12-2025")) {
            txtDiscount.setText("10"); 
        } else{
            txtDiscount.setText("");
        }
        
    }//GEN-LAST:event_btnSetMemberActionPerformed

    private void tblDataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSementaraMouseClicked
        btnUbah.setText("UBAH");
        btnDelete.setVisible(true);
        btnUbah.setVisible(true);
        dataTabelSementara();
        btnSetMember.setVisible(false);
        btnCancel1.setVisible(true);
        txtHargaResep.setEnabled(true);
        btnSetResep.setVisible(true);
        txtHargaResep.setEnabled(false);
        txtUntung.setEnabled(false);
        txtUntung.setText("");
        txtHargaTotal.setText("");
        txtJumlahBeli.setEnabled(true);
        untung.setText("Untung");
        harga.setText("Harga");
        btnSetResep.setVisible(false);
        txtJumlahBayar.setVisible(false);
        txtKembalian.setVisible(false);
        jumlahBayar.setVisible(false);
        Kembalian.setVisible(false);
    }//GEN-LAST:event_tblDataSementaraMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        if (btnUbah.getText().equals("SIMPAN")) {
        insertDataSementara();
        } else if(btnUbah.getText().equals("UBAH")){
         updateData();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
        btnUbah.setText("SIMPAN");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        loadDataSementara();
        resetForm();
        btnUbah.setVisible(false);
        btnDelete.setVisible(false);
        btnCancel1.setVisible(false);
        
                btnSave.requestFocus();
                clickNoSementara();
                txtJumlahBayar.setVisible(true);
                txtJumlahBayar.setEnabled(true);
                txtKembalian.setVisible(true);
                txtKembalian.setEnabled(true);
                jumlahBayar.setVisible(true);
                Kembalian.setVisible(true);
                txtKembalian.setEnabled(false);
            
            int totalHarga = getTotalHarga(txtId.getText());
            int totalUntung = getTotalUntung(txtId.getText());
            
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
            loadDataSementara();
            harga.setText("Total Harga");
            untung.setText("Total Untung");
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
        {
            btnSave.setText("SIMPAN");
        }
        else if(btnSave.getText().equals("SIMPAN"))
        {   
            if(txtKembalian.getText().equals("")) {
                loadDataSementara();
                resetForm();
            } else {
            insertData();
            insertDataDetail();
            deleteDataSementara();
            resetForm();
            loadData();
            showPanel();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIdMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMemberActionPerformed

    private void btnCloseDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDetailMouseClicked
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCloseDetailMouseClicked

    private void txtIdResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdResepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdResepActionPerformed

    private void btnSetResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetResepActionPerformed
        setResep();
        txtHargaTotal.setText("Enter after input jumlah beli");
        txtUntung.setText("Enter after input jumlah beli");
        harga.setText("Harga");
        untung.setText("Untung");
    }//GEN-LAST:event_btnSetResepActionPerformed

    private void txtTanggalPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalPenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPenjualanActionPerformed

    private void txtJumlahBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBayarActionPerformed
        String jumlahBayarText = txtJumlahBayar.getText();
        String hargaTotalText = txtHargaTotal.getText();
            
            if (jumlahBayarText.isEmpty()) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "MASUKKAN UANG PEMBELI");
                panel.showNotification();
            }
            return;
            }

            int jumlahBayar = Integer.parseInt(jumlahBayarText);
            int hargaTotal = Integer.parseInt(hargaTotalText);
            
            if (jumlahBayar < hargaTotal) {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "TIDAK BOLEH UTANG");
                panel.showNotification();
            }
            return; 
            }
            
            int kembalian = jumlahBayar - hargaTotal; 
            
            txtKembalian.setText(String.valueOf(kembalian)); 
    }//GEN-LAST:event_txtJumlahBayarActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tblData.getSelectedRow();

        String idTransaksi = tblData.getValueAt(row, 0).toString(); // Ambil ID Transaksi dari kolom pertama

try {
    String reportPath = "src/report/nota.jasper"; 

    // Siapkan parameter
    HashMap<String, Object> parameters = new HashMap<>();
    parameters.put("id_transaksi", idTransaksi); // Sesuaikan dengan parameter yang ada di laporan

    JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);

    JasperViewer viewer = new JasperViewer(print, false);
    viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
    viewer.setVisible(true);
} catch (Exception e) {
    e.printStackTrace();
}

    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCloseDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseDetailActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kembalian;
    private rojerusan.RSMaterialButtonRectangle batal2;
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnCancel1;
    private rojerusan.RSMaterialButtonRectangle btnCetak;
    private javax.swing.JButton btnCloseDetail;
    private rojerusan.RSMaterialButtonRectangle btnDelete;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private javax.swing.JButton btnSetMember;
    private javax.swing.JButton btnSetResep;
    private rojerusan.RSMaterialButtonRectangle btnUbah;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel databahan1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel hargaJual1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jumlahBayar;
    private javax.swing.JLabel jumlahBeli;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JLabel menubahan;
    private javax.swing.JLabel namabahan;
    private javax.swing.JLabel namabahan2;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JLabel stokbahan;
    private javax.swing.JLabel stokbahan1;
    private javax.swing.JLabel stokbahan10;
    private javax.swing.JLabel stokbahan11;
    private javax.swing.JLabel stokbahan12;
    private javax.swing.JLabel stokbahan13;
    private javax.swing.JLabel stokbahan15;
    private javax.swing.JLabel stokbahan2;
    private javax.swing.JLabel stokbahan9;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblDataSementara;
    private custom.JTextFieldRounded txtAlamat;
    private custom.JTextFieldRounded txtDiscount;
    private custom.JTextFieldRounded txtHargaJual;
    private custom.JTextFieldRounded txtHargaResep;
    private custom.JTextFieldRounded txtHargaTotal;
    private custom.JTextFieldRounded txtId;
    private custom.JTextFieldRounded txtIdMember;
    private custom.JTextFieldRounded txtIdResep;
    private custom.JTextFieldRounded txtJumlahBayar;
    private custom.JTextFieldRounded txtJumlahBeli;
    private custom.JTextFieldRounded txtKembalian;
    private custom.JTextFieldRounded txtNamaMember;
    private custom.JTextFieldRounded txtNamaResep;
    private custom.JTextFieldRounded txtNoTelepon;
    private custom.JTextFieldRounded txtSearch;
    private custom.JTextFieldRounded txtTanggalPenjualan;
    private custom.JTextFieldRounded txtUntung;
    private javax.swing.JLabel untung;
    // End of variables declaration//GEN-END:variables
    
    private void enabledFalse() {
        txtId.setEnabled(false);
        txtHargaTotal.setEnabled(false);
        txtKembalian.setEnabled(false);
        
        txtIdMember.setEnabled(false);
        txtNamaMember.setEnabled(false);
        txtNoTelepon.setEnabled(false);
        
        txtIdResep.setEnabled(false);
        txtNamaResep.setEnabled(false);
        txtHargaJual.setEnabled(false);
    }
    
    private void countHargaPembelian() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        txtJumlahBeli.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String jumlahBeliText = txtJumlahBeli.getText();
            String hargaJualText = txtHargaJual.getText();
            String hargaResepText = txtHargaResep.getText();
            
            if (jumlahBeliText.isEmpty()) {  
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "MASUKKAN JUMLAH VARIAN");
                panel.showNotification();
            }
            return;
            }

            int jumlahBeli = Integer.parseInt(jumlahBeliText);
            int hargaJual = Integer.parseInt(hargaJualText);
            int hargaResep = Integer.parseInt(hargaResepText);
            
            int totalHarga = jumlahBeli * hargaJual; 
            int untung = totalHarga - (jumlahBeli * hargaResep);
            
            txtHargaTotal.setText(String.valueOf(totalHarga)); 
            txtUntung.setText(String.valueOf(untung));
        }
    });
    }
    
    
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
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM transaksi";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null, e);
        }
        return totalData;
    }
    
    private void loadData() {
    calculateTotalPages();
    int totalData = getTotalData();
    lb_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));
    
    int startIndex = (halamanSaatIni - 1) * dataPerHalaman; // Indeks awal untuk pagination
    getData(startIndex, dataPerHalaman, (DefaultTableModel) tblData.getModel());
    btnDelete.setVisible(false);
    pnDetail.setVisible(false);
}
    
    private void resetForm() {
        txtIdResep.setText("");
        txtNamaResep.setText("");
        txtHargaResep.setText("");
        txtHargaJual.setText("");
    }
    
    private void resetFormBahan() {
        txtIdResep.setText("");
        txtNamaResep.setText("");
        txtHargaResep.setText("");
        txtHargaJual.setText("");
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new menuTransaksi(id_user));
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail.getModel();
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM detail_transaksi WHERE id_transaksi = '"+id+"'";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idTransaksi      = rs.getString("id_transaksi");
                    String idResep          = rs.getString("id_resep");
                    String namaResep        = rs.getString("nama_resep");
                    int hargaResep          = rs.getInt("harga_resep");
                    int hargaJual           = rs.getInt("harga_jual");
                    int jumlahBeli          = rs.getInt("jumlah_beli");
                    int Untung              = rs.getInt("untung");
                    

                    Object[] rowData = {idTransaksi, idResep, namaResep, hargaResep, hargaJual, jumlahBeli, Untung };
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT t.id_transaksi, t.id_member, t.nama_member, DATE(t.tgl_penjualan) AS tgl_penjualan, t.total_harga, t.jumlah_bayar, "
                   + "t.kembalian, us.nama FROM transaksi t INNER JOIN user us ON t.id_user = us.id_user ORDER BY t.id_transaksi ASC LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idTransaksi = rs.getString("id_transaksi");
                    String idMember = rs.getString("id_member");
                    String namaMember = rs.getString("nama_member");
                    String tglPenjualan = rs.getString("tgl_penjualan");
                    int totalHarga = rs.getInt("total_harga");
                    int jumlahBayar = rs.getInt("jumlah_bayar");
                    int Kembalian = rs.getInt("kembalian");
                    String namaUser = rs.getString("nama");
                    

                    Object[] rowData = {idTransaksi, idMember, namaMember, tglPenjualan, 
                        totalHarga, jumlahBayar, Kembalian, namaUser};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    private String setIdTransaksi() {
    String urutan = null;
    String prefix = "TRP";

    try {
        // Ambil semua ID yang ada
        String sql = "SELECT CAST(SUBSTRING(id_transaksi, 4) AS UNSIGNED) AS Nomor FROM transaksi WHERE id_transaksi LIKE ? ORDER BY Nomor ASC";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, prefix + "%");
            ResultSet rs = st.executeQuery();

            int expectedNomor = 1; // Mulai dari 1
            while (rs.next()) {
                int currentNomor = rs.getInt("Nomor");
                if (currentNomor != expectedNomor) {
                    // Jika ada gap, gunakan expectedNomor sebagai ID baru
                    urutan = prefix + String.format("%04d", expectedNomor);
                    return urutan;
                }
                expectedNomor++;
            }
            urutan = prefix + String.format("%04d", expectedNomor);
        }
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }

    return urutan;
    }
    
    private void setMember(){
        boolean closable = true;
        dataMember member = new dataMember(null, closable);
        member.setVisible(true);
        
        txtIdMember.setText(member.getId_member());
        txtNamaMember.setText(member.getNama_member());
        txtAlamat.setText(member.getAlamat());
        txtNoTelepon.setText(member.getNo_telepon());
        
        txtIdMember.setEnabled(false);
        txtNamaMember.setEnabled(false);
        txtAlamat.setEnabled(false);
        txtNoTelepon.setEnabled(false);
    }
    
    private void setResep(){
        boolean closable = true;
        dataResep resep = new dataResep(null, closable);
        resep.setVisible(true);
        
        txtIdResep.setText(resep.getId_resep());
        txtNamaResep.setText(resep.getNama_resep());
        txtHargaResep.setText(resep.getHarga_resep());
        txtHargaJual.setText(resep.getHarga_jual());
        
        
        txtIdResep.setEnabled(false);
        txtNamaResep.setEnabled(false);
        txtHargaResep.setEnabled(false);
        txtHargaJual.setEnabled(false);
    }
    
    public boolean validasiNama(){
        boolean valid = false;
        String id_bahan = txtIdMember.getText();
        String nama_bahan = txtNamaMember.getText();
        
        String sql = "SELECT nama_bahan From bahan WHERE id_bahan!='"+ id_bahan +
                "' AND nama_bahan LIKE BINARY '"+ nama_bahan +"'";
        try (PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this, 
                        "Nama Bahan sudah ada\nSilahkan input nama Bahan yang berbeda",
                        "Peringatan",JOptionPane.WARNING_MESSAGE);
            }else{
                valid = true;
            }
        } catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return valid;
    }
    
    
    
    // SEMENTARA
    
    private void insertDataSementara() {
    String idTransaksi = txtId.getText();
    String idResep = txtIdResep.getText();
    String namaResep = txtNamaResep.getText();
    String hargaResep = txtHargaResep.getText();
    String hargaJual = txtHargaJual.getText();
    String jumlahBeli = txtJumlahBeli.getText();
    String Untung = txtUntung.getText();

    if (idTransaksi.isEmpty() || idResep.isEmpty() || jumlahBeli.isEmpty() || Untung.isEmpty() ) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return;
    } else if(txtHargaTotal.getText().equals("Enter after input jumlah beli")) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "ENTER SETELAH MEMASUKKAN JUMLAH BELI");
            panel.showNotification();
        }
            return;
    }

    try {
        String sql = "INSERT INTO sementara_transaksi (id_transaksi, id_resep ,nama_resep, harga_resep ,harga_jual, "
                + "jumlah_beli, untung) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            st.setString(2, idResep);
            st.setString(3, namaResep);
            st.setString(4, hargaResep);
            st.setString(5, hargaJual);
            st.setString(6, jumlahBeli);
            st.setString(7, Untung);
            st.executeUpdate();

            if (JOptionPane.showConfirmDialog(this, "Mau Beli Varian Lain?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetFormBahan();
                clickYesSementara();
            } else {
                resetForm();
                btnSave.requestFocus();
                clickNoSementara();
                txtJumlahBayar.setVisible(true);
                txtJumlahBayar.setEnabled(true);
                txtKembalian.setVisible(true);
                txtKembalian.setEnabled(true);
                jumlahBayar.setVisible(true);
                Kembalian.setVisible(true);
                txtKembalian.setEnabled(false);
            }
            int totalHarga = getTotalHarga(idTransaksi);
            int totalUntung = getTotalUntung(idTransaksi);
            
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
            loadDataSementara();
            harga.setText("Total Harga");
            untung.setText("Total Untung");
        }
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
}
    private void clickYesSementara() {
        btnSetMember.setVisible(false);
        txtJumlahBeli.setText("");
        txtHargaTotal.setText("");
        txtUntung.setText("");
    }
    
    private void clickNoSementara() {
                btnSetMember.setVisible(false);
                btnSetResep.setVisible(false);
                txtHargaResep.setEnabled(false);
                btnUbah.setVisible(false);
                harga.setText("Total Harga");
                untung.setText("Total Untung");
                txtJumlahBeli.setEnabled(false);
                txtUntung.setEnabled(false);
                txtJumlahBeli.setText("");
    }
    
    private int getTotalHarga(String idTransaksi) {
    int totalHarga = 0;
    
    try {
        String sql = "SELECT SUM(" + totalHarga + " + (harga_jual * jumlah_beli)) AS total FROM sementara_transaksi WHERE id_transaksi = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalHarga = rs.getInt("total");
            }
        } 
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
    
    return totalHarga;
    }
    
    private int getTotalUntung(String idTransaksi) {
    int totalUntung = 0;
    
    try {
        String sql = "SELECT SUM(" + totalUntung + " + untung ) AS total FROM sementara_transaksi WHERE id_transaksi = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalUntung = rs.getInt("total");
            }
        } 
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
    
    return totalUntung;
    }
    
    private void loadDataSementara() {
    int startIndex = 0; 
    int entriesPage = 10; 
    getDataSementara((DefaultTableModel) tblDataSementara.getModel(), startIndex, entriesPage);
}

public void getDataSementara(DefaultTableModel model, int startIndex, int entriesPage) {
    model.setRowCount(0);
    
    try {
       String sql = "SELECT * FROM sementara_transaksi LIMIT ?,?";
       try (PreparedStatement st = conn.prepareStatement(sql)) {
           st.setInt(1, startIndex);
           st.setInt(2, entriesPage);
           ResultSet rs = st.executeQuery();
           
           while (rs.next()) {
                String idTransaksi = rs.getString("id_transaksi");
                String idResep = rs.getString("id_resep");
                String namaResep = rs.getString("nama_resep");
                String hargaResep = rs.getString("harga_resep");
                String hargaJual = rs.getString("harga_jual");
                String jumlahBeli = rs.getString("jumlah_beli");
                String untung = rs.getString("untung");


                Object[] rowData = {idTransaksi, idResep, namaResep ,hargaResep, hargaJual, jumlahBeli, untung};
                model.addRow(rowData);
            }
       }
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
}
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblDataSementara.getModel();
    }
    
    public void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM sementara_transaksi LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idTransaksi          = rs.getString("id_transaksi");
                    String idResep              = rs.getString("id_resep");
                    String namaResep            = rs.getString("nama_resep");
                    String hargaResep           = rs.getString("harga_resep");
                    String hargaJual            = rs.getString("harga_jual");
                    String jumlahBeli           = rs.getString("jumlah_beli");
                    String untung               = rs.getString("untung");
                    

                    Object[] rowData = {idTransaksi, idResep, namaResep, hargaResep, hargaJual, jumlahBeli, untung};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    // main
    private void insertData() {
    String idTransaksi = txtId.getText();
    String idMember = txtIdMember.getText();
    String namaMember = txtNamaMember.getText();
    String totalHarga = txtHargaTotal.getText();
    String jumlahBayar = txtJumlahBayar.getText();
    String Kembalian = txtKembalian.getText();
    String untungPerTransaksi = txtUntung.getText();
    
    
    // Dapatkan waktu sekarang dalam format yang benar
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String tglPenjualan = LocalDateTime.now().format(formatter);
    
    if(jumlahBayar.isEmpty()){
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return;
        }
    try {
        String sql = "INSERT INTO transaksi (id_transaksi, id_member, nama_member, tgl_penjualan, total_harga, jumlah_bayar, "
                + "kembalian, untung_per_transaksi, id_user) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            st.setString(2, idMember);
            st.setString(3, namaMember);
            st.setString(4, tglPenjualan); // Waktu sekarang dalam format yang sesuai
            st.setString(5, totalHarga);
            st.setString(6, jumlahBayar);
            st.setString(7, Kembalian);
            st.setString(8, untungPerTransaksi);
            st.setString(9, id_user);

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DITAMBAHKAN");
                panel.showNotification();
            }
            
                resetForm();
                loadData();
                showPanel();
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
}


    
    private void insertDataDetail() {
    String idTransaksi = txtId.getText();

    try {
        // Mulai transaksi
        conn.setAutoCommit(false);

        // 1. Insert data dari sementara_transaksi ke detail_transaksi
        String insertSQL = "INSERT INTO detail_transaksi (id_transaksi, id_resep, nama_resep, harga_resep, harga_jual, jumlah_beli, untung) "
                         + "SELECT ?, id_resep, nama_resep, harga_resep, harga_jual, jumlah_beli, untung FROM sementara_transaksi";

        try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
            insertStmt.setString(1, idTransaksi);
            insertStmt.executeUpdate();
        }

        // 2. Ambil data dari sementara_transaksi
        String selectSQL = "SELECT id_resep, jumlah_beli FROM sementara_transaksi";

        try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
             ResultSet rs = selectStmt.executeQuery()) {

            while (rs.next()) {
                String idResep = rs.getString("id_resep");
                int jumlahBeli = rs.getInt("jumlah_beli");
                System.out.println("Processing id_resep: " + idResep + ", jumlah_beli: " + jumlahBeli);

                // 3. Ambil bahan dari detail_resep
                String detailSQL = "SELECT id_bahan, jumlah_bahan FROM detail_resep WHERE id_resep = ?";
                try (PreparedStatement detailStmt = conn.prepareStatement(detailSQL)) {
                    detailStmt.setString(1, idResep);

                    try (ResultSet detailRs = detailStmt.executeQuery()) {
                        while (detailRs.next()) {
                            String idBahan = detailRs.getString("id_bahan");
                            int jumlahBahan = detailRs.getInt("jumlah_bahan");
                            int penguranganStok = jumlahBeli * jumlahBahan;

                            System.out.println("  Bahan: " + idBahan + ", Pengurangan Stok: " + penguranganStok);

                            // 4. Update stok bahan
                            String updateSQL = "UPDATE bahan SET stok_bahan = stok_bahan - ? WHERE id_bahan = ?";
                            try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                                updateStmt.setInt(1, penguranganStok);
                                updateStmt.setString(2, idBahan);
                                int rowsUpdated = updateStmt.executeUpdate();

                                if (rowsUpdated > 0) {
                                    System.out.println("  Stok bahan " + idBahan + " berhasil diperbarui.");
                                } else {
                                    System.out.println("  Gagal memperbarui stok bahan " + idBahan);
                                }
                            }
                        }
                    }
                }
                
                
                
                String detailSQLV = "SELECT id_varian FROM resep WHERE id_resep = ?";
                try (PreparedStatement detailStmt = conn.prepareStatement(detailSQLV)) {
                    detailStmt.setString(1, idResep);

                    try (ResultSet detailRs = detailStmt.executeQuery()) {
                        while (detailRs.next()) {
                            String idVarian = detailRs.getString("id_varian");

                            System.out.println("idVarian: " + idVarian);

                            // Hitung pengurangan stok_varian
                            int penguranganStokVarian;
                            if ("V001".equals(idVarian)) {
                                penguranganStokVarian = 50 * jumlahBeli;
                            } else {
                                penguranganStokVarian = 1 * jumlahBeli;
                            }

                            // Update stok_varian
                            String updateSQLVarian = "UPDATE varian SET stok_varian = stok_varian - ? WHERE id_varian = ?";
                            try (PreparedStatement updateStmtVarian = conn.prepareStatement(updateSQLVarian)) {
                                updateStmtVarian.setInt(1, penguranganStokVarian);
                                updateStmtVarian.setString(2, idVarian);
                                int rowsUpdatedVarian = updateStmtVarian.executeUpdate();

                                if (rowsUpdatedVarian > 0) {
                                    System.out.println("  Stok varian " + idVarian + " berhasil diperbarui. Dikurangi: " + penguranganStokVarian);
                                } else {
                                    System.out.println("  Gagal memperbarui stok varian " + idVarian);
                                }
                            }
                        }
                    }
                }

            }
        }

        // Commit transaksi
        conn.commit();
        System.out.println("Transaksi berhasil.");
    } catch (Exception e) {
        // Rollback jika terjadi error
        try {
            conn.rollback();
            System.out.println("Terjadi kesalahan. Semua perubahan dibatalkan.");
        } catch (Exception rollbackEx) {
            rollbackEx.printStackTrace();
        }
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    } finally {
        // Pastikan koneksi kembali ke auto-commit
        try {
            conn.setAutoCommit(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}



    private void dataTabelSementara() {
        int row = tblDataSementara.getSelectedRow();
        
        if(row!=-1) {
            
        txtId.setText(tblDataSementara.getValueAt(row, 0).toString());
        txtIdResep.setText(tblDataSementara.getValueAt(row, 1).toString());
        txtNamaResep.setText(tblDataSementara.getValueAt(row, 2).toString());
        txtHargaResep.setText(tblDataSementara.getValueAt(row, 3).toString());
        txtHargaJual.setText(tblDataSementara.getValueAt(row, 4).toString());
        txtJumlahBeli.setText(tblDataSementara.getValueAt(row, 5).toString());
        txtUntung.setText(tblDataSementara.getValueAt(row, 6).toString());
        
        }
    }
    
    private void updateData() {
    String idTransaksi = txtId.getText();
    String idResep = txtIdResep.getText();
    String namaResep = txtNamaResep.getText();
    String hargaResep = txtHargaResep.getText();
    String hargaJual = txtHargaJual.getText();
    String jumlahBeli = txtJumlahBeli.getText();
    String Untung = txtUntung.getText();
    
    if (idTransaksi.isEmpty() || idResep.isEmpty() || jumlahBeli.isEmpty() 
        || Untung.isEmpty()) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return;
    }

    try {
        String sql = "UPDATE sementara_transaksi SET id_transaksi=?, nama_resep=?, harga_resep=?, harga_jual=?, jumlah_beli =?, untung=? WHERE id_resep=?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            st.setString(2, namaResep);
            st.setString(3, hargaResep);
            st.setString(4, hargaJual);
            st.setString(5, jumlahBeli);
            st.setString(6, Untung);
            st.setString(7, idResep);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DIPERBARUI");
                panel.showNotification();
            }
            

                // Update total harga setelah data diperbarui
                int totalHarga = getTotalHarga(idTransaksi);
                int totalUntung = getTotalUntung(idTransaksi);
                
                
                if (!txtDiscount.getText().equals("")) {
                    int discount = Integer.parseInt(txtDiscount.getText());
                    
                    int countHarga = totalHarga - (totalHarga * discount / 100);
                    totalUntung = totalUntung - (totalHarga * discount / 100);
                    txtHargaTotal.setText(String.valueOf(countHarga));
                    txtUntung.setText(String.valueOf(totalUntung));
                }
                txtHargaTotal.setText(String.valueOf(totalHarga));
                txtUntung.setText(String.valueOf(totalUntung));
                
                
                resetForm();
                loadDataSementara();
                btnUbah.setVisible(false);
                btnDelete.setVisible(false);
                btnCancel1.setVisible(false);
                txtHargaResep.setEnabled(false);
                txtJumlahBeli.setText("");
                harga.setText("Total Harga");
                untung.setText("Total Untung");
                txtJumlahBeli.setEnabled( false);
                txtJumlahBayar.setVisible(true);
                txtKembalian.setVisible(true);
                txtKembalian.setEnabled(false);
                jumlahBayar.setVisible(true);
                Kembalian.setVisible(true);
            }
        }
        
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
    }
}

    private void deleteData() {
    int selectedRow = tblDataSementara.getSelectedRow();
    if (selectedRow == -1) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "PILIH DATA YANG INGIN DIHAPUS");
            panel.showNotification();
        }
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
            String sql = "DELETE FROM sementara_transaksi WHERE id_resep=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, id);

                int rowDeleted = st.executeUpdate();
                if (rowDeleted > 0) {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DIHAPUS");
                    panel.showNotification();
                }
            
                    
                    int totalHarga = getTotalHarga(txtId.getText());
                    int totalUntung = getTotalUntung(txtId.getText());
                
                
                    if (!txtDiscount.getText().equals("")) {
                    int discount = Integer.parseInt(txtDiscount.getText());
                    
                    int countHarga = totalHarga - (totalHarga * discount / 100);
                    totalUntung = totalUntung - (totalHarga * discount / 100);
                    txtHargaTotal.setText(String.valueOf(countHarga));
                    txtUntung.setText(String.valueOf(totalUntung));
                    }
                    txtHargaTotal.setText(String.valueOf(totalHarga));
                    txtUntung.setText(String.valueOf(totalUntung));
                    
                    loadDataSementara();
                    btnSetMember.setVisible(false);
                    btnUbah.setVisible(false);
                    btnDelete.setVisible(false);
                    btnCancel1.setVisible(false);
                    txtHargaResep.setEnabled(false);
                    txtJumlahBeli.setText("");
                    harga.setText("Total Harga");
                    untung.setText("Total Untung");
                    txtJumlahBeli.setEnabled( false);
                    txtJumlahBayar.setVisible(true);
                    txtKembalian.setVisible(true);
                    txtKembalian.setEnabled(false);
                    jumlahBayar.setVisible(true);
                    Kembalian.setVisible(true);
                } else {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "DATA GAGAL DIHAPUS");
                    panel.showNotification();
                }
            
                }
            }
            
        } catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    resetForm();
    loadDataSementara();
    btnUbah.setVisible(false);
    btnDelete.setVisible(false);
    btnCancel1.setVisible(false);
}
    
    private void deleteDataSementara(){
        try {
            String sql =  "DELETE FROM sementara_transaksi";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }   
        } catch (Exception e) {
            Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void searchData() {
    String kataKunci = txtSearch.getText().trim(); // Menghapus spasi di awal/akhir input

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT t.id_transaksi, t.id_member, t.nama_member, t.tgl_penjualan, "
                   + "t.total_harga, t.jumlah_bayar, t.kembalian, u.nama "
                   + "FROM transaksi t "
                   + "INNER JOIN user u ON t.id_user = u.id_user "
                   + "WHERE t.id_transaksi LIKE ? OR t.id_member LIKE ? OR t.nama_member LIKE ? "
                   + "OR t.tgl_penjualan LIKE ? OR t.total_harga LIKE ? OR t.jumlah_bayar LIKE ? "
                   + "OR t.kembalian LIKE ? OR u.nama LIKE ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter query untuk semua kolom
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            st.setString(3, "%" + kataKunci + "%");
            st.setString(4, "%" + kataKunci + "%");
            st.setString(5, "%" + kataKunci + "%");
            st.setString(6, "%" + kataKunci + "%");
            st.setString(7, "%" + kataKunci + "%");
            st.setString(8, "%" + kataKunci + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idTransaksi = rs.getString("id_transaksi");
                String idMember = rs.getString("id_member");
                String namaMember = rs.getString("nama_member");
                String tglPenjualan = rs.getString("tgl_penjualan");
                int totalHarga = rs.getInt("total_harga");
                int jumlahBayar = rs.getInt("jumlah_bayar");
                int kembalian = rs.getInt("kembalian");
                String namaUser = rs.getString("nama");
                Object[] rowData = {idTransaksi, idMember, namaMember, tglPenjualan, totalHarga,
                jumlahBayar, kembalian, namaUser};
                model.addRow(rowData);
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuTransaksi.class.getName()).log(Level.SEVERE, null, e);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Terjadi kesalahan saat mencari data: " + e.getMessage());
            panel.showNotification();
        }

    }
}



    
}
