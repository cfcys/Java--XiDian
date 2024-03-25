package 遍历;

import java.util.Scanner;

public class BianLi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
			System.out.println("找到了，是第"+(loc+1)+"个");
		}else {
			System.out.println("数据中未发现"+x);
		}
	}

}
