package 선택4반;

public class Day06_학생관리 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "김진강";
		s1.hakbun = "20405";
		s1.age = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		Student s2 = new Student();
		s2.name = "김은수";
		s2.hakbun = "30100";
		s2.age = 19;
		s2.printStudent();
		
		Student s3 = new Student("최유진", "20500", 20);
		s3.printStudent();
		
		Book myBook = new Book("토지", "박경리", 30000);
		myBook.printBook();
	}

}
