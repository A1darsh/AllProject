
public class Student {
	private int studentId;
	private String studentName;
	private int studentAge;
	private Department department;
	
	
	
	public Student(int studentId, String  studentName, int studentAge,Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.department=department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
		return ""+studentId+" "+studentName+" "+studentAge+" "+department;
	}
	
}
