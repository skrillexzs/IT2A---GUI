package BorrowersPackage;


import AdminsPackage.AccPage;
import AdminsPackage.BookWise;
import LibrarianPackage.ChangePassword;
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
import javafx.application.Platform;
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
 * @author USER
 */
public class BorrowerProf extends javax.swing.JFrame {

    String filename;
    byte[] person_image;
    
    public BorrowerProf() {
        initComponents();
        
        loadProfilePicture();
    }
    
    Color hover = new Color(0,85,255);  
    Color defbutton = new Color(210,255,255);
    
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
        ImageIcon icon = new ImageIcon(img.getScaledInstance(pp.getWidth(), pp.getHeight(), Image.SCALE_SMOOTH));
        pp.setIcon(icon);
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
            ImageIcon icon = new ImageIcon(img.getScaledInstance(pp.getWidth(), pp.getHeight(), Image.SCALE_SMOOTH));
            pp.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(null, "Default profile image is missing!", "Warning", JOptionPane.WARNING_MESSAGE);
            pp.setIcon(null);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading default image: " + e.getMessage());
        pp.setIcon(null);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();
        changepp = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        uprofile = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        bwid = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        afn = new javax.swing.JLabel();
        bwfname = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        aln = new javax.swing.JLabel();
        bwlname = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        bwemail = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        cn = new javax.swing.JLabel();
        bwcn = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        bwtype = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(240, 248, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(240, 320));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePictures/defaultpp.png"))); // NOI18N
        jPanel5.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 150));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("BORROWER ACCOUNT");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, 50));

        changepass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 21)); // NOI18N
        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.setText("Change Password");
        changepass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changepassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changepassMouseExited(evt);
            }
        });
        jPanel5.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 190, 30));

        changepp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        changepp.setText("Change Profile Picture");
        changepp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        changepp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeppActionPerformed(evt);
            }
        });
        jPanel5.add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 190, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        jPanel12.setBackground(new java.awt.Color(210, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel12.add(dbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 50));

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

        jPanel12.add(lbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 50));

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

        jPanel12.add(accButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 50));

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

        jPanel12.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 130, 50));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 830, 70));

        jPanel1.setBackground(new java.awt.Color(210, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(210, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uprofile.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        uprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uprofile.setText("Profile");
        jPanel2.add(uprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 70));

        jPanel4.setBackground(new java.awt.Color(210, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        id.setText("ID:");
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        bwid.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwid.setText("bwid");
        jPanel4.add(bwid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 300, 50));

        jPanel7.setBackground(new java.awt.Color(210, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        afn.setText("First name:");
        jPanel7.add(afn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        bwfname.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwfname.setText("bwfname");
        jPanel7.add(bwfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 300, 50));

        jPanel8.setBackground(new java.awt.Color(210, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aln.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        aln.setText("Last name:");
        jPanel8.add(aln, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        bwlname.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwlname.setText("bwlname");
        jPanel8.add(bwlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 50));

        jPanel9.setBackground(new java.awt.Color(210, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        email.setText("Email:");
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        bwemail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwemail.setText("bwemail");
        jPanel9.add(bwemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 230, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 320, 50));

        jPanel10.setBackground(new java.awt.Color(210, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        cn.setText("Contact number:");
        jPanel10.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        bwcn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwcn.setText("bwnumber");
        jPanel10.add(bwcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 320, 50));

        jPanel11.setBackground(new java.awt.Color(210, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        type.setText("Type:");
        jPanel11.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        bwtype.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bwtype.setText("bwtype");
        jPanel11.add(bwtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 320, 50));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setText("Setup Security Question");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 300, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 840, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        bwid.setText(""+sess.getUid());
        bwfname.setText(""+sess.getFname());
        bwlname.setText(""+sess.getLname());
        bwemail.setText(""+sess.getEmail());
        bwcn.setText(""+sess.getContact());
        bwtype.setText(""+sess.getType());
    }//GEN-LAST:event_formWindowActivated

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        ChangePass bcp = new ChangePass();
        bcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

    private void changepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseEntered
        changepass.setBackground(hover);
    }//GEN-LAST:event_changepassMouseEntered

    private void changepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseExited
        changepass.setBackground(defbutton);
    }//GEN-LAST:event_changepassMouseExited

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

    private void changeppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeppActionPerformed
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String filename = selectedFile.getAbsolutePath();

        // Set the image to the existing JLabel (pfp)
        ImageIcon ii = new ImageIcon(new ImageIcon(filename)
                .getImage().getScaledInstance(pp.getWidth(), pp.getHeight(), Image.SCALE_SMOOTH));
            pp.setIcon(ii); // Update the JLabel

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
    }//GEN-LAST:event_changeppActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadProfilePicture();
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Secretquestions sqs = new Secretquestions();
        this.dispose();
        sqs.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(BorrowerProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowerProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowerProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowerProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowerProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accButton;
    private javax.swing.JLabel afn;
    private javax.swing.JLabel aln;
    private javax.swing.JLabel bwcn;
    private javax.swing.JLabel bwemail;
    private javax.swing.JLabel bwfname;
    private javax.swing.JLabel bwid;
    private javax.swing.JLabel bwlname;
    private javax.swing.JLabel bwtype;
    private javax.swing.JLabel changepass;
    private javax.swing.JButton changepp;
    private javax.swing.JLabel cn;
    private javax.swing.JPanel dbButton;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel lbButton;
    private javax.swing.JPanel logButton;
    private javax.swing.JLabel pp;
    private javax.swing.JLabel type;
    private javax.swing.JLabel uprofile;
    // End of variables declaration//GEN-END:variables
}
