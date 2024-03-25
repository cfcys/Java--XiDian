package Theforth;

import java.util.HashMap;

public class Distance {
	private HashMap<String, HashMap<String, Integer>> allDistances = new HashMap<>();
	public void addCity(String city) {
		allDistances.put(city, new HashMap<String,Integer>());
	}
	public void addACity(String city1,String city2,int distance) {
		allDistances.get(city1).put(city2, distance);
	}
	public int getDistance(String city1,String city2) {
		int distance = allDistances.get(city1).get(city2);
		return distance;
	}
}
