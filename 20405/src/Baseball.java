
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
		System.out.println("�߱��� ���ݰ� ����� �����ǰ� 9���� �����̴�.");
		
	}
	
	public static void main(String[] args) {
		
		Baseball bb = new Baseball("�߱�" , 9);
		
		System.out.println("��� ���� " + bb.getName());
		//���� �ο� : 3��
		//��� ��Ģ : 
		System.out.println("���� �ο� : " + bb.getPlayer());
		bb.rule();
		
	}

}
