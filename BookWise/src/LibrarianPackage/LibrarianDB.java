package LibrarianPackage;


import AdminsPackage.AccPage;
import AdminsPackage.BookWise;
import BorrowersPackage.BorrowerProf;
import Logins.LoginForm;
import config.Config;
import config.Session;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class LibrarianDB extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianDB
     */
    public LibrarianDB() {
        
        initComponents();
        
        displayData();
        displayLoanStats();
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
        ImageIcon icon = new ImageIcon(img.getScaledInstance(lpp.getWidth(), lpp.getHeight(), Image.SCALE_SMOOTH));
        lpp.setIcon(icon);
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
            ImageIcon icon = new ImageIcon(img.getScaledInstance(lpp.getWidth(), lpp.getHeight(), Image.SCALE_SMOOTH));
            lpp.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(null, "Default profile image is missing!", "Warning", JOptionPane.WARNING_MESSAGE);
            lpp.setIcon(null);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading default image: " + e.getMessage());
        lpp.setIcon(null);
    }
}

public void displayData(){
        
        try{
            Config conf = new Config();
            ResultSet rs = conf.getData("SELECT lb_id, b_id, u_id, loaned_date, due_date, loan_duration, return_date, penalty, status FROM loanedbooks_tbl");           
            loanTrans.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(SQLException ex){
            System.out.println("Errors"+ex.getMessage());
        }
}

        public void displayLoanStats() {
    try {
        Config conf = new Config();

        // Total Loans
        ResultSet totalRs = conf.getData("SELECT COUNT(*) AS total FROM loanedbooks_tbl");
        if (totalRs.next()) {
            int total = totalRs.getInt("total");
            totalCount.setText("<html><center>Total Loans<br><br>" + total + "</center></html>");
        }

        // Loaned Count
        ResultSet loanedRs = conf.getData("SELECT COUNT(*) AS loaned FROM loanedbooks_tbl WHERE status = 'Loaned'");
        if (loanedRs.next()) {
            int loaned = loanedRs.getInt("loaned");
            successfulCount.setText("<html><center>Loaned<br><br>" + loaned + "</center></html>");
        }

        // Pending Count
        ResultSet pendingRs = conf.getData("SELECT COUNT(*) AS pending FROM loanedbooks_tbl WHERE status = 'Pending'");
        if (pendingRs.next()) {
            int pending = pendingRs.getInt("pending");
            pendingCount.setText("<html><center>Pending<br><br>" + pending + "</center></html>");
        }

        // Returned Count
        ResultSet returnedRs = conf.getData("SELECT COUNT(*) AS returned FROM loanedbooks_tbl WHERE status = 'Returned'");
        if (returnedRs.next()) {
            int returned = returnedRs.getInt("returned");
            returnedCount.setText("<html><center>Returned<br><br>" + returned + "</center></html>");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
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
        jPanel4 = new javax.swing.JPanel();
        lpp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        editloaning = new javax.swing.JButton();
        receipt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanTrans = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        dbButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        books = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CountPanel1 = new javax.swing.JPanel();
        totalCount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CountPanel2 = new javax.swing.JPanel();
        successfulCount = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CountPanel3 = new javax.swing.JPanel();
        pendingCount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CountPanel4 = new javax.swing.JPanel();
        returnedCount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(240, 248, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lpp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePictures/defaultpp.png"))); // NOI18N
        jPanel4.add(lpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 150));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("LIBRARIAN DASHBOARD");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 50));

        editloaning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        editloaning.setText("EDIT");
        editloaning.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        editloaning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editloaningActionPerformed(evt);
            }
        });
        jPanel4.add(editloaning, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 50));

        receipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        receipt.setText("RECEIPT");
        receipt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });
        jPanel4.add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 130, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        loanTrans.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(loanTrans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 820, 340));

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

        jPanel12.add(dbButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, 50));

        books.setBackground(new java.awt.Color(210, 255, 255));
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksMouseExited(evt);
            }
        });
        books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("BOOKS");
        books.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer icon.png"))); // NOI18N
        books.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel12.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 140, 50));

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

        jPanel12.add(accButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 50));

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

        jPanel12.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 130, 50));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 830, 70));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Loan Transactions");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, 40));

        CountPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalCount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        totalCount.setText("Total Loans:");
        CountPanel1.add(totalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/total loans.png"))); // NOI18N
        CountPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 40));

        jPanel1.add(CountPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 240, 90));

        CountPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        successfulCount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        successfulCount.setText("Successful Loans:");
        CountPanel2.add(successfulCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/successful loans.png"))); // NOI18N
        CountPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 40));

        jPanel1.add(CountPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 240, 90));

        CountPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pendingCount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pendingCount.setText("Pending Loans:");
        CountPanel3.add(pendingCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pending loans.png"))); // NOI18N
        CountPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 40));

        jPanel1.add(CountPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 240, 90));

        CountPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnedCount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        returnedCount.setText("Returned Books:");
        CountPanel4.add(returnedCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/returned books.png"))); // NOI18N
        CountPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 40));

        jPanel1.add(CountPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseClicked
        LibrarianDB ldb = new LibrarianDB();
        this.dispose();
        ldb.setVisible(true);
    }//GEN-LAST:event_dbButtonMouseClicked

    private void dbButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseEntered
        dbButton.setBackground(hover);
    }//GEN-LAST:event_dbButtonMouseEntered

    private void dbButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbButtonMouseExited
        dbButton.setBackground(defbutton);
    }//GEN-LAST:event_dbButtonMouseExited

    private void booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseClicked
        BooksDB bdb = new BooksDB();
        this.dispose();
        bdb.setVisible(true);
    }//GEN-LAST:event_booksMouseClicked

    private void booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseEntered
        books.setBackground(hover);
    }//GEN-LAST:event_booksMouseEntered

    private void booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseExited
        books.setBackground(defbutton);
    }//GEN-LAST:event_booksMouseExited

    private void accButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accButtonMouseClicked
        LibrarianProf lbp = new LibrarianProf();
        this.dispose();
        lbp.setVisible(true);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadProfilePicture();
    }//GEN-LAST:event_formWindowOpened

    private void editloaningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editloaningActionPerformed
        int rowIndex = loanTrans.getSelectedRow();
        if (rowIndex >= 0) {
            TableModel model = loanTrans.getModel();

           // Get the foodId from the first column (index 0)
           int selectedBookId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());

           // Create an instance of EditFood
           EditLoanBooks elb = new EditLoanBooks();

           // Pass the selected foodId to the EditFood form
           elb.lbookid = selectedBookId;  // This is the key part! We're storing the foodId

           // Populate the form fields (name, price, category, status)
           elb.editDrtn.setSelectedItem(model.getValueAt(rowIndex, 1).toString());
           elb.editPenalty.setSelectedItem(model.getValueAt(rowIndex, 2).toString());
           elb.editStat.setSelectedItem(model.getValueAt(rowIndex, 3).toString());

           // Make the EditFood form visible
           elb.setVisible(true);
           this.dispose(); // Close the current window
       } else {
           JOptionPane.showMessageDialog(null, "Please select a loan to edit.");
       }
    }//GEN-LAST:event_editloaningActionPerformed

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed
       int rowIndex = loanTrans.getSelectedRow();  // Get selected row index

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select a loan transaction.");
} else {
    try {
        Config conf = new Config();
        TableModel tbl = loanTrans.getModel();  // Get the table model
        int loanedBookId = Integer.parseInt(tbl.getValueAt(rowIndex, 0).toString());  // Get lb_id

        System.out.println("Selected Loaned Book ID: " + loanedBookId);  // Debugging statement

        String query = "SELECT l.lb_id, u.u_firstname, b.b_title, l.loaned_date, l.due_date, " +
                       "l.loan_duration, l.status " +
                       "FROM loanedbooks_tbl l " +
                       "JOIN user u ON l.u_id = u.u_id " +
                       "JOIN books b ON l.b_id = b.b_id " +
                       "WHERE l.lb_id = " + loanedBookId;

        ResultSet rs = conf.getData(query);

        if (rs.next()) {
            // ✅ Generate receipt content
            StringBuilder receipt = new StringBuilder();
            receipt.append("      BookWise - Loan Receipt\n");
            receipt.append("     ----------------------------\n");
            receipt.append("\n");
            receipt.append("Loan ID      : ").append(rs.getInt("lb_id")).append("\n");
            receipt.append("Borrower     : ").append(rs.getString("u_firstname")).append("\n");
            receipt.append("Book Title   : ").append(rs.getString("b_title")).append("\n");
          receipt.append("Loaned Date  : ").append(rs.getDate("loaned_date")).append("\n");
            receipt.append("Due Date     : ").append(rs.getDate("due_date").toString()).append("\n");
            receipt.append("Loan Duration: ").append(rs.getString("loan_duration")).append("\n");
            receipt.append("Status       : ").append(rs.getString("status")).append("\n");
            receipt.append("\n");
            receipt.append("     ----------------------------\n");
            receipt.append("    Please return books on time.\n");

            // Display receipt in a scrollable text area
            JTextArea textArea = new JTextArea(receipt.toString());
            textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(400, 300)); // Optional: Resize for better visibility

            // Ask if user wants to print
            int printOption = JOptionPane.showConfirmDialog(
                null,
                scrollPane,
                "RECEIPT - PRINT?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
            );

            if (printOption == JOptionPane.YES_OPTION) {
                // Send to printer
                PrintReceipt pr = new PrintReceipt(receipt.toString());
                pr.printReceipt();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No details found for this loan.");
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex);
        JOptionPane.showMessageDialog(null, "An error occurred while loading loan data.");
    }
}


    }//GEN-LAST:event_receiptActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CountPanel1;
    private javax.swing.JPanel CountPanel2;
    private javax.swing.JPanel CountPanel3;
    private javax.swing.JPanel CountPanel4;
    private javax.swing.JPanel accButton;
    private javax.swing.JPanel books;
    private javax.swing.JPanel dbButton;
    private javax.swing.JButton editloaning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable loanTrans;
    private javax.swing.JPanel logButton;
    private javax.swing.JLabel lpp;
    private javax.swing.JLabel pendingCount;
    private javax.swing.JButton receipt;
    private javax.swing.JLabel returnedCount;
    private javax.swing.JLabel successfulCount;
    private javax.swing.JLabel totalCount;
    // End of variables declaration//GEN-END:variables
}
