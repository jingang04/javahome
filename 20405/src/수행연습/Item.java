package 수행연습;

public class Item {
	private int no;
	private String name;
	private int price;
	private int count;
	
	private static final String company = "놀러와 회사";
	private static int itemCnt;
	//생성자 1
	public Item() {
		itemCnt++;
	}
	//생성자 2
	public Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}
	
	public Item(int no, String name, int price, int count) {
		this(no, name);
		this.price = price;
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return company;
	}
	
	
	public void inStore(int cnt) {
		count += cnt;
		System.out.println("입고 : " + name + ", " + cnt + "개");
	}
	
	public void outStore(int cnt) {
		if(count<cnt) {
			System.out.println("출고실패 : " + name + ", " + "현재 상품개수 "  + count + "개");
		} else {

			System.out.println("출고 : " + name + ", " + cnt + "개");
			count -= cnt;
		}
	}
	public void printInfo() {
		System.out.println("상품코드 : " + no + "\t상품명 : " + name + "\t상품가격 : " + price + "\t상품개수 : " + count);
	}
	
	
}
