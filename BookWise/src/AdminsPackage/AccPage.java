package AdminsPackage;

import BorrowersPackage.BorrowerDB;
import LibrarianPackage.LibrarianDB;
import Logins.LoginForm;
import config.Session;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC
 */
public class AccPage extends javax.swing.JFrame {

    /**
     * Creates new form AccPage
     */
    public AccPage() {
        initComponents();
        
        loadAccountInformation();
    }
    
    public void loadAccountInformation() {
        Session sess = Session.getInstance();

        // Check if session is valid

        String firstName = sess.getFname();
        String lastName = sess.getLname();
        
        afn.setText("First Name: " + firstName);
        aln.setText ("Last Name: " + lastName);
    }

        Color hover = new Color(0,85,255);  
        Color defbutton = new Color(153,204,255);
    
        Border empty = BorderFactory.createEmptyBorder();
    
        void resetButtonColor(JButton button){
            button.setBackground(defbutton);
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dbButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bwButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        accButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        afn = new javax.swing.JLabel();
        aln = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(240, 248, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 170));

        dbButton.setBackground(new java.awt.Color(153, 204, 255));
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

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setText("DASHBOARD");
        dbButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard icon.png"))); // NOI18N
        dbButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jPanel4.add(dbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 50));

        bwButton.setBackground(new java.awt.Color(153, 204, 255));
        bwButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bwButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bwButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bwButtonMouseExited(evt);
            }
        });
        bwButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setText("BORROWERS");
        bwButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer icon.png"))); // NOI18N
        bwButton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel4.add(bwButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 50));

        lbButton.setBackground(new java.awt.Color(153, 204, 255));
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

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setText("LIBRARIAN");
        lbButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin icon.png"))); // NOI18N
        lbButton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        jPanel4.add(lbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 50));

        accButton.setBackground(new java.awt.Color(153, 204, 255));
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

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel6.setText("ACCOUNT");
        accButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account icon(1).png"))); // NOI18N
        accButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        jPanel4.add(accButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 50));

        logButton.setBackground(new java.awt.Color(153, 204, 255));
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

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel11.setText("LOGOUT");
        logButton.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout icon.png"))); // NOI18N
        logButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        jPanel4.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 250, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        jPanel2.setBackground(new java.awt.Color(210, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setText("Account Page");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 370, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 80));

        afn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        afn.setText("First Name:");
        jPanel1.add(afn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 130, 40));

        aln.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        aln.setText("Last Name:");
        jPanel1.add(aln, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 130, 40));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dbButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseEntered
        dbButton.setBackground(hover);
    }//GEN-LAST:event_dbButtonMouseEntered

    private void dbButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseExited
        dbButton.setBackground(defbutton);
    }//GEN-LAST:event_dbButtonMouseExited

    private void dbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseClicked
        BookWise bwd = new BookWise();
        this.dispose();
        bwd.setVisible(true);
    }//GEN-LAST:event_dbButtonMouseClicked

    private void bwButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButtonMouseClicked
        BorrowerDB bdb = new BorrowerDB();
        this.dispose();
        bdb.setVisible(true);
    }//GEN-LAST:event_bwButtonMouseClicked

    private void bwButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButtonMouseEntered
        bwButton.setBackground(hover);
    }//GEN-LAST:event_bwButtonMouseEntered

    private void bwButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButtonMouseExited
        bwButton.setBackground(defbutton);
    }//GEN-LAST:event_bwButtonMouseExited

    private void lbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseClicked
        LibrarianDB ldb = new LibrarianDB();
        this.dispose();
        ldb.setVisible(true);
    }//GEN-LAST:event_lbButtonMouseClicked

    private void lbButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseEntered
        lbButton.setBackground(hover);
    }//GEN-LAST:event_lbButtonMouseEntered

    private void lbButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseExited
        lbButton.setBackground(defbutton);
    }//GEN-LAST:event_lbButtonMouseExited

    private void accButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseClicked
        AccPage acc = new AccPage();
        this.dispose();
        acc.setVisible(true);
    }//GEN-LAST:event_accButtonMouseClicked

    private void accButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseEntered
        accButton.setBackground(hover);
    }//GEN-LAST:event_accButtonMouseEntered

    private void accButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseExited
        accButton.setBackground(defbutton);
    }//GEN-LAST:event_accButtonMouseExited

    private void logButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButtonMouseClicked
        LoginForm lf = new LoginForm();
        this.dispose();
        lf.setVisible(true);
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
            java.util.logging.Logger.getLogger(AccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accButton;
    private javax.swing.JLabel afn;
    private javax.swing.JLabel aln;
    private javax.swing.JPanel bwButton;
    private javax.swing.JPanel dbButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel lbButton;
    private javax.swing.JPanel logButton;
    // End of variables declaration//GEN-END:variables
}
