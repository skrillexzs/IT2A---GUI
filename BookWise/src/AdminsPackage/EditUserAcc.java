/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminsPackage;

import config.Config;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EditUserAcc extends javax.swing.JFrame {

    List<String> existingEmails = Arrays.asList("u_email");
    
    public EditUserAcc() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cnum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stat = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 248, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT USER ACCOUNT INFO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 340, 70));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("First Name*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Last Name*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 40));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Email*");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 50, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 40));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("Contact Number*");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, -1));

        cnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumActionPerformed(evt);
            }
        });
        jPanel2.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 40));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Status");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 50, -1));

        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        jPanel2.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 340, 390));

        updateButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 120, 50));

        cancelButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         Config conf = new Config();
        boolean isValid = true;
       
         String emails = email.getText().trim();
        
         // First Name Validation
        {
         String firstName = fname.getText().trim();
                if (!firstName.matches("[a-zA-Z]+")) {
                    fname.setBorder(BorderFactory.createLineBorder(Color.RED));
                    JOptionPane.showMessageDialog(null, "First name must contain only letters.", "Error", JOptionPane.ERROR_MESSAGE);
                    isValid = false;
           }else {
            fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}
        
        // Last Name Validation
        String lastName = lname.getText().trim();
                if (!lastName.matches("[a-zA-Z]+")) {
                    lname.setBorder(BorderFactory.createLineBorder(Color.RED));
                    JOptionPane.showMessageDialog(null, "Last name must contain only letters.", "Error", JOptionPane.ERROR_MESSAGE);
                    isValid = false;
           }else {
            lname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

    // Email Validation
if (email.getText().isEmpty()) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    isValid = false;
} else if (existingEmails.contains(emails)) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email is already registered. Please use another email.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Email Format Validation
if (!emails.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email must be in the format 'username@domain.com'.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Contact Number Validation
    if (cnum.getText().isEmpty()) {
        cnum.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        cnum.setBorder(BorderFactory.createLineBorder(Color.GRAY));       
    }
    
    String contactNumber = cnum.getText().trim();
    if (!contactNumber.matches("\\d{11}")) {
        cnum.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        JOptionPane.showMessageDialog(null, "Contact number must contain exactly 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
    }else {
        cnum.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}
     // Final Validation Check
    if (!isValid) {
        JOptionPane.showMessageDialog(null, "Some fields are required", "Error!", JOptionPane.ERROR_MESSAGE);
    } else {
        
        JOptionPane.showMessageDialog(null, "User Info Updated", "Success!", JOptionPane.INFORMATION_MESSAGE);

            // Database Insertion
           if (conf.insertData("UPDATE user SET u_firstname = '" + fname.getText() + "', "
                + "u_lastname = '" + lname.getText() + "', "
                + "u_email = '" + email.getText() + "', "
                + "u_cnumber = '" + cnum.getText() + "', "
                + "u_status = 'Active' "
                + "WHERE u_email = '" + email.getText() + "'") == 1) {

            BookWise bwd = new BookWise();
            this.dispose();
            bwd.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Database update failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    }//GEN-LAST:event_updateButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
            BookWise bwd = new BookWise();
            this.dispose();
            bwd.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUserAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    public javax.swing.JTextField cnum;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField stat;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
