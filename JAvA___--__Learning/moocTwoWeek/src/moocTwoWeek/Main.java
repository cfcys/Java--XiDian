package moocTwoWeek;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//用ArrayList记录输入的城市，以###结束
		ArrayList<String> cities = new ArrayList<String>();
		String city = in.next();
		while( !city.equals("###")) {
			cities.add(city);
			city = in.next();
		}
		
		//用Distances对象记录输入的城市和对应的里程数
		int distance = in.nextInt();
		int num = cities.size();
		Distances allDistances = new Distances();
		for (int i=0; i<num; i++) {
			String cityA = cities.get(i);
			allDistances.addCity(cityA);
			for(int j=0; j<num; j++) {
				allDistances.addADistance(cityA, cities.get(j), distance);
				if(in.hasNextInt()) {
					distance = in.nextInt();
				}else{
					break;
				}
			}
		}		
		//读取两个城市，输出两者间的里程数
		String city1 = in.next();
		String city2 = in.next();
		System.out.println(allDistances.getDistance(city1, city2));		
		in.close();
	}
 
}
