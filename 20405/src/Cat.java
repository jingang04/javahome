
public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		//���� <=== ���� : ������, Upcasting
		cat.name = "�̹�";
		cat.toPrint();
		Cat cat2 = (Cat)cat;
		cat2.toPrint();
	}

}
