package filehandeling;

import java.io.Serializable;

public class Student implements Serializable{
	private int studentId;
	private String studentName;
	private int studentAge;
	
	
	public Student(int studentId, String  studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String toString(){
		return ""+studentId+" "+studentName+" "+studentAge;
	}
	
}

