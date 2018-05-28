package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

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
			
			while(rs.next()) {
				arr[0] = rs.getString("pname");
				arr[1] = rs.getString("age");
				
				// ������ ��/�� ���а����� ����
				arr[2] = rs.getString("gender");
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
				model.addRow(arr); // �����͸� ���̺� ��
			}
			
		}catch (Exception ex) {
			ex.getMessage();
		}
		
	}
}
