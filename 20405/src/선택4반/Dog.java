package ����4��;

public class Dog {
	
	Dog() {
		System.out.println("������ ��ü�� ����");
	}
	Dog(String breed, int age, String color) {
		this();
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println(breed + "is barking");
	}
	
	void hungry() {
		System.out.println(breed + "is hungry");
	}
	
	void sleeping() {
		System.out.println(breed + "is sleeping");
	}
	String toPrint() {
		String str;
		str = "(" + breed + "," + age + "," + color + ")";
		return str;
	}

}
