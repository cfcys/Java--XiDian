package notebook;

import java.util.ArrayList;

class Value{
	private  int i;
	public void set(int i) {
		this.i = i;
	}
	public int get() {
		return i;
	}
}

public class ForEach {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Value[] a = new Value[10];
//		for(int i = 0;i<a.length;i++) {
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for(Value v : a) {
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for(Value v : a) {
//			System.out.println(v.get());
//		}		
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		for(String s : a) {
			System.out.println(s);
		}
	}
}
