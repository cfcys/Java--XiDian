package jichenxuexi;

public class VideoGame extends Item {
	private int numOFplayers;
	public VideoGame(String name, String author, int time, String comment,int num) {
		super(name, author, time, comment);
		this.numOFplayers = num;
	}
	@Override
	public void print() {
		System.out.print("VedioGame:");
		System.out.println(Name+"����:"+Author);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}
}
