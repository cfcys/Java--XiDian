package rongqiXUEXI;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dallor");
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
		for(Integer k : coinnames.keySet()) {
			String name = coinnames.get(k);
			System.out.println(name);
		}
	}
	public String getName(int amount){
		if(coinnames.containsKey(amount))
		return coinnames.get(amount);
		else
			return "对不起，我没有找到";
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Coin coin = new Coin();
//		System.out.println(coin.getName(0));//null
//		System.out.println(coin.getName(1));
//		System.out.println(coin.getName(10));
//		System.out.println(coin.getName(11));
//		System.out.println(coin.getName(25));
//		System.out.println(coin.getName(50));
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
