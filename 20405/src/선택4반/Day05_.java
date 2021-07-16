package 선택4반;

import java.util.*;

public class Day05_ {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			System.out.println(i);
		
		for(int i = 0; i <= 10; i = i + 2)
			System.out.println(i);
		
		for(int i = 10; i > 3; i -= 2)
			System.out.println(i);
		
		System.out.println("====================");
		//어떤 수 n을 입력받아서 n까지의 짝수의 합과 홀수의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		for(int i = 1; i <= n; i++)
			if(i % 2 == 0)
				even_sum += i;
			else
				odd_sum += i;
		System.out.println("홀수의 합 : " + odd_sum);
		System.out.println("짝수의 합 : " + even_sum);

	}

}
