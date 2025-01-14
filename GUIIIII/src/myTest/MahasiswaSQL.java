/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myTest;

/**
 *
 * @author Josua EL
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MahasiswaSQL extends javax.swing.JFrame {

    
    private static Connection mysqlconfig;
    
    public static Connection congigDb()throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswadatabase";
            String user= "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Connection Failed!" + e.getMessage());
        }
        return mysqlconfig;
    }
    /**
     * Creates new form MahasiswaSQL
     */
    public MahasiswaSQL() {
        initComponents();
        load_table();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTXT = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        nbiLabel = new javax.swing.JLabel();
        nbiTXT = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jurusanLabel = new javax.swing.JLabel();
        jurusanComboBox = new javax.swing.JComboBox<>();
        alamatLabel = new javax.swing.JLabel();
        alamatTXT = new javax.swing.JTextField();
        hapusButton = new javax.swing.JButton();
        nohpLabel = new javax.swing.JLabel();
        nohpTXT = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataSQL = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mahasiswa");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Data Mahasiswa");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(204, 255, 255));
        userLabel.setText("Nama");

        userTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTXTActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(0, 0, 0));
        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 255, 255));
        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nbiLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nbiLabel.setForeground(new java.awt.Color(204, 255, 255));
        nbiLabel.setText("NBI");

        nbiTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbiTXTActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(0, 0, 0));
        editButton.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        editButton.setForeground(new java.awt.Color(153, 255, 255));
        editButton.setText("Edit");
        editButton.setToolTipText("");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jurusanLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jurusanLabel.setForeground(new java.awt.Color(204, 255, 255));
        jurusanLabel.setText("Jurusan");

        jurusanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika ", "Teknik Arsitek ", "Teknik Sipil ", "Teknik Mesin ", "Teknik Industri ", "Sistem Teknologi dan Informasi ", "Akuntansi", "Manajemen", "Administrasi Bisnis ", "Adminitrasi Negara", "Hukum", "Psikolog" }));
        jurusanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanComboBoxActionPerformed(evt);
            }
        });

        alamatLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        alamatLabel.setForeground(new java.awt.Color(204, 255, 255));
        alamatLabel.setText("Alamat");

        alamatTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTXTActionPerformed(evt);
            }
        });

        hapusButton.setBackground(new java.awt.Color(0, 0, 0));
        hapusButton.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        hapusButton.setForeground(new java.awt.Color(153, 255, 255));
        hapusButton.setText("Hapus");
        hapusButton.setToolTipText("");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        nohpLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nohpLabel.setForeground(new java.awt.Color(204, 255, 255));
        nohpLabel.setText("No. Hp");

        nohpTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpTXTActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 0, 0));
        clearButton.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(153, 255, 255));
        clearButton.setText("Clear");
        clearButton.setToolTipText("");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        dataSQL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        dataSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataSQLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataSQL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nbiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nbiTXT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userTXT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(alamatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alamatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nohpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nohpTXT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jurusanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jurusanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addComponent(editButton)
                            .addComponent(hapusButton)
                            .addComponent(clearButton))
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbiLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nbiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jurusanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jurusanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatLabel)
                    .addComponent(alamatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nohpLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nohpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton)))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTXTActionPerformed

    private void nbiTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbiTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbiTXTActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try {
        String sql = "UPDATE table_mhs SET Nama = ?, NBI = ?, Jurusan = ?, Alamat = ?, no_telephone = ? WHERE NBI = ?";
        Connection conn = congigDb();
        if (conn != null) {
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userTXT.getText());
            pst.setString(2, nbiTXT.getText());
            pst.setString(3, jurusanComboBox.getSelectedItem().toString());
            pst.setString(4, alamatTXT.getText());
            pst.setString(5, nohpTXT.getText());
            pst.setString(6, nbiTXT.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil Update!");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    load_table();
    clear();
    }//GEN-LAST:event_editButtonActionPerformed

    private void jurusanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jurusanComboBoxActionPerformed

    private void alamatTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTXTActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM table_mhs WHERE NBI=?";
            Connection conn = congigDb();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nbiTXT.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

        load_table();
        clear();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void nohpTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpTXTActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO table_mhs (Nama, NBI, Jurusan, Alamat, no_telephone) VALUES (?, ?, ?, ?, ?)";
            Connection conn = congigDb();
            if (conn != null) {
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, userTXT.getText());
                pst.setString(2, nbiTXT.getText());
                pst.setString(3, jurusanComboBox.getSelectedItem().toString());
                pst.setString(4, alamatTXT.getText());
                pst.setString(5, nohpTXT.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan data berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
        load_table();
        clear();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void dataSQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataSQLMouseClicked
        // TODO add your handling code here:
        int baris = dataSQL.rowAtPoint(evt.getPoint());
        String Nama = dataSQL.getValueAt(baris, 1).toString();
        userTXT.setText(Nama);
        String NBI = dataSQL.getValueAt(baris, 2).toString();
        nbiTXT.setText(NBI);
        String jurusan = dataSQL.getValueAt(baris, 3).toString();
        jurusanComboBox.setSelectedItem(jurusan);
        String alamat = dataSQL.getValueAt(baris, 4).toString();
        alamatTXT.setText(alamat);
        String hp = dataSQL.getValueAt(baris, 5).toString();
        nohpTXT.setText(hp);
    }//GEN-LAST:event_dataSQLMouseClicked

    private void load_table()
    {
        DefaultTableModel mode = new DefaultTableModel();
        mode.addColumn("No");
        mode.addColumn("Nama");
        mode.addColumn("NBI");
        mode.addColumn("Jurusan");
        mode.addColumn("Alamat");
        mode.addColumn("Phone");
        
        try 
        {
            int no =1;
            String sql = "select * from table_mhs";
            java.sql.Connection conn =(Connection)MahasiswaSQL.congigDb();
            java.sql.Statement state=conn.createStatement();
            java.sql.ResultSet res=state.executeQuery(sql);
            
            while(res.next())
            {
                mode.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                                               res.getString(3), res.getString(4),
                                               res.getString(5)});
            }
            dataSQL.setModel(mode);
        } catch (Exception e)
        {
            
        }
    }
    
    private void clear()
    {
        userTXT.setText(null);
        nbiTXT.setText(null);
        jurusanComboBox.setSelectedItem(null);
        alamatTXT.setText(null);
        nohpTXT.setText(null);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(MahasiswaSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaSQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextField alamatTXT;
    private javax.swing.JButton clearButton;
    private javax.swing.JTable dataSQL;
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusanComboBox;
    private javax.swing.JLabel jurusanLabel;
    private javax.swing.JLabel nbiLabel;
    private javax.swing.JTextField nbiTXT;
    private javax.swing.JLabel nohpLabel;
    private javax.swing.JTextField nohpTXT;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTXT;
    // End of variables declaration//GEN-END:variables
}
