package ������;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
