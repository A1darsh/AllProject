package inhertence;

public class Adarsh extends SalsePerson {
	private String branch;
	private int commesion;

	public Adarsh() {
		super();
	}

	public int getCommesion() {
		return commesion;
	}

	public void setCommesion(int commesion) {
		this.commesion = commesion;
	}

	public Adarsh(int id, int age, String name, int rate, int hour, int salary,
			int commision, String branch, int commesion) {
		super(id, age, name, rate, hour, salary, commision);
		this.branch = branch;
		this.commesion = commesion;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String toString() {
		return super.toString()+"Adarsh [branch=" + branch + "]"+commesion;
	}
	
	
}
