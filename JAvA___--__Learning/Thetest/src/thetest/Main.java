package thetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//创建一个输入的类
		Scanner in = new Scanner(System.in);
		//创建一个城市的容器
		ArrayList<String> cities = new ArrayList<>();//这里只是cities的一个类
		String city = in.next();
		while( !city.equals("###")) {
			cities.add(city);
			city = in.next();//这里其实是构成了一个循环
		}
		//用distance对象记录输入的城市和距离--HashMap
		int distance = in.nextInt();//输入数字要用这个--记住
		int num = cities.size();
		Distance allDistances = new Distance();//这里是Distance的对象
		for(int i = 0;i<num;i++) {
			String city1 = cities.get(i);
			allDistances.addCity(city1);
			for(int j = 0;j<num;j++) {
				allDistances.addACity(city1, cities.get(j), distance);
				if(in.hasNextInt()) {
					distance = in.nextInt();
				}else {
					break;
				}
			}
		}
		String cityA = in.next();
		String cityB = in.next();
		System.out.println(allDistances.getDistance(cityA, cityB));
		in.close();
		}
}
