package ec.edu.espe.inclass.view;

import ec.edu.espe.inclass.controller.CourseController;
import ec.edu.espe.inclass.controller.FormController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class FrmAddCourse extends javax.swing.JFrame {

    public FrmAddCourse() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
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
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNrc = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLogOut = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuEnrolled = new javax.swing.JMenuItem();
        menuAddStudent = new javax.swing.JMenuItem();
        menuRemoveStudent = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuManageGrade = new javax.swing.JMenuItem();
        menuGradeRecord = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuTakeAttendance = new javax.swing.JMenuItem();
        menuGetAttendace = new javax.swing.JMenuItem();
        menuTutorship = new javax.swing.JMenu();
        menuTutorships = new javax.swing.JMenuItem();
        menuCourses = new javax.swing.JMenu();
        menuManageCourses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 249, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 81, 78));
        jLabel1.setText("ADD COURSE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 81, 78));
        jLabel2.setText("Assignature's name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 81, 78));
        jLabel3.setText("NRC:");

        txtNrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNrcKeyTyped(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(48, 227, 202));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(64, 81, 78));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(100, 100, 100)
                .addComponent(btnAdd)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(17, 153, 158));
        jPanel3.setForeground(new java.awt.Color(228, 249, 245));

        btnBack.setBackground(new java.awt.Color(64, 81, 78));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(228, 249, 245));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
        );

        menuLogOut.setText("InClass");

        jMenuItem2.setText("Log out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuLogOut.add(jMenuItem2);

        jMenuBar1.add(menuLogOut);

        jMenu3.setText("Students");

        menuEnrolled.setText("Show enrolled students");
        menuEnrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEnrolledActionPerformed(evt);
            }
        });
        jMenu3.add(menuEnrolled);

        menuAddStudent.setText("Add Student");
        menuAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddStudentActionPerformed(evt);
            }
        });
        jMenu3.add(menuAddStudent);

        menuRemoveStudent.setText("Remove Student");
        menuRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveStudentActionPerformed(evt);
            }
        });
        jMenu3.add(menuRemoveStudent);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Grades");

        menuManageGrade.setText("Manage Grades");
        menuManageGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageGradeActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageGrade);

        menuGradeRecord.setText("Get grade record");
        menuGradeRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGradeRecordActionPerformed(evt);
            }
        });
        jMenu2.add(menuGradeRecord);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Attendance");

        menuTakeAttendance.setText("TakeAttendance");
        menuTakeAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTakeAttendanceActionPerformed(evt);
            }
        });
        jMenu4.add(menuTakeAttendance);

        menuGetAttendace.setText("Get attendance record");
        menuGetAttendace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGetAttendaceActionPerformed(evt);
            }
        });
        jMenu4.add(menuGetAttendace);

        jMenuBar1.add(jMenu4);

        menuTutorship.setText("Tutorships");

        menuTutorships.setText("Get tutorship record");
        menuTutorships.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTutorshipsActionPerformed(evt);
            }
        });
        menuTutorship.add(menuTutorships);

        jMenuBar1.add(menuTutorship);

        menuCourses.setText("Courses");

        menuManageCourses.setText("Manage courses");
        menuManageCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageCoursesActionPerformed(evt);
            }
        });
        menuCourses.add(menuManageCourses);

        jMenuBar1.add(menuCourses);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        FormController.AddValidCourse(this);

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNrcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNrcKeyTyped
        FormController.validKeyName(this, evt);
    }//GEN-LAST:event_txtNrcKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FrmTeacherMenu frmTeacherMenu = new FrmTeacherMenu();
        frmTeacherMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmInClassMenu frmInClassMenu = new FrmInClassMenu();
        frmInClassMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuEnrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEnrolledActionPerformed
        FrmShowEnrolledStudents frmShowEnrolledStudents = new FrmShowEnrolledStudents();
        frmShowEnrolledStudents.setVisible(true);
        FrmShowEnrolledStudents.txtNrcReceive.setText(CourseController.getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_menuEnrolledActionPerformed

    private void menuAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddStudentActionPerformed
        FrmAddStudent frmAddStudent = new FrmAddStudent();
        frmAddStudent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAddStudentActionPerformed

    private void menuRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoveStudentActionPerformed
        FrmRemoveStudent frmRemoveStudent = new FrmRemoveStudent();
        frmRemoveStudent.setVisible(true);
        FrmRemoveStudent.txtNrcReceive.setText(CourseController.getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_menuRemoveStudentActionPerformed

    private void menuManageGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageGradeActionPerformed
        FrmAddGrade frmAddGrade = new FrmAddGrade();
        frmAddGrade.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuManageGradeActionPerformed

    private void menuGradeRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGradeRecordActionPerformed
        FrmGetGradeRecord frmGetGradeRecord = new FrmGetGradeRecord();
        frmGetGradeRecord.setVisible(true);
        FrmGetGradeRecord.txtNrcReceive.setText(CourseController.getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_menuGradeRecordActionPerformed

    private void menuTakeAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTakeAttendanceActionPerformed
        FrmTakeAttendance frmTakeAttendance = new FrmTakeAttendance();
        frmTakeAttendance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTakeAttendanceActionPerformed

    private void menuGetAttendaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGetAttendaceActionPerformed
        FrmGetAttendanceRecord frmGetAttendanceRecord = new FrmGetAttendanceRecord();
        frmGetAttendanceRecord.setVisible(true);
        FrmGetAttendanceRecord.txtNrcReceive.setText(CourseController.getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_menuGetAttendaceActionPerformed

    private void menuTutorshipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTutorshipsActionPerformed
        FrmGetTutorshipRecord frmGetTutorshipRecord = new FrmGetTutorshipRecord();
        frmGetTutorshipRecord.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTutorshipsActionPerformed

    private void menuManageCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageCoursesActionPerformed
        FrmTeacherMenu frmTeacherMenu = new FrmTeacherMenu();
        frmTeacherMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuManageCoursesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddCourse().setVisible(true);
            }
        });
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtNrc() {
        return txtNrc;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem menuAddStudent;
    private javax.swing.JMenu menuCourses;
    private javax.swing.JMenuItem menuEnrolled;
    private javax.swing.JMenuItem menuGetAttendace;
    private javax.swing.JMenuItem menuGradeRecord;
    private javax.swing.JMenu menuLogOut;
    private javax.swing.JMenuItem menuManageCourses;
    private javax.swing.JMenuItem menuManageGrade;
    private javax.swing.JMenuItem menuRemoveStudent;
    private javax.swing.JMenuItem menuTakeAttendance;
    private javax.swing.JMenu menuTutorship;
    private javax.swing.JMenuItem menuTutorships;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNrc;
    // End of variables declaration//GEN-END:variables
}
