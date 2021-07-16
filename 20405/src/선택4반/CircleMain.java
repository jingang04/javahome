package 선택4반;

public class CircleMain extends Circle{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.pi = 3.1499999;
		System.out.println("원의둘레 : " + c.round(5));
		System.out.println("원의넓이 : " + c.area(5));
		
	}

}
