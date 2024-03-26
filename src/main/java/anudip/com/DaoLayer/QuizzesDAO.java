package anudip.com.DaoLayer;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import anudip.com.entitiesLayer.Quizzes;



public class QuizzesDAO {
	private final SessionFactory sessionFactory;

    public QuizzesDAO() {
        this.sessionFactory = configureSessionFactory();
    }

    // Method to configure Hibernate and obtain SessionFactory
    private SessionFactory configureSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernat.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        return meta.getSessionFactoryBuilder().build();
    }

    public void addQuizzes() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Define your quizzes statically
            Quizzes quiz1 = new Quizzes('A', "HTML", "easy");
            Quizzes quiz2 = new Quizzes('B', "HTML", "medium");
            Quizzes quiz3 = new Quizzes('C', "HTML", "hard");
            Quizzes quiz4 = new Quizzes('D', "CSS", "easy");
            Quizzes quiz5 = new Quizzes('E', "CSS", "medium");
            Quizzes quiz6 = new Quizzes('F', "CSS", "hard");

            // Save quizzes to the database
            session.save(quiz1);
            session.save(quiz2);
            session.save(quiz3);
            session.save(quiz4);
            session.save(quiz5);
            session.save(quiz6);

            transaction.commit();
            System.out.println("Quizzes added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quizDisplay() {
        try (Session session = sessionFactory.openSession()) {
            List<Quizzes> quizzes = session.createQuery("FROM Quizzes", Quizzes.class).list();
            if (quizzes.isEmpty()) {
                System.out.println("No quizzes found in the database.");
            } else {
                System.out.println("Quizzes:");
                for (Quizzes quiz : quizzes) {
                    System.out.println("Quiz ID: " + quiz.getQuizId());
                    System.out.println("Category: " + quiz.getCategory());
                    System.out.println("Difficulty: " + quiz.getDifficulty());
                    System.out.println("-------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectQuiz() {
        try (Session session = sessionFactory.openSession()) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("1. Select Quiz");
                System.out.println("2. Exit");
                System.out.println("Choose an option:");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                    	System.out.println("\n Quiz ID :");
                    	System.out.println(" Quiz ID: A[HTML , easy]\tQuiz ID: B[HTML , medium]\tQuiz ID: C[HTML , hard] ");
                    	System.out.println(" Quiz ID: D[CSS , easy] \tQuiz ID: E[CSS , medium] \tQuiz ID: D[CSS , hard] \n");
                    	System.out.println("Enter the Quiz ID:");
                        int quizId = scanner.nextInt();
                        // Fetch quiz details based on the provided quizId
                        Quizzes quiz = session.get(Quizzes.class, quizId);
                        if (quiz == null) {
                            System.out.println("No quiz found with ID: " + quizId);
                        } else {
                            // Display the quiz details
                            System.out.println("Quiz Details:");
                            System.out.println("Quiz ID: " + quiz.getQuizId());
                            System.out.println("Category: " + quiz.getCategory());
                            System.out.println("Difficulty: " + quiz.getDifficulty());
                            // You can display more details if needed
                        }
                        break;
                    case 2:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
            System.out.println("Exiting Quizzes Service...");
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
