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
		// TODO �Զ����ɵķ������
		Databases db = new Databases();
		db.add(new CD("Ŷ��","��",14,"�G������"));
		db.add(new CD("��������","��ʱ��",565,"��ĺܺ�"));
		db.add(new DVD("ٻŮ�Ļ�","��������",599,"����"));
		db.add(new DVD("����","��",12,"emmmm"));
		db.list();
	}

}
