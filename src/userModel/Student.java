/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)


/**
 * Description of Student .
 * 
 * @author Aouissaoui
 */
public class Student  extends User {
	/**
	 * Description of the property studentId.
	 */
	private int groupId ;

	
	
	/**
	 * The constructor.
	 */
	public Student(String userLogin, String lastName, String firstName, String userPwd, int userId) {
		super(userLogin, lastName, firstName, userPwd, userId, "Student");
		this.groupId = -1;
	}
	
	public Student(String userLogin, String lastName, String firstName, String userPwd, int userId,int groupId) {
		super(userLogin, lastName, firstName, userPwd, userId, "Student");
		this.groupId = groupId;
	}


	
	// Start of user code (user defined methods for Student )
	
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	

	public final String toString() {
		return "Student : " + super.toString() + " | " + this.groupId ;
	}

	

}
