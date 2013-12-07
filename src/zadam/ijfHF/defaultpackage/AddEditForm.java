package zadam.ijfHF.defaultpackage;

public class AddEditForm extends javax.swing.JFrame {
    
    /** Creates new form Find */
    public AddEditForm(Project porject) {
        initComponents();
        
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
    
    public AddEditForm(Task task) {
        initComponents();
        
        jtfName.setText(task.getName());
        jtaDescription.setText(task.getDescription());
        if (task.getProject() != null) {
            lblProjectName.setText(task.getProject().getName());
        } else {
            lblProjectName.setText("No project was selected");
        }
        
        
        lblTaskName.setVisible(false);
        lblCreationDate.setVisible(false);
        lblCreatedBy.setVisible(false);
        jtfDuration.setVisible(false);
        
        lblTasN.setVisible(false);
        lblCreatD.setVisible(false);
        lblCrBy.setVisible(false);
        lblDur.setVisible(false);
    }
    
        public AddEditForm(MeasureEntry mes, String actUser) {
        initComponents();
        
        jtaDescription.setText(mes.getComment());
        jtfDuration.setText(String.valueOf(mes.getDuration()));
        
        if (mes.getTask() != null && mes.getTask().getProject() != null) {
            lblProjectName.setText(mes.getTask().getProject().getName());
            lblTaskName.setText(mes.getTask().getName());
        } else {
            lblProjectName.setText("No project was selected");
            lblTaskName.setText("No task was selected");
        }
        lblCreationDate.setText(mes.getCreationDate());
        if (mes.getUser() != null) {
            lblCreatedBy.setText(mes.getUser().getName());
        } else {
            lblCreatedBy.setText(actUser);
        }
        
        
        lblName.setVisible(false);
        jtfName.setVisible(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        setTitle("Find");

        lblName.setText("Name");

        btnSave.setText("Save");

        btnCancel.setText("Cancel");

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
    }// </editor-fold>                        
    
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
    
    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
    
}