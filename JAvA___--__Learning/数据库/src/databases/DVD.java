package databases;

public class DVD extends Item{
	
	public DVD(String name, String author, int time, String comment) {
		super(name, author, time, comment);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void print() {
		System.out.print("DVD:");
		print1();
		System.out.print("������");
		print2();
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
