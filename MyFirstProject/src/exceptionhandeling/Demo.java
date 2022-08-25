package exceptionhandeling;

public class Demo {

	public static void main(String[] args) {
		int a = 9;
		int b = 3;
		int c = 0;
		try {
			c = a / b;
			if (c<10) {
				throw new Adarsh("for getting output value should be grater than 10");
			}
			System.out.println(c);
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Adarsh e) {
			System.out.println(e);
		}
		

	}

}
