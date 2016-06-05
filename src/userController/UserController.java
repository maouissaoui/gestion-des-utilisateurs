/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userController;

import userModel.UserDB;

// End of user code

/**
 * Description of UserController.
 * 
 * @author Aouissaoui
 */
public class UserController implements IUserController {
	/**
	 * Description of the property userDB.
	 */
	public UserDB userDB = null;

	// Start of user code (user defined attributes for UserController)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserController(String userfile) {
		// Start of user code constructor for UserController)
		UserDB userDB = new UserDB(userfile);
		this.setUserDB(userDB);
		// super();

		// End of user code
	}

	// Start of user code (user defined methods for UserController)
	@Override
	public String getUserName(String userLogin) {
		return userDB.getUserName(userLogin);
	}

	@Override
	public String getUserClass(String userLogin, String userPwd) {
		return userDB.getUserClass(userLogin, userPwd);
	}

	@Override
	public int getStudentGroup(String studentLogin) {
		return userDB.getStudentGroup(studentLogin);
	}

	@Override
	public boolean addAdmin(String adminLogin, String newAdminLogin, int adminId, String firstName, String lastName,
			String userPwd) {
		return userDB.addAdmin(adminLogin, newAdminLogin, adminId, firstName, lastName, userPwd);
	}

	@Override
	public boolean addTeacher(String adminLogin, String newTeacherLogin, int teacherId, String firstName,
			String lastName, String userPwd) {
		return userDB.addTeacher(adminLogin, newTeacherLogin, teacherId, firstName, lastName, userPwd);
	}

	@Override
	public boolean addStudent(String adminLogin, String newStudentLogin, int studentID, String firstName,
			String lastName, String userPwd) {
		return userDB.addStudent(adminLogin, newStudentLogin, studentID, firstName, lastName, userPwd);
	}

	@Override
	public boolean removeUser(String adminLogin, String userLogin) {
		return userDB.removeUser(adminLogin, userLogin);
	}

	@Override
	public boolean addGroup(String adminLogin, int groupId) {
		return userDB.addGroup(adminLogin, groupId);
	}

	@Override
	public boolean removeGroup(String adminLogin, int groupId) {
		return userDB.removeGroup(adminLogin, groupId);
	}

	@Override
	public boolean associateStudToGroup(String adminLogin, String studentLogin, int groupId) {
		return userDB.associateStudToGroup(adminLogin, studentLogin, groupId);
	}

	@Override
	public String[] usersToString() {
		return userDB.usersToString();
	}

	@Override
	public String[] usersLoginToString() {
		return userDB.usersLoginToString();
	}

	@Override
	public String[] studentsLoginToString() {
		return userDB.studentsLoginToString();
	}

	@Override
	public String[] groupsIdToString() {
		return userDB.groupsIdToString();
	}

	@Override
	public String[] groupsToString() {
		return userDB.groupsToString();
	}

	@Override
	public boolean loadDB() {
		return userDB.loadDB();
	}

	@Override
	public boolean saveDB() {
		return userDB.save();
	}

	public UserDB getUserDB() {
		return userDB;
	}

	public void setUserDB(UserDB userDB) {
		this.userDB = userDB;
	}
	}
