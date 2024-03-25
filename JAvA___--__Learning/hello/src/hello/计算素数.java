package hello;

import java.io.InputStream;
import java.util.Scanner;

public class 计算素数 {
public static boolean isPrime(int k) {
	boolean  Prime = false;
	for(int i = 2;i<k;i++) {
			if(k%2 == 0) {
				Prime = true;
			}
	}
	return Prime;
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int cnt = 0;
		int sum = 0;
		for(int m = i;m<j;m++) {
			if(isPrime(m)) {
				cnt++;
				sum += m;
			}
		}
		System.out.println("发现了"+cnt+"个素数"+"他们的加和为"+sum);
	}

}
