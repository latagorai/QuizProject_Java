package anudip.com.serviceLayer;

import java.util.Scanner;

import anudip.com.DaoLayer.OptionsDAO;
import anudip.com.entitiesLayer.Questions;
import anudip.com.entitiesLayer.Quizzes;

public class OptionsService {
	
	public void addOptionsInDB() {
		Quizzes htmlEasyQuiz = new Quizzes('A', "HTML", "Easy");
        Quizzes htmlMediumQuiz = new Quizzes('B', "HTML", "Medium");
        Quizzes htmlHardQuiz = new Quizzes('C', "HTML", "Hard");
        Quizzes cssEasyQuiz = new Quizzes('D', "CSS", "Easy");
        Quizzes cssMediumQuiz = new Quizzes('E', "CSS", "Medium");
        Quizzes cssHardQuiz = new Quizzes('F', "CSS", "Hard");
        // Create an instance of OptionsDAO
        OptionsDAO optionsDAO = new OptionsDAO();
        

       

     // Create instances of Questions for HTML and CSS
        Questions htmlEasyOptions1 = new Questions(1, htmlEasyQuiz ,"Q1", "What does HTML stand for?", 'B');
        Questions htmlEasyOptions2 = new Questions(2,  htmlEasyQuiz,"Q2", "Which tag is used to create a hyperlink in HTML?", 'D');
        Questions htmlEasyOptions3 = new Questions(3,  htmlEasyQuiz,"Q3", "What is the correct HTML for creating a numbered list?", 'D');
        Questions htmlEasyOptions4 = new Questions(4,  htmlEasyQuiz,"Q4", "Which HTML element is used to define the title of a document?", 'D');
        Questions htmlEasyOptions5 = new Questions(5,  htmlEasyQuiz,"Q5", "What does the <img> tag stand for in HTML?", 'A');
        
        Questions htmlMediumOptions6 = new Questions(6,  htmlMediumQuiz,"Q1", "Which HTML tag is used to create a table?", 'A');
        Questions htmlMediumOptions7 = new Questions(7,  htmlMediumQuiz,"Q2", "What is the correct HTML for inserting an image?", 'D');
        Questions htmlMediumOptions8= new Questions(8,  htmlMediumQuiz,"Q3", "Which tag is used to create a hyperlink to an email address?", 'D');
        Questions htmlMediumOptions9 = new Questions(9,  htmlMediumQuiz,"Q4", "How can you make a text input field required in HTML5?", 'A');
        Questions htmlMediumOptions10 = new Questions(10,  htmlMediumQuiz,"Q5", "Which attribute is used to specify an alternate text for an image, if the image cannot be displayed?", 'A');

        Questions htmlHardOptions11 = new Questions(11,  htmlHardQuiz,"Q1", "How can you create a comment in HTML?", 'A');
        Questions htmlHardOptions12 = new Questions(12,  htmlHardQuiz,"Q2", "What is the purpose of the <aside> element in HTML5?", 'A');
        Questions htmlHardOptions13 = new Questions(13,  htmlHardQuiz,"Q3", "Which HTML5 attribute is used to specify the keyboard shortcut for an element?", 'D');
        Questions htmlHardOptions14 = new Questions(14,  htmlHardQuiz,"Q4", "What is the purpose of the <footer> element in HTML5?", 'D');
        Questions htmlHardOptions15 = new Questions(15,  htmlHardQuiz,"Q5", "Which HTML5 attribute is used to specify the primary language of the content in a web page?", 'A');

        Questions cssEasyOptions16 = new Questions(16,  cssEasyQuiz,"Q1", "Which CSS property is used to change the text color of an element?", 'A');
        Questions cssEasyOptions17 = new Questions(17,  cssEasyQuiz,"Q2", "What does CSS stand for?", 'A');
        Questions cssEasyOptions18 = new Questions(18,  cssEasyQuiz,"Q3", "How can you include CSS in an HTML document?", 'A');
        Questions cssEasyOptions19 = new Questions(19,  cssEasyQuiz,"Q4", "Which CSS property is used to set the background color of an element?", 'A');
        Questions cssEasyOptions20 = new Questions(20,  cssEasyQuiz,"Q5", "What does the CSS property `display: none;` do?", 'A');

        Questions cssMediumOptions21 = new Questions(21,  cssMediumQuiz,"Q1", "How can you center align a block-level element horizontally in CSS?", 'C');
        Questions cssMediumOptions22 = new Questions(22,  cssMediumQuiz,"Q2", "What is the CSS property used to control the spacing between lines of text?", 'A');
        Questions cssMediumOptions23 = new Questions(23,  cssMediumQuiz,"Q3", "What is the correct CSS syntax for specifying multiple font families?", 'A');
        Questions cssMediumOptions24 = new Questions(24,  cssMediumQuiz,"Q4", "Which CSS property is used to control the size of the text?", 'D');
        Questions cssMediumOptions25 = new Questions(25,  cssMediumQuiz,"Q5", "What is the purpose of the CSS property `position: relative;`?", 'A');

        Questions cssHardOptions26 = new Questions(26,  cssHardQuiz,"Q1", "What is the purpose of the CSS property `z-index`?", 'B');
        Questions cssHardOptions27 = new Questions(27,  cssHardQuiz,"Q2", "What is the CSS pseudo-class used to select elements when they are being hovered over?", 'A');
        Questions cssHardOptions28 = new Questions(28,  cssHardQuiz,"Q3", "What is the purpose of the CSS property `box-sizing: border-box;`?", 'B');
        Questions cssHardOptions29 = new Questions(29,  cssHardQuiz,"Q4", "What does the CSS property `overflow: hidden;` do?", 'A');
        Questions cssHardOptions30 = new Questions(30,  cssHardQuiz,"Q5", "What is the purpose of the CSS property `flex-grow`?", 'C');

        
        // Call the appropriate method to add options
        optionsDAO.addEasyHtmlOptions1(htmlEasyOptions1);
        optionsDAO.addEasyHtmlOptions2(htmlEasyOptions2);
        optionsDAO.addEasyHtmlOptions3(htmlEasyOptions3);
        optionsDAO.addEasyHtmlOptions4(htmlEasyOptions4);
        optionsDAO.addEasyHtmlOptions5(htmlEasyOptions5);
        
        optionsDAO.addMediumHtmlOptions6(htmlMediumOptions6);
        optionsDAO.addMediumHtmlOptions7(htmlMediumOptions7);
        optionsDAO.addMediumHtmlOptions8(htmlMediumOptions8);
        optionsDAO.addMediumHtmlOptions9(htmlMediumOptions9);
        optionsDAO.addMediumHtmlOptions10(htmlMediumOptions10);
        
        optionsDAO.addHardHtmlOptions11(htmlHardOptions11);
        optionsDAO.addHardHtmlOptions12(htmlHardOptions12);
        optionsDAO.addHardHtmlOptions13(htmlHardOptions13);
        optionsDAO.addHardHtmlOptions14(htmlHardOptions14);
        optionsDAO.addHardHtmlOptions15(htmlHardOptions15);
        
        optionsDAO.addEasyCssOptions16(cssEasyOptions16);
        optionsDAO.addEasyCssOptions17(cssEasyOptions17);
        optionsDAO.addEasyCssOptions18(cssEasyOptions18);
        optionsDAO.addEasyCssOptions19(cssEasyOptions19);
        optionsDAO.addEasyCssOptions20(cssEasyOptions20);
        
        optionsDAO.addMediumCssOptions21(cssMediumOptions21);
        optionsDAO.addMediumCssOptions22(cssMediumOptions22);
        optionsDAO.addMediumCssOptions23(cssMediumOptions23);
        optionsDAO.addMediumCssOptions24(cssMediumOptions24);
        optionsDAO.addMediumCssOptions25(cssMediumOptions25);
        
        optionsDAO.addHardCssOptions26(cssHardOptions26);
        optionsDAO.addHardCssOptions27(cssHardOptions27);
        optionsDAO.addHardCssOptions28(cssHardOptions28);
        optionsDAO.addHardCssOptions29(cssHardOptions29);
        optionsDAO.addHardCssOptions30(cssHardOptions30);
    }
	
	public static void askForQuizAndDisplayQuestionsOptions() {
		final OptionsDAO optionsDAO1 = new OptionsDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("\n Quiz IDs :");
        	System.out.println("Quiz ID: A[HTML , easy]\tQuiz ID: B[HTML , medium]\tQuiz ID: C[HTML , hard] ");
        	System.out.println("Quiz ID: D[CSS , easy] \tQuiz ID: E[CSS , medium] \tQuiz ID: D[CSS , hard] \n");            char quizId = scanner.next().charAt(0);
            System.out.print("Select a quiz ID or 'X' to exit: ");

            switch (quizId) {
                case 'A':
                	optionsDAO1.displayQuestionsForQuiz('A');
                    break;
                case 'B':
                	optionsDAO1.displayQuestionsForQuiz('B');
                    break;
                case 'C':
                	optionsDAO1.displayQuestionsForQuiz('C');
                    break;
                case 'D':
                	optionsDAO1.displayQuestionsForQuiz('D');
                    break;
                case 'E':
                	optionsDAO1.displayQuestionsForQuiz('E');
                    break;
                case 'F':
                	optionsDAO1.displayQuestionsForQuiz('F');
                    break;
                case 'X':
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid quiz ID. Please enter a valid option.");
            }
        }
    }
	
}
