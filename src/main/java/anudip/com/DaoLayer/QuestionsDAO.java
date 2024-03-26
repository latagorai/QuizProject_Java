package anudip.com.DaoLayer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//import anudip.com.entitiesLayer.Options;
import anudip.com.entitiesLayer.Questions;
import anudip.com.entitiesLayer.Quizzes;

import java.util.List;

public class QuestionsDAO {
	private final SessionFactory sessionFactory;

    public QuestionsDAO() {
        this.sessionFactory = configureSessionFactory();
    }

    // Method to configure Hibernate and obtain SessionFactory
    private SessionFactory configureSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernat.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        return meta.getSessionFactoryBuilder().build();
    }
    
    
    public void addHtmlEasyQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(1,  quiz,"Q1", "What does HTML stand for?", 'B');
        addQuestion(2,  quiz,"Q2", "Which tag is used to create a hyperlink in HTML?", 'D');
        addQuestion(3,  quiz,"Q3", "What is the correct HTML for creating a numbered list?", 'D');
        addQuestion(4,  quiz,"Q4", "Which HTML element is used to define the title of a document?", 'D');
        addQuestion(5,  quiz,"Q5", "What does the <img> tag stand for in HTML?", 'A');
    }

    public void addHtmlMediumQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(6,  quiz,"Q1", "Which HTML tag is used to create a table?", 'A');
        addQuestion(7,  quiz,"Q2", "What is the correct HTML for inserting an image?", 'D');
        addQuestion(8,  quiz,"Q3", "Which tag is used to create a hyperlink to an email address?", 'D');
        addQuestion(9,  quiz,"Q4", "How can you make a text input field required in HTML5?", 'A');
        addQuestion(10,  quiz,"Q5", "Which attribute is used to specify an alternate text for an image, if the image cannot be displayed?", 'A');
    }

    public void addHtmlHardQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(11,  quiz,"Q1", "How can you create a comment in HTML?", 'A');
        addQuestion(12,  quiz,"Q2", "What is the purpose of the <aside> element in HTML5?", 'A');
        addQuestion(13,  quiz,"Q3", "Which HTML5 attribute is used to specify the keyboard shortcut for an element?", 'D');
        addQuestion(14,  quiz,"Q4", "What is the purpose of the <footer> element in HTML5?", 'D');
        addQuestion(15,  quiz,"Q5", "Which HTML5 attribute is used to specify the primary language of the content in a web page?", 'A');
    }
    
    public void addCssEasyQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(16,  quiz,"Q1", "Which CSS property is used to change the text color of an element?", 'A');
        addQuestion(17,  quiz,"Q2", "What does CSS stand for?", 'A');
        addQuestion(18,  quiz,"Q3", "How can you include CSS in an HTML document?", 'A');
        addQuestion(19,  quiz,"Q4", "Which CSS property is used to set the background color of an element?", 'A');
        addQuestion(20,  quiz,"Q5", "What does the CSS property `display: none;` do?", 'A');
    }

    public void addCssMediumQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(21,  quiz,"Q1", "How can you center align a block-level element horizontally in CSS?", 'C');
        addQuestion(22,  quiz,"Q2", "What is the CSS property used to control the spacing between lines of text?", 'A');
        addQuestion(23,  quiz,"Q3", "What is the correct CSS syntax for specifying multiple font families?", 'A');
        addQuestion(24,  quiz,"Q4", "Which CSS property is used to control the size of the text?", 'D');
        addQuestion(25,  quiz,"Q5", "What is the purpose of the CSS property `position: relative;`?", 'A');
    }

    public void addCssHardQuestions(Quizzes quiz) {
        System.out.println("Using quizId: " + quiz.getQuizId());

        addQuestion(26,  quiz,"Q1", "What is the purpose of the CSS property `z-index`?", 'B');
        addQuestion(27,  quiz,"Q2", "What is the CSS pseudo-class used to select elements when they are being hovered over?", 'A');
        addQuestion(28,  quiz,"Q3", "What is the purpose of the CSS property `box-sizing: border-box;`?", 'B');
        addQuestion(29,  quiz,"Q4", "What does the CSS property `overflow: hidden;` do?", 'A');
        addQuestion(30,  quiz,"Q5", "What is the purpose of the CSS property `flex-grow`?", 'C');
    }
    
    
    private void addQuestion(int quesId, Quizzes quiz, String questionNo,  String questionText, char correctOptions) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            
                Questions question = new Questions(quesId, quiz, questionNo, questionText,correctOptions);
                session.save(question);
                transaction.commit();
                System.out.println(quiz + " questions added successfully!");
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public final List<Questions> fetchQuestionsForQuiz(char quizId) {
        try (Session session = sessionFactory.openSession()) {
            // Perform database query to fetch questions for the given quiz ID
            List<Questions> questions = session.createQuery("FROM Questions WHERE Quizzes.quizId = :quizId", Questions.class)
                                                .setParameter("quizId", quizId)
                                                .list();
            return questions;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Questions> findQuestionById(int questionId) {
        try (Session session = sessionFactory.openSession()) {
            // Perform database query to fetch questions for the given quiz ID
            List<Questions> questions = session.createQuery("FROM Questions WHERE Questions.questionId = :questionId", Questions.class)
                                                .setParameter("questionId", questionId)
                                                .list();
            return questions;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
	/*
	 * private Questions findQuestionById(List<Questions> questions, int questionId)
	 * { for (Questions question : questions) { if (question.getQuestionId() ==
	 * questionId) { return question; } } return null; // Return null if the
	 * question with the given ID is not found }
	 */


    // Internal method to display questions for a specific quiz ID
	
	/*
	 * public void displayQuestionsForQuiz(char quizId) { try (Session session =
	 * sessionFactory.openSession()) { List<Questions> questions
	 * =session.createQuery("FROM Questions WHERE quiz.quizId = :quizId",Questions.
	 * class) .setParameter("quizId", quizId) .list(); if (questions.isEmpty()){
	 * System.out.println("No questions found for the quiz with ID: " + quizId); }
	 * else { System.out.println("Questions for Quiz ID " + quizId + ":");
	 * for(Questions question : questions) { System.out.println("Question Number: "
	 * +question.getQuestionNo()); System.out.println("Question Text: "
	 * +question.getQuestionText()); List<Options> options = question.getOptions();
	 * if (options != null && !options.isEmpty()) { System.out.println("Options:");
	 * for (Options option : options) { System.out.println(option); } }
	 * System.out.println("-------------------"); } } } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	 
    
}
