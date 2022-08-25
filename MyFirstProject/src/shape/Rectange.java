package shape;

public class Rectange extends Shape {
	private int length;
	private int breath;

	public Rectange(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public double area() {
		return length * breath;
	}

	public String toString() {
		return "" + length + "" + breath;
	}

}
