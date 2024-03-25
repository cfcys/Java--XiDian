package Theforth;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<>();
		String city = in.next();
		while(!city.equals("###")) {
			cities.add(city);
			city = in.next();
		}
		//下面是去使用Distance这个类来处理
		int distance = in.nextInt();
		int num = cities.size();
		Distance distances = new Distance();
		for(int i = 0;i<num;i++) {
			String city1 = cities.get(i);
			distances.addCity(city1);
			for(int j = 0;j<num;j++) {
				distances.addACity(city1, cities.get(j), distance);
				if(in.hasNextInt()) {
					distance = in.nextInt();
				}else {
					break;
				}
			}
		}
		String cityA = in.next();
		String cityB = in.next();
		System.out.println(distances.getDistance(cityA, cityB));
		in.close();
	}

}
