package anudip.com.serviceLayer;

import anudip.com.DaoLayer.QuizzesDAO;

public class QuizzesService {

    private final QuizzesDAO quizDAO;

    public QuizzesService() {
        this.quizDAO = new QuizzesDAO();
    }

    public void quizDisplay() {
        quizDAO.quizDisplay();
    }

    public void selectQuiz() {
        quizDAO.selectQuiz();
    }
}
