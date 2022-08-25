package packageB;

public class Employee implements Cloneable{
		private int id;
		private String name;
		
		
		public Employee() {
			super();
		}
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		public static void main(String[] args) throws CloneNotSupportedException {
			Employee e1=new Employee(3,"asdf");
			Employee e2=(Employee) e1.clone();
			System.out.println(e1);
			System.out.println(e2);
		}
}
