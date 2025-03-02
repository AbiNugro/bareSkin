/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menu;

import java.sql.PreparedStatement;
import java.sql.Connection;
import config.koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import notification.Notification;

/**
 *
 * @author user
 */
public class menuVarian extends javax.swing.JPanel {

    /**
     * Creates new form menuBahan
     */
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 20;
    private int totalPages;
    
    private final Connection conn;
    public menuVarian() {
        initComponents();
        
        conn = koneksi.getConnection();
        loadData();
        setTabelModel();
        paginationVarian();
        
        txtIdVarian.setEnabled(false);
        txtStok.setEnabled(false);
        txtHarga.setEnabled(false);
        
//        txtStok.addKeyListener(new java.awt.event.KeyAdapter() {
//        @Override
//        public void keyTyped(java.awt.event.KeyEvent evt) {
//            char c = evt.getKeyChar();
//            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
//                evt.consume();
//                JOptionPane.showMessageDialog(null, "Stok harus berupa angka!", 
//                        "Validasi", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        databahan = new javax.swing.JLabel();
        txtSearch = new custom.JTextFieldRounded();
        btnDelete = new rojerusan.RSMaterialButtonRectangle();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        btnCancel = new rojerusan.RSMaterialButtonRectangle();
        btn_first = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        menubahan = new javax.swing.JLabel();
        idVarian = new javax.swing.JLabel();
        namaVarian = new javax.swing.JLabel();
        stokVarian = new javax.swing.JLabel();
        satuan = new javax.swing.JLabel();
        txtIdVarian = new custom.JTextFieldRounded();
        txtNama = new custom.JTextFieldRounded();
        txtStok = new custom.JTextFieldRounded();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        batal2 = new rojerusan.RSMaterialButtonRectangle();
        cbxSatuan = new javax.swing.JComboBox<>();
        txtHarga = new custom.JTextFieldRounded();
        stokVarian1 = new javax.swing.JLabel();

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
                "ID Varian", "Nama Varian", "Stok Varian", "Satuan", "Harga/satuan"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        databahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan.setForeground(new java.awt.Color(102, 102, 102));
        databahan.setText("Menu Varian");

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("TAMBAH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel.setText("BATAL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btn_first.setText("First Page");

        btn_last.setText("Last Page");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        btn_before.setText("<");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20", "25", "30" }));

        btn_next.setText(">");

        lb_halaman.setText("Halaman Of Total Halaman");

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(databahan))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(610, 610, 610)
                        .addComponent(lb_halaman))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(btn_first)
                        .addGap(9, 9, 9)
                        .addComponent(btn_before)
                        .addGap(8, 8, 8)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btn_next)
                        .addGap(8, 8, 8)
                        .addComponent(btn_last)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(databahan)
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(lb_halaman)
                .addGap(4, 4, 4)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_first)
                    .addComponent(btn_before)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(btn_last))
                .addGap(49, 49, 49))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        menubahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        menubahan.setForeground(new java.awt.Color(102, 102, 102));
        menubahan.setText("Tambah Menu Varian");

        idVarian.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        idVarian.setForeground(new java.awt.Color(102, 102, 102));
        idVarian.setText("ID Varian*");

        namaVarian.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        namaVarian.setText("Nama Varian");

        stokVarian.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokVarian.setText("Stok Varian");

        satuan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        satuan.setText("Satuan");

        btnSave.setText("SIMPAN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        batal2.setBackground(new java.awt.Color(255, 102, 0));
        batal2.setText("BATAL");
        batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal2ActionPerformed(evt);
            }
        });

        cbxSatuan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satuan Varian", "Item", "Gram" }));

        stokVarian1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        stokVarian1.setText("Harga/satuan");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokVarian1)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menubahan)
                    .addComponent(idVarian)
                    .addComponent(txtIdVarian, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaVarian, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokVarian)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuan)
                    .addComponent(cbxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(768, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(menubahan)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(idVarian, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(txtIdVarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(namaVarian, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(stokVarian)
                .addGap(9, 9, 9)
                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(satuan)
                .addGap(9, 9, 9)
                .addComponent(cbxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stokVarian1)
                .addGap(9, 9, 9)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();

        txtIdVarian.setText(setidVarian());
        txtStok.setText(setStok());
        txtHarga.setText(setHarga());
        
        if(btnAdd.getText().equals("UBAH")){
            dataTabel();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
            {
                btnSave.setText("SIMPAN");
            }
        else if(btnSave.getText().equals("SIMPAN"))
            {
                insertData();
            }
        else if (btnSave.getText().equals("PERBARUI"))
            {
                updateData();
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void batal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal2ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_batal2ActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lastActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(btnAdd.getText().equals("TAMBAH")){
            btnAdd.setText("UBAH");
            btnDelete.setVisible(true);
            btnCancel.setVisible(true);
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle batal2;
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnCancel;
    private rojerusan.RSMaterialButtonRectangle btnDelete;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbxSatuan;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel idVarian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JLabel menubahan;
    private javax.swing.JLabel namaVarian;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JLabel satuan;
    private javax.swing.JLabel stokVarian;
    private javax.swing.JLabel stokVarian1;
    private javax.swing.JTable tblData;
    private custom.JTextFieldRounded txtHarga;
    private custom.JTextFieldRounded txtIdVarian;
    private custom.JTextFieldRounded txtNama;
    private custom.JTextFieldRounded txtSearch;
    private custom.JTextFieldRounded txtStok;
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
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman );
    }
    
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM varian";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return totalData;
    }
    
    private void loadData() {
        calculateTotalPages();
        int totalData = getTotalData();
        lb_halaman.setText(String.valueOf("Halaman "+ halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void resetForm() {
        txtIdVarian.setText("");
        txtNama.setText("");
        txtStok.setText("");
        cbxSatuan.setSelectedItem("Pilih Satuan Varian");
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new menuVarian());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM varian LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idVarian = rs.getString("id_varian");
                    String namaVarian = rs.getString("nama_varian");
                    int stokVarian = rs.getInt("stok_varian");
                    String satuan = rs.getString("satuan");
                    int harga = rs.getInt("harga_per_satuan");

                    Object[] rowData = {idVarian, namaVarian, stokVarian, satuan,harga};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    private String setidVarian() {
    String urutan = null;
    String prefix = "V";

    try {
        // Ambil semua ID yang ada
        String sql = "SELECT CAST(SUBSTRING(id_varian, 2) AS UNSIGNED) AS Nomor FROM varian WHERE id_varian LIKE ? ORDER BY Nomor ASC";
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

            // Jika tidak ada gap, gunakan nomor berikutnya
            urutan = prefix + String.format("%03d", expectedNomor);
        }
    } catch (Exception e) {
        Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE, null, e);
    }

    return urutan;
    }
    
    private String setStok() {
        String angka = "0";
        return angka;
    }
    
    private String setHarga() {
        String harga = "0";
        return harga;
    }
    
    public boolean validasiNama(){
        boolean valid = false;
        String id_varian = txtIdVarian.getText();
        String nama_varian = txtNama.getText();
        
        String sql = "SELECT nama_varian From varian WHERE id_varian!='"+ id_varian +
                "' AND nama_varian LIKE BINARY '"+ nama_varian +"'";
        try (PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.INFO, Notification.Location.TOP_CENTER, "SILAHKAN INPUT NAMA VARIAN BERBEDA");
                panel.showNotification();
            }
            
            }else{
                valid = true;
            }
        } catch (Exception e) {
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return valid;
    }

    private void insertData() {
        String id_varian = txtIdVarian.getText();
        String nama_varian = txtNama.getText();
        String stok_varian = txtStok.getText();
        String satuan = cbxSatuan.getSelectedItem().toString();
        String harga = txtHarga.getText();
        
        if(id_varian.isEmpty() || nama_varian.isEmpty() || txtStok.getText().isEmpty() || cbxSatuan.getSelectedItem().toString().equals("Pilih Satuan Varian")|| txtHarga.getText().isEmpty()){
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
                panel.showNotification();
            }
            return;
        }
        
        if(!validasiNama()){
            return;
        }
        
        try {
            String sql = "INSERT INTO varian (id_varian, nama_varian, stok_varian, satuan,harga_per_satuan) VALUES (?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, id_varian);
                st.setString(2, nama_varian);
                st.setString(3, stok_varian);
                st.setString(4, satuan);
                st.setString(5, harga);
                
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
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    private void dataTabel() {
         panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        databahan.setText("Perbarui Data Varian");
        
        txtIdVarian.setEnabled(false);
        txtStok.setEnabled(false);
        txtHarga.setEnabled(false);
        
        txtIdVarian.setText(tblData.getValueAt(row, 0).toString());
        txtNama.setText(tblData.getValueAt(row, 1).toString());
        txtStok.setText(tblData.getValueAt(row, 2).toString());
        cbxSatuan.setSelectedItem(tblData.getValueAt(row, 3).toString());
        txtHarga.setText(tblData.getValueAt(row, 4).toString());
    
    }
    
    private void updateData() {
        String id_varian = txtIdVarian.getText();
        String nama_varian = txtNama.getText();
        int stok_varian = Integer.parseInt(txtStok.getText());
        String satuan = cbxSatuan.getSelectedItem().toString();
        int harga = Integer.parseInt(txtHarga.getText());
        
        if(id_varian.isEmpty() || nama_varian.isEmpty() || txtStok.getText().isEmpty() || cbxSatuan.getSelectedItem().toString().equals("Pilih Satuan Varian") || txtHarga.getText().isEmpty()){
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "SEMUA KOLOM HARUS DI-ISI");
                panel.showNotification();
            }
                return;
        }
        
        try {
            String sql = "UPDATE varian SET nama_varian=?, stok_varian=?, satuan=?,harga_per_satuan=? WHERE id_varian=?";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, nama_varian);
                st.setInt(2, stok_varian);
                st.setString(3, satuan);
                st.setInt(4, harga);
                st.setString(5, id_varian);

                
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    if (frame != null) {
                        Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DIPERBARUI");
                        panel.showNotification();
                    }
                        
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    private void deleteData() {
    int selectedRow = tblData.getSelectedRow();

    // Validasi apakah ada baris yang dipilih
    if (selectedRow == -1) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "PILIH DATA YANG INGIN DIHAPUS");
            panel.showNotification();
        }
            return;
    }

    // Konfirmasi penghapusan
    int confirm = JOptionPane.showConfirmDialog(this,
            "Apakah yakin ingin menghapus data ini?",
            "Konfirmasi Hapus Data",
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        // Ambil ID dari kolom pertama (indeks 0)
        String id = tblData.getValueAt(selectedRow, 0).toString();

        try {
            String sql = "DELETE FROM varian WHERE id_varian=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, id);

                int rowDeleted = st.executeUpdate();
                if (rowDeleted > 0) {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    Notification panel = new Notification(frame, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "DATA BERHASIL DIHAPUS");
                    panel.showNotification();
                }
           
                    loadData(); // Refresh tabel setelah penghapusan
                } else {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    if (frame != null) {
                        Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "DATA GAGAL DIHAPUS");
                        panel.showNotification();
                    }
            
                }
            }
        } catch (Exception e) {
            Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    resetForm();
    loadData();
    showPanel();
}

    private void searchData() {
    String kataKunci = txtSearch.getText().trim(); // Menghapus spasi di awal/akhir input
    
    
    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT * FROM varian WHERE id_varian LIKE ? OR nama_varian LIKE ? OR CAST(stok_varian AS CHAR) LIKE ? OR satuan LIKE ? OR CAST(harga_per_satuan AS CHAR) LIKE ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter query untuk semua kolom
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            st.setString(3, "%" + kataKunci + "%");
            st.setString(4, "%" + kataKunci + "%");
            st.setString(5, "%" + kataKunci + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idVarian = rs.getString("id_varian");
                String namaVarian = rs.getString("nama_varian");
                int stokVarian = rs.getInt("stok_varian");
                String satuan = rs.getString("satuan");
                int harga = rs.getInt("harga_per_satuan");
                Object[] rowData = {idVarian, namaVarian, stokVarian, satuan,harga};
                model.addRow(rowData);
            }
        }
    } catch (Exception e) {
        Logger.getLogger(menuVarian.class.getName()).log(Level.SEVERE, null, e);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            Notification panel = new Notification(frame, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Terjadi kesalahan saat mencari data: " + e.getMessage());
            panel.showNotification();
        }
    }
}


    
}
