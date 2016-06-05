/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author Aouissaoui
 */
public abstract class User {
	
	/**
	 * Description of the property userLogin.
	 */
	private String userLogin="" ;
	
	/**
	 * Description of the property firstName.
	 */
	private String firstName ="" ;
	
	/**
	 * Description of the property lastName.
	 */
	private String lastName ="";
	
	/**
	 * Description of the property userPwd.
	 */
	private String userPwd="";
	/**
	 * Description of the property userId.
	 */
	private int userId;
	/**
	 * Description of the property type.
	 */
	private String type;

	// Start of user code (user defined attributes for User)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public User(){
	}
	/**
	 * The constructor with arguments.
	 */
	public User(String userLogin,String firstName,String lastName,String userPwd,int userId , String type) {
		
		this.userLogin=userLogin;
		this.firstName=firstName;
		this.lastName=lastName;
		this.userPwd=userPwd;
		this.userId=userId;
		this.type=type;

	}
	
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the userLogin
	 */
	public String getUserLogin() {
		return userLogin;
	}
	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
public String toString(){
	return this.firstName+"|"+this.lastName+this.userLogin+"|"+this.userPwd+"|"+this.userId+"|"+this.type;
}



}
