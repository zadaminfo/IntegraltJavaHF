package zadam.ijfHF.defaultpackage;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		System.out.println("Program has started...\n");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
		EntityManager em = emf.createEntityManager();
		
        try {
            em.getTransaction().begin();
             
            /**************
             *  Create/update User into the database
             */
            
            /*User user = new User();
            User user = em.find(User.class, 2);
            user.setName("ZAdam");
            user.setPassword("1234");
             
            em.persist(user);*/
            
            /**************
             *  Create project into the database
             */
            
/*            Project project = new Project();
            project.setName("Integralt fejlesztes JAVA platformon HF");
            project.setDescription("Hazi feladat elkeszitese");
            
            em.persist(project);*/
            
            /**************
             *  Create task into the database
             */
            
/*            Task task = new Task();
            task.setName("JPA-val kapcsolatos feladatok elkeszitese");
            task.setDescription("Minden olyan resz, ami JPA-val kapcsolatos");
            task.setProject(em.find(Project.class, 1));
            
            em.persist(task);*/
            
            /**************
             *  Create measure entries into the database
             */
            
/*            MeasureEntry me1 = new MeasureEntry();
            me1.setCreationDate(Calendar.getInstance().getTime().toString());
            me1.setComment("JPA dokumentacio olvasas");
            me1.setDuration(2.5);
            me1.setTask(em.find(Task.class, 1));
            me1.setUser(em.find(User.class, 1));
            
            MeasureEntry me2 = new MeasureEntry();
            me2.setCreationDate(Calendar.getInstance().getTime().toString());
            me2.setComment("Adatbazis elkeszitese");
            me2.setDuration(1.5);
            me2.setTask(em.find(Task.class, 1));
            me2.setUser(em.find(User.class, 1));
            
            em.persist(me1);
            em.persist(me2);*/
             
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
         
		Scanner s = new Scanner(System.in);
		try {
			System.out.println(s.next());
		} finally {
			s.close();
		}
        
        System.out.println("It is over");
	}
}
