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
		// TODO �Զ����ɵķ������
		DataBases db = new DataBases();
		db.add(new CD("�����ҹ","��֪��",56,"�����԰�"));
		db.add(new CD("lalalalala","Ҳ��֪��",69,"������"));
		db.add(new DVD("���Ǿ�Ԯ","�����",495,"�����ڴ�"));
		db.add(new DVD("���ɱ�ֲ�̫��","���",595,"�ٺٺ�"));
		db.add(new VideoGame("MineCraft", "JAVA", 0, null, 0));
		db.list();
	}

}
