package rongqiXUEXI;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	public void list() {
		for(CD cd : listCD) {
			cd.print();
		}
		for(DVD dvd : listDVD) {
			dvd.print();
		}
	}	
	private void add(DVD dvd) {
		// TODO �Զ����ɵķ������
		listDVD.add(dvd);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 Database db = new Database();
		 db.add(new CD("��Ա","Ѧ֮ǫ",70,"ֵ�û���"));
		 db.add(new CD("��ð�","����",89,"������"));
		 db.add(new DVD("Ф��˵ľ���","��֪��",464,"��֮�����ĵ�һ"));
		 db.add(new DVD("������","�ڶ���",566,"�ٺٺ�"));
		 db.list();
		 
	}

}
