package anudip.com.serviceLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import anudip.com.DaoLayer.QuestionsDAO;
import anudip.com.entitiesLayer.Quizzes;


public class QuestionsService {

    private final QuestionsDAO questionsDAO;

    public QuestionsService() {
        this.questionsDAO = new QuestionsDAO();
    }
 //Method to add questions
    public void addQuestionsInDB() {

    	// Create an instance of QuestionsDAO
        QuestionsDAO questionsDAO = new QuestionsDAO();

        // Create instances of Quizzes for HTML and CSS
        Quizzes htmlEasyQuiz = new Quizzes('A', "HTML", "Easy");
        Quizzes htmlMediumQuiz = new Quizzes('B', "HTML", "Medium");
        Quizzes htmlHardQuiz = new Quizzes('C', "HTML", "Hard");
        Quizzes cssEasyQuiz = new Quizzes('D', "CSS", "Easy");
        Quizzes cssMediumQuiz = new Quizzes('E', "CSS", "Medium");
        Quizzes cssHardQuiz = new Quizzes('F', "CSS", "Hard");

        // Call the methods to add HTML questions
        questionsDAO.addHtmlEasyQuestions(htmlEasyQuiz);
        questionsDAO.addHtmlMediumQuestions(htmlMediumQuiz);
        questionsDAO.addHtmlHardQuestions(htmlHardQuiz);

        // Call the methods to add CSS questions
        questionsDAO.addCssEasyQuestions(cssEasyQuiz);
        questionsDAO.addCssMediumQuestions(cssMediumQuiz);
        questionsDAO.addCssHardQuestions(cssHardQuiz);
    }
    

	/*
	 * // Method to display all questions for List<Character> quizIds =
	 * Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
	 * 
	 * public void displayQuestions(List<Character> quizIds) { for (char quizId :
	 * quizIds) { questionsDAO.displayQuestionsForQuiz(quizId); } }
	 */


	
	/*
	 * public void displayQuestionsForSelectedQuiz() {
	 * System.out.println("Enter the quizId : A, B, C, D, E, F "); List<Character>
	 * userAnswerA = new ArrayList<>(); List<Character> userAnswerB = new
	 * ArrayList<>(); List<Character> userAnswerC = new ArrayList<>();
	 * List<Character> userAnswerD = new ArrayList<>(); List<Character> userAnswerE
	 * = new ArrayList<>(); List<Character> userAnswerF = new ArrayList<>();
	 * 
	 * Scanner scanner = new Scanner(System.in); String answers =
	 * scanner.nextLine(); for (char quizId : quizIds) { switch (quizId) { case 'A':
	 * questionsDAO.displayQuestionsForQuiz('A'); break; case 'B':
	 * questionsDAO.displayQuestionsForQuiz('B'); break; case 'C':
	 * questionsDAO.displayQuestionsForQuiz('C'); break; case 'D':
	 * questionsDAO.displayQuestionsForQuiz('D'); break; case 'E':
	 * questionsDAO.displayQuestionsForQuiz('E'); break; case 'F':
	 * questionsDAO.displayQuestionsForQuiz('F'); break; default:
	 * System.out.println("Invalid quiz ID: " + quizId); } } scanner.close(); }
	 */
	 
}

