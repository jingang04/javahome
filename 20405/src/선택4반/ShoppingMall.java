package ����4��;

public class ShoppingMall {
	String code;
	int total;
	
	ShoppingMall(String code) {
		this.code = code;
		
	}
	
	void addTotal(int count ) {
		total += count;
		System.out.println("���� ����� :" + total);
	}
	
	void subTotal(int count) {
		if(count > total) {
			System.out.println("������ �����մϴ�.");
			//return;
		}else {
			
		
		total -= count;
		System.out.println("���� ����� : " + total);
		}
	}
}
