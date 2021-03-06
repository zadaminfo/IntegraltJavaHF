package com.zadam.intjavahf.workmanintegraljavahf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

public class MainWindow extends javax.swing.JFrame {

    // Indicates which list was lately selected (projects = 0, tasks = 1, measures = 2)
    private int lastSelectedList = 0;

    // when the log in was successfull it is true
    private boolean loggedIn = false;

    // The user object, who is logged in currently
    private User actualUser = null;
    private Project actualSelectedProject = null;
    private Task actualSelectedTask = null;

    /**
     * Creates new form ContactEditor
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Worktime manager");

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
                        .add(jtfUserName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .add(7, 7, 7)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
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
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.setEnabled(false);
        btnRemove.setName("btnRemove"); // NOI18N
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });

        btnDetails.setText("Stopwatch");
        btnDetails.setEnabled(false);
        btnDetails.setName("btnDetails"); // NOI18N
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

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
        jlTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlTasksMouseClicked(evt);
            }
        });
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
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel6)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .add(4, 4, 4)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 204, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel7)
                                .add(183, 183, 183)))
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
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
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Log in");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class MyWindowAdapter extends WindowAdapter {

        @Override
        public void windowClosed(WindowEvent we) {
            refreshProjectList();
            refreshTaskList();
            refreshMeasureList();
        }

    }

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        MyWindowAdapter refreshOnCloseAdapter = new MyWindowAdapter();

        if (lastSelectedList == 0) {
            AddEditForm f = new AddEditForm(new Project());
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        } else if (lastSelectedList == 1 && actualSelectedProject != null) {
            AddEditForm f = new AddEditForm(new Task(), actualSelectedProject);
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        } else if (actualSelectedProject != null && actualSelectedTask != null) {
            AddEditForm f = new AddEditForm(new MeasureEntry(), actualUser, actualSelectedProject, actualSelectedTask);
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void jlProjectsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlProjectsFocusGained
        lastSelectedList = 0;
    }//GEN-LAST:event_jlProjectsFocusGained

    private void jlTasksFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlTasksFocusGained
        lastSelectedList = 1;
    }//GEN-LAST:event_jlTasksFocusGained

    private void jlMeasuresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlMeasuresFocusGained
        lastSelectedList = 2;
    }//GEN-LAST:event_jlMeasuresFocusGained

    private void jlProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProjectsMouseClicked
        Project selectedProject = (Project) jlProjects.getSelectedValue();

        if (selectedProject == null) {
            return;
        }

        actualSelectedProject = selectedProject;

        // Reset Measures' JList
        DefaultListModel emptyList = new DefaultListModel();
        jlMeasures.setModel(emptyList);

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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
    }//GEN-LAST:event_jlProjectsMouseClicked

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked
        jtfUserName.setEnabled(false);
        jtfPassword.setEnabled(false);
        btnLogIn.setEnabled(false);

        new Thread() {
            public void run() {
                loggedIn = login();

                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        fillJListsWithData(loggedIn);

                        jlProjects.setEnabled(loggedIn);
                        jlTasks.setEnabled(loggedIn);
                        jlMeasures.setEnabled(loggedIn);

                        btnAdd.setEnabled(loggedIn);
                        btnEdit.setEnabled(loggedIn);
                        btnRemove.setEnabled(loggedIn);
                        btnDetails.setEnabled(loggedIn);

                        jtfUserName.setEnabled(!loggedIn);
                        jtfPassword.setEnabled(!loggedIn);
                        btnLogIn.setEnabled(!loggedIn);
                    }
                });

            }
        }.start();
    }//GEN-LAST:event_btnLogInMouseClicked

    private void jlTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlTasksMouseClicked
        Task selectedTask = (Task) jlTasks.getSelectedValue();

        if (selectedTask == null) {
            return;
        }

        actualSelectedTask = selectedTask;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();

        try {
            Query projectsQuery = em.createQuery("from MeasureEntry where Task_id = :myId");
            projectsQuery.setParameter("myId", selectedTask.getId());
            List measureList = projectsQuery.getResultList();

            DefaultListModel resultList = new DefaultListModel();
            jlMeasures.setModel(resultList);

            for (int i = 0; i < measureList.size(); i++) {
                resultList.addElement(measureList.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
    }//GEN-LAST:event_jlTasksMouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        String tableName = "";
        int selectedItemId = -1;

        if (lastSelectedList == 0) {
            tableName = "Project";
            Project selectedProject = (Project) jlProjects.getSelectedValue();

            if (selectedProject == null) {
                return;
            }

            selectedItemId = selectedProject.getId();
        } else if (lastSelectedList == 1) {
            tableName = "Task";
            Task selectedTask = (Task) jlTasks.getSelectedValue();

            if (selectedTask == null) {
                return;
            }

            selectedItemId = selectedTask.getId();
        } else {
            tableName = "MeasureEntry";
            MeasureEntry selectedMeasure = (MeasureEntry) jlMeasures.getSelectedValue();

            if (selectedMeasure == null) {
                return;
            }

            selectedItemId = selectedMeasure.getId();
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();

        try {
            Query query = em.createQuery("from " + tableName + " where id = :myId");
            query.setParameter("myId", selectedItemId);
            List measureList = query.getResultList();

            if (measureList.size() <= 0) {
                return;
            }

            em.getTransaction().begin();

            if (lastSelectedList == 0) {
                Project projToRemove = (Project) measureList.get(0);

                // Remove related measures
                Query relTasksQuery = em.createQuery("from Task where Project_id = :projectId");
                relTasksQuery.setParameter("projectId", projToRemove.getId());
                List relatedTaskList = relTasksQuery.getResultList();

                for (int i = 0; i < relatedTaskList.size(); i++) {
                    Task taskToRemove = (Task) relatedTaskList.get(i);

                    // Remove related measures
                    Query relQuery = em.createQuery("from MeasureEntry where Task_id = :taskId");
                    relQuery.setParameter("taskId", taskToRemove.getId());
                    List relatedMeasureList = relQuery.getResultList();

                    for (int k = 0; k < relatedMeasureList.size(); k++) {
                        em.remove(relatedMeasureList.get(k));
                    }

                    em.remove(taskToRemove);
                }

                em.remove(projToRemove);
            } else if (lastSelectedList == 1) {
                Task taskToRemove = (Task) measureList.get(0);

                // Remove related measures
                Query relQuery = em.createQuery("from MeasureEntry where Task_id = :taskId");
                relQuery.setParameter("taskId", taskToRemove.getId());
                List relatedMeasureList = relQuery.getResultList();

                for (int i = 0; i < relatedMeasureList.size(); i++) {
                    em.remove(relatedMeasureList.get(i));
                }

                em.remove(taskToRemove);
            } else {
                MeasureEntry mesToRemove = (MeasureEntry) measureList.get(0);
                em.remove(mesToRemove);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            emf.close();
        }

        refreshProjectList();
        refreshTaskList();
        refreshMeasureList();
    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        MyWindowAdapter refreshOnCloseAdapter = new MyWindowAdapter();

        if (lastSelectedList == 0) {
            Project selectedProject = (Project) jlProjects.getSelectedValue();

            if (selectedProject == null) {
                return;
            }

            AddEditForm f = new AddEditForm(selectedProject);
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        } else if (lastSelectedList == 1) {
            Task selectedTask = (Task) jlTasks.getSelectedValue();

            if (selectedTask == null) {
                return;
            }

            AddEditForm f = new AddEditForm(selectedTask, actualSelectedProject);
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        } else {
            MeasureEntry selectedMeasure = (MeasureEntry) jlMeasures.getSelectedValue();

            if (selectedMeasure == null) {
                return;
            }

            AddEditForm f = new AddEditForm(selectedMeasure, actualUser, actualSelectedProject, actualSelectedTask);
            f.addWindowListener(refreshOnCloseAdapter);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        if (actualSelectedProject != null && actualSelectedTask != null && actualUser != null) {
            StopWatch f = new StopWatch(actualSelectedProject, actualSelectedTask, actualUser, this);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    private boolean login() {
        boolean ret = false;

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
            EntityManager em = emf.createEntityManager();

            try {
                Query usersQuery = em.createQuery("from User where name = :Name and password = :Password");
                usersQuery.setParameter("Name", jtfUserName.getText());
                usersQuery.setParameter("Password", jtfPassword.getText());
                List userList = usersQuery.getResultList();

                if (userList.size() > 0) {
                    actualUser = (User) userList.get(0);
                }

                ret = userList.size() > 0;

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                emf.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return ret;
    }

    public void refreshProjectList() {
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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
    }

    public void refreshTaskList() {
        Project selectedProject = actualSelectedProject;

        // Reset Measures' JList
        DefaultListModel emptyList = new DefaultListModel();
        jlMeasures.setModel(emptyList);

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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
    }

    public void refreshMeasureList() {
        Task selectedTask = actualSelectedTask;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();

        try {
            Query projectsQuery = em.createQuery("from MeasureEntry where Task_id = :myId");
            projectsQuery.setParameter("myId", selectedTask.getId());
            List measureList = projectsQuery.getResultList();

            DefaultListModel resultList = new DefaultListModel();
            jlMeasures.setModel(resultList);

            for (int i = 0; i < measureList.size(); i++) {
                resultList.addElement(measureList.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
    }

    public void saveStopWatchMeasure(MeasureEntry mesEntry, Project project, Task task, User user) {
        MyWindowAdapter refreshOnCloseAdapter = new MyWindowAdapter();
        
        AddEditForm f = new AddEditForm(mesEntry, user, project, task);
        f.addWindowListener(refreshOnCloseAdapter);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setVisible(true);
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogIn;
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
    private javax.swing.JList jlMeasures;
    private javax.swing.JList jlProjects;
    private javax.swing.JList jlTasks;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables

}
