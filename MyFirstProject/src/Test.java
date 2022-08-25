
import shape.Circle;
import shape.Rectange;


public class Test {
	public static void main(String[] args){

		Student s=new Student(5,"asdf",30,new Department(5,"wert"));
		System.out.println(s);
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentAge());
		System.out.println(s.getStudentName());
		
		System.out.println(s.getDepartment().getDepartmentId());
		System.out.println(s.getDepartment().getDepartmentName());
		Circle c=new Circle(3);
		System.out.println(c);
		System.out.println("the area of circle is :"+c.area());
		Rectange r=new Rectange(4,5);
		System.out.println("the area of rectangle is:"+r.area());
		System.out.println(r);
	}
}
