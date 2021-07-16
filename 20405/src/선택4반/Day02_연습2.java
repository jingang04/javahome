package 선택4반;

import java.util.*;

public class Day02_연습2 {

	public static void main(String[] args) {
		//이름, 국어, 영어, 수학 점수를 입력
		// 총점(total)과 평균(avg) 구하는 프로그램
		// 국영수점수는 배열(score)을 이용하자
		String name;
		int[] score = new int[3];
		int total=0;
		float avg;
		
		System.out.print("이름 : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("국어 : ");
		score[0] = sc.nextInt();
		System.out.println("수학 : ");
		score[1] = sc.nextInt();
		System.out.println("영어 : ");
		score[2] = sc.nextInt();
		for(int i=0; i<score.length;i++)
			total = total + score[i];
		System.out.println("합 : "+total);
		System.out.println();
		
		avg = (float) total/3;
	}

}
