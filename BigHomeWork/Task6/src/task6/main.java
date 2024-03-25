package task6;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new Data());//以表格的形式显示和编辑数据，并不储存数据，只是数据的表现
		JScrollPane pane = new JScrollPane(table);//添加一个滚动条
		frame.add(pane);
		frame.pack();//自动去计算下其大小
		frame.setTitle("某班成绩单");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//是该表格可见
	}

}
