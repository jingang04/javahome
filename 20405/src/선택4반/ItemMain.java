package 선택4반;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신 걸 환영합니다!");
		System.out.println("현재 상품 종류 개수 : " + Item.getItemcnt() + "개");
		
		line();
		
		Item pen = new Item();
		pen.setNo(100);
		pen.setName("연필");
		pen.setPrice(600);
		pen.setCount(5);
		pen.printInfo();
		
		Item note = new Item(101,"노트", 1000, 4);
		note.printInfo();
		
		Item el = new Item(102, "지우개");
		el.setPrice(500);
		el.setCount(5);
		pen.printInfo();
		
		line();
		
		System.out.println("현재 상품 종류 개수 : " + Item.getItemcnt());
		
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
