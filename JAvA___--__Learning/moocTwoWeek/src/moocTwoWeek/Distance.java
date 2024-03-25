package moocTwoWeek;

import java.util.HashMap;
//没有占位的那个主函数
class Distances{
	private HashMap<String, HashMap<String,Integer>> allDistances = new HashMap<String, HashMap<String, Integer>>();
	public void addCity(String city) {
		allDistances.put(city, new HashMap<String, Integer>());
	}
	
	public void addADistance(String cityA, String cityB, int dis) {
		allDistances.get(cityA).put(cityB, dis);
	}
	
	public int getDistance(String cityA, String cityB) {
		int distance = allDistances.get(cityA).get(cityB);
		return distance;
	}
}
