/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rent;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brabim
 */
public class rental extends javax.swing.JFrame {

    /**
     * Creates new form rental
     */
    public rental() {
        initComponents();
         LoadCarid(); 
        txtdate.setDateFormatString("yyyy/MM/dd");
        txtdue.setDateFormatString("yyyy/MM/dd");
        
        txtcust_id.setEnabled(false);
         txtcustname.setEnabled(false);
           txtrentail.setEnabled(false);
             txtdate.setEnabled(false);
               txtdue.setEnabled(false);
        
        
        
    }
    
    
        Connection con;
        PreparedStatement pst;
         ResultSet rs;
         PreparedStatement pst1;
         PreparedStatement pst2;
          PreparedStatement pst3;
          PreparedStatement pst4;
    
            public void LoadCarid()
            {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
                    pst=con.prepareStatement("select * from carregistration ");
                    rs=pst.executeQuery();
                    combocarID.removeAllItems();
                    
                    while(rs.next())
                    {
                        combocarID.addItem(rs.getString(2));
                        
                    }
                    
                    
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combocarID = new javax.swing.JComboBox();
        txtcust_id = new javax.swing.JTextField();
        txtrentail = new javax.swing.JTextField();
        txtcustname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtavl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rental"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Customer ID");

        jLabel2.setText("Car ID");

        jLabel3.setText("Due Date");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Rental Fee");

        jLabel6.setText("Date");

        combocarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocarIDActionPerformed(evt);
            }
        });

        txtcust_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcust_idActionPerformed(evt);
            }
        });
        txtcust_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcust_idKeyPressed(evt);
            }
        });

        txtrentail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentailActionPerformed(evt);
            }
        });

        txtcustname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustnameActionPerformed(evt);
            }
        });

        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtrentail)
                    .addComponent(txtcustname)
                    .addComponent(txtcust_id)
                    .addComponent(combocarID, 0, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtavl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtavl)
                            .addComponent(combocarID, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrentail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcust_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcust_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcust_idActionPerformed

    private void txtrentailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentailActionPerformed

    private void txtcustnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustnameActionPerformed

    private void txtdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateMouseClicked

    private void txtdueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdueMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtdueMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String car_id=combocarID.getSelectedItem().toString();
         String cust_id=txtcust_id.getText();
         String fee= txtrentail.getText();
         
         SimpleDateFormat Date_Format= new SimpleDateFormat("yyyy-MM-dd");
         String date =Date_Format.format(txtdate.getDate());
         
           SimpleDateFormat Date_Format1= new SimpleDateFormat("yyyy-MM-dd");
          String due=Date_Format1.format(txtdue.getDate());
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
               
               pst3=con.prepareStatement("insert into rental(Car_id,Cust_id,Fee,Date,Due)values (?,?,?,?,?)");
               pst3.setString(1, car_id);
               pst3.setString(2, cust_id);
               pst3.setString(3, fee);
               pst3.setString(4, date);
               pst3.setString(5, due);
               pst3.executeUpdate();
                    
               pst4=con.prepareStatement("update carregistration set Available='No' where Car_Number =?");
               pst4.setString(1, car_id);
               pst4.executeUpdate();
               JOptionPane.showMessageDialog(this, "Success");
               
               
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combocarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocarIDActionPerformed
        // TODO add your handling code here:
        
        String car_id=combocarID.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
             pst1=con.prepareStatement( "select * from carregistration where Car_Number = ? ");
             pst1.setString(1, car_id);
             rs=pst.executeQuery();
             
            
             if(rs.next()==false)
             {
                            JOptionPane.showMessageDialog(this, "Car Number not Found");
             }
             else
             {
                 String aval=rs.getString("Available");
                 txtavl.setText(aval.trim());
                 if(aval.equals("Yes"))
                 {
                      txtcust_id.setEnabled(true);
                    txtcustname.setEnabled(true);
                    txtrentail.setEnabled(true);
                    txtdate.setEnabled(true);
                    txtdue.setEnabled(true);
                 }    
             }
             
             
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        
        
    }//GEN-LAST:event_combocarIDActionPerformed

    private void txtcust_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcust_idKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
                String cust_id= txtcust_id.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
                
                pst2=con.prepareStatement("select * from customer where Cust_id=?");
                pst2.setString(1, cust_id);
                rs= pst2.executeQuery();
                 if(rs.next()==false)
             {
                            JOptionPane.showMessageDialog(this, "Customer id not Found");
             }
             else
             {
                 String custname=rs.getString("Name");
                 txtcustname.setText(custname.trim());
             }
                        
                        
                        
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        
        }
        
        
        
    }//GEN-LAST:event_txtcust_idKeyPressed

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
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combocarID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtavl;
    private javax.swing.JTextField txtcust_id;
    private javax.swing.JTextField txtcustname;
    private javax.swing.JTextField txtrentail;
    // End of variables declaration//GEN-END:variables
}
