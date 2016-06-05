/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of IUserController.
 * 
 * @author Aouissaoui
 */
public interface IUserController {
	// Start of user code (user defined attributes for IUserController)

	public String getUserName(String userLogin);
	public String getUserClass(String userLogin, String userPwd);
	public int getStudentGroup(String studentLogin);
	public boolean addAdmin(String adminLogin, String newAdminlogin,int adminID, String firstname, String surname, String pwd);
	public boolean addTeacher(String adminLogin, String newteacherLogin,int teacherID, String firstname, String surname, String pwd);
	public boolean addStudent(String adminLogin, String newStudentLogin,int studentID, String firstname, String surname, String pwd);
	public boolean removeUser(String adminLogin, String userLogin);
	public boolean addGroup(String adminLogin, int groupId);
	public boolean removeGroup(String adminLogin, int groupId);
	public boolean associateStudToGroup(String adminLogin, String studentLogin, int groupId);
	public String[] usersToString();
	public String[] usersLoginToString();
	public String[] studentsLoginToString();
	public String[] groupsIdToString();
	 
		public String[] groupsToString();
		
		/**
		 * Fonction chargeant la base de donnée contenue dans un fichier XML.
		 * @return
		 * 		Un boolean indiquant si le chargement a bien été réalisée.
		 */
		public boolean loadDB();
		/**
		 * Fonction sauvegardant la base de donnée dans un fichier XML.
		 * @return
		 * 		Un boolean indiquant si la sauvegarde a bien été réalisée.
		 */
		public boolean saveDB();
	// End of user code

	// Start of user code (user defined methods for IUserController)

	// End of user code

}
