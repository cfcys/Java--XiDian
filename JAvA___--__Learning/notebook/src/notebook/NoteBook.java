package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>(); 
	public void add(String S) {
		notes.add(S);
	}
	public void add(int index,String S) {
		notes.add(index, S);
	}
	public int getsize() {
		return notes.size();
	}
	public String getNote(int index){
		return notes.get(index);
	}
	public void remove(int index) {
		notes.remove(index);
	}
	public String[] list() {
		String[] a = new String[notes.size()];
		for(int i = 0;i<notes.size();i++) {
			a[i] = notes.get(i);
		}
		return a;
	}
	public static void main(String[] args) {
	NoteBook nb = new NoteBook();
	nb.add("First");
	nb.add("Second");
	nb.add(1, "None of the Second");
	System.out.println(nb.getsize());
	System.out.println(nb.getNote(0));
	System.out.println(nb.getNote(1));
	System.out.println(nb.getNote(2));//会向后面顺延
	nb.remove(1);
	String[] a = nb.list();
	for(String s : a) {
		System.out.println(s);
	}
	}
}
