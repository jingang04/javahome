package ����4��;

import java.util.*;

public class TEST28 {

	public static void main(String[] args) {
		int sum = 0;
		int score[] = new int[5];
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("���� �Է� : ");
			score[i] = sc.nextInt();
			sum = sum + score[i];
			
		}
		
		System.out.println("�հ� : " + sum);
		avg = sum / 5.0;
		System.out.printf("��� : %.1f",avg);
		
	}

}
