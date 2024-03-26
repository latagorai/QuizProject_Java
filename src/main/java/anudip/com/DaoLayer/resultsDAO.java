package anudip.com.DaoLayer;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import anudip.com.entitiesLayer.Quizzes;
import anudip.com.entitiesLayer.Users;
import anudip.com.entitiesLayer.Result;

public class resultsDAO {
	private final SessionFactory sessionFactory;

    public resultsDAO() {
        this.sessionFactory = configureSessionFactory();
    }

    // Method to configure Hibernate and obtain SessionFactory
    private SessionFactory configureSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernat.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        return meta.getSessionFactoryBuilder().build();
    }
    public void addResult( int userId, char quizId, int score, double percentage) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
			
			  // Fetch user and quiz details from the database Users user =
            Users user = session.get(Users.class, userId);
			  
				/*
				 * if (user == null) { // Handle the case where the user doesn't exist
				 * System.out.println("User with userId " + userId + " does not exist.");
				 * return; // Or throw an exception if desired }
				 */
			
			/*
			 * Scanner scanner = new Scanner(System.in);
			 * System.out.println("Enter UserId to store the result."); int usersId =
			 * scanner.nextInt();
			 */

            Quizzes quiz = session.get(Quizzes.class, quizId);

            // Calculate comment based on percentage
            String comment = calculateComment(percentage);

            // Create Result object
            Result result = new Result();
            result.setUser(user);
            result.setQuizzes(quiz);
            result.setScore(score);
            result.setPercentage(percentage);
            result.setComment(comment);

            // Save the result
            session.save(result);

            transaction.commit();
           // displayResult(usersId);
        }
    }

    private String calculateComment(double percentage) {
        // Perform switch case logic to determine comment based on percentage
        // Example logic, modify as per your requirements
        String comment;
        if (percentage >= 90) {
            comment = "Excellent!";
        } else if (percentage >= 70) {
            comment = "Good job!";
        } else if (percentage >= 50) {
            comment = "You passed!";
        }else if (percentage <= 40) {
            comment = "Need more prcatise!";
        }else {
            comment = "Try again!";
        }
        return comment;
    }

    public List<Result> getResultsByUserId(int userId) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Result> criteriaQuery = builder.createQuery(Result.class);
            Root<Result> root = criteriaQuery.from(Result.class);
            criteriaQuery.select(root).where(builder.equal(root.get("user"), userId));
            return session.createQuery(criteriaQuery).getResultList();
        }
    }
    
    public void displayResult(int userId) {
        try (Session session = sessionFactory.openSession()) {
            // Fetch user details from the database based on the entered userId
            Users user = session.get(Users.class, userId);
            if (user == null) {
                // Handle the case where the user doesn't exist
                System.out.println("User with userId " + userId + " does not exist.");
                return;
            }

            // Fetch results for the given userId
            List<Result> results = session.createQuery(
            	    "SELECT r FROM Result r WHERE r.user = :user", Result.class)
            	    .setParameter("user", user)
            	    .getResultList();

            // Display results
            System.out.println("Results for User: " + user.getUserName());
            for (Result result : results) {
                System.out.println("Quiz ID: " + result.getQuizzes().getQuizId());
                System.out.println("Score: " + result.getScore());
                System.out.println("Percentage: " + result.getPercentage());
                System.out.println("Comment: " + result.getComment());
                System.out.println(); // Add a newline for readability
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}