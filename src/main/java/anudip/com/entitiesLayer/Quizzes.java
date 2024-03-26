package anudip.com.entitiesLayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quizzes {
	@Id
	private char quizId;
	@Column
	private String category;
	@Column
	private String difficulty;
	
	public char getQuizId() {
		return quizId;
	}
	public void setQuizId(char quizId) {
		this.quizId = quizId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public Quizzes(char quizId, String category, String difficulty) {
		super();
		this.quizId = quizId;
		this.category = category;
		this.difficulty = difficulty;
	}
	public Quizzes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
