package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class main {
	//����ѧ������
	//trueΪ���ԣ�falseΪŮ��
	static Student stu1 = new Student(1,false,"С��");
	static Student stu2 = new Student(2,true,"С��");
	static Student stu3 = new Student(3,true,"С��");
	static Student stu4 = new Student(4,false,"С��");
	static Student stu5 = new Student(5,true,"Сǿ");
	
	public static void main(String[] args) {
	//��������ṹ�洢����
	LinkedList<Student> list = new LinkedList<Student>();
	//<>�м�Ϊ���͡�
	list.add(stu1);
	list.add(stu2);
	list.add(stu3);
	list.addFirst(stu4);
	list.addLast(stu5);
	//����һ�ֱ���list�ķ�ʽ
	for(int i = 0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println(list);
	System.out.println("----------------------------------");
	
	ArrayList<Integer> list2 = new ArrayList<>();
	list2.add(1);
	list2.add(3);
	list2.add(5);
	list2.add(7);
	list2.add(9);
	
	list2.remove(1);
	
	System.out.println(list2);
	System.out.println("----------------------------------");	
	HashSet<String> set = new HashSet<>();
	set.add("a");
	set.add("b");
	set.add("c");
	
	set.add("b");//�ظ���Ԫ�ز���������
	set.remove("b");
	
	for(String i : set) {
		System.out.println(i);
	}
	System.out.println("----------------------------------");
	
	//Treeset���԰�����Ȼ˳����е�������
	TreeSet<Double> set2 = new TreeSet<>();
	set2.add(89.63);
	set2.add(5.96);
	set2.add(66.21);
	set2.add(11.23);
	set2.add(33.33);
	for(Double i : set2) {
		System.out.println(i);
	}//����Ľ���ǰ���˳�����е�
	System.out.println("----------------------------------");
	
	//HashMap���ǻ���Map�ӿڵ�ʵ��
	HashMap<Integer, String> map = new HashMap<>();
	map.put(2, "LiMing");
	map.put(1, "LiHua");
	map.put(3, "HeiHei");
	for(Integer i : map.keySet()) {
		System.out.println(i + ":" + map.get(i)); // key��value��ͬʱ���
	}//���Կ����ǰ���key��˳������������
	for(String value  : map.values()) {
		System.out.println(value);
		}
	map.remove(3);
	System.out.println("----------------------------------");
	
	//Collections�������һЩ��������
	Collections.reverse(list2);//���ϵĴ���ת
	Collections.sort(list2);//���������������
	Collections.swap(list2,2,3);//�����±���н���
	Collections.rotate(list2, 1);//������һ���ƶ���ǰ��
	Collections.shuffle(list2);//�����������
	
	}

}
