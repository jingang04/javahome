package ����4��;

public class Day06_Ŭ����1 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.������ = "������";
		myCar1.���� = "RED";
		myCar1.����ȸ�� = "����";
		myCar1.�޸���();
		myCar1.�����ϴ�();
		
		Car redCar = new Car();
		redCar.������ = "����";
		redCar.���� = "RED";
		redCar.�޸���();
		
		myCar1.�޸���();myCar1.�޸���();myCar1.�޸���();
		redCar.�޸���();redCar.�޸���();redCar.�޸���();

	}

}

class Car{
	String ������;
	String ����;
	String ����ȸ��;
	
	void �޸���() {
		System.out.println(������ + ���� + "�޸��� ��");
	}
	void �����ϴ�() {
		System.out.println(������ + ���� + "������");
	}
}