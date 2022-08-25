package packageA;

public class AA extends A{
	public int add(int x, int y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}
	public void test(){
		System.out.println("this is override method");
	}

	public static void main(String args[]) {
		AA aa = new AA(); 
		//System.out.println(aa.add(2,3,8));
		aa.test();
	}
}
