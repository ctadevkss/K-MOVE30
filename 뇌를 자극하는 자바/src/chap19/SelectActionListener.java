package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

public class SelectActionListener implements ActionListener {

	// �Ӽ�
	JTable table;
	JDBC_Manager jdbcManager;
	ResultSet rs;
	// ������
	public SelectActionListener(JDBC_Manager jdbcManager, JTable table) {
		super();
		this.jdbcManager = jdbcManager;
		this.table = table;
	}

	// �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("��ȸ��ư");
		
		String query = "select pname, age, gender from person";
        String arr[] = new String[3];
        //arr[0] = text1.getText();
        //arr[1] = text2.getText();
        //arr[2] = text3.getText();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
		try {
			rs = jdbcManager.SelectTable(query);
			model.setNumRows(0);
			
			ResultSetMetaData md = rs.getMetaData() ;
			int columnCount = md.getColumnCount();
			System.out.println("�÷�����: " + columnCount);
			
			rs.last();  // ���ڵ�¿� Ŀ���� ������ ������ �̵�

			int rowCount = rs.getRow(); // ���ڵ� ����  

			rs.beforeFirst(); // ���ڵ�¿� Ŀ���� ó�� ������ �̵�
			
			System.out.println("���ڵ� ����: " + rowCount);
			
			// ��ȸ�� ����� 1���̻� �ִٸ� 
			if( rowCount >= 1 ) {
				
				while(rs.next()) {
					arr[0] = rs.getString("pname");
					arr[1] = rs.getString("age");
					//arr[2] = rs.getString("gender");
				    // ������ ��/�� ���а����� ����
				     arr[2] = rs.getString("gender").equals("m") ? "��": "��";
					System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
					model.addRow(arr); // �����͸� ���̺� �߰�
				}
			} else {
				// ��ȸ�� ����� ������
				
				JOptionPane.showMessageDialog(null, "��ȸ�� ����� �����ϴ�.", "��� �޽���", JOptionPane.WARNING_MESSAGE);
				
				System.out.println("��ȸ�� ��� �����ϴ�.");
			}
			
		}catch (Exception ex) {
			ex.getMessage();
		}
		
		//int row = table.getSelectedRow();
		//int col = table.getSelectedColumn();
		//Object value = table.getValueAt(row, col);
		//Object value = table.getValueAt(0, 1);
		//System.out.println((String)value);

		System.out.println("�޼ҵ� ����");
	}
}
