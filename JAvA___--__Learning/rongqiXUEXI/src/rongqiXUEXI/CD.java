package rongqiXUEXI;

public class CD {
	private String title;
	private String author;
	private int Time;
	private boolean Gotit = false;
	private String comment;
	public CD(String title, String author, int time, String comment) {
		super();
		this.title = title;
		this.author = author;
		Time = time; 
		this.comment = comment;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public void print() {
		// TODO 自动生成的方法存根
		System.out.println("CD:"+title+":"+author);
	}

}
