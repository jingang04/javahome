package ����4��;

import java.util.*;

public class Day02_����2 {

	public static void main(String[] args) {
		//�̸�, ����, ����, ���� ������ �Է�
		// ����(total)�� ���(avg) ���ϴ� ���α׷�
		// ������������ �迭(score)�� �̿�����
		String name;
		int[] score = new int[3];
		int total=0;
		float avg;
		
		System.out.print("�̸� : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("���� : ");
		score[0] = sc.nextInt();
		System.out.println("���� : ");
		score[1] = sc.nextInt();
		System.out.println("���� : ");
		score[2] = sc.nextInt();
		for(int i=0; i<score.length;i++)
			total = total + score[i];
		System.out.println("�� : "+total);
		System.out.println();
		
		avg = (float) total/3;
	}

}
