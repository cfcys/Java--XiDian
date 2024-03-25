package databases;

import java.util.ArrayList;

public class Databases {
	ArrayList<Item> listItem = new ArrayList<Item>();
	
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
		Databases db = new Databases();
		db.add(new CD("哦吼","我",14,"欸哈哈哈"));
		db.add(new CD("勿忘初心","新时代",565,"真的很好"));
		db.add(new DVD("倩女幽魂","著名导演",599,"经典"));
		db.add(new DVD("西电","我",12,"emmmm"));
		db.list();
	}

}
