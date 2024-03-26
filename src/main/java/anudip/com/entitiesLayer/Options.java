package anudip.com.entitiesLayer;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name ="Options")
public class Options {
	@Id
	@Column(name = "optionId")
    private int optionId;

	@ManyToOne
	@JoinColumn(name = "questionId")
	private Questions question;


    @Column(name = "optionNo")
    private char optionNo;
    
    @Column(name = "optionText")
    private String optionText;

    @Column(name = "isCorrect")
    private boolean isCorrect;

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	public char getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(char optionNo) {
		this.optionNo = optionNo;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Options(int optionId, Questions question, char optionNo, String optionText, boolean isCorrect) {
		super();
		this.optionId = optionId;
		this.question = question;
		this.optionNo = optionNo;
		this.optionText = optionText;
		this.isCorrect = isCorrect;
	}

	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
