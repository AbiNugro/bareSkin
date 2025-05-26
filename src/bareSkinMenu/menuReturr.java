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
import config.koneksi;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import notification.Notification;
/**
 *
 * @author LENOVO
 */
public class menuReturr extends javax.swing.JPanel {
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private String id_user;
    private String nama;
    private String level;
    private final Connection conn;
    
    
    public menuReturr(String id_user, String nama) {
        conn = koneksi.getConnection();
        initComponents();
        this.id_user = id_user;
        this.nama = nama;
        
        finishing();
        loadData();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        setTanggalHariIni();
        pagination();
        tanggalView();
    }
   
    public String getIdUser() {
        return id_user;
    }
    
    public String getNama() {
        return nama;
    }
    
    private void setTanggalHariIni() {
        Locale indonesia = new Locale("in", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", indonesia);
        String tanggalSekarang = sdf.format(new Date());
        tanggalPenjualan.setText(tanggalSekarang);
    }
    
    private void tanggalView() {
        Date tanggalHariIni = new Date();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID"));
        String tanggalFormatIndonesia = formatTanggal.format(tanggalHariIni);
        tanggalIndonesia.setText(tanggalFormatIndonesia);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        pnMain = new custom.PanelCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        panelCustom3 = new custom.PanelCustom();
        panelCustom6 = new custom.PanelCustom();
        namaUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCustom7 = new custom.PanelCustom();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelCustom16 = new custom.PanelCustom();
        tanggalIndonesia = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelCustom17 = new custom.PanelCustom();
        seluruhData = new javax.swing.JLabel();
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
        txtIdReturn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tanggalPenjualan = new javax.swing.JLabel();
        totalHargaa = new javax.swing.JLabel();
        txtTotalProduct = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtStok = new custom.JTextFieldRounded();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtNamaProduct = new custom.JTextFieldRounded();
        jLabel31 = new javax.swing.JLabel();
        txtJumlah = new custom.JTextFieldRounded();
        btnSetProduct = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtKeterangan = new custom.JTextFieldRounded();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnSimpan = new rojerusan.RSMaterialButtonRectangle();
        txtIdProduct = new custom.JTextFieldRounded();
        jhargaBeli = new javax.swing.JLabel();
        txtSatuan = new custom.JTextFieldRounded();
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
        pnMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnMainMouseClicked(evt);
            }
        });
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblData.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Retur", "Tgl Penjualan", "Total Product", "Petugas"
            }
        ));
        tblData.setGridColor(new java.awt.Color(255, 255, 255));
        tblData.setRowHeight(30);
        tblData.setRowMargin(10);
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

        namaUser.setBackground(new java.awt.Color(75, 22, 76));
        namaUser.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        namaUser.setText("TONO");

        jLabel3.setBackground(new java.awt.Color(106, 106, 106));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("Nama User");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userr.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom6Layout = new javax.swing.GroupLayout(panelCustom6);
        panelCustom6.setLayout(panelCustom6Layout);
        panelCustom6Layout.setHorizontalGroup(
            panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(namaUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
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
                        .addComponent(namaUser)))
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
        jLabel7.setText("Rugi");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
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

        tanggalIndonesia.setBackground(new java.awt.Color(75, 22, 76));
        tanggalIndonesia.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        tanggalIndonesia.setText("30 Agustus 2025");

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
                    .addComponent(tanggalIndonesia))
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
                        .addComponent(tanggalIndonesia)))
                .addGap(27, 27, 27))
        );

        panelCustom3.add(panelCustom16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 310, 110));

        panelCustom17.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom17.setRoundBottomLeft(20);
        panelCustom17.setRoundBottomRight(20);
        panelCustom17.setRoundTopLeft(20);
        panelCustom17.setRoundTopRight(20);

        seluruhData.setBackground(new java.awt.Color(75, 22, 76));
        seluruhData.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        seluruhData.setText("100");

        jLabel11.setBackground(new java.awt.Color(106, 106, 106));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel11.setText("Total Retur");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/unduh.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom17Layout = new javax.swing.GroupLayout(panelCustom17);
        panelCustom17.setLayout(panelCustom17Layout);
        panelCustom17Layout.setHorizontalGroup(
            panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom17Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustom17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(seluruhData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
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
                        .addComponent(seluruhData)))
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
        databahan.setText("Detail Retur");

        tblDataDetail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDataDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Retur", "Nama Product", "Jumlah", "Keterangan"
            }
        ));
        tblDataDetail.setRowHeight(30);
        tblDataDetail.setRowMargin(10);
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
        tPenjualan.setText("MENU RETUR");
        pnHeader.add(tPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

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

        tblDataSementara.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tblDataSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Retur", "ID Product", "Nama Product", "Stok", "Satuan", "Jumlah", "Keterangan"
            }
        ));
        tblDataSementara.setGridColor(new java.awt.Color(255, 255, 255));
        tblDataSementara.setRowHeight(30);
        tblDataSementara.setRowMargin(10);
        tblDataSementara.setSelectionBackground(new java.awt.Color(75, 22, 76));
        tblDataSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSementaraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataSementara);

        panelCustom8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 1540, 370));

        panelCustom4.setBackground(new java.awt.Color(75, 22, 76));
        panelCustom4.setRoundBottomLeft(20);
        panelCustom4.setRoundBottomRight(20);
        panelCustom4.setRoundTopLeft(20);
        panelCustom4.setRoundTopRight(20);

        txtIdReturn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtIdReturn.setForeground(new java.awt.Color(255, 255, 255));
        txtIdReturn.setText("TRX0001");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID Retur :");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tgl. Transaksi :");

        tanggalPenjualan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tanggalPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tanggalPenjualan.setText("15-01-2025");

        totalHargaa.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        totalHargaa.setForeground(new java.awt.Color(255, 255, 255));
        totalHargaa.setText("Total Product :");

        txtTotalProduct.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtTotalProduct.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalProduct.setText("999999");

        javax.swing.GroupLayout panelCustom4Layout = new javax.swing.GroupLayout(panelCustom4);
        panelCustom4.setLayout(panelCustom4Layout);
        panelCustom4Layout.setHorizontalGroup(
            panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(txtIdReturn)
                .addGap(286, 286, 286)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(tanggalPenjualan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(totalHargaa)
                .addGap(18, 18, 18)
                .addComponent(txtTotalProduct)
                .addGap(205, 205, 205))
            .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCustom4Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel12)
                    .addContainerGap(1419, Short.MAX_VALUE)))
        );
        panelCustom4Layout.setVerticalGroup(
            panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalHargaa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggalPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdReturn)))
                .addContainerGap())
            .addGroup(panelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCustom4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelCustom8.add(panelCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1560, 60));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel24.setText("Stok ");
        panelCustom8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtStok.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel28.setText("ID Product");
        panelCustom8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel29.setText("Nama Product");
        panelCustom8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtNamaProduct.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtNamaProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProductActionPerformed(evt);
            }
        });
        panelCustom8.add(txtNamaProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 430, 50));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel31.setText("Jumlah Product");
        panelCustom8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        txtJumlah.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 170, -1));

        btnSetProduct.setText("...");
        btnSetProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetProductActionPerformed(evt);
            }
        });
        panelCustom8.add(btnSetProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, 50));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel32.setText("Keterangan");
        panelCustom8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        txtKeterangan.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        panelCustom8.add(txtKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 430, 50));

        btnBatal.setBackground(new java.awt.Color(75, 22, 76));
        btnBatal.setText("BATAL");
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        panelCustom8.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 140, 60));

        btnHapus.setBackground(new java.awt.Color(75, 22, 76));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelCustom8.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 60));

        btnSimpan.setBackground(new java.awt.Color(75, 22, 76));
        btnSimpan.setText("TAMBAH");
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelCustom8.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 60));

        txtIdProduct.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductActionPerformed(evt);
            }
        });
        panelCustom8.add(txtIdProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 50));

        jhargaBeli.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jhargaBeli.setText("Satuan");
        panelCustom8.add(jhargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        txtSatuan.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuanActionPerformed(evt);
            }
        });
        panelCustom8.add(txtSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 140, -1));

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
        tPenjualan2.setText("TAMBAH RETUR");
        panelCustom14.add(tPenjualan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

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

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        pnDetail.setVisible(true);
        
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        getDataDetail((DefaultTableModel) tblDataDetail.getModel(), id);
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSementaraMouseClicked
        dataTabelSementara();
        totalHargaa.setVisible(false);
        txtTotalProduct.setVisible(false);
        btnSimpan.setText("UBAH");
        cancelFieldColor(txtJumlah);
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
        txtJumlah.setEnabled(true);
        cancelFieldColor(txtJumlah);
        cancelFieldColor(txtKeterangan);
        
    }//GEN-LAST:event_tblDataSementaraMouseClicked

    private void btnSetProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetProductActionPerformed
        setProduct();
    }//GEN-LAST:event_btnSetProductActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
                btnSimpan.setText("SIMPAN");
                btnHapus.setVisible(false);
                btnBatal.setVisible(false);
        
                int total = getTotal(txtIdReturn.getText());

                txtTotalProduct.setText(String.valueOf(total));
                txtTotalProduct.setVisible(true);
                resetForm();
                loadDataSementara();

                // Reset tampilan input pembayar
                btnSimpan.setText("SIMPAN");
                totalHargaa.setVisible(true);
                fieldColor(txtKeterangan);
                fieldColor(txtJumlah);
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
            try {
            if (insertDataAndDetails()) {
                deleteDataSementara(); // Clear temporary data if everything was successful
                JOptionPane.showMessageDialog(this, "Berhasil Retur Produk", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                resetForm();
                loadData();
                showPanel();
            }
            } catch (Exception ex) {
                Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_btnSimpanActionPerformed

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
        
        txtIdReturn.setText(generateId());
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        loadDataSementara();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtNamaProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProductActionPerformed

    private void txtSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuanActionPerformed

    private void pnMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseClicked
        deleteDataSementara();
        showPanel();
        loadData();
    }//GEN-LAST:event_pnMainMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBack;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private javax.swing.JButton btnCloseDetail;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private javax.swing.JButton btnSetProduct;
    private rojerusan.RSMaterialButtonRectangle btnSimpan;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel iSearch;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jhargaBeli;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JLabel namaUser;
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
    private javax.swing.JLabel seluruhData;
    private javax.swing.JLabel tPenjualan;
    private javax.swing.JLabel tPenjualan2;
    private javax.swing.JLabel tanggalIndonesia;
    private javax.swing.JLabel tanggalPenjualan;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblDataSementara;
    private javax.swing.JLabel totalHargaa;
    private custom.JTextFieldRounded txtIdProduct;
    private javax.swing.JLabel txtIdReturn;
    private custom.JTextFieldRounded txtJumlah;
    private custom.JTextFieldRounded txtKeterangan;
    private custom.JTextFieldRounded txtNamaProduct;
    private custom.JTextFieldRounded txtSatuan;
    private custom.JTextFieldRounded txtSearch;
    private custom.JTextFieldRounded txtStok;
    private javax.swing.JLabel txtTotalProduct;
    // End of variables declaration//GEN-END:variables
   
    private boolean insertDataAndDetails() {
    try {
        conn.setAutoCommit(false);
        
        // Insert transaction data
        if (!insertData()) {
            conn.rollback();
            return false;
        }
        
        if (!insertDataDetail()) {
            conn.rollback();
            return false;
        }
        
        conn.commit();
        return true; // Pindahkan ke sini - hanya return true jika semua berhasil
        
    } catch (Exception e) {
        try {
            conn.rollback(); // Rollback on exception
        } catch (SQLException rollbackEx) {
            rollbackEx.printStackTrace();
        }
        Logger.getLogger(transaksiPembeliaan.class.getName()).log(Level.SEVERE, null, e);
        return false;
        
    } finally {
        try {
            conn.setAutoCommit(true); // Reset to auto-commit mode
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
    
        private String generateId() {
            SimpleDateFormat sdf = new SimpleDateFormat("HHmmddM"); 
            String dateTime = sdf.format(new Date());
            return "R" + dateTime; 
        }
    
    private void fieldColor(JTextField field) {
        field.setOpaque(true);
        field.setEditable(false);
        field.setBackground(new Color(219, 219, 219));
    }
    
    private void cancelFieldColor(JTextField field) {
        field.setOpaque(true);
        field.setEditable(true);
        field.setBackground(new Color(255, 255, 255));
    }

    private void finishing() {
        fieldColor(txtIdProduct);
        fieldColor(txtNamaProduct);
        fieldColor(txtStok);
        fieldColor(txtSatuan);
        txtTotalProduct.setVisible(false);
        totalHargaa.setVisible(false);
    }
    
    private void setProduct(){
        boolean closable = true;
        dataProduct product = new dataProduct(null, closable);
        product.setVisible(true);
        
        txtIdProduct.setText(product.getId_product());
        txtNamaProduct.setText(product.getNama_product());
        txtSatuan.setText(product.getSatuan());
        txtStok.setText(product.getStok_product());
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
        panelMain.add(new menuReturr(id_user, nama));
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
            String sql = "SELECT COUNT(*) AS total FROM return_produk";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE,null, e);
        }
        return totalData;
    }
    
    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT rt.id_return, DATE(rt.tgl_return) AS tgl_return, rt.total_product, "
                   + "us.nama AS nama_user FROM return_produk rt "
                   + "INNER JOIN user us ON rt.id_user = us.id_user ORDER BY rt.id_return ASC LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idReturn = rs.getString("id_return");
                    String tglReturn = rs.getString("tgl_return");
                    int totalProduct = rs.getInt("total_product");
                    String namaUser = rs.getString("nama_user");
                    

                    Object[] rowData = {idReturn, tglReturn, totalProduct, namaUser};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT dr.id_return, p.nama_product, dr.jumlah, dr.keterangan"
                   + " FROM detail_return_product dr INNER JOIN product p ON dr.id_product = p.id_product WHERE dr.id_return = '"+id+"'";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idReturn         = rs.getString("id_return");
                    String namaProduct      = rs.getString("nama_product");
                    int jumlah              = rs.getInt("jumlah");
                    String keterangan       = rs.getString("keterangan");
                    

                    Object[] rowData = {idReturn, namaProduct, jumlah, keterangan};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    private void loadData() {
        calculateTotalPages();
        int totalData = getTotalData();
        seluruhData.setText(String.valueOf(totalData));
        lb_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));

        int startIndex = (halamanSaatIni - 1) * dataPerHalaman; // Indeks awal untuk pagination
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tblData.getModel());
        pnDetail.setVisible(false);
        namaUser.setText(nama.split("\\s+")[0].toUpperCase());
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
        txtSatuan.setText("");
        txtStok.setText("");
        txtJumlah.setText("");
        txtKeterangan.setText("");
    }
    
    private void clickNoSementara() {
                btnSetProduct.setVisible(false);
                txtSatuan.setEnabled(false);
                txtJumlah.setText("");
    }
    
    private int getTotal(String idTransaksi) {
        int totalHarga = 0;

        try {
        String sql = "SELECT SUM(jumlah) AS total FROM sementara_return WHERE id_return = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idTransaksi);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalHarga = rs.getInt("total");
            }
        } 
        } catch (Exception e) {
                Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
            }

        return totalHarga;
    }
    
    private void insertDataSementara() {
    String idReturn = txtIdReturn.getText();
    String idProduct = txtIdProduct.getText();
    String namaProduct = txtNamaProduct.getText();
    String stok = txtStok.getText();
    String satuan = txtSatuan.getText();
    String jumlah = txtJumlah.getText();
    String keterangan    = txtKeterangan.getText();

    if (idReturn.isEmpty() || idProduct.isEmpty() || jumlah.isEmpty() || keterangan.isEmpty()) {
            // Menggunakan JOptionPane untuk menampilkan pesan peringatan
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di-isi", 
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

    try {
        String sql = "INSERT INTO sementara_return (id_return, id_product ,nama_product, stok, satuan, jumlah,"
                + "keterangan) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idReturn);
            st.setString(2, idProduct);
            st.setString(3, namaProduct);
            st.setString(4, stok);
            st.setString(5, satuan);
            st.setString(6, jumlah);
            st.setString(7, keterangan);
            st.executeUpdate();

            if (JOptionPane.showConfirmDialog(this, "Mau Retur Product Lain?", 
                    "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetForm();
            } else {
                resetForm();
                btnSimpan.requestFocus();
                clickNoSementara();
                
                fieldColor(txtJumlah);
                fieldColor(txtKeterangan);
                totalHargaa.setVisible(true);
                txtTotalProduct.setVisible(true);
                btnSimpan.setText("SIMPAN");
                txtKeterangan.setText("");
            }
            int total = getTotal(idReturn);
            
            txtTotalProduct.setText(String.valueOf(total));
            loadDataSementara();
        }
    } catch (Exception e) {
        Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
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
           String sql = "SELECT * FROM sementara_return LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();

               while (rs.next()) {
                    String idReturn = rs.getString("id_return");
                    String idProduct = rs.getString("id_product");
                    String namaProduct = rs.getString("nama_product");
                    String stok = rs.getString("stok");
                    String satuan = rs.getString("satuan");
                    String jumlah = rs.getString("jumlah");
                    String keterangan = rs.getString("keterangan");


                    Object[] rowData = {idReturn, idProduct, namaProduct ,stok, satuan, jumlah, keterangan};
                    model.addRow(rowData);
                }
           }
        } catch (Exception e) {
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tblDataSementara.getModel();
    }
    
   

    
    // main
    private boolean insertData() {
    String idReturn = txtIdReturn.getText();
    String totalProduct = txtTotalProduct.getText();


    // Dapatkan waktu sekarang dalam format yang benar
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String tglReturn = LocalDateTime.now().format(formatter);

    try {
        String sql = "INSERT INTO return_produk (id_return, tgl_return, total_product, id_user) VALUES (?, ?, ?, ?)";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idReturn);
            st.setString(2, tglReturn);
            st.setString(3, totalProduct);
            st.setString(4, id_user);

            int rowInserted = st.executeUpdate();
            return rowInserted > 0;
            
        }
    } catch (Exception e) {
        Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
        return false;
    }
}
    
    private boolean insertDataDetail() {
    String idTransaksiPenjualan = txtIdReturn.getText();
    if (idTransaksiPenjualan == null || idTransaksiPenjualan.trim().isEmpty()) {
        System.err.println("ID Return tidak boleh kosong");
        return false;
    }
    
    try {
        // Pastikan koneksi aktif
        if (conn == null || conn.isClosed()) {
            System.err.println("Koneksi database tidak tersedia.");
            return false;
        }
        
        // 1. Insert ke detail_return_product dari sementara_return
        String insertSQL = "INSERT INTO detail_return_product (id_return, id_product, jumlah, keterangan) " +
                           "SELECT ?, id_product, jumlah, keterangan FROM sementara_return";
                           
        try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
            insertStmt.setString(1, idTransaksiPenjualan);
            int affectedRows = insertStmt.executeUpdate();
            
            if (affectedRows == 0) {
                System.err.println("Tidak ada data yang disisipkan ke detail_return_product");
                return false;
            }
        }
        
        // 2. Tambah kembali stok produk yang di-return (kebalikan dari penjualan)
        String selectReturnSQL = "SELECT id_product, jumlah FROM sementara_return";
        try (PreparedStatement selectStmt = conn.prepareStatement(selectReturnSQL);
             ResultSet rs = selectStmt.executeQuery()) {
             
            while (rs.next()) {
                String idProduct = rs.getString("id_product");
                int jumlahReturn = rs.getInt("jumlah");
                
                // Validasi bahwa produk ada di database
                String checkProductSQL = "SELECT id_product FROM product WHERE id_product = ?";
                try (PreparedStatement checkStmt = conn.prepareStatement(checkProductSQL)) {
                    checkStmt.setString(1, idProduct);
                    try (ResultSet productRs = checkStmt.executeQuery()) {
                        if (!productRs.next()) {
                            System.err.println("Produk dengan ID " + idProduct + " tidak ditemukan");
                            return false;
                        }
                    }
                }
                
                // Update stok dengan menambah (karena barang dikembalikan)
                String updateStokSQL = "UPDATE product SET stok_product = stok_product - ? WHERE id_product = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateStokSQL)) {
                    updateStmt.setInt(1, jumlahReturn);
                    updateStmt.setString(2, idProduct);
                    int updateResult = updateStmt.executeUpdate();
                    
                    if (updateResult == 0) {
                        System.err.println("Gagal mengupdate stok untuk produk ID: " + idProduct);
                        return false;
                    } else {
                        System.out.println("Stok produk " + idProduct + " bertambah " + jumlahReturn + " unit (return)");
                    }
                }
            }
        }
        
        return true;
        
    } catch (Exception e) {
        Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, "Kesalahan saat insert detail return", e);
        return false;
    }
}


    
    private void dataTabelSementara() {
        int row = tblDataSementara.getSelectedRow();
        
        if(row!=-1) {
            
        txtIdReturn.setText(tblDataSementara.getValueAt(row, 0).toString());
        txtIdProduct.setText(tblDataSementara.getValueAt(row, 1).toString());
        txtNamaProduct.setText(tblDataSementara.getValueAt(row, 2).toString());
        txtStok.setText(tblDataSementara.getValueAt(row, 3).toString());
        txtSatuan.setText(tblDataSementara.getValueAt(row, 4).toString());
        txtJumlah.setText(tblDataSementara.getValueAt(row, 5).toString());
        txtKeterangan.setText(tblDataSementara.getValueAt(row, 6).toString());
        
        }
    }
    
    
    private void updateData() {
        String idReturn = txtIdReturn.getText();
        String idProduct = txtIdProduct.getText();
        String namaProduct = txtNamaProduct.getText();
        String stok = txtStok.getText();
        String satuan = txtSatuan.getText();
        String jumlah = txtJumlah.getText();
        String keterangan    = txtKeterangan.getText();

    if (idReturn.isEmpty() || idProduct.isEmpty() || jumlah.isEmpty() || keterangan.isEmpty()) {
            // Menggunakan JOptionPane untuk menampilkan pesan peringatan
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di-isi", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }


        String sql = "UPDATE sementara_return SET id_return=?, nama_product=?, stok=?, satuan=?, jumlah=?, keterangan=? WHERE id_product=?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idReturn);
            st.setString(2, namaProduct);
            st.setString(3, stok);
            st.setString(4, satuan);
            st.setString(5, jumlah);
            st.setString(6, keterangan);
            st.setString(7, idProduct);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                // Update total harga dan total untung setelah perubahan
                int total = getTotal(idReturn);

                txtTotalProduct.setText(String.valueOf(total));
                txtTotalProduct.setVisible(true);
                resetForm();
                loadDataSementara();

                // Reset tampilan input pembayar
                fieldColor(txtJumlah);
                fieldColor(txtKeterangan);
                btnSimpan.setText("SIMPAN");
                totalHargaa.setVisible(true);
                btnHapus.setVisible(false);
                btnBatal.setVisible(false);
                fieldColor(txtJumlah);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
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
                String sql = "DELETE FROM sementara_return WHERE id_product=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);

                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                        int total = getTotal(txtIdReturn.getText());

                        txtTotalProduct.setText(String.valueOf(total));

                        loadDataSementara();
                        txtJumlah.setText("");
                        txtJumlah.setEnabled( false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

            } catch (Exception e) {
                Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE, null, e);
            }
        }
                int total = getTotal(txtIdReturn.getText());

                txtTotalProduct.setText(String.valueOf(total));
                txtTotalProduct.setVisible(true);
                resetForm();
                loadDataSementara();

                fieldColor(txtJumlah);
                fieldColor(txtKeterangan);
                btnSimpan.setText("SIMPAN");
                totalHargaa.setVisible(true);
                btnHapus.setVisible(false);
                btnBatal.setVisible(false);
                fieldColor(txtJumlah);
    }

    private void deleteDataSementara(){
        try {
            String sql =  "DELETE FROM sementara_return";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate();
                }   
        } catch (Exception e) {
            Logger.getLogger(menuReturr.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void searchData() {
    String kataKunci = txtSearch.getText().trim(); // Menghapus spasi di awal/akhir input

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);
    
    
    
    try {
        String sql = "SELECT rt.id_return, DATE(rt.tgl_return) AS tgl_return, rt.total_product, "
           + "us.nama FROM return_produk rt "
           + "INNER JOIN user us ON rt.id_user = us.id_user "
           + "WHERE rt.id_return LIKE ? OR DATE(rt.tgl_return) LIKE ? "
           + "OR CAST(rt.total_product AS CHAR) LIKE ? OR us.nama LIKE ?";

        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter query untuk semua kolom
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            st.setString(3, "%" + kataKunci + "%");
            st.setString(4, "%" + kataKunci + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idReturn = rs.getString("id_return");
                String tglReturn = rs.getString("tgl_return");
                int totalProduct = rs.getInt("total_product");
                String namaUser = rs.getString("nama");
                Object[] rowData = {idReturn, tglReturn, totalProduct, namaUser};
                model.addRow(rowData);
            }
        }
    } catch (Exception e) {
        Logger.getLogger(transaksiPembeliaan.class.getName()).log(Level.SEVERE, null, e);
    }
}
}

