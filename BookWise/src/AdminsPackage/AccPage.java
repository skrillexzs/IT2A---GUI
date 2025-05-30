package AdminsPackage;

import BorrowersPackage.BorrowerProf;
import LibrarianPackage.LibrarianDB;
import Logins.LoginForm;
import config.Config;
import config.Session;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
        
     
    }
    
 

        Color hover = new Color(0,85,255);  
        Color defbutton = new Color(240,248,255);
    
        Border empty = BorderFactory.createEmptyBorder();
    
        void resetButtonColor(JButton button){
            button.setBackground(defbutton);
        }
        Session sess = Session.getInstance();
        
        public void loadProfilePicture() {
//    String username = Config.loggedInUsername;

    if (sess.getEmail() == null || sess.getEmail().isEmpty()) {
        setDefaultProfilePicture();
        return;
    }

    try (Connection con = Config.getConnection();
         PreparedStatement pst = con.prepareStatement("SELECT u_profilepic FROM user WHERE u_email = ?")) {

        pst.setString(1, sess.getEmail());
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String imagePath = rs.getString("u_profilepic");

            if (imagePath != null && !imagePath.isEmpty()) {
                File imageFile = new File(imagePath);

                if (!imageFile.isAbsolute()) {
                    imageFile = new File("src/" + imagePath);  // fallback
                }

                if (imageFile.exists()) {
                    setProfilePicture(imageFile);
                    return;
                }
            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading profile picture: " + e.getMessage());
    }

    setDefaultProfilePicture(); // fallback to default if anything fails
}

private void setProfilePicture(File imageFile) {
    try {
        BufferedImage img = ImageIO.read(imageFile);
        ImageIcon icon = new ImageIcon(img.getScaledInstance(app.getWidth(), app.getHeight(), Image.SCALE_SMOOTH));
        app.setIcon(icon);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error setting profile picture: " + e.getMessage());
        setDefaultProfilePicture();
    }
}

private void setDefaultProfilePicture() {
    try {
        URL defaultImageUrl = getClass().getResource("/ProfilePictures/defaultpp.png");

        if (defaultImageUrl != null) {
            BufferedImage img = ImageIO.read(defaultImageUrl);
            ImageIcon icon = new ImageIcon(img.getScaledInstance(app.getWidth(), app.getHeight(), Image.SCALE_SMOOTH));
            app.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(null, "Default profile image is missing!", "Warning", JOptionPane.WARNING_MESSAGE);
            app.setIcon(null);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading default image: " + e.getMessage());
        app.setIcon(null);
    }
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        app = new javax.swing.JLabel();
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
        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        aid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        afn = new javax.swing.JLabel();
        afname = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        aln = new javax.swing.JLabel();
        alname = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        aemail = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cn = new javax.swing.JLabel();
        acn = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        atype = new javax.swing.JLabel();
        changeapp = new javax.swing.JButton();
        securityquestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 21)); // NOI18N
        acp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acp.setText("Change Password");
        acp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        acp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acpMouseExited(evt);
            }
        });
        jPanel1.add(acp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 210, 40));

        jPanel4.setBackground(new java.awt.Color(240, 248, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BookWise-removebg-preview.png"))); // NOI18N
        jPanel4.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 170));

        dbButton.setBackground(new java.awt.Color(240, 248, 255));
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

        bwButton.setBackground(new java.awt.Color(240, 248, 255));
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

        lbButton.setBackground(new java.awt.Color(240, 248, 255));
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

        accButton.setBackground(new java.awt.Color(240, 248, 255));
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

        logButton.setBackground(new java.awt.Color(240, 248, 255));
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

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        id.setText("ID:");
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        aid.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        aid.setText("aid");
        jPanel3.add(aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 300, 50));

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        afn.setText("First name:");
        jPanel5.add(afn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        afname.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        afname.setText("afname");
        jPanel5.add(afname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 300, 50));

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aln.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        aln.setText("Last name:");
        jPanel6.add(aln, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        alname.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        alname.setText("alname");
        jPanel6.add(alname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 50));

        jPanel7.setBackground(new java.awt.Color(102, 204, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        email.setText("Email:");
        jPanel7.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        aemail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        aemail.setText("email");
        jPanel7.add(aemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 230, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 320, 50));

        jPanel8.setBackground(new java.awt.Color(102, 204, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        cn.setText("Contact number:");
        jPanel8.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        acn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        acn.setText("number");
        jPanel8.add(acn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 320, 50));

        jPanel9.setBackground(new java.awt.Color(102, 204, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        type.setText("Type:");
        jPanel9.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        atype.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        atype.setText("type");
        jPanel9.add(atype, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 320, 50));

        changeapp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        changeapp.setText("Change Profile Picture");
        changeapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        changeapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeappActionPerformed(evt);
            }
        });
        jPanel1.add(changeapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 190, 40));

        securityquestion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        securityquestion.setText("Setup Security Question");
        securityquestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        securityquestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityquestionMouseClicked(evt);
            }
        });
        jPanel1.add(securityquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 300, 40));

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
        BorrowersRegistry bwr = new BorrowersRegistry();
        this.dispose();
        bwr.setVisible(true);
    }//GEN-LAST:event_bwButtonMouseClicked

    private void bwButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButtonMouseEntered
        bwButton.setBackground(hover);
    }//GEN-LAST:event_bwButtonMouseEntered

    private void bwButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bwButtonMouseExited
        bwButton.setBackground(defbutton);
    }//GEN-LAST:event_bwButtonMouseExited

    private void lbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbButtonMouseClicked
        LibrariansRegistry lr = new LibrariansRegistry();
        this.dispose();
        lr.setVisible(true);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
        aid.setText(""+sess.getUid());
        afname.setText(""+sess.getFname());
        alname.setText(""+sess.getLname());
        aemail.setText(""+sess.getEmail());
        acn.setText(""+sess.getContact());
        atype.setText(""+sess.getType());
    }//GEN-LAST:event_formWindowActivated

    private void acpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acpMouseClicked
        AdminChangePass acp = new AdminChangePass();
        acp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_acpMouseClicked

    private void acpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acpMouseEntered
        acp.setBackground(hover);
    }//GEN-LAST:event_acpMouseEntered

    private void acpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acpMouseExited
        acp.setBackground(defbutton);
    }//GEN-LAST:event_acpMouseExited

    private void changeappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeappActionPerformed
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String filename = selectedFile.getAbsolutePath();

            // Set the image to the existing JLabel (pfp)
            ImageIcon ii = new ImageIcon(new ImageIcon(filename)
                .getImage().getScaledInstance(app.getWidth(), app.getHeight(), Image.SCALE_SMOOTH));
            app.setIcon(ii); // Update the JLabel

            // Define the target directory within the NetBeans project (src/pfpimage)
            File destination = new File("src/ProfilePictures", selectedFile.getName());

            // Ensure the directory exists
            destination.getParentFile().mkdirs();

            // Save the image
            try (InputStream fis = new FileInputStream(selectedFile);
                OutputStream fos = new FileOutputStream(destination)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }

                // Now update the database with the relative image path
                //        String username = Config.loggedInUsername; // Use logged-in username

                try {
                    Connection con = Config.getConnection(); // Get DB connection
                    String sql = "UPDATE user SET u_profilepic = ? WHERE u_email = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    String relativePath = "ProfilePictures/" + selectedFile.getName(); // Store relative path
                    pst.setString(1, relativePath);
                    pst.setString(2, sess.getEmail());
                    pst.executeUpdate();
                    con.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error saving image path: " + e.getMessage());
                    return;
                }

                JOptionPane.showMessageDialog(null, "Profile Picture Updated Successfully!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving image: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_changeappActionPerformed

    private void securityquestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityquestionMouseClicked
        SecurityQuestion sq = new SecurityQuestion();
        this.dispose();
        sq.setVisible(true);
    }//GEN-LAST:event_securityquestionMouseClicked

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
    private javax.swing.JLabel acn;
    private javax.swing.JLabel acp;
    private javax.swing.JLabel aemail;
    private javax.swing.JLabel afn;
    private javax.swing.JLabel afname;
    private javax.swing.JLabel aid;
    private javax.swing.JLabel aln;
    private javax.swing.JLabel alname;
    private javax.swing.JLabel app;
    private javax.swing.JLabel atype;
    private javax.swing.JPanel bwButton;
    private javax.swing.JButton changeapp;
    private javax.swing.JLabel cn;
    private javax.swing.JPanel dbButton;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel lbButton;
    private javax.swing.JPanel logButton;
    private javax.swing.JLabel securityquestion;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
