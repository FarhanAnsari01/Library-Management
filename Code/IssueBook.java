
package library;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Farhan
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookidtxt = new javax.swing.JTextField();
        studentidtxt = new javax.swing.JTextField();
        issuedatebox = new com.toedter.calendar.JDateChooser();
        duedatebox = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 73, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 144, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 214, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 293, -1, -1));

        bookidtxt.setBackground(new java.awt.Color(255, 255, 204));
        bookidtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bookidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 67, 226, -1));

        studentidtxt.setBackground(new java.awt.Color(255, 255, 204));
        studentidtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(studentidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 138, 226, -1));

        issuedatebox.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(issuedatebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 212, 226, -1));

        duedatebox.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(duedatebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 291, 226, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/save-icon--1.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 354, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 354, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Icons/123456.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
            SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
       String bookID = bookidtxt.getText();
       String studentID = studentidtxt.getText();
       String issuedate = dformat.format(issuedatebox.getDate());
       String duedate = dformat.format(duedatebox.getDate());
       String returnbook = "NO";
           
           try
           {
               java.sql.Connection con = sever.getCon();
               Statement st = con.createStatement();
               ResultSet rs = st.executeQuery("select *from newbook where bookID='"+bookID+"'");
               if(rs.next())
               {
                    ResultSet rs1 = st.executeQuery("select *from librarydata where studentID='"+studentID+"'");
                    if(rs1.next())
                    {
                 st.executeUpdate("insert into issuebook value('"+bookID+"','"+studentID+"','"+issuedate+"','"+duedate+"','"+returnbook+"')");
                        JOptionPane.showConfirmDialog(null, "Book Successfully Issued");
                        setVisible(false);
                        new IssueBook().setVisible(true);
                    }else
                    {
                         JOptionPane.showConfirmDialog(null, "Incorrect StudentID");
                    }
               }
               else
               {
                   JOptionPane.showConfirmDialog(null, "Incorrect BookID");
               }
           }catch(Exception e)
           {
                 JOptionPane.showConfirmDialog(null, "Connection error");
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookidtxt;
    private com.toedter.calendar.JDateChooser duedatebox;
    private com.toedter.calendar.JDateChooser issuedatebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField studentidtxt;
    // End of variables declaration//GEN-END:variables
}
