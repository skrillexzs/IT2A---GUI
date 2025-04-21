package Logins;


import AdminsPackage.AccPage;
import AdminsPackage.BookWise;
import LibrarianPackage.LibrarianDB;
import BorrowersPackage.BorrowerProf;
import BorrowersPackage.BorrowersDB;
import ForgotPassword.UserID;
import config.Config;
import static config.HashPass.hashPassword;
import config.Session;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    static String status;
    static String type;

    public static boolean validateLogin(String email, String password) throws NoSuchAlgorithmException {
        Config conf = new Config();
        String query = "SELECT u_password, u_status, u_type, u_id, u_firstname, u_lastname, u_cnumber FROM user WHERE u_email = ?";

        try (Connection conn = conf.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, email);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("u_password");
                status = resultSet.getString("u_status");
                type = resultSet.getString("u_type");

                // Hash user input for comparison
                String hashedInputPassword = hashPassword(password);

                // Compare hashed input password with stored password
                if (hashedInputPassword.equals(storedPassword)) {
                    // Store user session details
                    Session sess = Session.getInstance();
                    sess.setUid(resultSet.getString("u_id"));
                    sess.setFname(resultSet.getString("u_firstname"));
                    sess.setLname(resultSet.getString("u_lastname"));
                    sess.setEmail(email);
                    sess.setContact(resultSet.getString("u_cnumber"));
                    sess.setType(type);
                    sess.setStatus(status);

                    System.out.println("Login successful for: " + sess.getFname() + " " + sess.getLname());
                    return true;
                } else {
                    System.out.println("Incorrect password or email: " + email);
                    return false;
                }
            } else {
                System.out.println("User not found: " + email);
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
        
    
   public void loginButton() throws NoSuchAlgorithmException {
        String url = "jdbc:mysql://localhost:3306/joseph";
        String user = "root";
        String password = "";

        String query = "SELECT u_id, u_password, u_status, u_type, u_firstname, u_lastname, u_cnumber FROM user WHERE u_email = ?";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, uemail.getText());
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String storedPassword = rs.getString("u_password");
            String status = rs.getString("u_status");
            String type = rs.getString("u_type");

            // Hash the input password
            String hashedInputPassword = hashPassword(passw.getText());

            // If the stored password is not hashed, hash and update it
            if (!storedPassword.matches("[a-fA-F0-9]{64}")) {
                System.out.println("Rehashing plaintext password...");
                String newHashedPassword = hashPassword(storedPassword);
                String updateQuery = "UPDATE user SET u_password = ? WHERE u_email = ?";
                
                try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                    updateStmt.setString(1, newHashedPassword);
                    updateStmt.setString(2, uemail.getText());
                    updateStmt.executeUpdate();
                }
                
                // Use the new hashed password for comparison
                storedPassword = newHashedPassword;
            }

            if (hashedInputPassword.equals(storedPassword) && "active".equalsIgnoreCase(status)) {
                // Save user session
                Session sess = Session.getInstance();
                sess.setUid(rs.getString("u_id"));
                sess.setFname(rs.getString("u_firstname"));
                sess.setLname(rs.getString("u_lastname"));
                sess.setEmail(uemail.getText());
                sess.setContact(rs.getString("u_cnumber"));
                sess.setType(type);
                sess.setStatus(status);

                JOptionPane.showMessageDialog(null, "Login Successful! Welcome " + sess.getFname());

                // Redirect based on user type
                switch (type.toLowerCase()) {
                    case "borrower":
                        new BorrowersDB().setVisible(true);
                        break;
                    case "librarian":
                        new LibrarianDB().setVisible(true);
                        break;
                    case "admin":
                        new BookWise().setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unknown user type!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "User not found or inactive!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uemail = new javax.swing.JTextField();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        passw = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        RegButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JToggleButton();
        fpbutton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(240, 248, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 490));

        jPanel4.setBackground(new java.awt.Color(210, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member Login");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, 40));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        uemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uemailActionPerformed(evt);
            }
        });
        jPanel4.add(uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 40));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel4.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 20));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/show.png"))); // NOI18N
        jPanel4.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 20));
        jPanel4.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 40));

        loginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel4.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, 40));

        RegButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        RegButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegButton.setText("New User? Create Account Here!");
        RegButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegButtonMouseClicked(evt);
            }
        });
        jPanel4.add(RegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 30));

        exitButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel4.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 120, 40));

        fpbutton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        fpbutton.setText("Forgot Password?");
        fpbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpbuttonMouseClicked(evt);
            }
        });
        jPanel4.add(fpbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 390, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Transparent Background 2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            loginButton();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
}
    }//GEN-LAST:event_loginButtonActionPerformed

    private void uemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uemailActionPerformed

    private void RegButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegButtonMouseClicked
        RegForm rf = new RegForm();
        this.dispose();
        rf.setVisible(true);
    }//GEN-LAST:event_RegButtonMouseClicked

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        passw.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        passw.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_exitButtonActionPerformed

    private void fpbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpbuttonMouseClicked
       UserID uid = new UserID();
       uid.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_fpbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegButton;
    private javax.swing.JToggleButton exitButton;
    private javax.swing.JLabel fpbutton;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passw;
    private javax.swing.JLabel show;
    private javax.swing.JTextField uemail;
    // End of variables declaration//GEN-END:variables

}