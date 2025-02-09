
import java.awt.Color;
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

    /**
     * Creates new form RegForm
     */
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
        pass = new javax.swing.JPasswordField();
        cpass = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 248, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SCC\\Downloads\\BookWise-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 230, 180));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create a new account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 50));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("First name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Last name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 20));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 40, 20));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Contact number");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 20));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 20));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Confirm Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 130, 20));

        fname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 40));

        lname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 40));

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 40));

        cnumber.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumberActionPerformed(evt);
            }
        });
        jPanel2.add(cnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 240, 40));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 40));
        jPanel2.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 240, 40));

        signup.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 153, 255));
        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel2.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 600, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        boolean isValid = true;
       
         String emails = email.getText().trim();
        
        {
        if (fname.getText().isEmpty()) {
        fname.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (lname.getText().isEmpty()) {
        lname.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        lname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (email.getText().isEmpty()) {
        this.email.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    
    
    }else {
        email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (cnumber.getText().isEmpty()) {
        cnumber.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        cnumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
    }
    
      if (pass.getPassword().length == 0) {
        pass.setBorder(BorderFactory.createLineBorder(Color.RED));  
        isValid = false;
    } else if (pass.getPassword().length < 8) {
        pass.setBorder(BorderFactory.createLineBorder(Color.RED));  
        JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}   else {
        pass.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
}      

    if (cpass.getPassword().length == 0) {
        cpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        cpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
    
        if (!String.valueOf(pass.getPassword()).equals(String.valueOf(cpass.getPassword()))) {
        pass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        cpass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        JOptionPane.showMessageDialog(null, "Password does not match", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}    else {
        pass.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        cpass.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
}
     if (!emails.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
        email.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        JOptionPane.showMessageDialog(null, "Email must be in the format 'username@domain.com'.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}   else {
        email.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
}
      
        String contactNumber = cnumber.getText().trim();
        if (!contactNumber.matches("\\d{11}")) {
            cnumber.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            JOptionPane.showMessageDialog(null, "Contact number must contain exactly 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
            isValid = false;
        }else {
            cnumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}
        
    if (!isValid) {
        JOptionPane.showMessageDialog(null, "Some fields are required", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        
        JOptionPane.showMessageDialog(null, "Registration Completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        
        LoginForm lg = new LoginForm();
        this.dispose();
        lg.setVisible(true);
    }
       
    }
    }//GEN-LAST:event_signupActionPerformed

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
    private javax.swing.JTextField cnumber;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
