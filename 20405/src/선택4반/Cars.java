package ����4��;

public class Cars {
	Cars() {
		System.out.println("Cars ������ 2");
	}
	Cars(String name) {
		System.out.println("Cars ������ 2");
	}
	String name;
	String color;
	int velocity;
	
	void speedUp() {
		velocity += 10;
		System.out.println(name + "����ӷ�" + velocity);
	}
	
	void speedDown() {
		velocity -= 10;
		System.out.println(name + "����ӷ�" + velocity);
	}
}
