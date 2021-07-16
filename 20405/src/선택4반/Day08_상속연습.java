package 선택4반;

public class Day08_상속연습 {
	public static void main(String[] args) {
		Cars sonata = new Cars();
		sonata.name = "소나타";
		sonata.color = "은색";
		sonata.velocity = 80;
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedDown();
		
		Taxi t = new Taxi();
		t.name = "카카오 택시";
		t.velocity = 60;
		t.speedUp();
		t.speedUp();
		t.speedDown();
		t.speedDown();
		t.speedUp();
		t.speedUp();
		t.speedUp();
		
	}

}
