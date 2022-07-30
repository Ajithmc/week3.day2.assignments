package org.studentdetails;

public class Students {
	public void getStudentInfo(int id) {
		

	}
	
	public void getStudentInfo(int id, String name){
		
		
	}
	
public void getStudentInfo(String email , float phonenum){
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students();
		stud.getStudentInfo(7014758);
		stud.getStudentInfo(7014758, "Ajith");
		stud.getStudentInfo("ajithak@gmail.com", 9876543210f);
	}

}
