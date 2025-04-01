/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorrowersPackage;

import AdminsPackage.AccPage;
import AdminsPackage.BookWise;
import Logins.LoginForm;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author USER
 */
public class BorrowersDB extends javax.swing.JFrame {

    /**
     * Creates new form BorrowersDB
     */
    public BorrowersDB() {
        initComponents();
    }
    
    Color hover = new Color(0,85,255);  
    Color defbutton = new Color(210,255,255);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dbButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(240, 248, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 170));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel1.setText("BORROWERS DASHBOARD");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        jPanel2.setBackground(new java.awt.Color(210, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dbButton.setBackground(new java.awt.Color(210, 255, 255));
        dbButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbButtonMouseExited(evt);
            }
        });
        dbButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("DASHBOARD");
        dbButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard icon.png"))); // NOI18N
        dbButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel2.add(dbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 50));

        lbButton.setBackground(new java.awt.Color(210, 255, 255));
        lbButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbButtonMouseExited(evt);
            }
        });
        lbButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("LOANED BOOKS");
        lbButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer icon.png"))); // NOI18N
        lbButton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel2.add(lbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 50));

        accButton.setBackground(new java.awt.Color(210, 255, 255));
        accButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accButtonMouseExited(evt);
            }
        });
        accButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("ACCOUNT");
        accButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account icon(1).png"))); // NOI18N
        accButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel2.add(accButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 50));

        logButton.setBackground(new java.awt.Color(210, 255, 255));
        logButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logButtonMouseExited(evt);
            }
        });
        logButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("LOGOUT");
        logButton.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout icon.png"))); // NOI18N
        logButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel2.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 130, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 830, 70));

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

    private void dbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseClicked
        BorrowersDB bwdb = new BorrowersDB();
        this.dispose();
        bwdb.setVisible(true);
    }//GEN-LAST:event_dbButtonMouseClicked

    private void dbButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseEntered
        dbButton.setBackground(hover);
    }//GEN-LAST:event_dbButtonMouseEntered

    private void dbButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseExited
        dbButton.setBackground(defbutton);
    }//GEN-LAST:event_dbButtonMouseExited

    private void lbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseClicked
        LoanedBooks lb = new LoanedBooks();
        this.dispose();
        lb.setVisible(true);
    }//GEN-LAST:event_lbButtonMouseClicked

    private void lbButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseEntered
        lbButton.setBackground(hover);
    }//GEN-LAST:event_lbButtonMouseEntered

    private void lbButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseExited
        lbButton.setBackground(defbutton);
    }//GEN-LAST:event_lbButtonMouseExited

    private void accButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseClicked
        BorrowerProf bwp = new BorrowerProf();
        this.dispose();
        bwp.setVisible(true);
    }//GEN-LAST:event_accButtonMouseClicked

    private void accButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseEntered
        accButton.setBackground(hover);
    }//GEN-LAST:event_accButtonMouseEntered

    private void accButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseExited
        accButton.setBackground(defbutton);
    }//GEN-LAST:event_accButtonMouseExited

    private void logButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButtonMouseClicked
        int choice = JOptionPane.showConfirmDialog(
            null,
            "Do you want to logout?",
            "Logout Confirmation",
            JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {

            this.dispose();
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
        }
    }//GEN-LAST:event_logButtonMouseClicked

    private void logButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButtonMouseEntered
        logButton.setBackground(hover);
    }//GEN-LAST:event_logButtonMouseEntered

    private void logButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButtonMouseExited
        logButton.setBackground(defbutton);
    }//GEN-LAST:event_logButtonMouseExited

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
            java.util.logging.Logger.getLogger(BorrowersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowersDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accButton;
    private javax.swing.JPanel dbButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel lbButton;
    private javax.swing.JPanel logButton;
    // End of variables declaration//GEN-END:variables
}
