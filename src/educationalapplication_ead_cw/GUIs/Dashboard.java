/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package educationalapplication_ead_cw.GUIs;

import educationalapplication_ead_cw.GUIs.Views.ViewCourses;
import educationalapplication_ead_cw.GUIs.Views.ViewLectures;
import educationalapplication_ead_cw.GUIs.Views.ViewExam;
import educationalapplication_ead_cw.GUIs.Views.ViewSubjects;
import educationalapplication_ead_cw.GUIs.Views.ViewStudents;
import educationalapplication_ead_cw.GUIs.Views.AddUser;
import educationalapplication_ead_cw.Db.DBcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ktime
 */
public class Dashboard extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    public Dashboard(String username) {
        initComponents();

        this.username = username;
        LoginNametxt.setText("Welcome " + username +" !");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mgStudentBtn = new javax.swing.JButton();
        mgCourseBtn = new javax.swing.JButton();
        mgLecturesBtn = new javax.swing.JButton();
        logoutBrtn = new javax.swing.JButton();
        mgModulesBtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mgModulesBtn2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LoginNametxt = new javax.swing.JLabel();
        LoginNametxt1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lecCount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        CoCount = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        gRbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard of SIMS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(450, 240));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        mgStudentBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        mgStudentBtn.setText("View Students");
        mgStudentBtn.setToolTipText("View | Edit | Update ");
        mgStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgStudentBtnActionPerformed(evt);
            }
        });

        mgCourseBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        mgCourseBtn.setText("View Courses");
        mgCourseBtn.setToolTipText("View | Edit | Update ");
        mgCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgCourseBtnActionPerformed(evt);
            }
        });

        mgLecturesBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        mgLecturesBtn.setText("View Lecturers");
        mgLecturesBtn.setToolTipText("View | Edit | Update ");
        mgLecturesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgLecturesBtnActionPerformed(evt);
            }
        });

        logoutBrtn.setBackground(new java.awt.Color(255, 0, 51));
        logoutBrtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        logoutBrtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBrtn.setText("Logout");
        logoutBrtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBrtnActionPerformed(evt);
            }
        });

        mgModulesBtn1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        mgModulesBtn1.setText("View Subjects");
        mgModulesBtn1.setToolTipText("View | Edit | Update ");
        mgModulesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgModulesBtn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quick Actions");

        mgModulesBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        mgModulesBtn2.setText("View Exams");
        mgModulesBtn2.setToolTipText("View | Edit | Update ");
        mgModulesBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgModulesBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(mgStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(mgLecturesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBrtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgModulesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgModulesBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mgStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mgCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mgLecturesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mgModulesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mgModulesBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBrtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        LoginNametxt.setFont(new java.awt.Font("Poppins", 3, 24)); // NOI18N

        LoginNametxt1.setFont(new java.awt.Font("Poppins", 3, 24)); // NOI18N
        LoginNametxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginNametxt1.setText("Student Information Management System");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(LoginNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LoginNametxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(LoginNametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        studentCount.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        studentCount.setForeground(new java.awt.Color(255, 255, 255));
        studentCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(studentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        lecCount.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lecCount.setForeground(new java.awt.Color(255, 255, 255));
        lecCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lecCount, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lecCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));

        CoCount.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        CoCount.setForeground(new java.awt.Color(255, 255, 255));
        CoCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        cTable.setAutoCreateRowSorter(true);
        cTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_iD", "Course_Name", "Duration", "Desc", "Course Director"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        cTable.setCellSelectionEnabled(true);
        cTable.setFillsViewportHeight(true);
        cTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        cTable.setMaximumSize(new java.awt.Dimension(2147483647, 500));
        cTable.setName(""); // NOI18N
        this.setLayout(new java.awt.BorderLayout());
        this.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.setViewportView(cTable);
        if (cTable.getColumnModel().getColumnCount() > 0) {
            cTable.getColumnModel().getColumn(0).setResizable(false);
            cTable.getColumnModel().getColumn(1).setResizable(false);
            cTable.getColumnModel().getColumn(2).setResizable(false);
            cTable.getColumnModel().getColumn(3).setResizable(false);
            cTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course List");

        gRbtn.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        gRbtn.setText("Generate Report");
        gRbtn.setToolTipText("View | Edit | Update ");
        gRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gRbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gRbtn)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gRbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Add User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgStudentBtnActionPerformed

        ViewStudents vsWin = new ViewStudents();
        vsWin.setVisible(true);


    }//GEN-LAST:event_mgStudentBtnActionPerformed

    private void mgCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgCourseBtnActionPerformed

        ViewCourses vcWin = new ViewCourses();
        vcWin.setVisible(true);

    }//GEN-LAST:event_mgCourseBtnActionPerformed

    private void mgLecturesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgLecturesBtnActionPerformed
        ViewLectures vlWin = new ViewLectures();
        vlWin.setVisible(true);
    }//GEN-LAST:event_mgLecturesBtnActionPerformed

    private void logoutBrtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBrtnActionPerformed
        Login lgWindow = new Login();
        JOptionPane.showMessageDialog(null, "Are You Sure Want to Logout", "Logout Option", JOptionPane.YES_NO_OPTION);
        this.dispose();
        lgWindow.setVisible(true);
    }//GEN-LAST:event_logoutBrtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        AddUser adwindow = new AddUser();
        adwindow.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tableFill() {
        DBcon db = new DBcon();
        ResultSet usersSet = db.SelectData("SELECT * from courses");
        try {
            while (usersSet.next()) {
                DefaultTableModel CourseData = (DefaultTableModel) cTable.getModel();

                String cId = usersSet.getString("course_id");
                String Name = usersSet.getString("course_name");
                String dur = usersSet.getString("duration");
                String desc = usersSet.getString("description");
                String cd = usersSet.getString("course_director");
                Object rowData[] = {cId, Name, dur, desc, cd};
                CourseData.addRow(rowData);
                cTable.setModel(CourseData);

            }
        } catch (Exception e) {
            System.out.println("Error loading data :" + e.getMessage());

        }
    }

    private void clearData() {
        DefaultTableModel model = (DefaultTableModel) cTable.getModel();
        model.setRowCount(0);
    }

    private void dataCount() {
        try {
            DBcon con = new DBcon();
            con.OpenConnection();
            String Query = "SELECT (SELECT COUNT(*) FROM students) AS count1, (SELECT COUNT(*) FROM lecturers) AS count2, (SELECT COUNT(*) FROM courses) AS count3;";
            ResultSet rs = con.SelectData(Query);
            if (rs.next()) {
                int count = rs.getInt("count1");
                studentCount.setText("Total Students : " + count);
                int count2 = rs.getInt("count2");
                lecCount.setText("Total Lectures : " + count2);
                int count3 = rs.getInt("count3");
                CoCount.setText("Total Courses : " + count3);
            }

        } catch (Exception e) {
            System.out.println("Error Getting Data or Code" + e.getMessage());
        }

    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dataCount();
        tableFill();
    }//GEN-LAST:event_formWindowOpened

    private void mgModulesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgModulesBtn1ActionPerformed

        ViewSubjects vsWin = new ViewSubjects();
        vsWin.setVisible(true);

    }//GEN-LAST:event_mgModulesBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dataCount();
        clearData();
        tableFill();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mgModulesBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgModulesBtn2ActionPerformed

        ViewExam veWin = new ViewExam();
        veWin.setVisible(true);
    }//GEN-LAST:event_mgModulesBtn2ActionPerformed

    private void gRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gRbtnActionPerformed
    java.sql.Connection conn = null;
    try {
        // Show loading message
        javax.swing.JOptionPane.showMessageDialog(this, "Generating report... Please wait.", "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // Get database connection using your existing DBcon class
        DBcon db = new DBcon();
        conn = db.OpenConnection();

        if (conn == null) {
            throw new Exception("Database connection failed");
        }

        System.out.println("Database connection successful!");

        // Try multiple possible paths for the report file
        String[] possiblePaths = {
            System.getProperty("user.dir") + "\\src\\educationalapplication_ead_cw\\Reports\\StudentReport.jrxml",
            System.getProperty("user.dir") + "\\Reports\\StudentReport.jrxml",
            System.getProperty("user.dir") + "\\src\\Reports\\StudentReport.jrxml",
            "src\\educationalapplication_ead_cw\\Reports\\StudentReport.jrxml",
            "Reports\\StudentReport.jrxml",
            "StudentReport.jrxml"
        };

        String reportPath = null;
        java.io.File reportFile = null;

        // Find the correct path
        for (String path : possiblePaths) {
            reportFile = new java.io.File(path);
            System.out.println("Trying path: " + reportFile.getAbsolutePath());
            if (reportFile.exists()) {
                reportPath = path;
                System.out.println("Found report file at: " + reportPath);
                break;
            }
        }

        if (reportPath == null) {
            // Show all attempted paths for debugging
            StringBuilder pathsAttempted = new StringBuilder("Report file not found. Attempted paths:\n");
            for (String path : possiblePaths) {
                pathsAttempted.append("- ").append(new java.io.File(path).getAbsolutePath()).append("\n");
            }
            throw new Exception(pathsAttempted.toString());
        }

        System.out.println("Using report file: " + reportPath);

        // Compile and generate report
        System.out.println("Compiling report...");
        net.sf.jasperreports.engine.JasperReport jasperReport = net.sf.jasperreports.engine.JasperCompileManager.compileReport(reportPath);

        // Create parameters map (empty for now, but can be used for filtering)
        java.util.Map<String, Object> parameters = new java.util.HashMap<>();

        System.out.println("Filling report with data...");
        net.sf.jasperreports.engine.JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasperReport, parameters, conn);

        System.out.println("Displaying report...");
        net.sf.jasperreports.view.JasperViewer.viewReport(jasperPrint, false);

    } catch (org.xml.sax.SAXParseException ex) {
        String error = "Report XML parsing failed: " + ex.getMessage() +
                      "\nThis usually means:\n1. JRXML file has compatibility issues\n2. Wrong JasperReports version\n" +
                      "Try using a simpler JRXML file or update JasperReports library.";
        System.err.println(error);
        javax.swing.JOptionPane.showMessageDialog(this, error, "Report XML Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (net.sf.jasperreports.engine.JRException ex) {
        String error = "Report generation failed: " + ex.getMessage();
        System.err.println(error);
        javax.swing.JOptionPane.showMessageDialog(this, error, "Report Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        String error = "Unexpected error: " + ex.getMessage();
        System.err.println(error);
        ex.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, error, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } finally {
        if (conn != null) {
            try {
                DBcon db = new DBcon();
                db.CloseConnection(conn);
                System.out.println("Database connection closed.");
            } catch (Exception e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}//GEN-LAST:event_gRbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoCount;
    private javax.swing.JLabel LoginNametxt;
    private javax.swing.JLabel LoginNametxt1;
    private javax.swing.JTable cTable;
    private javax.swing.JButton gRbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lecCount;
    private javax.swing.JButton logoutBrtn;
    private javax.swing.JButton mgCourseBtn;
    private javax.swing.JButton mgLecturesBtn;
    private javax.swing.JButton mgModulesBtn1;
    private javax.swing.JButton mgModulesBtn2;
    private javax.swing.JButton mgStudentBtn;
    private javax.swing.JLabel studentCount;
    // End of variables declaration//GEN-END:variables
}
