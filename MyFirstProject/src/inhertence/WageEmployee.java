package inhertence;

public class WageEmployee extends Employee {
	private int rate;
	private int hour;

	public WageEmployee() {
		super();
	}

	public WageEmployee(int id, int age, String name, int rate, int hour) {
		super(id, age, name);
		this.rate = rate;
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String toString() {
		return super.toString()+"WageEmployee [rate=" + rate + ", hour=" + hour + "]";
	}

}
