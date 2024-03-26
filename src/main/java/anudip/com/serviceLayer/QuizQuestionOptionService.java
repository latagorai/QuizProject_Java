package anudip.com.serviceLayer;


import anudip.com.DaoLayer.QuizzesDAO;


public class QuizQuestionOptionService {
	public static void main(String []args) {
		
		QuizzesDAO quizzesDAO = new QuizzesDAO();
		QuestionsService questionService = new QuestionsService();
        OptionsService optionsService = new OptionsService();
        
        quizzesDAO.addQuizzes();
        questionService.addQuestionsInDB();
        optionsService.addOptionsInDB();
	}
}
