package ����4��;

public class Truck extends Cars{
	Truck(String name) {
	super(name);
	System.out.println("Truck�⺻������");
	System.out.println("SUPER : " + super.name);
	}

	public static void main(String[] args) {
		Truck bonggo = new Truck("����");
		System.out.println(bonggo.name);
		
		
	}

}
