package thetest;//�Լ�д��

import java.util.HashMap;

public class Distance {//�µĹ�ϣ�����ʽ(ֵ��ѧϰ)
	private HashMap<String, HashMap<String, Integer>>  Distances = new HashMap<>(); 
	public void addCity(String city) {
		Distances.put(city,new HashMap<String, Integer>());
	}
	
	public void addACity(String city1,String city2,int dis) {
		Distances.get(city1).put(city2, dis);
	}//�����������к����������ľ���
	
	public int getDistance(String city1,String city2) {
		int distance = Distances.get(city1).get(city2);
		return distance;
	}
}
