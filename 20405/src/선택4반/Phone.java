package ����4��;

public class Phone {
	String model;
	int price;
	int total;
	
	Phone() { total++; }
	Phone(String model, int price) {
		this(); 
		this.model = model;
		this.price = price;
	}
	
	String toPrint() {
		System.out.println("��������� �� " + total + "���� ������");
		return (price + "����¥��" + model + "����Ʈ��");
	}

}
