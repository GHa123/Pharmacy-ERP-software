/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jbj
 */
public class changepassword extends javax.swing.JInternalFrame {
Connection con;
    /**
     * Creates new form changepassword
     */
    public changepassword() {
        initComponents();
        setBounds(0,0,1365,680);
         ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        try {
                 Class.forName("com.mysql.jdbc.Driver");
                 try {
                     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
                 } catch (SQLException ex) {
                     
                 }
                 
             }
             
             catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane,ex.toString());
                 
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
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(103, 65, 114));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 430, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Old Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 150, 140, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(380, 150, 200, 28);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(380, 220, 200, 28);

        jPasswordField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(380, 290, 200, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 290, 190, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 220, 140, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(103, 65, 114));
        jButton1.setText("Confirm");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 380, 230, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/ssg_security_padlock_locker_lock_logo_design_symbol_by_alex_tass.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(710, 90, 530, 390);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1320, 10, 50, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1450, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
login1 l=new login1();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(!jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !jPasswordField3.getText().equals(""))
{
 String uname=l.username;   
  String pwd=l.pwd;  
  //JOptionPane.showMessageDialog(rootPane,uname+""+pwd);  
  if(jPasswordField1.getText().equals(pwd))
  {
 
     if(jPasswordField2.getText().equals(jPasswordField3.getText()))
     
     {
         if( jPasswordField2.getText().length()>5 && jPasswordField3.getText().length()>5)
 {
     try {
         String str="update login set pw='"+jPasswordField2.getText()+"' where username='"+uname+"'";
         Statement st=con.createStatement();
         st.executeUpdate(str);
         
         JOptionPane.showMessageDialog(rootPane,"updated");
         
         jPasswordField1.setText("");
         jPasswordField2.setText("");
         jPasswordField3.setText("");
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(changepassword.class.getName()).log(Level.SEVERE, null, ex);
     }
     }else
     {
      JOptionPane.showMessageDialog(rootPane,"Enter more than 6 characters");
     jPasswordField1.setText("");
         jPasswordField2.setText("");
         jPasswordField3.setText(""); 
     }
 }
 
     
     
     
 
 else
 {
  
   JOptionPane.showMessageDialog(rootPane,"Password does not match");
         jPasswordField1.setText("");
         jPasswordField2.setText("");
         jPasswordField3.setText("");
 }

  
    }
  else
 {
     
   JOptionPane.showMessageDialog(rootPane,"Wrong Password");
    
         jPasswordField1.setText("");
         jPasswordField2.setText("");
         jPasswordField3.setText("");
     
 }
}

 else
{
    JOptionPane.showMessageDialog(rootPane, "Enter Password Correctly");
     
         jPasswordField1.setText("");
         jPasswordField2.setText("");
         jPasswordField3.setText("");
}










// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
