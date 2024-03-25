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
		// TODO 自动生成的方法存根
		listDVD.add(dvd);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Database db = new Database();
		 db.add(new CD("演员","薛之谦",70,"值得回忆"));
		 db.add(new CD("你好啊","四叔",89,"啦啦啦"));
		 db.add(new DVD("肖申克的救赎","不知道",464,"当之无愧的第一"));
		 db.add(new DVD("霸王别姬","第二名",566,"嘿嘿嘿"));
		 db.list();
		 
	}

}
