package ����;

import java.util.Scanner;

public class BianLi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int loc = -1;
		for(int i = 0;i<data.length;i++) {
			if(x == data[i]) {
				loc = i;
				break;
			}
		}
		if(loc > -1) {
			System.out.println("�ҵ��ˣ��ǵ�"+(loc+1)+"��");
		}else {
			System.out.println("������δ����"+x);
		}
	}

}
