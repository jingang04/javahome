package 선택4반;

public class Taxi extends Cars {
	
	int pay = 3000;
	
	void payUp() {
		pay += 100;
		System.out.println(name + "현재 요금" + pay);
	}
	
}
