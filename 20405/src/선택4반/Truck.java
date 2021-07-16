package 선택4반;

public class Truck extends Cars{
	Truck(String name) {
	super(name);
	System.out.println("Truck기본생성자");
	System.out.println("SUPER : " + super.name);
	}

	public static void main(String[] args) {
		Truck bonggo = new Truck("봉고");
		System.out.println(bonggo.name);
		
		
	}

}
