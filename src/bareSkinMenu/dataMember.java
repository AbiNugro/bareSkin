package bareSkinMenu;

import menu.*;
import config.koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class dataMember extends javax.swing.JDialog {
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    private Connection conn;
    
    private String id_member;
    private String nama_member;
    private String alamat;
    private String id_card;
    private String poin;
    
    public String getId_member() {
        return id_member;
    }

    public String getNama_member() {
        return nama_member;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getId_card() {
        return id_card;
    }
    
    public String getPoin() {
        return poin;
    }

    public dataMember(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conn = koneksi.getConnection();
        loadData();
        setTabelModel();
        pagination();
        setupTableMouseListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        databahan = new javax.swing.JLabel();
        txtSearch = new custom.JTextFieldRounded();
        btn_first = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblData.setForeground(new java.awt.Color(75, 22, 76));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama Member", "Alamat", "ID Card", "Poin"
            }
        ));
        tblData.setRowMargin(3);
        jScrollPane1.setViewportView(tblData);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        databahan.setBackground(new java.awt.Color(75, 22, 76));
        databahan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        databahan.setForeground(new java.awt.Color(75, 22, 76));
        databahan.setText("Data Member");

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btn_first.setForeground(new java.awt.Color(75, 22, 76));
        btn_first.setText("First Page");

        btn_last.setForeground(new java.awt.Color(75, 22, 76));
        btn_last.setText("Last Page");

        btn_before.setForeground(new java.awt.Color(75, 22, 76));
        btn_before.setText("<");

        cbx_data.setForeground(new java.awt.Color(75, 22, 76));
        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        btn_next.setForeground(new java.awt.Color(75, 22, 76));
        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        lb_halaman.setForeground(new java.awt.Color(75, 22, 76));
        lb_halaman.setText("Halaman Of Total Halaman");

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(databahan))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1))))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(lb_halaman))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btn_first)
                .addGap(8, 8, 8)
                .addComponent(btn_before)
                .addGap(11, 11, 11)
                .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_next)
                .addGap(11, 11, 11)
                .addComponent(btn_last))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(databahan)
                .addGap(16, 16, 16)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lb_halaman)
                .addGap(9, 9, 9)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_first)
                    .addComponent(btn_before)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(btn_last)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nextActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel databahan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tblData;
    private custom.JTextFieldRounded txtSearch;
    // End of variables declaration//GEN-END:variables

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }

    private void setupTableMouseListener() {
        tblData.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Double-click
                    pilihData();
                }
            }
        });
        
        // Also add keyboard support for Enter key
        tblData.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    pilihData();
                }
            }
        });
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
    
 

    
    private void calculateTotalPages(){
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman );
    }
    
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM member";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        }catch (Exception e) {     
            Logger.getLogger(dataMember.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return totalData;
    }
    
    private void loadData() {
        calculateTotalPages();
        int totalData = getTotalData();
        lb_halaman.setText(String.valueOf("Halaman "+ halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
    }
    
    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
           String sql = "SELECT * FROM member LIMIT ?,?";
           try (PreparedStatement st = conn.prepareStatement(sql)) {
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery();
               
               while (rs.next()) {
                    String idMember = rs.getString("id_member");
                    String namaMember = rs.getString("nama_member");
                    String alamat = rs.getString("alamat");
                    String idCard = rs.getString("id_card");
                    int poin = rs.getInt("poin");

                    Object[] rowData = {idMember, namaMember, alamat, idCard, poin};
                    model.addRow(rowData);
                }
           }
        }catch (Exception e) {
            Logger.getLogger(dataMember.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    private void searchData() {
    String kataKunci = txtSearch.getText().trim();

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT * FROM member WHERE id_member LIKE ? OR nama_member LIKE ? OR "
                   + "alamat LIKE ? OR id_card LIKE ? OR CAST(poin AS CHAR) LIKE ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            for (int i = 1; i <= 5; i++) {
                st.setString(i, "%" + kataKunci + "%");
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String idMember = rs.getString("id_member");
                String namaMember = rs.getString("nama_member");
                String alamat = rs.getString("alamat");
                String idCard = rs.getString("id_card");
                int poin = rs.getInt("poin");
                model.addRow(new Object[]{idMember, namaMember, alamat, idCard, poin});
            }
        }

        System.out.println("Jumlah baris setelah search: " + tblData.getRowCount());

            if (tblData.getRowCount() == 1) {
                tblData.setRowSelectionInterval(0, 0);
                System.out.println("Baris tunggal ditemukan, memanggil pilihData()");
                pilihData();
            }

    } catch (Exception e) {
        Logger.getLogger(dataMember.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencari data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    private void pilihData() {
    int selectedRow = tblData.getSelectedRow();
    if (selectedRow != -1) {
        String id = tblData.getValueAt(selectedRow, 0).toString();
        String nama = tblData.getValueAt(selectedRow, 1).toString();
        System.out.println("Terpilih: " + id + " - " + nama);

        // Tutup form jika memang kamu ingin auto-close
        // dispose();  <-- bisa dikomentar dulu saat uji coba
    }
}

    
}
