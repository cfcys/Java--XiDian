package databases;

public class Item {
	private String Name;
	private String Author;
	private int Time;
	private boolean isPopular = false;
	private String Comment;

	public Item(String name, String author, int time, String comment) {
		super();
		Name = name;
		Author = author;
		Time = time;
		Comment = comment;
	}

	public void print1() {
		System.out.println(Name+"--"+Author);
	}
	public void print2() {
		System.out.println(Comment);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public void print() {
		// TODO 自动生成的方法存根
		
	}

}
