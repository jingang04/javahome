package ����4��;

public class Student1 {


	static String school = "ROBOT";
	//final static String school = "ROBOT";
	String name;
	private int grade;
	static int count;
	
	Student1() {
		count++;
		
	}
	void print() {
		
		System.out.println(name + grade + "�г�");
	}
	//"2�г� ���ȣ", ���·� �����ϴ� �޼ҵ带 �����ε�
	String print(int grade) {
		String str = grade + "�г� " + name;
		return str;
	}
	
	
	
	
	//ĵ��ȭ ����
	//set : ���� �����ϴ�. �����Ѵ�.
	//get : ���� �ҷ��´�. �д´�.
	void setGrade (int grade) {
		if(grade > 3) {
			System.out.println("�г� ������ Ȯ���ϼ���");
			return;
		}
		//�Էµ� grade ���� 3���� ũ�� �����޼��� ����Ͻÿ�
		this.grade = grade;
	}
	int getGrade() {
		return this.grade;
	}
	void setName(String name) {
		this.name =name;
	}
	String getName() {
		return this.name;
	}
	
		

}
