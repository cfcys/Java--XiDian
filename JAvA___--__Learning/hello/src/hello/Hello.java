package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��ã�����!");
//		try (Scanner in = new Scanner(System.in)) {
////			System.out.println("echo:" + in.nextLine());
//			
//			System.out.println("100-"+in.nextInt()+"="+(100 - in.nextInt()));
//		}	
		Scanner in = new Scanner(System.in);
		System.out.print("������۸�");
		int price = in.nextInt();
		System.out.print("��������");
		int amount = in.nextInt();
		System.out.println("������֮������Ϊ"+(amount-price));
	}

}
