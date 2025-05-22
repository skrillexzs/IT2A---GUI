package Logins;


import Logins.LoginForm;
import config.Config;
import config.HashPass;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC
 */
public class RegForm extends javax.swing.JFrame {

    List<String> existingEmails = Arrays.asList("u_email");
    
    public RegForm() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cnumber = new javax.swing.JTextField();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        hide3 = new javax.swing.JLabel();
        show3 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 248, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 230, 180));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create a new account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 50));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("First name*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Last name*");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 20));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("Email*");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 50, 20));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Contact number*");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 20));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Password*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 20));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Confirm Password*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 130, 20));

        fname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 40));

        lname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 40));

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 40));

        cnumber.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cnumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumberActionPerformed(evt);
            }
        });
        jPanel2.add(cnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 240, 40));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 20));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/show.png"))); // NOI18N
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 20));

        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 40));

        hide3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide.png"))); // NOI18N
        hide3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hide3MouseReleased(evt);
            }
        });
        jPanel2.add(hide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 20));

        show3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/show.png"))); // NOI18N
        jPanel2.add(show3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 20));

        cpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 240, 40));

        signup.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 153, 255));
        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel2.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 40));

        Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Cancel.setForeground(new java.awt.Color(0, 153, 255));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel2.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 120, 40));

        type.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Borrower", "Librarian" }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 40));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setText("Type*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 600, 490));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Transparent Background 2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 730));

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

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed

    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed

    }//GEN-LAST:event_lnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void cnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumberActionPerformed

    }//GEN-LAST:event_cnumberActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        
        Config conf = new Config();
boolean isValid = true;

String emails = email.getText().trim();

// First Name Validation
String firstName = fname.getText().trim();
if (!firstName.matches("[a-zA-Z]+")) {
    fname.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "First name must contain only letters.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Last Name Validation
String lastName = lname.getText().trim();
if (!lastName.matches("[a-zA-Z]+")) {
    lname.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Last name must contain only letters.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
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
} else if (!emails.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email must be in the format 'username@domain.com'.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Contact Number Validation
String contactNumber = cnumber.getText().trim();
if (contactNumber.isEmpty() || !contactNumber.matches("\\d{11}")) {
    cnumber.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Contact number must contain exactly 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    cnumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Password Validation
char[] passwordChars = pass.getPassword();
String password = new String(passwordChars); // Convert char[] to String
Arrays.fill(passwordChars, ' '); // Clear password from memory for security

if (password.isEmpty()) {
    pass.setBorder(BorderFactory.createLineBorder(Color.RED));
    isValid = false;
} else if (password.length() < 8) {
    pass.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    pass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Confirm Password Validation
String confirmPassword = new String(cpass.getPassword());
if (confirmPassword.isEmpty()) {
    cpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    isValid = false;
} else if (!password.equals(confirmPassword)) {
    pass.setBorder(BorderFactory.createLineBorder(Color.RED));
    cpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Password does not match", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;
} else {
    pass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    cpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Account Type Validation
if (type.getSelectedIndex() == 0) {
    type.setBorder(BorderFactory.createLineBorder(Color.RED));
    isValid = false;
} else {
    type.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Final Validation Check
if (!isValid) {
    JOptionPane.showMessageDialog(null, "Some fields are required", "Error!", JOptionPane.ERROR_MESSAGE);
    return;
}

// Hash Password
String hashedPassword = HashPass.hashPassword(password);

// Set the default profile picture
        String profilePicture = "Profilepictures/defaultpp.png";  // Set the path to the default profile picture

// Database Insertion Using PreparedStatement
try {
    String sql = "INSERT INTO user (u_firstname, u_lastname, u_email, u_cnumber, u_password, u_type, u_profilepic, u_status) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, 'Pending')";

    PreparedStatement pst = conf.getConnection().prepareStatement(sql);
    pst.setString(1, firstName);
    pst.setString(2, lastName);
    pst.setString(3, emails);
    pst.setString(4, contactNumber);
    pst.setString(5, hashedPassword);
    pst.setString(6, type.getSelectedItem().toString());
    pst.setString(7, profilePicture);

    int rowsInserted = pst.executeUpdate();
    
    if (rowsInserted == 1) {
        JOptionPane.showMessageDialog(null, "Registration Completed", "Success!", JOptionPane.INFORMATION_MESSAGE);
        
        LoginForm lg = new LoginForm();
        this.dispose();
        lg.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Registration failed. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_signupActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        pass.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void hide3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide3MousePressed
        show3.setVisible(true);
        hide3.setVisible(false);
        cpass.setEchoChar((char)0);
    }//GEN-LAST:event_hide3MousePressed

    private void hide3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide3MouseReleased
        show3.setVisible(false);
        hide3.setVisible(true);
        cpass.setEchoChar('*');
    }//GEN-LAST:event_hide3MouseReleased

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        LoginForm lf = new LoginForm();
        this.dispose();
        lf.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField cnumber;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show3;
    private javax.swing.JButton signup;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
