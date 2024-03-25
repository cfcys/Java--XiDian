package learing1;

import java.util.Random;

public class Main {
	public static void main(String[] args) throws Exception {
		//睡眠时间。
	/*	for (int i = 0; i < 20; i++) {
			Thread.sleep(200);
			System.out.println("main...."+i);
		}
	}*/
		//伪随机数生成。
	Random r = new Random();
	int i;
	for (int j = 0; j < 20; j++) {
		i = r.nextInt(10); 
		System.out.println(i   );
		}
	}
}	
