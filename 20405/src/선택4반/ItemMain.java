package ����4��;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "�� ���� �� ȯ���մϴ�!");
		System.out.println("���� ��ǰ ���� ���� : " + Item.getItemcnt() + "��");
		
		line();
		
		Item pen = new Item();
		pen.setNo(100);
		pen.setName("����");
		pen.setPrice(600);
		pen.setCount(5);
		pen.printInfo();
		
		Item note = new Item(101,"��Ʈ", 1000, 4);
		note.printInfo();
		
		Item el = new Item(102, "���찳");
		el.setPrice(500);
		el.setCount(5);
		pen.printInfo();
		
		line();
		
		System.out.println("���� ��ǰ ���� ���� : " + Item.getItemcnt());
		
		line();
		pen.inStore(10);
		note.inStore(20);
		note.outStore(5);
		el.inStore(20);
		el.outStore(26);
		
		line();
		
		pen.printInfo();
		note.printInfo();
		el.printInfo();
		
		
		
		
	}
	
	public static void line() {
		System.out.println("=========================================================");
	}

}
