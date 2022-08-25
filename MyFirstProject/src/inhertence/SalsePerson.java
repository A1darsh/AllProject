package inhertence;

public class SalsePerson extends WageEmployee{
	private int salary;
	private int commision;
	
	public SalsePerson() {
		super();
	}

	public SalsePerson(int id, int age, String name, int rate, int hour,
			int salary, int commision) {
		super(id, age, name, rate, hour);
		this.salary = salary;
		this.commision = commision;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public String toString() {
		return super.toString()+"SalsePerson [salary=" + salary + ", commision=" + commision
				+ "]";
	}
	
	
}
