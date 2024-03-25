package databases;

public class DVD extends Item{
	
	public DVD(String name, String author, int time, String comment) {
		super(name, author, time, comment);
		// TODO 自动生成的构造函数存根
	}
	public void print() {
		System.out.print("DVD:");
		print1();
		System.out.print("评论是");
		print2();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
