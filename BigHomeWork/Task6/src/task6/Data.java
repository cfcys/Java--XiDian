package task6;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Data implements TableModel {
	private String[] title = {
			"姓名","语文","数学","英语","物理","化学","生物"
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
		return 30;//表格有30行
	}

	public int getColumnCount() {
		return 7;//表格有7列
	}

	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;//每一个格子是否能编辑
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
