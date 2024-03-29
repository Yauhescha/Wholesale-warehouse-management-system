package tableModal;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entity.Employee;

/**
 * 
 * @author admin
 * Модель таблицы сотрудника
 */
public class EmployeeTableModal extends AbstractTableModel {

	private static final int ID_COL = 0;
	private static final int FIO_COL = 1;
	private static final int PHONE_COL = 2;
	private static final int EMAIL_COL = 3;

	private final String[] columnNames = {"Id", "FIO", "Phone", "Email" };
	private List<Employee > list;

	public EmployeeTableModal(List<Employee > theProviders) {
		list = theProviders;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		Employee temp = list.get(row);

		switch (col) {
		case ID_COL:
			return temp.getId();
		case FIO_COL:
			return temp.getFio();
		case PHONE_COL:
			return temp.getPhone();
		case EMAIL_COL:
			return temp.getEmail();
		default:
			return temp.getFio();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
