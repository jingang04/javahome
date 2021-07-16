package 선택4반;

import java.util.*;

public class Day02_연습1 {

	public static void main(String[] args) {
		
		String major, num, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("학과 : ");
		major = sc.next();
		System.out.println("학번 : ");
		num = sc.next();
		System.out.println("이름 : ");
		name = sc.next();
		
		System.out.println("키 : ");
		int h = sc.nextInt();
		
		System.out.println("저는 " + major + num + name);
		System.out.println("제키는" + h + "입니다.");

	}

}
