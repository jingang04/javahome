package º±≈√4π›;

public class PhoneMain {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.model = "S21";
		p1.price = 200;
		System.out.println(p1.toPrint());
		
		Phone p2 = new Phone();
		p2.model = "V50";
		p2.price = 85;
		System.out.println(p2.toPrint());
		
		Phone p3 = new Phone("S20", 100);
		System.out.println(p3.toPrint());
		

	}

}
