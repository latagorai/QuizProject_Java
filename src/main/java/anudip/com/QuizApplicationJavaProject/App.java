package anudip.com.QuizApplicationJavaProject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import anudip.com.serviceLayer.OptionsService;
import anudip.com.serviceLayer.QuestionsService;
import anudip.com.serviceLayer.QuizzesService;
import anudip.com.serviceLayer.UsersService;

public class App 
{
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	UsersService usersService = new UsersService();

        // Get user details
        System.out.println("Welcome to the Quiz Application!");
        usersService.addUser();
        askForUserIdAndStartQuiz();
        /*
		 * String username = getUserDetails(); int userId = getUserId();
		 * 
		 * // Play quiz playQuiz(username, userId);
		 * }
		 */
    

	
	 /* private static String getUserDetails() {
	  System.out.print("Enter your username: "); return scanner.nextLine(); }
	  
	  private static int getUserId() { System.out.print("Enter your userId: ");
	 return scanner.nextInt();
    }*/

	/*
	 * private static void playQuiz(String username, int userId) {
	 * 
	 * 
	 * 
	 * // Prompt user to select a quiz
	 * System.out.print("Select a quiz ID or 'X' to exit: "); char quizId =
	 * scanner.next().charAt(0);
	 * 
	 * // Display questions for the selected quiz displayQuestionsForQuiz(quizId,
	 * username, userId); }
	 */
    }
    private static void askForUserIdAndStartQuiz() {
        // Retrieve and display questions for the selected quiz
        // Use your existing logic to display questions and options
        // Pass username and userId to display alongside the questions
    
    	//UsersService usersService = new UsersService();
    	//QuizzesService quizzesService = new QuizzesService();
    	//QuestionsService questionsService = new QuestionsService();

       // Add a user
        //usersService.addUser();

        // Display all users
        //usersService.displayUserDetails();
        
     // Display all quiz Details
       // quizzesService.quizDisplay();
        
        
        OptionsService.askForQuizAndDisplayQuestionsOptions();
        
    	
    }
}
