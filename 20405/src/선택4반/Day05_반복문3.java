package 선택4반;

import java.util.*;

public class Day05_반복문3 {

	public static void main(String[] args) {
		
		/*
		 무한루프로 어떤 수 n을 입력받아서 
		 n이 3의 배수인지 아닌지에 대한 결과를 출력하자
		 이때 0이 입력되면 반복문을 종료한다.
		 만약 n이 3,6,9이면 출력하지 말고 다음 수를 입력받는다.
		 */
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		if (n == 0)
			break;
		else if(n == 3 || n == 6 || n == 9)
			continue;
		else if(n % 3 == 0)
			System.out.println(n +" : 3의 배수");
		else
			System.out.println(n +" : 3의 배수 아님");
		
		}
		System.out.println("종료");
	}

}
