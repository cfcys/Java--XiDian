package thetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//����һ���������
		Scanner in = new Scanner(System.in);
		//����һ�����е�����
		ArrayList<String> cities = new ArrayList<>();//����ֻ��cities��һ����
		String city = in.next();
		while( !city.equals("###")) {
			cities.add(city);
			city = in.next();//������ʵ�ǹ�����һ��ѭ��
		}
		//��distance�����¼����ĳ��к;���--HashMap
		int distance = in.nextInt();//��������Ҫ�����--��ס
		int num = cities.size();
		Distance allDistances = new Distance();//������Distance�Ķ���
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
