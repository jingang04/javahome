package ����4��;

import java.util.*;

public class Day05_�ݺ���3 {

	public static void main(String[] args) {
		
		/*
		 ���ѷ����� � �� n�� �Է¹޾Ƽ� 
		 n�� 3�� ������� �ƴ����� ���� ����� �������
		 �̶� 0�� �ԷµǸ� �ݺ����� �����Ѵ�.
		 ���� n�� 3,6,9�̸� ������� ���� ���� ���� �Է¹޴´�.
		 */
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		if (n == 0)
			break;
		else if(n == 3 || n == 6 || n == 9)
			continue;
		else if(n % 3 == 0)
			System.out.println(n +" : 3�� ���");
		else
			System.out.println(n +" : 3�� ��� �ƴ�");
		
		}
		System.out.println("����");
	}

}
