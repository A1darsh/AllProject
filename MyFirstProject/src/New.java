
class Address{
	private int houseno;

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public Address(int houseno) {
		super();
		this.houseno = houseno;
	}
	public int hashCode() {
		return houseno;
	}
}

public class New implements Cloneable{

	private int id;
	private String name;
	private Address address;
	
	

	
	public New(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
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
	protected Object clone() throws CloneNotSupportedException {
		Address ad=new Address(address.getHouseno());
		New n=new New(id,name,ad);
		return n;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad=new Address(555);
		New n1= new New(11,"adarsh",ad);
		New n2=(New) n1.clone();
		New n3=(New)n2.clone();
		n1.setId(2);
		n1.setName("asdf");
		ad.setHouseno(333);
		System.out.println(n1.getId()+":"+n1.getName()+" "+n1.getAddress().getHouseno());
		System.out.println(n2.getId()+":"+n2.getName()+" "+n1.getAddress().getHouseno());
		System.out.println(n3.getId()+":"+n3.getName()+" "+n1.getAddress().getHouseno());
	}
	

}
