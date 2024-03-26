package anudip.com.DaoLayer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import anudip.com.entitiesLayer.Users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class UsersDAO {

    private final SessionFactory sessionFactory;

    public UsersDAO() {
        this.sessionFactory = configureSessionFactory();
    }

    // Method to configure Hibernate and obtain SessionFactory
    private SessionFactory configureSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernat.cfg.xml")
                .build();
        Metadata meta = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();
        return meta.getSessionFactoryBuilder().build();
    }

    public void addUser() {
        try (Session session = sessionFactory.openSession()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your ID:");
            int id = scanner.nextInt();
            System.out.println("Enter your name:");
            String name = scanner.next();
            System.out.println("Enter your email ID:");
            String emailId = scanner.next();

            Transaction transaction = session.beginTransaction();
            Users user = new Users(id, name, emailId);
            session.save(user);
            transaction.commit();

            System.out.println("User details saved successfully!");
            System.out.println("Thank you for providing your details.");
            System.out.println("You can proceed now.");
            //scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	/*
	 * public void displayUserDetailsByUserId(int userId) { Users user =
	 * Users.getUserByUserId(userId); if (user != null) {
	 * System.out.println("User Details:"); System.out.println("User ID: " +
	 * user.getUserId()); System.out.println("Username: " + user.getUsername()); //
	 * Display other user details as needed } else {
	 * System.out.println("User not found for userID: " + userId); } }
	 */
    
    public void displayUserDetails() {
        try (Session session = sessionFactory.openSession()) {
            List<Users> users = session.createQuery("FROM Users", Users.class).list();
            if (users.isEmpty()) {
                System.out.println("No users found in the database.");
            } else {
                System.out.println("User Details:");
                for (Users user : users) {
                	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println("Date and Time: " + formatter.format(now));                 
                    System.out.println("User ID: " + user.getUserId());
                    System.out.println("Name: " + user.getUserName());
                    System.out.println("Email ID: " + user.getEmailId());
                    System.out.println("-------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

