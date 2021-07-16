package 선택4반;

public class Day05_반복문4 {

	public static void main(String[] args) {
		int a[] = new int[] {12,23,34,45,56};
		for(int i = 0; i < a.length;i++)
			System.out.println(a[i]);
		System.out.println("\n");
		//for each(각각의)
		for(int val : a)
			System.out.println(val);

		
		System.out.println("=============");
		float f[] = new float[] {3.14f, 5.34f, 2.3f};
		float sum = 0;
		for(float val : f) {
			sum = sum + val;
			System.out.println(val);
		}
		System.out.println("SUM : " + sum);
	}

}
