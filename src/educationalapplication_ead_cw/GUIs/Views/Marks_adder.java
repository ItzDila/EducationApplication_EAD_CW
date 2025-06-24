/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package educationalapplication_ead_cw.GUIs.Views;

import educationalapplication_ead_cw.Db.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ktime
 */
public class Marks_adder extends javax.swing.JFrame {

    public Marks_adder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StuBox = new javax.swing.JComboBox<>();
        SubBox = new javax.swing.JComboBox<>();
        StuTxt = new javax.swing.JTextField();
        SubTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ExBox = new javax.swing.JComboBox<>();
        ExTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mrks = new javax.swing.JTextField();
        mkTxt = new javax.swing.JTextField();
        ExTxt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel7.setFont(new java.awt.Font("Poppins", 3, 36)); // NOI18N
        jLabel7.setText("Manage Marks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("Mark ID");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("Subject ID");

        StuBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        StuBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SubBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        SubBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        StuTxt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        StuTxt.setToolTipText("");
        StuTxt.setFocusable(false);

        SubTxt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        SubTxt.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Exam ID");

        jButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton1.setText("Add Marks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton2.setText("Update Markls");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ExBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ExBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ExTxt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ExTxt.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setText("Enter Marks");

        mrks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        mkTxt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        ExTxt1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ExTxt1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SubBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(StuBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SubTxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ExTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ExTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(StuTxt))
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(mrks)
                        .addGap(220, 220, 220))))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StuBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SubBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ExTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(mrks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Call this in your form constructor or initialization

    private void setupStuBox() {
        try {
            DBcon db = new DBcon();
            db.OpenConnection();

            ResultSet rs = db.SelectData("SELECT student_id FROM students");
            StuBox.removeAllItems();

            while (rs.next()) {
                StuBox.addItem(rs.getString("student_id"));
            }

            // Add listener to respond to selection
            StuBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String selectedID = (String) StuBox.getSelectedItem();
                        ResultSet rs = db.SelectData("SELECT name FROM students WHERE student_id = '" + selectedID + "'");
                        if (rs.next()) {
                            StuTxt.setText(rs.getString("name"));
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            });

        } catch (Exception e) {
            System.out.println("Error loading student IDs: " + e.getMessage());
        }
    }

    private void setupSubBox() {
        try {
            DBcon db = new DBcon();
            db.OpenConnection();

            ResultSet rs = db.SelectData("SELECT subject_id FROM subjects");
            SubBox.removeAllItems();

            while (rs.next()) {
                SubBox.addItem(rs.getString("subject_id"));
            }

            SubBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String selectedID = (String) SubBox.getSelectedItem();
                        ResultSet rs = db.SelectData("SELECT name FROM subjects WHERE subject_id = '" + selectedID + "'");
                        if (rs.next()) {
                            SubTxt.setText(rs.getString("name"));
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            });

        } catch (Exception e) {
            System.out.println("Error loading subject IDs: " + e.getMessage());
        }
    }

    private void setupExBox() {
        try {
            DBcon db = new DBcon();
            db.OpenConnection();

            ResultSet rs = db.SelectData("SELECT exam_id FROM exams");
            ExBox.removeAllItems();

            while (rs.next()) {
                ExBox.addItem(rs.getString("exam_id"));
            }

            ExBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String selectedID = (String) ExBox.getSelectedItem();
                        ResultSet rs = db.SelectData("SELECT * FROM exams WHERE exam_id = '" + selectedID + "'");
                        if (rs.next()) {
                            ExTxt.setText(rs.getString("course_id"));
                            ExTxt1.setText(rs.getString("name"));

                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            });

        } catch (Exception e) {
            System.out.println("Error loading Exam IDs: " + e.getMessage());
        }
    }

    private void clearMarks() {
        mkTxt.setText("");
        StuBox.setSelectedIndex(0);
        StuTxt.setText("");
        SubBox.setSelectedIndex(0);
        SubTxt.setText("");
        ExBox.setSelectedIndex(0);
        ExTxt.setText("");
        ExTxt1.setText("");
        mrks.setText("");
    }

    private void insertMarks() {
        String markID = mkTxt.getText();
        String studentID = StuBox.getSelectedItem().toString();
        String subjectID = SubBox.getSelectedItem().toString();
        String examID = ExBox.getSelectedItem().toString();
        String marks = mrks.getText();

        if (markID.isEmpty() || studentID.isEmpty() || subjectID.isEmpty() || examID.isEmpty() || marks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            DBcon db = new DBcon();
            db.OpenConnection();

            String query = "INSERT INTO marks (mark_id, student_id, subject_id, exam_id, mark) VALUES ('@1', '@2', '@3', '@4', '@5')";
            query = query.replaceAll("@1", markID);
            query = query.replaceAll("@2", studentID);
            query = query.replaceAll("@3", subjectID);
            query = query.replaceAll("@4", examID);
            query = query.replaceAll("@5", marks);

            db.InsertData(query);
            JOptionPane.showMessageDialog(null, "Marks added successfully!");
            clearMarks();
        } catch (Exception e) {
            System.out.println("Error inserting marks: " + e.getMessage());
        }
    }

    private void updateMarks() {
        String markID = mkTxt.getText();
        String studentID = StuBox.getSelectedItem().toString();
        String subjectID = SubBox.getSelectedItem().toString();
        String examID = ExBox.getSelectedItem().toString();
        String marks = mrks.getText();

        if (markID.isEmpty() || studentID.isEmpty() || subjectID.isEmpty() || examID.isEmpty() || marks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            DBcon db = new DBcon();
            db.OpenConnection();

            String query = "UPDATE marks SET "
                    + "student_id = '@1', "
                    + "subject_id = '@2', "
                    + "exam_id = '@3', "
                    + "mark = '@4' "
                    + "WHERE mark_id = '@5'";

            query = query.replaceAll("@1", studentID);
            query = query.replaceAll("@2", subjectID);
            query = query.replaceAll("@3", examID);
            query = query.replaceAll("@4", marks);
            query = query.replaceAll("@5", markID);

            db.InsertData(query);
            JOptionPane.showMessageDialog(null, "Marks updated successfully!");
            clearMarks();
        } catch (Exception e) {
            System.out.println("Error updating marks: " + e.getMessage());
        }
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        setupStuBox();
        setupSubBox();
        setupExBox();

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        insertMarks();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateMarks();
    }//GEN-LAST:event_jButton2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ExBox;
    private javax.swing.JTextField ExTxt;
    private javax.swing.JTextField ExTxt1;
    private javax.swing.JComboBox<String> StuBox;
    private javax.swing.JTextField StuTxt;
    private javax.swing.JComboBox<String> SubBox;
    private javax.swing.JTextField SubTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mkTxt;
    private javax.swing.JTextField mrks;
    // End of variables declaration//GEN-END:variables
}
