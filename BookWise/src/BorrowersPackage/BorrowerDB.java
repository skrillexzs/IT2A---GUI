package BorrowersPackage;


import AdminsPackage.AccPage;
import AdminsPackage.BookWise;
import LibrarianPackage.LibrarianDB;
import Logins.LoginForm;
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
 * @author USER
 */
public class BorrowerDB extends javax.swing.JFrame {

    /**
     * Creates new form BorrowerDB
     */
    public BorrowerDB() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dbButton1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bwButton1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbButton1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        accButton1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logButton1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(240, 248, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 170));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel1.setText("BORROWER DASHBOARD");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        jPanel6.setBackground(new java.awt.Color(210, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dbButton1.setBackground(new java.awt.Color(210, 255, 255));
        dbButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbButton1MouseExited(evt);
            }
        });
        dbButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setText("DASHBOARD");
        dbButton1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard icon.png"))); // NOI18N
        dbButton1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel6.add(dbButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 50));

        bwButton1.setBackground(new java.awt.Color(210, 255, 255));
        bwButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bwButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bwButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bwButton1MouseExited(evt);
            }
        });
        bwButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("BORROWERS");
        bwButton1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer icon.png"))); // NOI18N
        bwButton1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel6.add(bwButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 50));

        lbButton1.setBackground(new java.awt.Color(210, 255, 255));
        lbButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbButton1MouseExited(evt);
            }
        });
        lbButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setText("LIBRARIAN");
        lbButton1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin icon.png"))); // NOI18N
        lbButton1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel6.add(lbButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 150, 50));

        accButton1.setBackground(new java.awt.Color(210, 255, 255));
        accButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accButton1MouseExited(evt);
            }
        });
        accButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel20.setText("ACCOUNT");
        accButton1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account icon(1).png"))); // NOI18N
        accButton1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel6.add(accButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 140, 50));

        logButton1.setBackground(new java.awt.Color(210, 255, 255));
        logButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logButton1MouseExited(evt);
            }
        });
        logButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setText("LOGOUT");
        logButton1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 30));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout icon.png"))); // NOI18N
        logButton1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel6.add(logButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 130, 50));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 830, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 850, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dbButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButton1MouseClicked
        BookWise bwd = new BookWise();
        this.dispose();
        bwd.setVisible(true);
    }//GEN-LAST:event_dbButton1MouseClicked

    private void dbButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButton1MouseEntered
        dbButton1.setBackground(hover);
    }//GEN-LAST:event_dbButton1MouseEntered

    private void dbButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButton1MouseExited
        dbButton1.setBackground(defbutton);
    }//GEN-LAST:event_dbButton1MouseExited

    private void bwButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButton1MouseClicked
        BorrowerDB bdb = new BorrowerDB();
        this.dispose();
        bdb.setVisible(true);
    }//GEN-LAST:event_bwButton1MouseClicked

    private void bwButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButton1MouseEntered
        bwButton1.setBackground(hover);
    }//GEN-LAST:event_bwButton1MouseEntered

    private void bwButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButton1MouseExited
        bwButton1.setBackground(defbutton);
    }//GEN-LAST:event_bwButton1MouseExited

    private void lbButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButton1MouseClicked
        LibrarianDB ldb = new LibrarianDB();
        this.dispose();
        ldb.setVisible(true);
    }//GEN-LAST:event_lbButton1MouseClicked

    private void lbButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButton1MouseEntered
        lbButton1.setBackground(hover);
    }//GEN-LAST:event_lbButton1MouseEntered

    private void lbButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButton1MouseExited
        lbButton1.setBackground(defbutton);
    }//GEN-LAST:event_lbButton1MouseExited

    private void accButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButton1MouseClicked
        AccPage ap = new AccPage();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_accButton1MouseClicked

    private void accButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButton1MouseEntered
        accButton1.setBackground(hover);
    }//GEN-LAST:event_accButton1MouseEntered

    private void accButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButton1MouseExited
        accButton1.setBackground(defbutton);
    }//GEN-LAST:event_accButton1MouseExited

    private void logButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButton1MouseClicked
        LoginForm lf = new LoginForm();
        this.dispose();
        lf.setVisible(true);
    }//GEN-LAST:event_logButton1MouseClicked

    private void logButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButton1MouseEntered
        logButton1.setBackground(hover);
    }//GEN-LAST:event_logButton1MouseEntered

    private void logButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButton1MouseExited
        logButton1.setBackground(defbutton);
    }//GEN-LAST:event_logButton1MouseExited

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
            java.util.logging.Logger.getLogger(BorrowerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowerDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accButton1;
    private javax.swing.JPanel bwButton1;
    private javax.swing.JPanel dbButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel lbButton1;
    private javax.swing.JPanel logButton1;
    // End of variables declaration//GEN-END:variables
}
