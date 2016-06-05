/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Teacher.
 * 
 * @author Aouissaoui
 */

@XmlRootElement(name = "Teacher")
@XmlType(propOrder = { "userLogin", "userId", "firstName", "lastName", "userPwd" })

public class Teacher extends User {
	/**
	 * Description of the property teacherId.
	 */
	private int teacherId;

	/**
	 * The constructor.
	 */
	public Teacher(String userLogin, String lastName, String firstName, String userPwd, int userId) {
		// Start of user code constructor for Teacher)
		super(userLogin, lastName, firstName, userPwd, userId, "Teacher");
		// End of user code
	}

	/**
	 * @return the teacherId
	 */
	public int getTeacherId() {
		return teacherId;
	}

	/**
	 * @param teacherId
	 *            the teacherId to set
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

}
