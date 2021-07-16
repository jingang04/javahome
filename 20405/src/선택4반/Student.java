package 선택4반;

public class Student {

	
	Student(String name, String hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}
	public Student() {}
	String name;
	String hakbun;
	int age;
	
	private String jumin;
	
	void printStudent(String name, String hakbun, int age) {
		System.out.println("학생이름 : "+ name);
		System.out.println("학번 : "+ hakbun);
		System.out.println("나이 : "+ age);
	}
	void printStudent() {
		System.out.print("학생이름 : " + name);
		System.out.print("학번 : " + hakbun);
		System.out.println("나이 : " + age);
	}

}
