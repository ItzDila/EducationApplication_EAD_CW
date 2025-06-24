/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package educationalapplication_ead_cw.GUIs;

import educationalapplication_ead_cw.Db.DBcon;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author ktime
 */
public class Login extends javax.swing.JFrame {

    private String uname;

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userTxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passTxt1 = new javax.swing.JPasswordField();
        loginBtn1 = new javax.swing.JButton();
        closeBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login to SIMS");
        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(640, 240));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("Blacksword", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Poppins ExtraBold", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student Information Management System");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setText("Username");

        userTxt1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        userTxt1.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setText("Password");

        passTxt1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        passTxt1.setName(""); // NOI18N
        passTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxt1ActionPerformed(evt);
            }
        });

        loginBtn1.setBackground(new java.awt.Color(51, 204, 0));
        loginBtn1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        loginBtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn1.setText("Login");
        loginBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });

        closeBtn1.setBackground(new java.awt.Color(255, 51, 51));
        closeBtn1.setFont(new java.awt.Font("Poppins Black", 0, 12)); // NOI18N
        closeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn1.setText("Close");
        closeBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        closeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(passTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(passTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(userTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57)
                    .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxt1ActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
        String username = this.userTxt1.getText();
        String password = this.passTxt1.getText();

        if (username.equals("adminTest") || password.equals("admin123")) {
            this.dispose();
            Dashboard window1 = new Dashboard(username);
            window1.setVisible(true);
        } else {

            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill Out All Fields to Login", "Login Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    DBcon con = new DBcon();
                    con.OpenConnection();
                    String Query = "SELECT* FROM userLogin WHERE username = '@1' AND password = '@2' ";
                    Query = Query.replaceAll("@1", username);
                    Query = Query.replaceAll("@2", password);
                    ResultSet rs = con.SelectData(Query);
                    if (rs.next()) {
                        this.dispose();
                        Dashboard window1 = new Dashboard(username);
                        window1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entered Username or Password is Incorrect or No Registerd User", "Login Error", JOptionPane.YES_OPTION);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Occured :" + e.getMessage());

                }
            }
        }    }//GEN-LAST:event_loginBtn1ActionPerformed

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtn1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JPasswordField passTxt1;
    private javax.swing.JTextField userTxt1;
    // End of variables declaration//GEN-END:variables
}
