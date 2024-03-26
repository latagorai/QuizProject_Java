package anudip.com.entitiesLayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY for auto-increment
	@Column(name = "userId")
    private int userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "emailId")
    private String emailId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Users(int userId, String userName, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
