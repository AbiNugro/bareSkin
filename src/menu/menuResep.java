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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import notification.Notification;

/**
 *
 * @author user
 */
public class menuResep extends javax.swing.JPanel {

    /**
     * Creates new form menuBahan
     */
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 20;
    private int totalPages;
    private String id_user;
    
    private final Connection conn;
    public menuResep(String id_user) {
        initComponents();
        
        conn = koneksi.getConnection();
        this.id_user = id_user;
        loadData();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        countHargaVarian();
        countHargaBahan();
        paginationVarian();
        enabledFalse();
        noText();
        btnCancel1.setVisible(false);
        
        hargaJual.setVisible(false);
        txtHargaJual.setVisible(false);
        
        setTabelModelSementara();
        loadDataSementara();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        panelAdd = new javax.swing.JPanel();
        menubahan = new javax.swing.JLabel();
        namabahan = new javax.swing.JLabel();
        stokbahan = new javax.swing.JLabel();
        txtNamaVarian = new custom.JTextFieldRounded();
        txtIdVarian = new custom.JTextFieldRounded();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        batal2 = new rojerusan.RSMaterialButtonRectangle();
        stokbahan1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtId = new custom.JTextFieldRounded();
        stokbahan2 = new javax.swing.JLabel();
        txtHargaTotal = new custom.JTextFieldRounded();
        hargaResep = new javax.swing.JLabel();
        hargaJual = new javax.swing.JLabel();
        txtHargaJual = new custom.JTextFieldRounded();
        btnSetVarian = new javax.swing.JButton();
        txtSatuanVarian = new custom.JTextFieldRounded();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataSementara = new javax.swing.JTable();
        btnUbah = new rojerusan.RSMaterialButtonRectangle();
        btnDelete = new rojerusan.RSMaterialButtonRectangle();
        btnCancel1 = new rojerusan.RSMaterialButtonRectangle();
        stokbahan4 = new javax.swing.JLabel();
        txtNamaResep = new custom.JTextFieldRounded();
        txtJumlahVarian = new custom.JTextFieldRounded();
        stokbahan9 = new javax.swing.JLabel();
        stokbahan10 = new javax.swing.JLabel();
        txtHargaSatuanVarian = new custom.JTextFieldRounded();
        stokbahan11 = new javax.swing.JLabel();
        namabahan2 = new javax.swing.JLabel();
        stokbahan12 = new javax.swing.JLabel();
        stokbahan13 = new javax.swing.JLabel();
        stokbahan14 = new javax.swing.JLabel();
        txtHargaSatuanBahan = new custom.JTextFieldRounded();
        txtSatuanBahan = new custom.JTextFieldRounded();
        txtJumlahBahan = new custom.JTextFieldRounded();
        txtNamaBahan = new custom.JTextFieldRounded();
        txtIdBahan = new custom.JTextFieldRounded();
        btnSetBahan = new javax.swing.JButton();
        txtHargaVarian = new custom.JTextFieldRounded();
        hargaJual1 = new javax.swing.JLabel();
        hargaJual2 = new javax.swing.JLabel();
        txtHargaBahan = new custom.JTextFieldRounded();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Resep", "ID Varian", "Nama Resep", "Harga Resep", "Harga Jual"
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
        databahan1.setText("Menu Resep");

        pnDetail.setBackground(new java.awt.Color(255, 255, 255));

        databahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan.setForeground(new java.awt.Color(102, 102, 102));
        databahan.setText("Detail Resep");

        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDataDetail.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID Resep", "ID Bahan", "Nama Bahan", "Jumlah Bahan", "Satuan", "Harga/satuan", "Harga Bahan"
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

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(databahan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1061, Short.MAX_VALUE)
                .addComponent(btnCloseDetail)
                .addContainerGap())
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCloseDetail)
                    .addComponent(databahan))
                .addGap(0, 198, Short.MAX_VALUE))
            .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDetailLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

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
                .addContainerGap(22, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(databahan1))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(897, 897, 897)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(databahan1)
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        menubahan.setForeground(new java.awt.Color(102, 102, 102));
        menubahan.setText("Tambah Resep");
        panelAdd.add(menubahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        namabahan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        namabahan.setForeground(new java.awt.Color(102, 102, 102));
        namabahan.setText("Nama");
        panelAdd.add(namabahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 37));

        stokbahan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan.setText("Varian");
        panelAdd.add(stokbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        panelAdd.add(txtNamaVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 182, -1));

        txtIdVarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVarianActionPerformed(evt);
            }
        });
        panelAdd.add(txtIdVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 182, 40));

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
        stokbahan1.setText("Jumlah");
        panelAdd.add(stokbahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        stokbahan2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan2.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan2.setText("ID");

        hargaResep.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        hargaResep.setForeground(new java.awt.Color(102, 102, 102));
        hargaResep.setText("Harga Sementara");

        hargaJual.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        hargaJual.setText("Harga Jual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(stokbahan2)
                .addGap(92, 92, 92)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(hargaResep)
                .addGap(18, 18, 18)
                .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(hargaJual)
                .addGap(41, 41, 41)
                .addComponent(txtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaResep)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokbahan2)
                    .addComponent(hargaJual)
                    .addComponent(txtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelAdd.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1220, -1));

        btnSetVarian.setText("...");
        btnSetVarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetVarianActionPerformed(evt);
            }
        });
        panelAdd.add(btnSetVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 38, 40));
        panelAdd.add(txtSatuanVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 182, -1));

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
                "ID Resep", "ID Bahan", "Nama Bahan", "Jumlah Bahan", "Satuan", "Harga/satuan", "Harga Bahan"
            }
        ));
        tblDataSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSementaraMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDataSementara);

        panelAdd.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 1220, 140));

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        panelAdd.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 95, 49));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelAdd.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 95, 49));

        btnCancel1.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel1.setText("BATAL");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        panelAdd.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 95, 49));

        stokbahan4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan4.setText("Nama Resep");
        panelAdd.add(stokbahan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, -1, -1));
        panelAdd.add(txtNamaResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 182, -1));
        panelAdd.add(txtJumlahVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 182, -1));

        stokbahan9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan9.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan9.setText("Satuan");
        panelAdd.add(stokbahan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        stokbahan10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan10.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan10.setText("Harga/satuan");
        panelAdd.add(stokbahan10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        panelAdd.add(txtHargaSatuanVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 182, -1));

        stokbahan11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan11.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan11.setText("Bahan");
        panelAdd.add(stokbahan11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        namabahan2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        namabahan2.setForeground(new java.awt.Color(102, 102, 102));
        namabahan2.setText("Nama");
        panelAdd.add(namabahan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 37));

        stokbahan12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan12.setText("Jumlah");
        panelAdd.add(stokbahan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        stokbahan13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan13.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan13.setText("Satuan");
        panelAdd.add(stokbahan13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        stokbahan14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokbahan14.setForeground(new java.awt.Color(102, 102, 102));
        stokbahan14.setText("Harga/satuan");
        panelAdd.add(stokbahan14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));
        panelAdd.add(txtHargaSatuanBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 182, -1));
        panelAdd.add(txtSatuanBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 182, -1));
        panelAdd.add(txtJumlahBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 182, -1));
        panelAdd.add(txtNamaBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 182, -1));

        txtIdBahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBahanActionPerformed(evt);
            }
        });
        panelAdd.add(txtIdBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 182, 40));

        btnSetBahan.setText("...");
        btnSetBahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBahanActionPerformed(evt);
            }
        });
        panelAdd.add(btnSetBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 38, 40));

        txtHargaVarian.setForeground(new java.awt.Color(102, 102, 102));
        txtHargaVarian.setText("Enter after input jumlah varian");
        panelAdd.add(txtHargaVarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 182, -1));

        hargaJual1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        hargaJual1.setForeground(new java.awt.Color(102, 102, 102));
        hargaJual1.setText("Harga Varian");
        panelAdd.add(hargaJual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, -1, -1));

        hargaJual2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        hargaJual2.setForeground(new java.awt.Color(102, 102, 102));
        hargaJual2.setText("Harga Bahan");
        panelAdd.add(hargaJual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, -1, -1));

        txtHargaBahan.setForeground(new java.awt.Color(102, 102, 102));
        txtHargaBahan.setText("Enter after input jumlah bahan");
        panelAdd.add(txtHargaBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, 182, -1));

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txtId.setText(setIdResep());
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
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataDetailMouseClicked

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btnSetVarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetVarianActionPerformed
        setVarian();
    }//GEN-LAST:event_btnSetVarianActionPerformed

    private void tblDataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSementaraMouseClicked
        
        btnUbah.setText("UBAH");
        btnDelete.setVisible(true);
        btnUbah.setVisible(true);
        dataTabelSementara();
        btnSetVarian.setVisible(false);
        btnCancel1.setVisible(true);
        txtJumlahBahan.setEnabled(true);
        txtHargaBahan.setText("");
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
        txtHargaBahan.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        loadDataSementara();
        resetForm();
        btnUbah.setVisible(false);
        btnDelete.setVisible(false);
        btnCancel1.setVisible(false);
        txtJumlahBahan.setEnabled(false);
        txtHargaBahan.setText("");
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
        {
            btnSave.setText("SIMPAN");
        }
        else if(btnSave.getText().equals("SIMPAN"))
        {
            if(txtHargaJual.getText().equals("")) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "MASUKKAN HARGA JUAL");
                    panel.showNotification();
                }
            return;
            }
            if (JOptionPane.showConfirmDialog(this, "Yakin sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { 
            insertData();
            insertDataDetail();
            deleteDataSementara();
            resetForm();
            loadData();
            showPanel();
            } else {
                resetForm();
                loadDataSementara();
            }
        }
        else if (btnSave.getText().equals("PERBARUI"))
        {
            updateData();
            resetForm();
            loadData();
            showPanel();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIdVarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVarianActionPerformed

    private void btnCloseDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDetailMouseClicked
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCloseDetailMouseClicked

    private void txtIdBahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBahanActionPerformed

    private void btnSetBahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBahanActionPerformed
        setBahan();
    }//GEN-LAST:event_btnSetBahanActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle batal2;
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnCancel1;
    private javax.swing.JButton btnCloseDetail;
    private rojerusan.RSMaterialButtonRectangle btnDelete;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private javax.swing.JButton btnSetBahan;
    private javax.swing.JButton btnSetVarian;
    private rojerusan.RSMaterialButtonRectangle btnUbah;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel databahan1;
    private javax.swing.JLabel hargaJual;
    private javax.swing.JLabel hargaJual1;
    private javax.swing.JLabel hargaJual2;
    private javax.swing.JLabel hargaResep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JLabel stokbahan14;
    private javax.swing.JLabel stokbahan2;
    private javax.swing.JLabel stokbahan4;
    private javax.swing.JLabel stokbahan9;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblDataSementara;
    private custom.JTextFieldRounded txtHargaBahan;
    private custom.JTextFieldRounded txtHargaJual;
    private custom.JTextFieldRounded txtHargaSatuanBahan;
    private custom.JTextFieldRounded txtHargaSatuanVarian;
    private custom.JTextFieldRounded txtHargaTotal;
    private custom.JTextFieldRounded txtHargaVarian;
    private custom.JTextFieldRounded txtId;
    private custom.JTextFieldRounded txtIdBahan;
    private custom.JTextFieldRounded txtIdVarian;
    private custom.JTextFieldRounded txtJumlahBahan;
    private custom.JTextFieldRounded txtJumlahVarian;
    private custom.JTextFieldRounded txtNamaBahan;
    private custom.JTextFieldRounded txtNamaResep;
    private custom.JTextFieldRounded txtNamaVarian;
    private custom.JTextFieldRounded txtSatuanBahan;
    private custom.JTextFieldRounded txtSatuanVarian;
    private custom.JTextFieldRounded txtSearch;
    // End of variables declaration//GEN-END:variables
    
    private void enabledFalse() {
        txtId.setEnabled(false);
        txtHargaTotal.setEnabled(false);
        txtHargaVarian.setEnabled(false);
        txtHargaBahan.setEnabled(false);
        
        txtIdVarian.setEnabled(false);
        txtNamaVarian.setEnabled(false);
        txtSatuanVarian.setEnabled(false);
        txtHargaSatuanVarian.setEnabled(false);
        
        txtIdBahan.setEnabled(false);
        txtNamaBahan.setEnabled(false);
        txtSatuanBahan.setEnabled(false);
        txtHargaSatuanBahan.setEnabled(false);
    }
    
    private void noText() {
    txtJumlahVarian.addKeyListener(new java.awt.event.KeyAdapter() { 
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            // Periksa apakah karakter bukan digit atau bukan kontrol
            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                evt.consume(); // Mengabaikan karakter input
                // Mendapatkan parent JFrame dari txtNomor
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(txtJumlahVarian);
                if (frame != null) {
                    SwingUtilities.invokeLater(() -> {
                        Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Input harus berupa angka!");
                        panel.showNotification();
                    });
                }
            }
            }
    });
    
    txtJumlahBahan.addKeyListener(new java.awt.event.KeyAdapter() { 
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            // Periksa apakah karakter bukan digit atau bukan kontrol
            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                evt.consume(); // Mengabaikan karakter input
                // Mendapatkan parent JFrame dari txtNomor
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(txtJumlahBahan);
                if (frame != null) {
                    SwingUtilities.invokeLater(() -> {
                        Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Input harus berupa angka!");
                        panel.showNotification();
                    });
                }
            }
            }
    });
    }
    
    private void countHargaVarian() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        txtJumlahVarian.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String jumlahVarianText = txtJumlahVarian.getText();
            String hargaSatuanVarianText = txtHargaSatuanVarian.getText(); 

            if (jumlahVarianText.isEmpty()) {
                if (frame != null) {
                    Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "MASUKKAN JUMLAH VARIAN");
                    panel.showNotification();
                }
            return; 
            }


            int jumlahVarian = Integer.parseInt(jumlahVarianText);
            int hargaSatuanVarian = Integer.parseInt(hargaSatuanVarianText);

            int hargaVarian = jumlahVarian * hargaSatuanVarian; 

            txtHargaVarian.setText(String.valueOf(hargaVarian)); 
            
            
        }
    });
    }
    
    private void countHargaBahan() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        txtJumlahBahan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String jumlahBahanText = txtJumlahBahan.getText();
            String hargaSatuanBahanText = txtHargaSatuanBahan.getText(); 

            if (jumlahBahanText.isEmpty()) {
                if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "MASUKKAN JUMLAH BAHAN!");
                panel.showNotification();
                }
                return;  
            }


            int jumlahBahan = Integer.parseInt(jumlahBahanText);
            int hargaSatuanBahan = Integer.parseInt(hargaSatuanBahanText);

            int hargaBahan = jumlahBahan * hargaSatuanBahan; 

            txtHargaBahan.setText(String.valueOf(hargaBahan)); 
            
            
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
            String sql = "SELECT COUNT(*) AS total FROM resep";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
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
        txtIdBahan.setText("");
        txtNamaBahan.setText("");
        txtJumlahBahan.setText("");
        txtSatuanBahan.setText("");
        txtHargaSatuanBahan.setText("");
    }
    
    private void resetFormBahan() {
        txtIdBahan.setText("");
        txtNamaBahan.setText("");
        txtJumlahBahan.setText("");
        txtSatuanBahan.setText("");
        txtHargaSatuanBahan.setText("");
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new menuResep(id_user));
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
           String sql = "SELECT * FROM detail_resep WHERE id_resep = '"+id+"'";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idResep      = rs.getString("id_resep");
                    String idBahan      = rs.getString("id_bahan");
                    String namaBahan    = rs.getString("nama_bahan");
                    int jumlahBahan     = rs.getInt("jumlah_bahan");
                    String satuan       = rs.getString("satuan");
                    int hargaPerSatuan  = rs.getInt("harga_per_satuan");
                    int hargaBahan      = rs.getInt("harga_bahan");
                    

                    Object[] rowData = {idResep, idBahan, namaBahan, jumlahBahan, satuan, hargaPerSatuan, hargaBahan };
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM resep LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idResep = rs.getString("id_resep");
                    String idVarian = rs.getString("id_varian");
                    String namaResep = rs.getString("nama_resep");
                    int hargaResep = rs.getInt("harga_resep");
                    int hargaJual = rs.getInt("harga_jual");
                    

                    Object[] rowData = {idResep, idVarian, namaResep, hargaResep, hargaJual};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    private String setIdResep() {
    String urutan = null;
    String prefix = "R";

    try {
        // Ambil semua ID yang ada
        String sql = "SELECT CAST(SUBSTRING(id_resep, 2) AS UNSIGNED) AS Nomor FROM resep WHERE id_resep LIKE ? ORDER BY Nomor ASC";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, prefix + "%");
            ResultSet rs = st.executeQuery();

            int expectedNomor = 1; // Mulai dari 1
            while (rs.next()) {
                int currentNomor = rs.getInt("Nomor");
                if (currentNomor != expectedNomor) {
                    // Jika ada gap, gunakan expectedNomor sebagai ID baru
                    urutan = prefix + String.format("%03d", expectedNomor);
                    return urutan;
                }
                expectedNomor++;
            }
            urutan = prefix + String.format("%03d", expectedNomor);
        }
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }

    return urutan;
    }
    
    private void setVarian(){
        boolean closable = true;
        dataVarian varian = new dataVarian(null, closable);
        varian.setVisible(true);
        
        txtIdVarian.setText(varian.getId_varian());
        txtNamaVarian.setText(varian.getNama_varian());
        txtSatuanVarian.setText(varian.getSatuan());
        txtHargaSatuanVarian.setText(varian.getHargaPerSatuan());
        
        txtIdVarian.setEnabled(false);
        txtNamaVarian.setEnabled(false);
        txtHargaSatuanVarian.setEnabled(false);
        txtSatuanVarian.setEnabled(false);
    }
    
    private void setBahan(){
        boolean closable = true;
        dataBahan bahan = new dataBahan(null, closable);
        bahan.setVisible(true);
        
        txtIdBahan.setText(bahan.getId_bahan());
        txtNamaBahan.setText(bahan.getNama_bahan());
        txtSatuanBahan.setText(bahan.getSatuan());
        txtHargaSatuanBahan.setText(bahan.getHargaPerSatuan());
        
        txtIdBahan.setEnabled(false);
        txtNamaBahan.setEnabled(false);
        txtHargaSatuanBahan.setEnabled(false);
        txtSatuanBahan.setEnabled(false);
    }
    
    public boolean validasiNama(){
        boolean valid = false;
        String id_bahan = txtIdVarian.getText();
        String nama_bahan = txtNamaVarian.getText();
        
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
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return valid;
    }
    
    
    
    // SEMENTARA
    
    private void insertDataSementara() {
    String idResep = txtId.getText();
    String idBahan = txtIdBahan.getText();
    String namaBahan = txtNamaBahan.getText();
    String jumlahBahan = txtJumlahBahan.getText();
    String satuanBahan = txtSatuanBahan.getText();
    String hargaSatuanBahan = txtHargaSatuanBahan.getText();
    String hargaBahan = txtHargaBahan.getText();
    String hargaVarian = txtHargaVarian.getText(); // Ambil harga varian

    if (idResep.isEmpty() || idBahan.isEmpty() || jumlahBahan.isEmpty() || hargaBahan.isEmpty() || txtNamaResep.getText().isEmpty()) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return;
    } else if(txtHargaVarian.getText().equals("Enter after input jumlah varian")) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "Enter setelah memasukkan jumlah varian/bahan");
            panel.showNotification();
        }
            return;
    } else if(txtHargaBahan.getText().equals("Enter after input jumlah bahan")) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "Enter setelah memasukkan jumlah varian/bahan");
            panel.showNotification();
        }
            return;
    }
    try {
        String sql = "INSERT INTO sementara_resep (id_resep, id_bahan ,nama_bahan ,jumlah_bahan ,satuan, "
                + "harga_per_satuan, harga_bahan) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idResep);
            st.setString(2, idBahan);
            st.setString(3, namaBahan);
            st.setString(4, jumlahBahan);
            st.setString(5, satuanBahan);
            st.setString(6, hargaSatuanBahan);
            st.setString(7, hargaBahan);
            st.executeUpdate();

            // Update total harga
            
            int totalHarga = getTotalHarga(idResep);
            txtHargaTotal.setText(String.valueOf(totalHarga));
            loadDataSementara();

            if (JOptionPane.showConfirmDialog(this, "Mau Tambah Bahan Untuk Resep?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetFormBahan();
                clickYesSementara();
                txtHargaBahan.setText("Enter after input jumlah bahan");
            } else {
                batal2.setVisible(false);
                resetForm();
                btnSave.requestFocus();
                clickNoSementara();
                hargaResep.setText("       Harga Resep ");

            if (!hargaVarian.isEmpty()) {
                int totalHargaVarian = totalHarga + Integer.parseInt(hargaVarian);
                txtHargaTotal.setText(String.valueOf(totalHargaVarian));
            }
            
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }
}
    private void clickYesSementara() {
        btnSetVarian.setVisible(false);
        txtJumlahVarian.setEnabled(false);
        txtNamaResep.setEnabled(false);
        txtHargaBahan.setText("");
    }
    
    private void clickNoSementara() {
          txtNamaResep.setEnabled(false);
                btnSetVarian.setVisible(false);
                btnSetBahan.setVisible(false);
                hargaJual.setVisible(true);
                txtHargaJual.setVisible(true);
                txtJumlahVarian.setEnabled(false);
                txtJumlahBahan.setEnabled(false);
                txtHargaBahan.setText("");
                btnUbah.setVisible(false);
    }
    
    private int getTotalHarga(String idResep) {
    int totalHarga = 0;
    
    try {
        String sql = "SELECT SUM(" + totalHarga + " + harga_bahan) AS total FROM sementara_resep WHERE id_resep = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idResep);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalHarga = rs.getInt("total");
            }
        } 
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }
    
    return totalHarga;
    }
    
    private void loadDataSementara() {
    int startIndex = 0; 
    int entriesPage = 10; 
    getDataSementara((DefaultTableModel) tblDataSementara.getModel(), startIndex, entriesPage);
}

public void getDataSementara(DefaultTableModel model, int startIndex, int entriesPage) {
    model.setRowCount(0);
    
    try {
       String sql = "SELECT * FROM sementara_resep LIMIT ?,?";
       try (PreparedStatement st = conn.prepareStatement(sql)) {
           st.setInt(1, startIndex);
           st.setInt(2, entriesPage);
           ResultSet rs = st.executeQuery();
           
           while (rs.next()) {
                String idResep = rs.getString("id_resep");
                String idBahan = rs.getString("id_bahan");
                String namaBahan = rs.getString("nama_bahan");
                String jumlahBahan = rs.getString("jumlah_bahan");
                String satuan = rs.getString("satuan");
                String hargaPerSatuan = rs.getString("harga_per_satuan");
                String hargaBahan = rs.getString("harga_bahan");


                Object[] rowData = {idResep, idBahan,namaBahan, jumlahBahan, satuan, hargaPerSatuan, hargaBahan};
                model.addRow(rowData);
            }
       }
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }
}
     
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblDataSementara.getModel();
    }
    
    public void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM sementara_resep LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idResep              = rs.getString("id_resep");
                    String idBahan              = rs.getString("id_bahan");
                    String namaBahan            = rs.getString("nama_bahan");
                    String jumlahBahan          = rs.getString("jumlah_bahan");
                    String satuan               = rs.getString("satuan");
                    String hargaPerSatuan       = rs.getString("harga_per_satuan");
                    String hargaBahan           = rs.getString("harga_bahan");
                    

                    Object[] rowData = {idResep, idBahan,namaBahan, jumlahBahan,satuan, hargaPerSatuan, hargaBahan};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    // main
    private void insertData() {
        String idResep = txtId.getText();
        String idVarian    = txtIdVarian.getText();
        String namaResep    = txtNamaResep.getText();
        String hargaResep    = txtHargaTotal.getText();
        String hargaJual    = txtHargaJual.getText();
        
        if(idResep.isEmpty() || idVarian.isEmpty() || hargaResep.isEmpty() || hargaJual.isEmpty()){
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return;
        }

  
        try {
            String sql = "INSERT INTO resep (id_resep, id_varian, nama_resep, harga_resep, harga_jual) VALUES (?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idResep);
                st.setString(2, idVarian);
                st.setString(3, namaResep);
                st.setString(4, hargaResep);
                st.setString(5, hargaJual);
                
                

                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
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
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null, e);
        }
        
    }

    
    private void insertDataDetail() {
    String idPembelianVarian = txtId.getText();

    try {
        String insertSQL = "INSERT INTO detail_resep (id_resep, id_bahan, nama_bahan, jumlah_bahan, satuan, harga_per_satuan, harga_bahan) "
                         + "SELECT ?, id_bahan, nama_bahan, jumlah_bahan, satuan, harga_per_satuan, harga_bahan FROM sementara_resep";

        try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
            insertStmt.setString(1, idPembelianVarian); // Indeks 1 untuk parameter pertama
            insertStmt.executeUpdate();
        }
        
/*
        String selectSQL = "SELECT id_varian, stok, harga_satuan FROM sementara_varian"; 
        
        try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
             ResultSet rs = selectStmt.executeQuery()) {
            
            while (rs.next()) {
                String idVarian = rs.getString("id_varian");
                int stokVarian = rs.getInt("stok");
                System.out.println("Updating id_varian: " + idVarian + ", Stok: " + stokVarian); // Log data yang diambil

                String updateSQL = "UPDATE varian SET stok_varian = stok_varian + ? WHERE id_varian = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                    updateStmt.setInt(1, stokVarian);  
                    updateStmt.setString(2, idVarian); 
                    int rowsUpdated = updateStmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("Update berhasil untuk id_varian: " + idVarian); // Log keberhasilan update
                    } else {
                        System.out.println("Tidak ada baris yang diupdate untuk id_varian: " + idVarian); // Log jika tidak ada perubahan
                    }
                }
            }
        }
        
        try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
             ResultSet rs = selectStmt.executeQuery()) {
            
            while (rs.next()) {
                String idVarian = rs.getString("id_varian");
                int hargaSatuan = rs.getInt("harga_satuan");
                System.out.println("Updating id_varian: " + idVarian + ", Harga Satuan: " + hargaSatuan); // Log data yang diambil

                String updateSQL = "UPDATE varian SET harga_per_satuan =  ? WHERE id_varian = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                    updateStmt.setInt(1, hargaSatuan);  
                    updateStmt.setString(2, idVarian); 
                    int rowsUpdated = updateStmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("Update berhasil untuk id_varian: " + idVarian); // Log keberhasilan update
                    } else {
                        System.out.println("Tidak ada baris yang diupdate untuk id_varian: " + idVarian); // Log jika tidak ada perubahan
                    }
                }
            }
        }
*/

    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }
}



    
    private void dataTabelSementara() {
        int row = tblDataSementara.getSelectedRow();
        
        if(row!=-1) {
            
        txtId.setText(tblDataSementara.getValueAt(row, 0).toString());
        txtIdBahan.setText(tblDataSementara.getValueAt(row, 1).toString());
        txtNamaBahan.setText(tblDataSementara.getValueAt(row, 2).toString());
        txtJumlahBahan.setText(tblDataSementara.getValueAt(row, 3).toString());
        txtSatuanBahan.setText(tblDataSementara.getValueAt(row, 4).toString());
        txtHargaSatuanBahan.setText(tblDataSementara.getValueAt(row, 5).toString());
        txtHargaBahan.setText(tblDataSementara.getValueAt(row, 6).toString());
        
        }
    }
    
    private void updateData() {
    String idResep = txtId.getText();
    String idBahan = txtIdBahan.getText();
    String namaBahan = txtNamaBahan.getText();
    String jumlahBahan = txtJumlahBahan.getText();
    String satuanBahan = txtSatuanBahan.getText();
    String hargaSatuanBahan = txtHargaSatuanBahan.getText();
    String hargaBahan = txtHargaBahan.getText();

    if (idResep.isEmpty() || idBahan.isEmpty() || jumlahBahan.isEmpty() || hargaSatuanBahan.isEmpty() 
        || hargaBahan.isEmpty()) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
            panel.showNotification();
        }
            return; 
    } else if(txtHargaBahan.getText().equals("Enter after input jumlah bahan")) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "Enter setelah memasukkan jumlah varian/bahan");
            panel.showNotification();
        }
            return;
    }
    try {
        String sql = "UPDATE sementara_resep SET id_resep=?, nama_bahan=?, jumlah_bahan=?, satuan=?, harga_per_satuan=?, harga_bahan=? WHERE id_bahan=?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idResep);
            st.setString(2, namaBahan);
            st.setString(3, jumlahBahan);
            st.setString(4, satuanBahan);
            st.setString(5, hargaSatuanBahan);
            st.setString(6, hargaBahan);
            st.setString(7, idBahan);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DIPERBARUI");
                panel.showNotification();
            }
            

                // Update total harga setelah data diperbarui
                int totalHarga = getTotalHarga(idResep);
                txtHargaTotal.setText(String.valueOf(totalHarga));
                
                if (!txtHargaVarian.getText().isEmpty()) {
                int totalHargaVarian = totalHarga + Integer.parseInt(txtHargaVarian.getText());
                txtHargaTotal.setText(String.valueOf(totalHargaVarian));
                }

                resetForm();
                loadDataSementara();
                btnUbah.setVisible(false);
                btnDelete.setVisible(false);
                btnCancel1.setVisible(false);
                txtJumlahBahan.setEnabled(false);
                txtHargaBahan.setText("");
            }
        }
        
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
    }
}

    private void deleteData() {
    int selectedRow = tblDataSementara.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Validasi", JOptionPane.WARNING_MESSAGE);
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
            String sql = "DELETE FROM sementara_resep WHERE id_bahan=?";
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
                    txtHargaTotal.setText(String.valueOf(totalHarga));

                    int totalHargaVarian = totalHarga + Integer.parseInt(txtHargaVarian.getText());
                    txtHargaTotal.setText(String.valueOf(totalHargaVarian));
                    
                    loadDataSementara(); // Refresh tabel setelah penghapusan
                    btnSetVarian.setVisible(false);
                } else {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    if (frame != null) {
                        Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "DATA GAGAL DIHAPUS");
                        panel.showNotification();
                    }
            
                }
            }
            
        } catch (Exception e) {
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    txtJumlahBahan.setEnabled(false);
    resetForm();
    loadDataSementara();
    btnUbah.setVisible(false);
    btnDelete.setVisible(false);
    btnCancel1.setVisible(false);
}
    private void deleteDataSementara(){
        try {
            String sql =  "DELETE FROM sementara_resep";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }   
        } catch (Exception e) {
            Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void searchData() {
    String kataKunci = txtSearch.getText().trim(); // Menghapus spasi di awal/akhir input

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT * FROM resep WHERE id_resep LIKE ? OR id_varian LIKE ? OR nama_resep LIKE ? OR harga_resep LIKE ? OR harga_jual LIKE ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter query untuk semua kolom
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            st.setString(3, "%" + kataKunci + "%");
            st.setString(4, "%" + kataKunci + "%");
            st.setString(5, "%" + kataKunci + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idResep = rs.getString("id_resep");
                String idVarian = rs.getString("id_varian");
                String namaResep = rs.getString("nama_resep");
                int hargaResep = rs.getInt("harga_resep");
                int hargaJual = rs.getInt("harga_jual");
                Object[] rowData = {idResep, idVarian, namaResep, hargaResep, hargaJual};
                model.addRow(rowData);
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuResep.class.getName()).log(Level.SEVERE, null, e);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Terjadi kesalahan saat mencari data: " + e.getMessage());
            panel.showNotification();
        }
            
    }
}


    
}
