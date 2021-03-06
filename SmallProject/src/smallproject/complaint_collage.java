/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallproject;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class complaint_collage extends javax.swing.JFrame {
    private static  final String url ="jdbc:mysql://localhost:3306/ccteam";
    private static  final String user ="root";
    private static  final String password ="";
    private  static  Connection conn;
    private  static  Statement stat;
    private  static ResultSet resSet;
    public DefaultTableModel tabModel;
    
     public void Table() {
        Object[] Table = {
            "ID_Complaint", "Date_Of_Filling", "NIM", "Complaint", "Evidence"
        };
        tabModel = new DefaultTableModel(null, Table);
        txt_dataTabel.setModel(tabModel);
    }
      public void tampilData(String where) {
        try {
            conn = DriverManager.getConnection(url, user, password); //opening the connection
            stat = conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            resSet = stat.executeQuery("SELECT * FROM complaint_collage " + where);
            
            while (resSet.next()) {
                Object[] data = {
                    resSet.getString("ID_Complaint"),
                    resSet.getString("Date_Of_Filling"),
                    resSet.getString("NIM"),
                    resSet.getString("Complaint"),
                    resSet.getString("Evidence"),
                };
                tabModel.addRow(data);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates new form complaint_collage
     */
    public complaint_collage() {
        initComponents();
         Table();
        tampilData("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_complaint = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_keluhan = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_evidance = new javax.swing.JTextField();
        txt_gambar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_dataTabel = new javax.swing.JTable();
        b_Add = new javax.swing.JButton();
        b_Update = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_Cancel = new javax.swing.JButton();
        b_next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallproject/cc.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Complaint Collage");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIM");

        txt_nim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID_Complaint");

        txt_complaint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_complaintActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Complaint");

        txt_keluhan.setColumns(20);
        txt_keluhan.setRows(5);
        jScrollPane1.setViewportView(txt_keluhan);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Of Filling");

        txt_date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Evidance");

        txt_evidance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_gambar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_gambar.setForeground(new java.awt.Color(255, 255, 255));
        txt_gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txt_dataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "ID_Complaint", "Complaint", "Date Of Filling", "Evidance"
            }
        ));
        jScrollPane2.setViewportView(txt_dataTabel);

        b_Add.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b_Add.setText("Add");
        b_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_AddActionPerformed(evt);
            }
        });

        b_Update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b_Update.setText("Update");
        b_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UpdateActionPerformed(evt);
            }
        });

        b_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b_delete.setText("Delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        b_Cancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b_Cancel.setText("Cancel");
        b_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CancelActionPerformed(evt);
            }
        });

        b_next.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b_next.setText("Next");
        b_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2)
                                .addGap(127, 127, 127))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_complaint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(110, 110, 110)))
                        .addComponent(txt_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_Add)
                            .addComponent(b_delete))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_Update)
                            .addComponent(b_Cancel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_evidance, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_next))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_evidance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txt_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Update)
                            .addComponent(b_Add))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_delete)
                    .addComponent(b_Cancel))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_next)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_complaintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_complaintActionPerformed

    private void b_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_AddActionPerformed
        // TODO add your handling code here:
        try{
            conn = DriverManager.getConnection(url, user, password); // opening the connection
            stat = conn.createStatement();// execute query
           stat.executeUpdate("INSERT INTO `complaint_collage`(`ID_Complaint`, `Date_Of_Filling`, `NIM`, `Complaint`, `Evidence`) VALUES ('"+txt_complaint.getText()+"','"+txt_date.getText()+"','"+txt_nim.getText()+"','"+txt_complaint.getText()+"','"+txt_evidance.getText()+"')");

            JOptionPane.showMessageDialog(null, "berhasil simpan");
            
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_b_AddActionPerformed

    private void b_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UpdateActionPerformed
        // TODO add your handling code here:
        try{
            conn = DriverManager.getConnection(url, user, password); // opening the connection
            stat = conn.createStatement();// execute query
            java.sql.PreparedStatement stat = conn.prepareStatement ("UPDATE `complaint_collage` SET Date_Of_Filling ='"+txt_date.getText()+"', NIM = '"+txt_nim.getText()+"', Complaint = '"+txt_complaint.getText()+"', Evidence = '"+txt_evidance.getText()+"' WHERE ID_Complaint = '"+txt_complaint.getText()+"'");
                stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhasil diedit");
            
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_b_UpdateActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        try{
            conn = DriverManager.getConnection(url, user, password); // opening the connection
            stat = conn.createStatement();// execute query
            java.sql.PreparedStatement stat = conn.prepareStatement("DELETE FROM `complaint_collage` WHERE `ID_Complaint` ='" + txt_complaint.getText() + "'");
                stat.executeUpdate();
    
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
            
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_b_CancelActionPerformed

    private void b_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nextActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new campus().setVisible(true);
    }//GEN-LAST:event_b_nextActionPerformed

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
            java.util.logging.Logger.getLogger(complaint_collage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complaint_collage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complaint_collage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complaint_collage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complaint_collage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Add;
    private javax.swing.JButton b_Cancel;
    private javax.swing.JButton b_Update;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_complaint;
    private javax.swing.JTable txt_dataTabel;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_evidance;
    private javax.swing.JLabel txt_gambar;
    private javax.swing.JTextArea txt_keluhan;
    private javax.swing.JTextField txt_nim;
    // End of variables declaration//GEN-END:variables
}
