class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class static_Block {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");// load class
		
	}
}


// first when new keyword is found class loads in class loader
// then objects are instantiated if constructors present
// when class loads it executes static block , hence static block executed first
// class loads only once and objects are created many times
// static vars have a single pool of vars
//constructors called as many times the objects are called