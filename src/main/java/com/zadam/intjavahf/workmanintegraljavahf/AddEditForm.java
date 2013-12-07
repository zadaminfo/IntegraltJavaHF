package com.zadam.intjavahf.workmanintegraljavahf;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddEditForm extends javax.swing.JFrame {

    private Project internalProject = null;
    private Task internalTask = null;
    private MeasureEntry internalMeasureEntry = null;

    private User actualUser = null;

    /**
     * Creates new form Find
     */
    public AddEditForm(Project porject) {
        initComponents();

        this.internalProject = porject;

        jtfName.setText(porject.getName());
        jtaDescription.setText(porject.getDescription());

        lblProjectName.setVisible(false);
        lblTaskName.setVisible(false);
        lblCreationDate.setVisible(false);
        lblCreatedBy.setVisible(false);
        jtfDuration.setVisible(false);

        lblProjN.setVisible(false);
        lblTasN.setVisible(false);
        lblCreatD.setVisible(false);
        lblCrBy.setVisible(false);
        lblDur.setVisible(false);
    }

    public AddEditForm(Task task, Project project) {
        initComponents();

        this.internalTask = task;
        this.internalProject = project;

        jtfName.setText(task.getName());
        jtaDescription.setText(task.getDescription());
        lblProjectName.setText(internalProject.getName());

        lblTaskName.setVisible(false);
        lblCreationDate.setVisible(false);
        lblCreatedBy.setVisible(false);
        jtfDuration.setVisible(false);

        lblTasN.setVisible(false);
        lblCreatD.setVisible(false);
        lblCrBy.setVisible(false);
        lblDur.setVisible(false);
    }

    public AddEditForm(MeasureEntry mes, User actUser, Project project, Task task) {
        initComponents();

        this.internalMeasureEntry = mes;
        this.actualUser = actUser;
        this.internalTask = task;
        this.internalProject = project;

        jtaDescription.setText(mes.getComment());
        jtfDuration.setText(String.valueOf(mes.getDuration()));

        lblProjectName.setText(internalProject.getName());
        lblTaskName.setText(internalTask.getName());

        lblCreationDate.setText(mes.getCreationDate());
        if (mes.getUser() != null) {
            lblCreatedBy.setText(mes.getUser().getName());
        } else {
            lblCreatedBy.setText(actUser.getName());
        }

        lblName.setVisible(false);
        jtfName.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        jtfDuration = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescription = new javax.swing.JTextArea();
        lblCreatD = new javax.swing.JLabel();
        lblDur = new javax.swing.JLabel();
        lblProjN = new javax.swing.JLabel();
        lblTasN = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        lblProjectName = new javax.swing.JLabel();
        lblTaskName = new javax.swing.JLabel();
        lblCreationDate = new javax.swing.JLabel();
        lblCrBy = new javax.swing.JLabel();
        lblCreatedBy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add/Edit");

        lblName.setText("Name");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblDescription.setText("Description");

        jtaDescription.setColumns(20);
        jtaDescription.setRows(5);
        jScrollPane1.setViewportView(jtaDescription);

        lblCreatD.setText("Creation date");

        lblDur.setText("Duration");

        lblProjN.setText("Project name");

        lblTasN.setText("Task name");

        lblProjectName.setText("actProjName");

        lblTaskName.setText("actTaskName");

        lblCreationDate.setText("actCreationDate");

        lblCrBy.setText("Created by");

        lblCreatedBy.setText("actCreatedBy");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(lblName)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfName))
                    .add(layout.createSequentialGroup()
                        .add(lblProjN)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblProjectName))
                    .add(layout.createSequentialGroup()
                        .add(lblTasN)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblTaskName))
                    .add(layout.createSequentialGroup()
                        .add(lblCreatD)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblCreationDate))
                    .add(layout.createSequentialGroup()
                        .add(lblCrBy)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblCreatedBy))
                    .add(layout.createSequentialGroup()
                        .add(lblDescription)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(btnCancel))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 288, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(lblDur, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jtfDuration, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblName)
                    .add(jtfName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblDescription)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblProjN)
                    .add(lblProjectName))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTasN)
                    .add(lblTaskName))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCreatD)
                    .add(lblCreationDate))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCrBy)
                    .add(lblCreatedBy))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblDur)
                    .add(jtfDuration, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCancel)
                    .add(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
            EntityManager em = emf.createEntityManager();

            try {
                em.getTransaction().begin();

                if (internalMeasureEntry != null && actualUser != null && internalTask != null && internalProject != null) {
                    try {
                        internalMeasureEntry.setDuration(Double.parseDouble(jtfDuration.getText()));
                    } catch (Exception e) {
                        return;
                    }
                    internalMeasureEntry.setComment(jtaDescription.getText());

                    MeasureEntry mesEntry = em.find(MeasureEntry.class, internalMeasureEntry.getId());
                    if (mesEntry != null) {
                        mesEntry.setDuration(internalMeasureEntry.getDuration());
                        mesEntry.setComment(internalMeasureEntry.getComment());
                    } else {
                        mesEntry = new MeasureEntry();
                        mesEntry.setCreationDate(Calendar.getInstance().getTime().toString());
                        mesEntry.setTask(internalTask);
                        mesEntry.setUser(actualUser);
                        mesEntry.setDuration(internalMeasureEntry.getDuration());
                        mesEntry.setComment(internalMeasureEntry.getComment());

                        em.persist(mesEntry);
                    }
                } else if (internalTask != null && internalProject != null) {
                    internalTask.setName(jtfName.getText());
                    internalTask.setDescription(jtaDescription.getText());

                    Task tsk = em.find(Task.class, internalTask.getId());
                    if (tsk != null) {
                        tsk.setName(internalTask.getName());
                        tsk.setDescription(internalTask.getDescription());
                    } else {
                        tsk = new Task();
                        tsk.setName(internalTask.getName());
                        tsk.setDescription(internalTask.getDescription());
                        tsk.setProject(internalProject);

                        em.persist(tsk);
                    }
                } else if (internalProject != null) {
                    internalProject.setName(jtfName.getText());
                    internalProject.setDescription(jtaDescription.getText());

                    Project proj = em.find(Project.class, internalProject.getId());
                    if (proj != null) {
                        proj.setName(internalProject.getName());
                        proj.setDescription(internalProject.getDescription());
                    } else {
                        proj = new Project();
                        proj.setName(internalProject.getName());
                        proj.setDescription(internalProject.getDescription());

                        em.persist(proj);
                    }
                }

                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
                e.printStackTrace();
            } finally {
                emf.close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
//            for (int idx=0; idx<installedLookAndFeels.length; idx++)
//                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
//                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
//                    break;
//                }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddEditForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescription;
    private javax.swing.JTextField jtfDuration;
    private javax.swing.JTextField jtfName;
    private javax.swing.JLabel lblCrBy;
    private javax.swing.JLabel lblCreatD;
    private javax.swing.JLabel lblCreatedBy;
    private javax.swing.JLabel lblCreationDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDur;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProjN;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JLabel lblTasN;
    private javax.swing.JLabel lblTaskName;
    // End of variables declaration//GEN-END:variables

}