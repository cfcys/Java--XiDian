package task6;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new Data());//�Ա�����ʽ��ʾ�ͱ༭���ݣ������������ݣ�ֻ�����ݵı���
		JScrollPane pane = new JScrollPane(table);//���һ��������
		frame.add(pane);
		frame.pack();//�Զ�ȥ���������С
		frame.setTitle("ĳ��ɼ���");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//�Ǹñ��ɼ�
	}

}
