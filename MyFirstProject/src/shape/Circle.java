package shape;

public class Circle implements Shapable {
	private int radious;

	public Circle() {
		super();
	}

	public Circle(int radious) {
		super();
		this.radious = radious;
	}

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

	public double area() {
		return 3.14 * radious * radious;
	}

	public int name() {
		
		return 40;
	}
	

	
	
	
}
