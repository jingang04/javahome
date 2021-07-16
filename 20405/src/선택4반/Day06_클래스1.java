package 선택4반;

public class Day06_클래스1 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.소유자 = "김진강";
		myCar1.색상 = "RED";
		myCar1.제조회사 = "현대";
		myCar1.달리다();
		myCar1.정지하다();
		
		Car redCar = new Car();
		redCar.소유자 = "현빈";
		redCar.색상 = "RED";
		redCar.달리다();
		
		myCar1.달리다();myCar1.달리다();myCar1.달리다();
		redCar.달리다();redCar.달리다();redCar.달리다();

	}

}

class Car{
	String 소유자;
	String 색상;
	String 제조회사;
	
	void 달리다() {
		System.out.println(소유자 + 색상 + "달리는 중");
	}
	void 정지하다() {
		System.out.println(소유자 + 색상 + "정지함");
	}
}