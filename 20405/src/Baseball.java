
public class Baseball extends Sports {
	static int count;
	Baseball() {
		count++;
	}
	Baseball(String name, int player) {
		this.name = name;
		this.player = player;
	}
	
	public void rule() {
		System.out.println("야구는 공격과 수비로 구성되고 9명이 한팀이다.");
		
	}
	
	public static void main(String[] args) {
		
		Baseball bb = new Baseball("야구" , 9);
		
		System.out.println("경기 종목 " + bb.getName());
		//선수 인원 : 3명
		//경기 규칙 : 
		System.out.println("선수 인원 : " + bb.getPlayer());
		bb.rule();
		
	}

}
