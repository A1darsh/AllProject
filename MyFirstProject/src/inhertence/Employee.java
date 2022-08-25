package inhertence;

public class Employee {
	private int id;
	private int age;
	private String name;

	public Employee() {
		super();
	}

	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
