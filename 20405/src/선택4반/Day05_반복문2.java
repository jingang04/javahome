package ����4��;

public class Day05_�ݺ���2 {

	public static void main(String[] args) {
		
		
		for(int i = 1;i <= 3;i++) {
			for(int j = 1;j <= i;j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("============");
		
		for(int i = 1;i <= 3;i++) {
			for(int j = 1;j <= i;j++)
				System.out.print(i);
			System.out.println();
		}
		System.out.println("============");
		
		for(int i = 3;i >= 1;i--) {
			for(int j = 1;j <= i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("============");
		
		for(int i = 1;i <= 3;i++) {
			for(int j = 1;j <= i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("============");
		
		

	}

}
