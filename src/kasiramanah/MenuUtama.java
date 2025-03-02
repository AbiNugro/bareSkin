package kasiramanah;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.Timer;
import menu.menuBahan;
import menu.menuVarian;
import menu.menuDashboard;
import menu.menuDashboardKasir;
import menu.menuPelanggan;
import menu.menuUser;

public class MenuUtama extends javax.swing.JFrame {

    int xx,xy;
    private String id_user;
    private String nama;
    private String level;
    private Timer timer;
    
    public MenuUtama(String id_user, String nama, String level) {
        setDate();
        initComponents();
        setLocationRelativeTo(null);
        lbProfile.setText(nama);
        this.id_user = id_user;
        this.level = level;
        addMenu();
        
       // this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }
    

    
    private void addMenu() {
        if(level.equals("Admin")){
            sideMenu.add(new menuAdmin(this));
            pn_utama.removeAll();
            pn_utama.add(new menuDashboard());
            pn_utama.repaint();
            pn_utama.revalidate();
        }else {
            sideMenu.add(new menuKasir(this));
            pn_utama.removeAll();
            pn_utama.add(new menuDashboardKasir());
            pn_utama.repaint();
            pn_utama.revalidate();
        }
    }
    
    public String getid_user(){
        return id_user;
    }
    
    public String getlevel() {
        return level;
    }
    public JPanel getPanelUtama() {
        return pn_utama;
    }
    
    private void setDate(){
        timer = new Timer(100, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar calender = Calendar.getInstance();
                Date now = new Date();
                SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in","ID"));
                SimpleDateFormat formatTanggal  = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String hari = formatHari.format(calender.getTime());
                String waktuTanggal = formatTanggal.format(now);
                lbDate.setText(hari+", "+waktuTanggal);
            }
        });
        
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sideMenu = new javax.swing.JPanel();
        pn_kanan = new javax.swing.JPanel();
        pn_atas = new javax.swing.JPanel();
        batal = new rojerusan.RSMaterialButtonRectangle();
        lbProfile = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pn_kiri.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_kasir.png"))); // NOI18N

        jScrollPane1.setBorder(null);

        sideMenu.setBackground(new java.awt.Color(102, 204, 255));
        sideMenu.setLayout(new javax.swing.BoxLayout(sideMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(sideMenu);

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_atas.setBackground(new java.awt.Color(102, 204, 255));

        batal.setBackground(new java.awt.Color(255, 0, 51));
        batal.setText("LOGOUT");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        lbProfile.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbProfile.setForeground(new java.awt.Color(255, 255, 255));
        lbProfile.setText("USER NAME");

        lbDate.setBackground(new java.awt.Color(255, 255, 255));
        lbDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbDate.setForeground(new java.awt.Color(255, 255, 255));
        lbDate.setText("DATE");

        javax.swing.GroupLayout pn_atasLayout = new javax.swing.GroupLayout(pn_atas);
        pn_atas.setLayout(pn_atasLayout);
        pn_atasLayout.setHorizontalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addComponent(lbDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1142, Short.MAX_VALUE)
                .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addComponent(lbProfile)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_atasLayout.setVerticalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addGroup(pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_atasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_atasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbProfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDate)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pn_kanan.add(pn_atas, java.awt.BorderLayout.PAGE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        FormLogin fl = new FormLogin();
        fl.setVisible(true);
        fl.revalidate();
        
        dispose();
    }//GEN-LAST:event_batalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String id_user  = "id_user";
                String level    = "level";
                String nama     = "nama";
                new MenuUtama(id_user, nama, level).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbProfile;
    private javax.swing.JPanel pn_atas;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JPanel sideMenu;
    // End of variables declaration//GEN-END:variables
}
