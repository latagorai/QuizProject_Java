package anudip.com.entitiesLayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Result {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY for auto-increment
	private int resultId;
	
	@ManyToOne
	@JoinColumn(name = "UserId")
	private Users user;
	
	@OneToOne
	@JoinColumn(name = "quizId")
	private Quizzes quizzes;
	
	@Column(name = "score")
	private int score;
	
	@Column(name = "percentage")
	private double percentage;
	
	@Column(name = "comment")
	private String comment;
	
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Quizzes getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(Quizzes quizzes) {
		this.quizzes = quizzes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Result(int resultId, Users user, Quizzes quizzes, int score, double percentage, String comment) {
		super();
		this.resultId = resultId;
		this.user = user;
		this.quizzes = quizzes;
		this.score = score;
		this.percentage = percentage;
		this.comment = comment;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
