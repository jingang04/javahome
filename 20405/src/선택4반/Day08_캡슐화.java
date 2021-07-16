package ¼±ÅÃ4¹İ;

public class Day08_Ä¸½¶È­ {

	public static void main(String[] args) {
		Student1 kim = new Student1();
		kim.name = "±è±âÈ£";
		kim.setGrade(2);
		kim.print();
		
		System.out.println("getGrade°á°ú : " + kim.getGrade());
		System.out.println("getName °á°ú : " + kim.getName());
		
		kim.print();
		System.out.println(kim.print(3));

	}

}
