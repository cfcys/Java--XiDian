package ����Ӣ��;

import java.util.Scanner;

public class ��һ��ʵ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	Scanner in = new Scanner(System.in);
	System.out.print("������ߣ�");
	int Chi = in.nextInt();
	System.out.print("������磺");
	int Cun = in.nextInt();
	double Mi = 0;
	System.out.println("���Ϊ"+((int)(((Chi+(Cun/12.0))*0.3048)*100))+"����");
	}

}
