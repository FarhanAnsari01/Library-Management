/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import javax.swing.JOptionPane;

/**
 *
 * @author Farhan
 */
public class LoginLibrary extends javax.swing.JFrame {

    /**
     * Creates new form LoginLibrary
     */
    public LoginLibrary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userlb = new javax.swing.JLabel();
        paswrdlb = new javax.swing.JLabel();
        usrtxt = new javax.swing.JTextField();
        logbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        pswrdtxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userlb.setText("User Name");
        getContentPane().add(userlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        paswrdlb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paswrdlb.setText("Password");
        getContentPane().add(paswrdlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        usrtxt.setBackground(new java.awt.Color(255, 255, 204));
        usrtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(usrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 210, -1));

        logbtn.setBackground(new java.awt.Color(255, 255, 204));
        logbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/login.png"))); // NOI18N
        logbtn.setText("Login");
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, -1, -1));

        closebtn.setBackground(new java.awt.Color(255, 255, 204));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/red-x-mark-transparent-background-3.png"))); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, -1));

        pswrdtxt.setBackground(new java.awt.Color(255, 255, 204));
        pswrdtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(pswrdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 210, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/Login background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_closebtnActionPerformed

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
       if(usrtxt.getText().equals("admin") && pswrdtxt.getText().equals("118921"))
       {
           setVisible(false);
           new HomeLibrary().setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Incorrect user and password");
           usrtxt.setText("");
           pswrdtxt.setText("");
       }
    }//GEN-LAST:event_logbtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginLibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logbtn;
    private javax.swing.JLabel paswrdlb;
    private javax.swing.JPasswordField pswrdtxt;
    private javax.swing.JLabel userlb;
    private javax.swing.JTextField usrtxt;
    // End of variables declaration//GEN-END:variables
}
