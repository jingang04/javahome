package 선택4반;

public class Book {
	String name;
	String author;
	int price;
	private double discount = 0.1;
	
	Book(String name, String author, int price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	void printBook() {
		System.out.println(name + " " + author + " " + price);
		System.out.println("할인가격 : " + (price - price * discount));
	}
}
