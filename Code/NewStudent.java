
package library;

import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Farhan
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        fathertxt = new javax.swing.JTextField();
        coursebox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        branchbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 116, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 184, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 244, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Branch Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 314, -1, -1));

        idtxt.setBackground(new java.awt.Color(255, 255, 204));
        idtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 46, 194, -1));

        nametxt.setBackground(new java.awt.Color(255, 255, 204));
        nametxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 110, 194, -1));

        fathertxt.setBackground(new java.awt.Color(255, 255, 204));
        fathertxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fathertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 178, 194, -1));

        coursebox.setBackground(new java.awt.Color(255, 255, 204));
        coursebox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coursebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "B.Tech", "BSC(CS)", " " }));
        getContentPane().add(coursebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 238, 194, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/save-icon--1.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 377, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 377, -1, -1));

        branchbox.setBackground(new java.awt.Color(255, 255, 204));
        branchbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branchbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIVIL", "IT", "PHARMA", " ", " " }));
        branchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchboxActionPerformed(evt);
            }
        });
        getContentPane().add(branchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 308, 194, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/123456.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
           try
            {
                 String StudentID = idtxt.getText();
                 String name = nametxt.getText();
                 String fathername = fathertxt.getText();
                 String course = (String)coursebox.getSelectedItem();
                 String branch = (String)branchbox.getSelectedItem();
                 
               Connection con = sever.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("insert into librarydata values('"+StudentID+"','"+name+"','"+fathername+"','"+course+"','"+branch+"')");
                JOptionPane.showMessageDialog(null,"Successfull updated");
                setVisible(false);
                new NewStudent().setVisible(true);
            }
            catch(Exception e)
            {
                   JOptionPane.showMessageDialog(null,"student already exist");
                setVisible(false);
                new NewStudent().setVisible(true);
             
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void branchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchbox;
    private javax.swing.JComboBox<String> coursebox;
    private javax.swing.JTextField fathertxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables
}
