package task6;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Data implements TableModel {
	private String[] title = {
			"����","����","��ѧ","Ӣ��","����","��ѧ","����"
	};
	
	private String[][] data = new String[30][7];
	
	public Data() {
		for(int i = 0;i<data.length;i++) {
			for(int j = 0;j<data[i].length;j++) {
				data[i][j] = "";
			}
		}
	}
	public int getRowCount() {
		return 30;//�����30��
	}

	public int getColumnCount() {
		return 7;//�����7��
	}

	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;//ÿһ�������Ƿ��ܱ༭
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = (String)aValue;
	}

	public void addTableModelListener(TableModelListener l) {
			
	}

	public void removeTableModelListener(TableModelListener l) {

	}

}
