package 선택4반;

import java.util.*;

public class Day02_입출력 {

	public static void main(String[] args) {
		System.out.println("금요일");
		System.out.print("신");
		System.out.println("난다");
		//스캐너 Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		System.out.println("입력된 나이는" + age);
		
		System.out.println("이름 : ");
		String name;
		name = sc.next();
		System.out.println("당신의 이름은"+name);
		

	}

}
