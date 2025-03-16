/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bareSkinDashboard;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import menu.menuBahan;
/**
 *
 * @author user
 */
public class menuDashboard extends javax.swing.JFrame{

    /**
     * Creates new form template
     */
    
    private JLabel activeButton = null;
    
    public menuDashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        activeButton = tDashboard;
        
        pn_utama.removeAll();
        pn_utama.add(new menu.menuVarian());
        pn_utama.repaint();
        pn_utama.revalidate();
        iDashboardT.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new custom.PanelCustom();
        jLabel2 = new javax.swing.JLabel();
        pnDashboard = new custom.PanelCustom();
        tDashboard = new javax.swing.JLabel();
        panelCustom2 = new custom.PanelCustom();
        iDashboardT = new javax.swing.JLabel();
        iDashboardG = new javax.swing.JLabel();
        pnProduct = new custom.PanelCustom();
        tProduct = new javax.swing.JLabel();
        panelCustom5 = new custom.PanelCustom();
        pnMember = new custom.PanelCustom();
        tMember = new javax.swing.JLabel();
        panelCustom7 = new custom.PanelCustom();
        pnKaryawan = new custom.PanelCustom();
        tKaryawan = new javax.swing.JLabel();
        panelCustom9 = new custom.PanelCustom();
        pnPenjualan = new custom.PanelCustom();
        tPenjualan = new javax.swing.JLabel();
        panelCustom11 = new custom.PanelCustom();
        pnPembelian = new custom.PanelCustom();
        tPembelian = new javax.swing.JLabel();
        panelCustom13 = new custom.PanelCustom();
        pnLaporan = new custom.PanelCustom();
        tLaporan = new javax.swing.JLabel();
        panelCustom15 = new custom.PanelCustom();
        jPanel1 = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_kiri.setBackground(new java.awt.Color(221, 136, 207));
        pn_kiri.setRoundBottomRight(100);
        pn_kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BS logo.png"))); // NOI18N
        pn_kiri.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        pnDashboard.setBackground(new java.awt.Color(75, 22, 76));
        pnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        pnDashboard.setRoundBottomLeft(10);
        pnDashboard.setRoundBottomRight(40);
        pnDashboard.setRoundTopLeft(10);
        pnDashboard.setRoundTopRight(10);
        pnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnDashboardMouseExited(evt);
            }
        });
        pnDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tDashboard.setBackground(new java.awt.Color(245, 245, 245));
        tDashboard.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tDashboard.setForeground(new java.awt.Color(245, 245, 245));
        tDashboard.setText("Dashboard");
        pnDashboard.add(tDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 18, -1, -1));

        panelCustom2.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom2.setRoundBottomLeft(10);
        panelCustom2.setRoundBottomRight(10);
        panelCustom2.setRoundTopLeft(10);
        panelCustom2.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnDashboard.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, -1, -1));

        iDashboardT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dashboard T (1).png"))); // NOI18N
        pnDashboard.add(iDashboardT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, -1, -1));

        iDashboardG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dashboard G (1).png"))); // NOI18N
        pnDashboard.add(iDashboardG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, -1, -1));

        pn_kiri.add(pnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 260, 70));

        pnProduct.setBackground(new java.awt.Color(221, 136, 207));
        pnProduct.setRoundBottomLeft(10);
        pnProduct.setRoundBottomRight(40);
        pnProduct.setRoundTopLeft(10);
        pnProduct.setRoundTopRight(10);
        pnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnProductMouseExited(evt);
            }
        });

        tProduct.setBackground(new java.awt.Color(75, 22, 76));
        tProduct.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tProduct.setForeground(new java.awt.Color(75, 22, 76));
        tProduct.setText("Product");

        panelCustom5.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom5.setRoundBottomLeft(10);
        panelCustom5.setRoundBottomRight(10);
        panelCustom5.setRoundTopLeft(10);
        panelCustom5.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom5Layout = new javax.swing.GroupLayout(panelCustom5);
        panelCustom5.setLayout(panelCustom5Layout);
        panelCustom5Layout.setHorizontalGroup(
            panelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom5Layout.setVerticalGroup(
            panelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnProductLayout = new javax.swing.GroupLayout(pnProduct);
        pnProduct.setLayout(pnProductLayout);
        pnProductLayout.setHorizontalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProductLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(tProduct)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnProductLayout.setVerticalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tProduct)
                .addGap(19, 19, 19))
        );

        pn_kiri.add(pnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, 70));

        pnMember.setBackground(new java.awt.Color(221, 136, 207));
        pnMember.setRoundBottomLeft(10);
        pnMember.setRoundBottomRight(40);
        pnMember.setRoundTopLeft(10);
        pnMember.setRoundTopRight(10);
        pnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnMemberMouseExited(evt);
            }
        });

        tMember.setBackground(new java.awt.Color(245, 245, 245));
        tMember.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tMember.setForeground(new java.awt.Color(75, 22, 76));
        tMember.setText("Member");

        panelCustom7.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom7.setRoundBottomLeft(10);
        panelCustom7.setRoundBottomRight(10);
        panelCustom7.setRoundTopLeft(10);
        panelCustom7.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom7Layout = new javax.swing.GroupLayout(panelCustom7);
        panelCustom7.setLayout(panelCustom7Layout);
        panelCustom7Layout.setHorizontalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom7Layout.setVerticalGroup(
            panelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMemberLayout = new javax.swing.GroupLayout(pnMember);
        pnMember.setLayout(pnMemberLayout);
        pnMemberLayout.setHorizontalGroup(
            pnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMemberLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(tMember)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pnMemberLayout.setVerticalGroup(
            pnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMemberLayout.createSequentialGroup()
                .addGroup(pnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMemberLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMemberLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tMember)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 260, 70));

        pnKaryawan.setBackground(new java.awt.Color(221, 136, 207));
        pnKaryawan.setRoundBottomLeft(10);
        pnKaryawan.setRoundBottomRight(40);
        pnKaryawan.setRoundTopLeft(10);
        pnKaryawan.setRoundTopRight(10);
        pnKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnKaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnKaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnKaryawanMouseExited(evt);
            }
        });

        tKaryawan.setBackground(new java.awt.Color(245, 245, 245));
        tKaryawan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tKaryawan.setForeground(new java.awt.Color(75, 22, 76));
        tKaryawan.setText("Karyawan");

        panelCustom9.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom9.setRoundBottomLeft(10);
        panelCustom9.setRoundBottomRight(10);
        panelCustom9.setRoundTopLeft(10);
        panelCustom9.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom9Layout = new javax.swing.GroupLayout(panelCustom9);
        panelCustom9.setLayout(panelCustom9Layout);
        panelCustom9Layout.setHorizontalGroup(
            panelCustom9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom9Layout.setVerticalGroup(
            panelCustom9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnKaryawanLayout = new javax.swing.GroupLayout(pnKaryawan);
        pnKaryawan.setLayout(pnKaryawanLayout);
        pnKaryawanLayout.setHorizontalGroup(
            pnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKaryawanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(tKaryawan)
                .addGap(59, 59, 59))
        );
        pnKaryawanLayout.setVerticalGroup(
            pnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKaryawanLayout.createSequentialGroup()
                .addGroup(pnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnKaryawanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnKaryawanLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tKaryawan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 260, 70));

        pnPenjualan.setBackground(new java.awt.Color(221, 136, 207));
        pnPenjualan.setRoundBottomLeft(10);
        pnPenjualan.setRoundBottomRight(40);
        pnPenjualan.setRoundTopLeft(10);
        pnPenjualan.setRoundTopRight(10);
        pnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPenjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnPenjualanMouseExited(evt);
            }
        });

        tPenjualan.setBackground(new java.awt.Color(245, 245, 245));
        tPenjualan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tPenjualan.setForeground(new java.awt.Color(75, 22, 76));
        tPenjualan.setText("Penjualan");

        panelCustom11.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom11.setRoundBottomLeft(10);
        panelCustom11.setRoundBottomRight(10);
        panelCustom11.setRoundTopLeft(10);
        panelCustom11.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom11Layout = new javax.swing.GroupLayout(panelCustom11);
        panelCustom11.setLayout(panelCustom11Layout);
        panelCustom11Layout.setHorizontalGroup(
            panelCustom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom11Layout.setVerticalGroup(
            panelCustom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnPenjualanLayout = new javax.swing.GroupLayout(pnPenjualan);
        pnPenjualan.setLayout(pnPenjualanLayout);
        pnPenjualanLayout.setHorizontalGroup(
            pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPenjualanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(tPenjualan)
                .addGap(58, 58, 58))
        );
        pnPenjualanLayout.setVerticalGroup(
            pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPenjualanLayout.createSequentialGroup()
                .addGroup(pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPenjualanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPenjualanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tPenjualan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 260, 70));

        pnPembelian.setBackground(new java.awt.Color(221, 136, 207));
        pnPembelian.setRoundBottomLeft(10);
        pnPembelian.setRoundBottomRight(40);
        pnPembelian.setRoundTopLeft(10);
        pnPembelian.setRoundTopRight(10);
        pnPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnPembelianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnPembelianMouseExited(evt);
            }
        });

        tPembelian.setBackground(new java.awt.Color(245, 245, 245));
        tPembelian.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tPembelian.setForeground(new java.awt.Color(75, 22, 76));
        tPembelian.setText("Pembelian");

        panelCustom13.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom13.setRoundBottomLeft(10);
        panelCustom13.setRoundBottomRight(10);
        panelCustom13.setRoundTopLeft(10);
        panelCustom13.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom13Layout = new javax.swing.GroupLayout(panelCustom13);
        panelCustom13.setLayout(panelCustom13Layout);
        panelCustom13Layout.setHorizontalGroup(
            panelCustom13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom13Layout.setVerticalGroup(
            panelCustom13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnPembelianLayout = new javax.swing.GroupLayout(pnPembelian);
        pnPembelian.setLayout(pnPembelianLayout);
        pnPembelianLayout.setHorizontalGroup(
            pnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPembelianLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(tPembelian)
                .addGap(52, 52, 52))
        );
        pnPembelianLayout.setVerticalGroup(
            pnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPembelianLayout.createSequentialGroup()
                .addGroup(pnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPembelianLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPembelianLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tPembelian)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 260, 70));

        pnLaporan.setBackground(new java.awt.Color(221, 136, 207));
        pnLaporan.setRoundBottomLeft(10);
        pnLaporan.setRoundBottomRight(40);
        pnLaporan.setRoundTopLeft(10);
        pnLaporan.setRoundTopRight(10);
        pnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnLaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLaporanMouseExited(evt);
            }
        });

        tLaporan.setBackground(new java.awt.Color(245, 245, 245));
        tLaporan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tLaporan.setForeground(new java.awt.Color(75, 22, 76));
        tLaporan.setText("Laporan");

        panelCustom15.setBackground(new java.awt.Color(221, 136, 207));
        panelCustom15.setRoundBottomLeft(10);
        panelCustom15.setRoundBottomRight(10);
        panelCustom15.setRoundTopLeft(10);
        panelCustom15.setRoundTopRight(10);

        javax.swing.GroupLayout panelCustom15Layout = new javax.swing.GroupLayout(panelCustom15);
        panelCustom15.setLayout(panelCustom15Layout);
        panelCustom15Layout.setHorizontalGroup(
            panelCustom15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelCustom15Layout.setVerticalGroup(
            panelCustom15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnLaporanLayout = new javax.swing.GroupLayout(pnLaporan);
        pnLaporan.setLayout(pnLaporanLayout);
        pnLaporanLayout.setHorizontalGroup(
            pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLaporanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(tLaporan)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnLaporanLayout.setVerticalGroup(
            pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLaporanLayout.createSequentialGroup()
                .addGroup(pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLaporanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLaporanLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tLaporan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, 260, 70));

        getContentPane().add(pn_kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 1020));

        jPanel1.setBackground(new java.awt.Color(248, 231, 246));

        pn_utama.setBackground(new java.awt.Color(248, 231, 246));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(pn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 1571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1690, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProductMouseClicked
        resetButtonStyles();
        pnProduct.setBackground(new Color(75,22,76));
        tProduct.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tProduct;
    }//GEN-LAST:event_pnProductMouseClicked

    private void pnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseClicked
        resetButtonStyles();
        pnDashboard.setBackground(new Color(75,22,76));
        tDashboard.setForeground(new Color(245,245,245));
        iDashboardG.setVisible(false);
        iDashboardT.setVisible(true);
        
        pn_utama.removeAll();
        pn_utama.add(new menu.menuVarian());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tDashboard;
    }//GEN-LAST:event_pnDashboardMouseClicked

    private void pnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProductMouseEntered
        if (activeButton != tProduct) { 
        pnProduct.setBackground(new Color(75,23,107));
        tProduct.setForeground(new Color(245,245,245));
        
        }
    }//GEN-LAST:event_pnProductMouseEntered

    private void pnProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProductMouseExited
        if (activeButton != tProduct) { 
        pnProduct.setBackground(new Color(221,136,207));
        tProduct.setForeground(new Color(75,22,76));
        
        }
    }//GEN-LAST:event_pnProductMouseExited

    private void pnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseEntered
        if (activeButton != tDashboard) { 
        pnDashboard.setBackground(new Color(75,23,107));
        tDashboard.setForeground(new Color(245,245,245));
        iDashboardG.setVisible(false);
        iDashboardT.setVisible(true);
        }
    }//GEN-LAST:event_pnDashboardMouseEntered

    private void pnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseExited
        if (activeButton != tDashboard) { 
        pnDashboard.setBackground(new Color(221,136,207));
        tDashboard.setForeground(new Color(75,22,76));
        iDashboardT.setVisible(false);
        iDashboardG.setVisible(true);
        }
    }//GEN-LAST:event_pnDashboardMouseExited

    private void pnMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMemberMouseClicked
        resetButtonStyles();
        pnMember.setBackground(new Color(75,22,76));
        tMember.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tMember;
    }//GEN-LAST:event_pnMemberMouseClicked

    private void pnMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMemberMouseEntered
        if (activeButton != tMember) { 
        pnMember.setBackground(new Color(75,23,107));
        tMember.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnMemberMouseEntered

    private void pnMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMemberMouseExited
        if (activeButton != tMember) { 
        pnMember.setBackground(new Color(221,136,207));
        tMember.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnMemberMouseExited

    private void pnKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKaryawanMouseClicked
        resetButtonStyles();
        pnKaryawan.setBackground(new Color(75,22,76));
        tKaryawan.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tKaryawan;
    }//GEN-LAST:event_pnKaryawanMouseClicked

    private void pnKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKaryawanMouseEntered
        if (activeButton != tKaryawan) { 
        pnKaryawan.setBackground(new Color(75,23,107));
        tKaryawan.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnKaryawanMouseEntered

    private void pnKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKaryawanMouseExited
        if (activeButton != tKaryawan) { 
        pnKaryawan.setBackground(new Color(221,136,207));
        tKaryawan.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnKaryawanMouseExited

    private void pnPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPenjualanMouseClicked
        resetButtonStyles();
        pnPenjualan.setBackground(new Color(75,22,76));
        tPenjualan.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tPenjualan;
    }//GEN-LAST:event_pnPenjualanMouseClicked

    private void pnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPenjualanMouseEntered
        if (activeButton != tPenjualan) { 
        pnPenjualan.setBackground(new Color(75,23,107));
        tPenjualan.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnPenjualanMouseEntered

    private void pnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPenjualanMouseExited
        if (activeButton != tPenjualan) { 
        pnPenjualan.setBackground(new Color(221,136,207));
        tPenjualan.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnPenjualanMouseExited

    private void pnPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPembelianMouseClicked
        resetButtonStyles();
        pnPembelian.setBackground(new Color(75,22,76));
        tPembelian.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tPembelian;
    }//GEN-LAST:event_pnPembelianMouseClicked

    private void pnPembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPembelianMouseEntered
        if (activeButton != tPembelian) { 
        pnPembelian.setBackground(new Color(75,23,107));
        tPembelian.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnPembelianMouseEntered

    private void pnPembelianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPembelianMouseExited
        if (activeButton != tPembelian) { 
        pnPembelian.setBackground(new Color(221,136,207));
        tPembelian.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnPembelianMouseExited

    private void pnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLaporanMouseClicked
        resetButtonStyles();
        pnLaporan.setBackground(new Color(75,22,76));
        tLaporan.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuBahan());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tLaporan;
    }//GEN-LAST:event_pnLaporanMouseClicked

    private void pnLaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLaporanMouseEntered
        if (activeButton != tLaporan) { 
        pnLaporan.setBackground(new Color(75,23,107));
        tLaporan.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnLaporanMouseEntered

    private void pnLaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLaporanMouseExited
        if (activeButton != tLaporan) { 
        pnLaporan.setBackground(new Color(221,136,207));
        tLaporan.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnLaporanMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuDashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iDashboardG;
    private javax.swing.JLabel iDashboardT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private custom.PanelCustom panelCustom11;
    private custom.PanelCustom panelCustom13;
    private custom.PanelCustom panelCustom15;
    private custom.PanelCustom panelCustom2;
    private custom.PanelCustom panelCustom5;
    private custom.PanelCustom panelCustom7;
    private custom.PanelCustom panelCustom9;
    private custom.PanelCustom pnDashboard;
    private custom.PanelCustom pnKaryawan;
    private custom.PanelCustom pnLaporan;
    private custom.PanelCustom pnMember;
    private custom.PanelCustom pnPembelian;
    private custom.PanelCustom pnPenjualan;
    private custom.PanelCustom pnProduct;
    private custom.PanelCustom pn_kiri;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JLabel tDashboard;
    private javax.swing.JLabel tKaryawan;
    private javax.swing.JLabel tLaporan;
    private javax.swing.JLabel tMember;
    private javax.swing.JLabel tPembelian;
    private javax.swing.JLabel tPenjualan;
    private javax.swing.JLabel tProduct;
    // End of variables declaration//GEN-END:variables
    
    private void resetButtonStyles() {
    // Reset warna tombol lain di sini
    pnDashboard.setBackground(new Color(221,136,207));
    tDashboard.setForeground(new Color(75,22,76));
    iDashboardT.setVisible(false);
    iDashboardG.setVisible(true);

    pnProduct.setBackground(new Color(221,136,207));
    tProduct.setForeground(new Color(75,22,76));
    
    pnMember.setBackground(new Color(221,136,207));
    tMember.setForeground(new Color(75,22,76));
    
    pnKaryawan.setBackground(new Color(221,136,207));
    tKaryawan.setForeground(new Color(75,22,76));
    
    pnPenjualan.setBackground(new Color(221,136,207));
    tPenjualan.setForeground(new Color(75,22,76));
    
    pnPembelian.setBackground(new Color(221,136,207));
    tPembelian.setForeground(new Color(75,22,76));
    
    pnLaporan.setBackground(new Color(221,136,207));
    tLaporan.setForeground(new Color(75,22,76));
    }
}
