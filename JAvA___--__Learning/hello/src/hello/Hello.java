package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("你好，世界!");
//		try (Scanner in = new Scanner(System.in)) {
////			System.out.println("echo:" + in.nextLine());
//			
//			System.out.println("100-"+in.nextInt()+"="+(100 - in.nextInt()));
//		}	
		Scanner in = new Scanner(System.in);
		System.out.print("请输入价格：");
		int price = in.nextInt();
		System.out.print("请输入余额：");
		int amount = in.nextInt();
		System.out.println("您购买之后的余额为"+(amount-price));
	}

}
