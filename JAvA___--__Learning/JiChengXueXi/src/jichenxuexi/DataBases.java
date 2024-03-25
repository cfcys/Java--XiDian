package jichenxuexi;

import java.util.ArrayList;

public class DataBases {
private ArrayList<Item> listItem = new ArrayList<>();

public void add(Item item) {
	listItem.add(item);
}
public void list() {
	for(Item a : listItem) {
		a.print();
	}
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DataBases db = new DataBases();
		db.add(new CD("想你的夜","不知道",56,"还可以吧"));
		db.add(new CD("lalalalala","也不知道",69,"不经典"));
		db.add(new DVD("火星救援","外国人",495,"让人期待"));
		db.add(new DVD("这个杀手不太冷","尼克",595,"嘿嘿嘿"));
		db.add(new VideoGame("MineCraft", "JAVA", 0, null, 0));
		db.list();
	}

}
