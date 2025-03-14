/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eadcw;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owner
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    
    static final String URL = "jdbc:mysql://localhost/inventory_management";
    static final String USER = "root";
    static final String PASSWORD = "Semali33g8hby";
    
    public Customer() {
        initComponents();
        loadCustomerData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnupdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        txtcontact = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnupdate.setBackground(new java.awt.Color(51, 51, 51));
        btnupdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        btndelete.setBackground(new java.awt.Color(51, 51, 51));
        btndelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Contact", "Address", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 140));

        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        btnrefresh.setBackground(new java.awt.Color(51, 51, 51));
        btnrefresh.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadcw/back-button (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        btnadd.setBackground(new java.awt.Color(51, 51, 51));
        btnadd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadcw/6.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, 393));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateCustomer();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadCustomerData();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard dbForm = new Dashboard();
        dbForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        addCustomer();
    }//GEN-LAST:event_btnaddActionPerformed

     private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void loadCustomerData() {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        model.setRowCount(0);  // Clear existing rows

        String sql = "SELECT * FROM Customer";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("CustomerID"));
                row.add(rs.getString("Name"));
                row.add(rs.getString("ContactNumber"));
                row.add(rs.getString("Address"));
                row.add(rs.getString("Email"));
                model.addRow(row);  // Add row to the table model
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading customer data: " + e.getMessage());
        }
    }

    private void addCustomer() {
        String customerID = txtCustomerID.getText();
        String name = txtname.getText();
        String contact = txtcontact.getText();
        String address = txtaddress.getText();
        String email = txtemail.getText();
        
        if (checkCustomerExists(customerID)){
            JOptionPane.showMessageDialog(this, "Customer ID is already registered");
        }else{
            String sql = "INSERT INTO Customer (CustomerID, Name, ContactNumber, Address, Email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customerID);
            pstmt.setString(2, name);
            pstmt.setString(3, contact);
            pstmt.setString(4, address);
            pstmt.setString(5, email);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer added successfully.");
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding customer: " + e.getMessage());
        }
        }
        
    }

    private void updateCustomer() {
        String customerID = txtCustomerID.getText();
        String name = txtname.getText();
        String contact = txtcontact.getText();
        String address = txtaddress.getText();
        String email = txtemail.getText();

        if(checkCustomerExists(customerID)){
            String sql = "UPDATE Customer SET Name = ?, ContactNumber = ?, Address = ?, Email = ? WHERE CustomerID = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, contact);
            pstmt.setString(3, address);
            pstmt.setString(4, email);
            pstmt.setString(5, customerID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Customer updated successfully.");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Customer ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating customer: " + e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(this, "Customer ID not found.");
        }
        
    }

    private boolean checkCustomerExists(String customerID) {
        String sql = "SELECT COUNT(*) FROM customer WHERE CustomerID = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customerID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
        return false;
    }
    
    private void deleteCustomer() {
        String customerID = txtCustomerID.getText();
        String sql = "DELETE FROM Customer WHERE CustomerID = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customerID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Customer deleted successfully.");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Customer ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting customer: " + e.getMessage());
        }
    }

    private void clearFields() {
        txtCustomerID.setText("");
        txtname.setText("");
        txtcontact.setText("");
        txtaddress.setText("");
        txtemail.setText("");
    }
            
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
