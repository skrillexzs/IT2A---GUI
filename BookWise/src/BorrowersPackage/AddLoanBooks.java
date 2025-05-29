/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorrowersPackage;

import Logins.LoginForm;
import config.Config;
import config.Session;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SCC
 */
public class AddLoanBooks extends javax.swing.JFrame {

    /**
     * Creates new form AddLoanBooks
     */
    public AddLoanBooks() {
        initComponents();
        horror.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        
        horror.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        horrorMouseClicked(evt);
    }
});
        
        sci_fi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        
        sci_fi.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        sci_fiMouseClicked(evt);
    }
});
        
        romance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        
        romance.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        romanceMouseClicked(evt);
    }
});
        
        documentary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        
        documentary.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        documentaryMouseClicked(evt);
    }
});
        
        displayData();
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

public void displayData(){
        
        try{
            Config conf = new Config();
            ResultSet rs = conf.getData("SELECT b_id, b_title , b_genre, b_author, date_published, b_condition, b_status FROM books");           
            btlTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(SQLException ex){
            System.out.println("Errors"+ex.getMessage());
        }
}

public void filterByGenre(String genre) {
    try {
        Config conf = new Config();
        ResultSet rs = conf.getData("SELECT b_id, b_title , b_genre, b_author, date_published, b_condition, b_status FROM books WHERE b_genre = '" + genre + "'");
        btlTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error filtering books: " + ex.getMessage());
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        genres_tab = new javax.swing.JPanel();
        genres = new javax.swing.JLabel();
        horror = new javax.swing.JLabel();
        sci_fi = new javax.swing.JLabel();
        romance = new javax.swing.JLabel();
        documentary = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btlTable = new javax.swing.JTable();
        checkout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(dbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 160, 50));

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

        jPanel2.add(lbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 200, 50));

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

        jPanel2.add(accButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 140, 50));

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

        jPanel2.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 130, 50));

        jPanel3.setBackground(new java.awt.Color(210, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel1.setText("Choose Books to Loan");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open_book_remove_bg.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 70));

        genres_tab.setBackground(new java.awt.Color(153, 204, 255));
        genres_tab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(0, 153, 204), new java.awt.Color(0, 102, 204)));
        genres_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genres.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        genres.setText("Genres");
        genres_tab.add(genres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        horror.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        horror.setText("Horror");
        horror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horrorMouseClicked(evt);
            }
        });
        genres_tab.add(horror, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));

        sci_fi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        sci_fi.setText("Science Fiction");
        sci_fi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sci_fiMouseClicked(evt);
            }
        });
        genres_tab.add(sci_fi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        romance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        romance.setText("Romance");
        romance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                romanceMouseClicked(evt);
            }
        });
        genres_tab.add(romance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        documentary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        documentary.setText("Documentary");
        documentary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documentaryMouseClicked(evt);
            }
        });
        genres_tab.add(documentary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        jPanel1.add(genres_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 280));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePictures/defaultpp.png"))); // NOI18N
        jPanel5.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 140));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 170, 140));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btlTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(btlTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 770, 440));

        checkout.setBackground(new java.awt.Color(240, 248, 255));
        checkout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutMouseClicked(evt);
            }
        });
        checkout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        jLabel5.setText("Check-out Book");
        checkout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check-out 1.png"))); // NOI18N
        checkout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 30));

        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void horrorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horrorMouseClicked
        filterByGenre("Horror");
    }//GEN-LAST:event_horrorMouseClicked

    private void checkoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseClicked
        int selectedRow = btlTable.getSelectedRow();

if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Please select a book to checkout.");
    return;
}

try {
    // Get book data from table
    int bookId = Integer.parseInt(btlTable.getValueAt(selectedRow, 0).toString()); // Column 0 = b_id
    String bookStatus = btlTable.getValueAt(selectedRow, 6).toString(); // Assume Column 4 = status (update index if different)

    // Check book status
    if (bookStatus.equalsIgnoreCase("Loaned")) {
        JOptionPane.showMessageDialog(this, "This book is currently loaned out and cannot be borrowed.");
        return;
    }

    // Get user ID from session
    String userId = Session.getUserId(); // Replace with your actual user ID source

    if (userId == null || userId.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "User not logged in. Please log in first.");
        return;
    }

    // Current date for loan
    java.util.Date today = new java.util.Date();
    java.sql.Date loanDate = new java.sql.Date(today.getTime());

    // Insert into loanedbooks_tbl
    Config conf = new Config(); // Your DB connection class
    String query = "INSERT INTO loanedbooks_tbl (b_id, u_id, loaned_date, due_date, loan_duration, return_date, penalty, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement ps = conf.connect.prepareStatement(query);

    ps.setInt(1, bookId);                         // b_id
    ps.setString(2, userId);                      // u_id
    ps.setDate(3, loanDate);                      // loaned_date
    ps.setNull(4, java.sql.Types.DATE);           // due_date
    ps.setNull(5, java.sql.Types.VARCHAR);        // loan_duration
    ps.setNull(6, java.sql.Types.DATE);           // return_date
    ps.setNull(7, java.sql.Types.VARCHAR);        // penalty
    ps.setString(8, "Pending");                   // status

    int inserted = ps.executeUpdate();
    if (inserted > 0) {
        JOptionPane.showMessageDialog(this, "Book checked out successfully.");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to checkout book.");
    }

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}
    }//GEN-LAST:event_checkoutMouseClicked

    private void sci_fiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sci_fiMouseClicked
        filterByGenre("Science Fiction");
    }//GEN-LAST:event_sci_fiMouseClicked

    private void romanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_romanceMouseClicked
        filterByGenre("Romance");
    }//GEN-LAST:event_romanceMouseClicked

    private void documentaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentaryMouseClicked
        filterByGenre("Documentary");
    }//GEN-LAST:event_documentaryMouseClicked

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
            java.util.logging.Logger.getLogger(AddLoanBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLoanBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLoanBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoanBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLoanBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accButton;
    private javax.swing.JTable btlTable;
    private javax.swing.JPanel checkout;
    private javax.swing.JPanel dbButton;
    private javax.swing.JLabel documentary;
    private javax.swing.JLabel genres;
    private javax.swing.JPanel genres_tab;
    private javax.swing.JLabel horror;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lbButton;
    private javax.swing.JPanel logButton;
    private javax.swing.JLabel pp;
    private javax.swing.JLabel romance;
    private javax.swing.JLabel sci_fi;
    // End of variables declaration//GEN-END:variables
}
