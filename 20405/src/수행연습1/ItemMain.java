package ���࿬��1;

public class ItemMain {

	public static void main(String[] args) {
		
		System.out.println(Item.getCompany() + "�� ���� �� ȯ���մϴ�!");
		System.out.println("���� ��ǰ ���� ���� : " + Item.getItemCnt() + "��");
		
		System.out.println("====================================================");
		
		Item pen = new Item();
		pen.setNo(100);
		pen.setName("����");
		pen.setPrice(600);
		pen.setCount(5);
		pen.printInfo();
		
		Item note = new Item(101, "��Ʈ");
		note.setPrice(1000);
		note.setCount(4);
		note.printInfo();
		
		Item er = new Item(102, "���찳", 500, 5);
		er.printInfo();
		
		System.out.println("====================================================");
		
		System.out.println("���� ��ǰ ���� ���� : " + Item.getItemCnt() + "��");
		
		System.out.println("====================================================");
		
		pen.inStore(10);
		note.inStore(20);
		note.outStore(5);
		er.inStore(20);
		er.outStore(26);
		
		System.out.println("====================================================");
		
		pen.printInfo();
		note.printInfo();
		er.printInfo();
		
		
		

	}

}
