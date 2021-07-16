package 선택4반;

public class ShoppingMall {
	String code;
	int total;
	
	ShoppingMall(String code) {
		this.code = code;
		
	}
	
	void addTotal(int count ) {
		total += count;
		System.out.println("현재 총재고 :" + total);
	}
	
	void subTotal(int count) {
		if(count > total) {
			System.out.println("수량이 부족합니다.");
			//return;
		}else {
			
		
		total -= count;
		System.out.println("현재 총재고 : " + total);
		}
	}
}
