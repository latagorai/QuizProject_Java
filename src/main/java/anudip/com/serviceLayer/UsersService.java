package anudip.com.serviceLayer;


import anudip.com.DaoLayer.UsersDAO;

public class UsersService {

    private final UsersDAO usersDao;

    public UsersService() {
        this.usersDao = new UsersDAO();
    }

	
	  public void addUser() {
		  usersDao.addUser(); 
		  
	  }
	 

    public void displayUserDetails() {
    	
        usersDao.displayUserDetails();
        
    }
    
}
