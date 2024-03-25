package 计算英尺;

import java.util.Scanner;

public class 第一个实例 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Scanner in = new Scanner(System.in);
	System.out.print("请输入尺：");
	int Chi = in.nextInt();
	System.out.print("请输入寸：");
	int Cun = in.nextInt();
	double Mi = 0;
	System.out.println("身高为"+((int)(((Chi+(Cun/12.0))*0.3048)*100))+"厘米");
	}

}
