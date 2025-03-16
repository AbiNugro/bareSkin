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
public class menuDashboardKasir extends javax.swing.JFrame{

    /**
     * Creates new form template
     */
    
    private JLabel activeButton = null;
    
    public menuDashboardKasir() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        activeButton = tDashboard;
        
        pn_utama.removeAll();
        pn_utama.add(new menu.menuVarian());
        pn_utama.repaint();
        pn_utama.revalidate();
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
        pnMember = new custom.PanelCustom();
        tMember = new javax.swing.JLabel();
        panelCustom5 = new custom.PanelCustom();
        pnPenjualan = new custom.PanelCustom();
        tPenjualan = new javax.swing.JLabel();
        panelCustom7 = new custom.PanelCustom();
        pnLaporan = new custom.PanelCustom();
        tLaporan = new javax.swing.JLabel();
        panelCustom9 = new custom.PanelCustom();
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

        tDashboard.setBackground(new java.awt.Color(245, 245, 245));
        tDashboard.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tDashboard.setForeground(new java.awt.Color(245, 245, 245));
        tDashboard.setText("Dashboard");

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

        javax.swing.GroupLayout pnDashboardLayout = new javax.swing.GroupLayout(pnDashboard);
        pnDashboard.setLayout(pnDashboardLayout);
        pnDashboardLayout.setHorizontalGroup(
            pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(tDashboard)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnDashboardLayout.setVerticalGroup(
            pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDashboardLayout.createSequentialGroup()
                .addGroup(pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDashboardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tDashboard)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 260, 70));

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

        tMember.setBackground(new java.awt.Color(75, 22, 76));
        tMember.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tMember.setForeground(new java.awt.Color(75, 22, 76));
        tMember.setText("Member");

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

        javax.swing.GroupLayout pnMemberLayout = new javax.swing.GroupLayout(pnMember);
        pnMember.setLayout(pnMemberLayout);
        pnMemberLayout.setHorizontalGroup(
            pnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMemberLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(tMember)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pnMemberLayout.setVerticalGroup(
            pnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMemberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tMember)
                .addGap(19, 19, 19))
        );

        pn_kiri.add(pnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, 70));

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

        javax.swing.GroupLayout pnPenjualanLayout = new javax.swing.GroupLayout(pnPenjualan);
        pnPenjualan.setLayout(pnPenjualanLayout);
        pnPenjualanLayout.setHorizontalGroup(
            pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPenjualanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(tPenjualan)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnPenjualanLayout.setVerticalGroup(
            pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPenjualanLayout.createSequentialGroup()
                .addGroup(pnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPenjualanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPenjualanLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tPenjualan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 260, 70));

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

        javax.swing.GroupLayout pnLaporanLayout = new javax.swing.GroupLayout(pnLaporan);
        pnLaporan.setLayout(pnLaporanLayout);
        pnLaporanLayout.setHorizontalGroup(
            pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLaporanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(tLaporan)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnLaporanLayout.setVerticalGroup(
            pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLaporanLayout.createSequentialGroup()
                .addGroup(pnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLaporanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLaporanLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tLaporan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kiri.add(pnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 260, 70));

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

    private void pnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseClicked
        resetButtonStyles();
        pnDashboard.setBackground(new Color(75,22,76));
        tDashboard.setForeground(new Color(245,245,245));

        pn_utama.removeAll();
        pn_utama.add(new menu.menuVarian());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        activeButton = tDashboard;
    }//GEN-LAST:event_pnDashboardMouseClicked

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

    private void pnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseEntered
        if (activeButton != tDashboard) { 
        pnDashboard.setBackground(new Color(75,23,107));
        tDashboard.setForeground(new Color(245,245,245));
        }
    }//GEN-LAST:event_pnDashboardMouseEntered

    private void pnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDashboardMouseExited
        if (activeButton != tDashboard) { 
        pnDashboard.setBackground(new Color(221,136,207));
        tDashboard.setForeground(new Color(75,22,76));
        }
    }//GEN-LAST:event_pnDashboardMouseExited

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
            java.util.logging.Logger.getLogger(menuDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuDashboardKasir().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private custom.PanelCustom panelCustom2;
    private custom.PanelCustom panelCustom5;
    private custom.PanelCustom panelCustom7;
    private custom.PanelCustom panelCustom9;
    private custom.PanelCustom pnDashboard;
    private custom.PanelCustom pnLaporan;
    private custom.PanelCustom pnMember;
    private custom.PanelCustom pnPenjualan;
    private custom.PanelCustom pn_kiri;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JLabel tDashboard;
    private javax.swing.JLabel tLaporan;
    private javax.swing.JLabel tMember;
    private javax.swing.JLabel tPenjualan;
    // End of variables declaration//GEN-END:variables
    
    private void resetButtonStyles() {
    // Reset warna tombol lain di sini
    pnDashboard.setBackground(new Color(221,136,207));
    tDashboard.setForeground(new Color(75,22,76));

    pnMember.setBackground(new Color(221,136,207));
    tMember.setForeground(new Color(75,22,76));
    
    pnPenjualan.setBackground(new Color(221,136,207));
    tPenjualan.setForeground(new Color(75,22,76));
    
    pnLaporan.setBackground(new Color(221,136,207));
    tLaporan.setForeground(new Color(75,22,76));
    }
}
