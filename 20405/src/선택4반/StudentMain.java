package 선택4반;

public class StudentMain {

	public static void main(String[] args) {
		Student1 kim = new Student1();
		kim.school = "서울예술고";
		System.out.println("김 : " + kim.school);
		
		Student1 jang = new Student1();
		Student1 kbak = new Student1();
		Student1 choi = new Student1();
		System.out.println("최 :" + choi.school);
		
		System.out.println("생성된 학생수는 " + Student1.count);
		
		

	}

}
