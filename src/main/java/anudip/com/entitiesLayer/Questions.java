package anudip.com.entitiesLayer;

import java.util.List;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToMany;


@Entity(name = "Questions")
public class Questions {
	@Id
	@Column(name = "questionId")
    private int questionId;
	
    @ManyToOne
    @JoinColumn(name = "quizId")
    private Quizzes quiz;
    
    @Column(name = "questionNo")
    private String questionNo;
    
    
    @Column(name = "questiontext")
    private String questionText;
    
	
	@OneToMany(mappedBy = "question") 
	private List<Options> options;
	 
    @Column(name = "correctOptions")
    private char correctOptions;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public Quizzes getQuiz() {
		return quiz;
	}

	public void setQuiz(Quizzes quiz) {
		this.quiz = quiz;
	}

	public String getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	
	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	
	
	  public List<Options> getOptions() { return options; }
	  
	  public void setOptions(List<Options> options) { this.options = options; }
	 

	public char getCorrectOptions() {
        return correctOptions;
    }
	
	public void setCorrectOptions(char correctOptions) {
        this.correctOptions = correctOptions;
    }

	public Questions(int questionId, Quizzes quiz, String questionNo,String questionText, char correctOptions) {
		super();
		this.questionId = questionId;
		this.quiz = quiz;
		this.questionNo = questionNo;
		this.questionText = questionText;
		this.correctOptions = correctOptions;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
