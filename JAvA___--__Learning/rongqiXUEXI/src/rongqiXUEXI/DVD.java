package rongqiXUEXI;

public class DVD {
	private String title;
	private String director;
	private int Time;
	private boolean Gotit = false;
	public DVD(String title, String director, int time, String comment) {
		super();
		this.title = title;
		this.director = director;
		Time = time;
		this.comment = comment;
	}
	private String comment;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	public void print() {
		// TODO �Զ����ɵķ������
		System.out.println("DVD:"+title+":"+director);
	}

}
