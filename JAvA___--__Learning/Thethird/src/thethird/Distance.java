package thethird;

import java.util.HashMap;

public class Distance {
	private HashMap<String, HashMap<String, Integer>> alldistances = new HashMap<>();
	public void addCity(String city) {
		alldistances.put(city,new HashMap<String, Integer>());
	}
	public void addACity(String city1,String city2,int dis) {
		alldistances.get(city1).put(city2, dis);
	}//���city1��city2֮��ľ���
	
	public int getDistance(String city1,String city2) {
		int distance = alldistances.get(city1).get(city2);
		return distance;
	}
}
