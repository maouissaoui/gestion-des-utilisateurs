/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.ArrayList;

import javax.swing.GroupLayout.Group;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Administrator.
 * 
 * @author Aouissaoui
 */
public class Administrator extends User {
	/**
	 * Description of the property adminId.
	 */
	private int adminId;

	/**
	 * The constructor.
	 */
//	public Administrator() {
//
//	}

	public Administrator(String userLogin, String firstName, String lastName, String userPwd, int adminId) {
		super(userLogin,firstName,lastName,userPwd,adminId, "Administrator");
	}
	
	
	/**
	 * Description of the method addAdmin.
	 */
	
	public Administrator addAdmin(String newlogin, String firstName, String lastName, String userPwd, int userId){
		return new Administrator(newlogin,firstName,lastName,userPwd,userId);
	}

	/**
	 * Description of the method addStudent.
	 */
	public Student addStudent(String newlogin, String firstName, String lastName, String userPwd, int userId){
		return new Student(newlogin,firstName,lastName,userPwd,userId);
	}

	
	/**
	 * Description of the method addGroup.
	 */
	public Teacher addTeacher(String newlogin, String firstName, String lastName, String userPwd, int userId){
		return new Teacher(newlogin,firstName,lastName,userPwd,userId);
	}
	/**
	 * Description of the method removeGroup.
	 */
	public boolean removeGroupe(int groupId,ArrayList<Group> ListGroup,ArrayList<User> ListUsers) {
		for(int j=0;j<ListGroup.size();j++){
			if(ListGroup.get(j).getGroupId()==groupId){
				for(int i=0;i<ListUsers.size();i++){	
					if(ListUsers.get(i).getType().equals("Student")){
						if(((Student) ListUsers.get(i)).getGroupId()==groupId)
							((Student) ListUsers.get(i)).setGroupId(-1);
					}
				}
				ListGroup.remove(j);
				return true;
			}
		}
		return false;
	}
	

	
	public ArrayList<User> removeUser(String userLogin,ArrayList<User> ListUsers,ArrayList<Group> ListGroup) {
		for(int i=0;i<ListUsers.size();i++){
			if(ListUsers.get(i).getUserLogin().equals(userLogin)){
				if(ListUsers.get(i).getType().equals("Student")){
					for(int j=0;j<ListGroup.size();j++){
						if(ListGroup.get(j).getGroupId()==((Student) ListUsers.get(i)).getGroupId())
							ListGroup.get(j).removeStudent(userLogin);
					}
				}
					
				ListUsers.remove(i);
				return ListUsers;
			}
		}
		return ListUsers;
	}
	
	public ArrayList<Group> addGroup(int ID, ArrayList<Group> ListGroup){
		ListGroup.add(new Group (ID));
		return ListGroup;
	}
	/**
	 * Description of the method associateStudToGroup.
	 */
	public boolean associateStudToGroup(String studentLogin, int groupId,ArrayList<Group> ListGroup,ArrayList<User> ListUsers){
		for(int j=0;j<ListGroup.size();j++){
			if(ListGroup.get(j).getGroupId()==groupId){
				for(int i=0;i<ListUsers.size();i++){	
					if(ListUsers.get(i).getUserLogin().equals(studentLogin)){
						((Student) ListUsers.get(i)).setGroupId(groupId);
						ListGroup.get(j).addStudent(((Student) ListUsers.get(i)));
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
	public int getAdminId() {
		return this.adminId;
	}

	/**
	 * Sets a value to attribute adminId.
	 * 
	 * @param newAdminId
	 */
	public void setAdminId(int newAdminId) {
		this.adminId = newAdminId;
	}


}
