package jichenxuexi;

public class CD extends Item {

	public CD(String name, String author, int time, String comment) {
		super(name, author, time, comment);
		// TODO 自动生成的构造函数存根
	}
	public void print() {
		System.out.println("CD:"+Name+"作者:"+Author);
	}


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CD cd = new CD("想你的液","我",56,"你懂的");
		CD cd2 = new CD("想你的液","我",56,"你懂的");
		System.out.println(cd.equals(cd2));//若是从这个Object类里得来的
		//equals是只能判断是不是自身的
		//System.out.println(cd.toString());//将一个对象以字符串的形式显示出来
	}
	@Override
	public boolean equals(Object obj) {
		CD cc = (CD)obj;
		return Name.equals(cc.Name);
	}
	@Override
	public String toString() {
		return "CD [Name=" + Name + ", Author=" + Author + ", Time=" + Time + ", Comment=" + Comment + ", toString()="
				+ super.toString() + "]";
	}

}
