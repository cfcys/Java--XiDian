package 数数字;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int cnt = 0;
		while(number>0) {
			number = number / 10;
			cnt += 1;
		}
		System.out.println(cnt);
	}

}
