package jichenxuexi;

public class CD extends Item {

	public CD(String name, String author, int time, String comment) {
		super(name, author, time, comment);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void print() {
		System.out.println("CD:"+Name+"����:"+Author);
	}


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CD cd = new CD("�����Һ","��",56,"�㶮��");
		CD cd2 = new CD("�����Һ","��",56,"�㶮��");
		System.out.println(cd.equals(cd2));//���Ǵ����Object���������
		//equals��ֻ���ж��ǲ��������
		//System.out.println(cd.toString());//��һ���������ַ�������ʽ��ʾ����
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
