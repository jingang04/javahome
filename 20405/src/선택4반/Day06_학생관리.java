package ����4��;

public class Day06_�л����� {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "������";
		s1.hakbun = "20405";
		s1.age = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		Student s2 = new Student();
		s2.name = "������";
		s2.hakbun = "30100";
		s2.age = 19;
		s2.printStudent();
		
		Student s3 = new Student("������", "20500", 20);
		s3.printStudent();
		
		Book myBook = new Book("����", "�ڰ渮", 30000);
		myBook.printBook();
	}

}
