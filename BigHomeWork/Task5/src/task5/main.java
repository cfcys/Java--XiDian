package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class main {
	//创建学生对象。
	//true为男性，false为女性
	static Student stu1 = new Student(1,false,"小花");
	static Student stu2 = new Student(2,true,"小明");
	static Student stu3 = new Student(3,true,"小李");
	static Student stu4 = new Student(4,false,"小红");
	static Student stu5 = new Student(5,true,"小强");
	
	public static void main(String[] args) {
	//采用链表结构存储对象
	LinkedList<Student> list = new LinkedList<Student>();
	//<>中间为泛型。
	list.add(stu1);
	list.add(stu2);
	list.add(stu3);
	list.addFirst(stu4);
	list.addLast(stu5);
	//这是一种遍历list的方式
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
	
	set.add("b");//重复的元素不会接着添加
	set.remove("b");
	
	for(String i : set) {
		System.out.println(i);
	}
	System.out.println("----------------------------------");
	
	//Treeset可以按照自然顺序进行递增排序
	TreeSet<Double> set2 = new TreeSet<>();
	set2.add(89.63);
	set2.add(5.96);
	set2.add(66.21);
	set2.add(11.23);
	set2.add(33.33);
	for(Double i : set2) {
		System.out.println(i);
	}//输出的结果是按照顺序排列的
	System.out.println("----------------------------------");
	
	//HashMap类是基于Map接口的实现
	HashMap<Integer, String> map = new HashMap<>();
	map.put(2, "LiMing");
	map.put(1, "LiHua");
	map.put(3, "HeiHei");
	for(Integer i : map.keySet()) {
		System.out.println(i + ":" + map.get(i)); // key和value都同时输出
	}//可以看出是按照key的顺序来进行排列
	for(String value  : map.values()) {
		System.out.println(value);
		}
	map.remove(3);
	System.out.println("----------------------------------");
	
	//Collections工具类的一些操作方法
	Collections.reverse(list2);//集合的次序反转
	Collections.sort(list2);//按照升序进行排列
	Collections.swap(list2,2,3);//根据下标进行交换
	Collections.rotate(list2, 1);//将后面一个移动到前面
	Collections.shuffle(list2);//随机进行排序
	
	}

}
