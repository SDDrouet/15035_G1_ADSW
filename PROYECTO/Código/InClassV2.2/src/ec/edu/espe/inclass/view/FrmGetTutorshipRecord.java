package ec.edu.espe.inclass.view;

import ec.edu.espe.inclass.controller.CourseController;
import ec.edu.espe.inclass.controller.FormController;
import ec.edu.espe.inclass.controller.PdfManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author alejo
 */
public class FrmGetTutorshipRecord extends javax.swing.JFrame {

    public FrmGetTutorshipRecord() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        FormController.showTableDate(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlButtons = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTutorships = new javax.swing.JTable();
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

        pnlButtons.setBackground(new java.awt.Color(17, 153, 158));

        btnPrint.setBackground(new java.awt.Color(0, 102, 204));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(70, 70, 70))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(27, 27, 27))
        );

        jPanel1.setBackground(new java.awt.Color(228, 249, 245));

        titile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titile.setForeground(new java.awt.Color(64, 81, 78));
        titile.setText("Registro de Tutorias");

        tblTutorships.setBackground(new java.awt.Color(48, 227, 202));
        tblTutorships.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTutorships.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "ID", "Estudiante"
            }
        ));
        tblTutorships.setEnabled(false);
        jScrollPane1.setViewportView(tblTutorships);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titile)
                        .addGap(327, 327, 327))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titile)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        menuLogOut.setText("EnClases");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuLogOut.add(jMenuItem2);

        jMenuBar1.add(menuLogOut);

        jMenu3.setText("Estudiantes");

        menuEnrolled.setText("Lista de Alumnos");
        menuEnrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEnrolledActionPerformed(evt);
            }
        });
        jMenu3.add(menuEnrolled);

        menuAddStudent.setText("Agregar Alumno");
        menuAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddStudentActionPerformed(evt);
            }
        });
        jMenu3.add(menuAddStudent);

        menuRemoveStudent.setText("Quitar Alumno");
        menuRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveStudentActionPerformed(evt);
            }
        });
        jMenu3.add(menuRemoveStudent);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Notas");

        menuManageGrade.setText("Administrar Notas");
        menuManageGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageGradeActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageGrade);

        menuGradeRecord.setText("Registro de Notas");
        menuGradeRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGradeRecordActionPerformed(evt);
            }
        });
        jMenu2.add(menuGradeRecord);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Asistencia");

        menuTakeAttendance.setText("Tomar Asistencia");
        menuTakeAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTakeAttendanceActionPerformed(evt);
            }
        });
        jMenu4.add(menuTakeAttendance);

        menuGetAttendace.setText("Registro de Asistencias");
        menuGetAttendace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGetAttendaceActionPerformed(evt);
            }
        });
        jMenu4.add(menuGetAttendace);

        jMenuBar1.add(jMenu4);

        menuTutorship.setText("Tutorias");

        menuTutorships.setText("Registro de Tutorias");
        menuTutorships.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTutorshipsActionPerformed(evt);
            }
        });
        menuTutorship.add(menuTutorships);

        jMenuBar1.add(menuTutorship);

        menuCourses.setText("Cursos");

        menuManageCourses.setText("Administrar Cursos");
        menuManageCourses.setToolTipText("");
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        PdfManager.createTutorshipRecord(this, tblTutorships);
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGetTutorshipRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGetTutorshipRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGetTutorshipRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGetTutorshipRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGetTutorshipRecord().setVisible(true);
            }
        });
    }


    public JButton getBtnPrint() {
        return btnPrint;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JPanel getPnlButtons() {
        return pnlButtons;
    }

    public JTable getTblTutorships() {
        return tblTutorships;
    }

    public JLabel getTitile() {
        return titile;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTable tblTutorships;
    private javax.swing.JLabel titile;
    // End of variables declaration//GEN-END:variables
}
