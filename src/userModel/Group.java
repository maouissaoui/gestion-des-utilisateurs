/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Groupe.
 * 
 * @author Aouissaoui
 */
public class Group {
	/**
	 * Description of the property groupeId.
	 */
	private int groupId;
	ArrayList<Student> ListStudents;

	/**
	 * The constructor.
	 */
	public Group(int groupId) {
		this.groupId=groupId;
		this.ListStudents = new ArrayList<Student>();	// End of user code
	}

	
	/**
	 * Returns groupeId.
	 * @return groupeId 
	 */
	public int getGroupId() {
		return this.groupId;
	}

	/**
	 * Sets a value to attribute groupeId. 
	 * @param newGroupeId 
	 */
	public void setGroupId(int newGroupId) {
		this.groupId = newGroupId;
	}

	public boolean addStudent(Student student){
		this.ListStudents.add(student);
		return true;
	}
	
	public void removeStudent(String studentLogin){
		for(int i=0;i<this.ListStudents.size();i++){
			if(this.ListStudents.get(i).getUserLogin().equals(studentLogin))
				this.ListStudents.remove(i);
		}
	}
	public String toString(){
		String groupes="Group "+String.valueOf(this.groupId)+" | Students : ";
		for(int i=0;i<this.ListStudents.size();i++){
			groupes+=this.ListStudents.get(i).getUserLogin()+" ";
		}
		return groupes;
	}

	public ArrayList<Student> getListStudents() {
		return ListStudents;
	}

	public void setListStudents(ArrayList<Student> listStudents) {
		ListStudents = listStudents;
	}
	
}
