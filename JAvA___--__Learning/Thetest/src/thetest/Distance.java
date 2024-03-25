package thetest;//自己写的

import java.util.HashMap;

public class Distance {//新的哈希表的形式(值得学习)
	private HashMap<String, HashMap<String, Integer>>  Distances = new HashMap<>(); 
	public void addCity(String city) {
		Distances.put(city,new HashMap<String, Integer>());
	}
	
	public void addACity(String city1,String city2,int dis) {
		Distances.get(city1).put(city2, dis);
	}//填的是这个城市和其他两个的距离
	
	public int getDistance(String city1,String city2) {
		int distance = Distances.get(city1).get(city2);
		return distance;
	}
}
