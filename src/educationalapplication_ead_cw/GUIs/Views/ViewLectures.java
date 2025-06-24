/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package educationalapplication_ead_cw.GUIs.Views;

import educationalapplication_ead_cw.Db.DBcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ktime
 */
public class ViewLectures extends javax.swing.JFrame {

    /**
     * Creates new form ViewLectures
     */
    public ViewLectures() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LecTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lecid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LecName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LecMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LecMob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LecSpec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel7.setFont(new java.awt.Font("Poppins", 3, 36)); // NOI18N
        jLabel7.setText("Manage Lecturers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(432, 432, 432))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        LecTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        LecTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer_ID", " Name", "Email", "Mobile Number", "Specialization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LecTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setText("Lecturer ID");

        Lecid.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Lecid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecidActionPerformed(evt);
            }
        });
        Lecid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LecidKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Lecturer Name");

        LecName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Lecturer E-mail");

        LecMail.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Lecturer Mobile");

        LecMob.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Specialization");

        LecSpec.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter Details Of Lecturer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LecMail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(LecMob, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LecSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Lecid, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(LecName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lecid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LecName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LecMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LecMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LecSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setText("ADD LECTURER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setText("UPDATE LECTURER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton3.setText("DELETE LECTURER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LecDataFill() {
        try {
            DBcon dbcLec = new DBcon();
            dbcLec.OpenConnection();
            ResultSet rs = dbcLec.SelectData("SELECT*FROM lecturers");

            while (rs.next()) {
                DefaultTableModel lecData = (DefaultTableModel) LecTable.getModel();
                String lid = rs.getString("lecturer_id");
                String ln = rs.getString("name");
                String le = rs.getString("email");
                String lp = rs.getString("phone");
                String ls = rs.getString("specialization");
                Object data[] = {lid, ln, le, lp, ls,};
                lecData.addRow(data);
                LecTable.setModel(lecData);

            }

        } catch (Exception e) {
            System.out.println("Error Loading Student Table" + e.getMessage());
        }
    }

    private void clearDataLec() {
        DefaultTableModel model = (DefaultTableModel) LecTable.getModel();
        model.setRowCount(0);
    }

    private void gettingData() {
        LecTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = LecTable.getSelectedRow();

                if (selectedRow >= 0) {
                 
                    Lecid.setText(LecTable.getValueAt(selectedRow, 0).toString());
                    LecName.setText(LecTable.getValueAt(selectedRow, 1).toString());
                    LecMail.setText(LecTable.getValueAt(selectedRow, 2).toString());
                    LecMob.setText(LecTable.getValueAt(selectedRow, 3).toString());
                    LecSpec.setText(LecTable.getValueAt(selectedRow, 4).toString());
                }
            }
        });
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String lecID = Lecid.getText();
        String lecName = LecName.getText();

        if (lecID.equals("") || lecName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill out all fields");
            return;
        }

        if (lecID.length() >= 2) {
            try {
                DBcon dbcLec = new DBcon();
                dbcLec.OpenConnection();
                ResultSet rs = dbcLec.SelectData("SELECT * FROM lecturers WHERE lecturer_id='" + lecID + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Lecturer already exists!");
                } else {
                    String query = "INSERT INTO lecturers (lecturer_id, name, email, phone, specialization) VALUES ('@1','@2','@3','@4','@5') ";
                    query = query.replaceAll("@1", Lecid.getText());
                    query = query.replaceAll("@2", LecName.getText());
                    query = query.replaceAll("@3", LecMail.getText());
                    query = query.replaceAll("@4", LecMob.getText());
                    query = query.replaceAll("@5", LecSpec.getText());
                    dbcLec.InsertData(query);
                    JOptionPane.showMessageDialog(null, "Lecturer Addedd Successfully");
                    clearDataLec();
                    LecDataFill();

                }
            } catch (Exception e) {
                System.out.println("Error Loading Names: " + e.getMessage());
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteLecturer() {
        String lecID = Lecid.getText();

        if (lecID.length() >= 2) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this lecturer?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    DBcon dbcStudent = new DBcon();
                    dbcStudent.OpenConnection();

                    String query = "DELETE FROM lecturers WHERE lecturer_id = '" + lecID + "'";

                    dbcStudent.InsertData(query); // assuming InsertData works for DELETE too

                    JOptionPane.showMessageDialog(null, "Lecturer Deleted Successfully");

                    clearDataLec();
                    LecDataFill();
                    Lecid.setText("");
                    LecName.setText("");
                    LecMob.setText("");
                    LecSpec.setText("");
                    LecMail.setText("");
                } catch (Exception e) {
                    System.out.println("Error Deleting Lecturer: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Lecturer ID to delete.");
        }
    }

    private void updateLecFill() {
        String lecID = Lecid.getText();

        if (lecID.length() >= 2) {
            try {
                DBcon dbcStudent = new DBcon();
                dbcStudent.OpenConnection();

                String query = "UPDATE lecturers SET "
                        + "name = '@1', "
                        + "email = '@2', "
                        + "phone = '@3', "
                        + "specialization = '@4' "
                        + "WHERE lecturer_id = '" + lecID + "'";

                query = query.replaceAll("@1", LecName.getText());
                query = query.replaceAll("@2", LecMail.getText());
                query = query.replaceAll("@3", LecMob.getText());
                query = query.replaceAll("@4", LecSpec.getText());

                dbcStudent.InsertData(query);// same thing used as data insertion

                JOptionPane.showMessageDialog(null, " Lecturer Updated Successfully");
                clearDataLec();
                LecDataFill();
                Lecid.setText("");
                LecName.setText("");
                LecMob.setText("");
                LecSpec.setText("");
                LecMail.setText("");
            } catch (Exception e) {
                System.out.println("Error Updating Student: " + e.getMessage());
            }
        }

    }


    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged


    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LecDataFill();
        gettingData();

    }//GEN-LAST:event_formWindowOpened

    private void LecidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LecidActionPerformed

    private void LecidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LecidKeyPressed
        String lecID = this.Lecid.getText();

        if (lecID.length() >= 2) {
            try {
                DBcon dbcLec = new DBcon();
                dbcLec.OpenConnection();
                ResultSet rs = dbcLec.SelectData("SELECT*FROM lecturers WHERE lecturer_id='" + lecID + "'");
                if (rs.next()) {
                    LecName.setText(rs.getString("name"));
                    LecMail.setText(rs.getString("email"));
                    LecMob.setText(rs.getString("phone"));
                    LecSpec.setText(rs.getString("specialization"));
                } else {
                    LecName.setText("");
                    LecMail.setText("");
                    LecMob.setText("");
                    LecSpec.setText("");
                }

            } catch (Exception e) {
                System.out.println("Error Loading Names" + e.getMessage());
            }
        }    }//GEN-LAST:event_LecidKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        updateLecFill();
        clearDataLec();
        LecDataFill();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        deleteLecturer();
        LecDataFill();

    }//GEN-LAST:event_jButton3ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LecMail;
    private javax.swing.JTextField LecMob;
    private javax.swing.JTextField LecName;
    private javax.swing.JTextField LecSpec;
    private javax.swing.JTable LecTable;
    private javax.swing.JTextField Lecid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
