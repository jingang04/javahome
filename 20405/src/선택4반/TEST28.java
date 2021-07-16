package 선택4반;

import java.util.*;

public class TEST28 {

	public static void main(String[] args) {
		int sum = 0;
		int score[] = new int[5];
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("성적 입력 : ");
			score[i] = sc.nextInt();
			sum = sum + score[i];
			
		}
		
		System.out.println("합계 : " + sum);
		avg = sum / 5.0;
		System.out.printf("평균 : %.1f",avg);
		
	}

}
