
public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		//상위 <=== 하위 : 묵시적, Upcasting
		cat.name = "미미";
		cat.toPrint();
		Cat cat2 = (Cat)cat;
		cat2.toPrint();
	}

}
