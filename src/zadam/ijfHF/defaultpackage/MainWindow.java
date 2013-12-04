package zadam.ijfHF.defaultpackage;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.persistence.*;

public class MainWindow extends javax.swing.JFrame {
    
    // Indicates which list was lately selected (projects = 0, tasks = 1, measures = 2)
    private int lastSelectedList = 0;
    
    // when the log in was successfull it is true
    private boolean loggedIn = false;
    
    /**
     * Creates new form ContactEditor
     */
    public MainWindow() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlProjects = new javax.swing.JList();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlMeasures = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlTasks = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-mail Contacts");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Log in "));
        jPanel1.setToolTipText("Log in");
        jPanel1.setName("jpLogin"); // NOI18N

        jLabel1.setText("User name");

        jLabel2.setText("Password");

        jtfUserName.setText("admin");

        jtfPassword.setText("1234");

        btnLogIn.setText("Log in");
        btnLogIn.setName("btnLogIn"); // NOI18N
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnLogIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfUserName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .add(7, 7, 7)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jtfPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfUserName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnLogIn)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel6.setText("Projects");

        jlProjects.setDoubleBuffered(true);
        jlProjects.setEnabled(false);
        jlProjects.setName("jlProjects"); // NOI18N
        jlProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlProjectsMouseClicked(evt);
            }
        });
        jlProjects.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlProjectsFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jlProjects);

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.setName("btnEdit"); // NOI18N

        btnRemove.setText("Remove");
        btnRemove.setEnabled(false);
        btnRemove.setName("btnRemove"); // NOI18N

        btnDetails.setText("Details");
        btnDetails.setEnabled(false);
        btnDetails.setName("btnDetails"); // NOI18N

        jlMeasures.setDoubleBuffered(true);
        jlMeasures.setEnabled(false);
        jlMeasures.setName("jlMeasures"); // NOI18N
        jlMeasures.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlMeasuresFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jlMeasures);

        jlTasks.setDoubleBuffered(true);
        jlTasks.setEnabled(false);
        jlTasks.setName("jlTasks"); // NOI18N
        jlTasks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlTasksFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(jlTasks);

        jLabel7.setText("Tasks");

        jLabel8.setText("Measures");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(btnAdd)
                        .add(18, 18, 18)
                        .add(btnEdit)
                        .add(18, 18, 18)
                        .add(btnRemove)
                        .add(18, 18, 18)
                        .add(btnDetails)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel6)
                                .add(119, 119, 119)
                                .add(jLabel7)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {btnAdd, btnDetails, btnEdit, btnRemove}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel7)
                    .add(jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnAdd)
                            .add(btnEdit)
                            .add(btnRemove)
                            .add(btnDetails)))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");

        btnOk.setText("OK");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(btnOk)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancel))
                    .add(jPanel1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {btnCancel, btnOk}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCancel)
                    .add(btnOk))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Log in");

        pack();
    }// </editor-fold>                        

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (lastSelectedList == 0) {
        DefaultListModel resultList = new DefaultListModel();
        jlProjects.setModel(resultList);

        for (int i = 0; i < 10; i++) {
            resultList.addElement(String.valueOf(i));
        }
        } else if (lastSelectedList == 1) {
            DefaultListModel resultList = new DefaultListModel();
            jlTasks.setModel(resultList);

            for (int i = 0; i < 10; i++) {
                resultList.addElement(String.valueOf(i));
            }
        }else {
            DefaultListModel resultList = new DefaultListModel();
            jlMeasures.setModel(resultList);

            for (int i = 0; i < 10; i++) {
                resultList.addElement(String.valueOf(i));
            }
        }
    }                                   

    private void jlProjectsFocusGained(java.awt.event.FocusEvent evt) {                                       
        lastSelectedList = 0;
    }                                      

    private void jlTasksFocusGained(java.awt.event.FocusEvent evt) {                                    
        lastSelectedList = 1;
    }                                   

    private void jlMeasuresFocusGained(java.awt.event.FocusEvent evt) {                                       
        lastSelectedList = 2;
    }                                      

    private void jlProjectsMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	Project selectedProject = (Project) jlProjects.getSelectedValue();
    	
    	if (selectedProject == null) {
    		return;
    	}
    	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
		EntityManager em = emf.createEntityManager();
		
        try {            
            Query projectsQuery = em.createQuery("from Task where Project_id = :myId");
            projectsQuery.setParameter("myId", selectedProject.getId());
            List taskList = projectsQuery.getResultList();
            
            DefaultListModel resultList = new DefaultListModel();
            jlTasks.setModel(resultList);

            for (int i = 0; i < taskList.size(); i++) {
                resultList.addElement(taskList.get(i));
            }
         
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
    }                                       

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {                                      
        loggedIn = login();
        
        fillJListsWithData(loggedIn);
        
        jlProjects.setEnabled(loggedIn);
        jlTasks.setEnabled(loggedIn);
        jlMeasures.setEnabled(loggedIn);
        
        btnAdd.setEnabled(loggedIn);
        btnEdit.setEnabled(loggedIn);
        btnRemove.setEnabled(loggedIn);
        btnDetails.setEnabled(loggedIn);
    }                                     
    
    private boolean login() {
    	boolean ret = false;
    	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
		EntityManager em = emf.createEntityManager();
		
        try {            
            Query usersQuery = em.createQuery("from User where name = :Name and password = :Password");
            usersQuery.setParameter("Name", jtfUserName.getText());
            usersQuery.setParameter("Password", jtfPassword.getText());
            List userList = usersQuery.getResultList();
            
            ret = userList.size() > 0;
         
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
        return ret;
    }
    
    private void fillJListsWithData(boolean loggedIn) {
    	if (!loggedIn) {
    		return;
    	}
    	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
		EntityManager em = emf.createEntityManager();
		
        try {            
            Query projectsQuery = em.createQuery("from Project");
            List projectList = projectsQuery.getResultList();
            
            DefaultListModel resultList = new DefaultListModel();
            jlProjects.setModel(resultList);

            for (int i = 0; i < projectList.size(); i++) {
                resultList.addElement(projectList.get(i));
            }
         
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
    }
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new ContactEditor().setVisible(true);
        //    }
        //});
        
        new MainWindow().setVisible(true);
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jtfUserName;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JList jlMeasures;
    private javax.swing.JList jlProjects;
    private javax.swing.JList jlTasks;
    // End of variables declaration                   
    
}