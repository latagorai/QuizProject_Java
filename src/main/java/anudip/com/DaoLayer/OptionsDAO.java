package anudip.com.DaoLayer;


import java.util.List;
import java.util.Scanner;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import anudip.com.entitiesLayer.Users;
import anudip.com.entitiesLayer.Options;
import anudip.com.entitiesLayer.Questions;

public class OptionsDAO {
	private final SessionFactory sessionFactory;

    public OptionsDAO() {
        this.sessionFactory = configureSessionFactory();
    }

    // Method to configure Hibernate and obtain SessionFactory
    private SessionFactory configureSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernat.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        return meta.getSessionFactoryBuilder().build();
    }

    

 // Adding HTML options
    public void addEasyHtmlOptions1(Questions question) {
        addOption(1, question, 'A', "Hyper Text Markup Language", false);
        addOption(2, question, 'B', "Hyperlink and Text Markup Language", true);
        addOption(3, question, 'C', "High Technology Markup Language", false);
        addOption(4, question, 'D', "Home Tool Markup Language", false);
    }
    public void addEasyHtmlOptions2(Questions question) {
        addOption(5, question, 'A', "<link>", false);
        addOption(6, question, 'B', "<a>", false);
        addOption(7, question, 'C', "<href>", false);
        addOption(8, question, 'D', "<hyperlink>", true);
    }
    public void addEasyHtmlOptions3(Questions question) {
        addOption(9, question, 'A', "<ol>", false);
        addOption(10, question, 'B', "<list>", false);
        addOption(11, question, 'C', "<ul>", false);
        addOption(12, question, 'D', "<li>", true);
    }
    public void addEasyHtmlOptions4(Questions question) {
        addOption(13, question, 'A', "<title>", false);
        addOption(14, question, 'B', "<head>", false);
        addOption(15, question, 'C', "<header>", false);
        addOption(16, question, 'D', "<meta>", true);
    }
    public void addEasyHtmlOptions5(Questions question) {
        addOption(17, question, 'A', "Image", true);
        addOption(18, question, 'B', "Input Method Group", false);
        addOption(19, question, 'C', "Internet Mail Group", false);
        addOption(20, question, 'D', "Inline Media Group", false);
    }
    public void addMediumHtmlOptions6(Questions question) {
        addOption(21, question, 'A', "<table>", true);
        addOption(22, question, 'B', "<tab>", false);
        addOption(23, question, 'C', "<tbl>", false);
        addOption(24, question, 'D', "<tr>", false);
    }
    public void addMediumHtmlOptions7(Questions question) {
        addOption(25, question, 'A', "<image src=\"image.jpg\">", false);
        addOption(26, question, 'B', "<img src=\"image.jpg\">", false);
        addOption(27, question, 'C', "<picture src=\"image.jpg\">", false);
        addOption(28, question, 'D', "<insert src=\"image.jpg\">", true);
    }
    public void addMediumHtmlOptions8(Questions question) {
        addOption(29, question, 'A', "<link>", false);
        addOption(30, question, 'B', "<mail>", false);
        addOption(31, question, 'C', "<email>", false);
        addOption(32, question, 'D', "<a>", true);
    }
    public void addMediumHtmlOptions9(Questions question) {
        addOption(33, question, 'A', "required=\"true\"", true);
        addOption(34, question, 'B', "validate=\"required\"", false);
        addOption(35, question, 'C', "input=\"required\"", false);
        addOption(36, question, 'D', "mandatory=\"yes\"", false);
    }
    public void addMediumHtmlOptions10(Questions question) {
        addOption(37, question, 'A', "alt", true);
        addOption(38, question, 'B', "title", false);
        addOption(39, question, 'C', "alttext", false);
        addOption(40, question, 'D', "description", false);
    }

    public void addHardHtmlOptions11(Questions question) {
        addOption(41, question, 'A', "<!-- This is a comment -->", true);
        addOption(42, question, 'B', "// This is a comment", false);
        addOption(43, question, 'C', "# This is a comment", false);
        addOption(44, question, 'D', "/* This is a comment */", false);
    }
    public void addHardHtmlOptions12(Questions question) {
        addOption(45, question, 'A', "To define additional content related to the main content", true);
        addOption(46, question, 'B', "To create a sidebar navigation", false);
        addOption(47, question, 'C', "To define an alternative content", false);
        addOption(48, question, 'D', "To represent a section of navigation links", false);
    }
    public void addHardHtmlOptions13(Questions question) {
        addOption(49, question, 'A', "shortcut", false);
        addOption(50, question, 'B', "key", false);
        addOption(51, question, 'C', "accesskey", false);
        addOption(52, question, 'D', "keypress", true);
    }
    public void addHardHtmlOptions14(Questions question) {
        addOption(53, question, 'A', "To define the main content of a web page", false);
        addOption(54, question, 'B', "To represent a section of navigation links", false);
        addOption(55, question, 'C', "To define additional content related to the main content", false);
        addOption(56, question, 'D', "To define the footer of a document or section", true);
    }
    public void addHardHtmlOptions15(Questions question) {
        addOption(57, question, 'A', "lang", true);
        addOption(58, question, 'B', "primary-language", false);
        addOption(59, question, 'C', "language", false);
        addOption(60, question, 'D', "locale", false);
    }

    // Adding CSS options
    public void addEasyCssOptions16(Questions question) {
        addOption(61, question, 'A', "color", true);
        addOption(62, question, 'B', "text-color", false);
        addOption(63, question, 'C', "font-color", false);
        addOption(64, question, 'D', "text-style", false);
    }
    public void  addEasyCssOptions17(Questions question) {
        addOption(65, question, 'A', "Cascading Style Sheets", true);
        addOption(66, question, 'B', "Creative Style Sheets", false);
        addOption(67, question, 'C', "Computer Style Sheets", false);
        addOption(68, question, 'D', "Colorful Style Sheets", false);
    }
    public void addEasyCssOptions18(Questions question) {
        addOption(69, question, 'A', "All of the above", true);
        addOption(70, question, 'B', "External stylesheet", false);
        addOption(71, question, 'C', "Inline styles", false);
        addOption(72, question, 'D', "Internal stylesheet", false);
    }
    public void addEasyCssOptions19(Questions question) {
        addOption(73, question, 'A', "background-color", true);
        addOption(74, question, 'B', "color", false);
        addOption(75, question, 'C', "bg-color", false);
        addOption(76, question, 'D', "background", false);
    }
    public void addEasyCssOptions20(Questions question) {
        addOption(77, question, 'A', "Hides the element", true);
        addOption(78, question, 'B', "Makes the element visible", false);
        addOption(79, question, 'C', "Changes the background color of the element", false);
        addOption(80, question, 'D', "Adds a border around the element", false);
    }

    public void addMediumCssOptions21(Questions question) {
        addOption(81, question, 'A', "text-align: center;", false);
        addOption(82, question, 'B', "align: center;", false);
        addOption(83, question, 'C', "margin: auto;", true);
        addOption(84, question, 'D', "float: center;", false);
    }
    public void addMediumCssOptions22(Questions question) {
        addOption(85, question, 'A', "line-height", true);
        addOption(86, question, 'B', "text-spacing", false);
        addOption(87, question, 'C', "line-spacing", false);
        addOption(88, question, 'D', "spacing", false);
    }
    public void addMediumCssOptions23(Questions question) {
        addOption(89, question, 'A', "font-family: Arial, Verdana, sans-serif;", true);
        addOption(90, question, 'B', "font-family: \"Arial\", \"Verdana\", sans-serif;", false);
        addOption(91, question, 'C', "font-family: Arial; Verdana; sans-serif;", false);
        addOption(92, question, 'D', "font-family: Arial; Verdana; sans-serif;", false);
    }
    public void addMediumCssOptions24(Questions question) {
        addOption(93, question, 'A', "font-size", false);
        addOption(94, question, 'B', "text-size", false);
        addOption(95, question, 'C', "text-scale", false);
        addOption(96, question, 'D', "font-scale", true);
    }
    public void addMediumCssOptions25(Questions question) {
        addOption(97, question, 'A', "Positions the element relative to its parent", true);
        addOption(98, question, 'B', "Makes the element invisible", false);
        addOption(99, question, 'C', "Removes the element from the document flow", false);
        addOption(100, question, 'D', "Floats the element to the right", false);
    }

    public void addHardCssOptions26(Questions question) {
        addOption(101, question, 'A', "Sets the opacity of an element", false);
        addOption(102, question, 'B', "Controls the stacking order of elements", true);
        addOption(103, question, 'C', "Adjusts the spacing between lines of text", false);
        addOption(104, question, 'D', "Changes the font size of an element", false);
    }
    public void addHardCssOptions27(Questions question) {
        addOption(105, question, 'A', ":hover", true);
        addOption(106, question, 'B', ":active", false);
        addOption(107, question, 'C', ":focus", false);
        addOption(108, question, 'D', ":hovered", false);
    }
    public void addHardCssOptions28(Questions question) {
        addOption(109, question, 'A', "Makes the element invisible", false);
        addOption(110, question, 'B', "Adds padding and border to the width and height of the element", true);
        addOption(111, question, 'C', "Centers the element horizontally", false);
        addOption(112, question, 'D', "Removes the element from the document flow", false);
    }
    public void addHardCssOptions29(Questions question) {
        addOption(113, question, 'A', "Hides the content that overflows the element's box", true);
        addOption(114, question, 'B', "Adds a shadow to the element", false);
        addOption(115, question, 'C', "Clips the content to the specified height and width", false);
        addOption(116, question, 'D', "Centers the element vertically", false);
    }
    public void addHardCssOptions30(Questions question) {
        addOption(117, question, 'A', "Specifies the width of a flex item", false);
        addOption(118, question, 'B', "Specifies the maximum number of flex lines", false);
        addOption(119, question, 'C', "Specifies how much a flex item should grow relative to the rest of the flex items", true);
        addOption(120, question, 'D', "Sets the direction of the flex container", false);
    }
    public void addOption(int optionId, Questions question, char optionNo, String optionText, boolean isCorrect) {
        try (Session session = sessionFactory.openSession()) {
            	Transaction transaction = session.beginTransaction();
                Options option = new Options(optionId, question, optionNo, optionText, isCorrect);
                session.save(option);
                transaction.commit();
                System.out.println("Option added successfully!");
                // Populate the options field in the Questions entity with correct options
                if (isCorrect) {
                    char correctOptions = question.getCorrectOptions();
                    if (correctOptions == '\0') {
                        correctOptions = optionNo;
                    } 
                    question.setCorrectOptions(correctOptions);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	
    public void displayOptionsForQuestion(int questionId) {
        try (Session session = sessionFactory.openSession()) {
            // Retrieve options based on the questionId
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Options> criteria = builder.createQuery(Options.class);
            Root<Options> root = criteria.from(Options.class);
            criteria.select(root).where(builder.equal(root.get("question").get("questionId"), questionId));
            List<Options> options = session.createQuery(criteria).getResultList();

            if (options != null && !options.isEmpty()) {
                // Display question details
                //System.out.println("Options for Question ID: " + questionId);

                // Display options
                for (Options option : options) {
                    System.out.print("" + option.getOptionNo());
                    System.out.println(" : " + option.getOptionText());
                    // Add other relevant information as needed
                    //char correctOption = question.getCorrectOptions();

                }
            } else {
                System.out.println("No options available for Question ID: " + questionId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void displayQuestionsForQuiz(char quizId) {
    	//UsersDAO usersDAO = new UsersDAO();
    	
    	int score = 0;
        Scanner scanner = new Scanner(System.in);
        try (Session session = sessionFactory.openSession()) {
            // Retrieve all questions associated with the given quizId
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Questions> criteria = builder.createQuery(Questions.class);
            Root<Questions> root = criteria.from(Questions.class);
            criteria.select(root).where(builder.equal(root.get("quiz").get("quizId"), quizId));
            List<Questions> questions = session.createQuery(criteria).getResultList();

            // Display questions

            if (questions != null && !questions.isEmpty()) {
                System.out.println("Questions for Quiz ID: " + quizId);
                for (Questions question : questions) {
                    //System.out.println("Question ID: " + question.getQuestionId());
                	
                    System.out.print(" " + question.getQuestionNo());
                    
                    System.out.println(" : " + question.getQuestionText());
                    // Display options for this question
                    displayOptionsForQuestion(question.getQuestionId());
                    char correctOption = question.getCorrectOptions();
                    System.out.println(": Enter your response (A, B, C, D):"); // Fixed index display
                    char userResponse = scanner.next().charAt(0);
                    if (userResponse == correctOption) {
                        score++;
                    }
                    System.out.println(); // Add a newline for readability
                }
             // Calculate percentage
                int totalQuestions = 5; // Assuming there are 5 questions for each quiz
                double percentage = (double) score / totalQuestions * 100;
                
                Users user = new Users();
                int userId = user.getUserId();
                resultsDAO resultsDAO = new resultsDAO();
				resultsDAO.addResult(userId, quizId, score, percentage);
                
                // Display results
				
				//resultsDAO.displayResult(usersId);
                //usersDAO.addUser();
				
				  System.out.println("Quiz ID: " + quizId); System.out.println("Score: " +
				  score + "/" + totalQuestions); System.out.println("Percentage: " +
				  String.format("%.2f", percentage) + "%");
				 


            } 
            else {
                System.out.println("No questions available for the given quizId.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    
    }
        
    }

