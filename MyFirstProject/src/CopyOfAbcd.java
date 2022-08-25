public class CopyOfAbcd {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CopyOfAbcd(int id) {

		this.id = id;
	}

	public int hashCode() {
		return id;
	}
	public static void main(String[] args) {
		CopyOfAbcd a = new CopyOfAbcd(55);
		System.out.println(a.hashCode());

		
	}

}
