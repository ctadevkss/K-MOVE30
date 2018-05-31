package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

public class RemoveActionListener implements ActionListener {
    
	JTable table;
	JDBC_Manager jdbcManager;
	
	public RemoveActionListener(JDBC_Manager jdbcManager, JTable table) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
	}

	public void actionPerformed(ActionEvent e) {
        
		int confirm = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", 
				    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		System.out.println("confirm: " + confirm);
		
		if(confirm  == 1) // �ƴϿ��� �����ϸ� 
			return;       // ����   
		
		
		int row = table.getSelectedRow();
       
        if (row == -1)
            return;
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        //////// ������ �̸� 
        Object name = table.getValueAt(row, 0);
        String deleteName = name.toString();
        System.out.println(deleteName);
        //////////////////////////////////
        
        model.removeRow(row);  // ���õ� ���� ���� 
        
        try {
        	// DB ���̺� ���ڵ�(������) ���� 
        	jdbcManager.deleteTable(deleteName);
        }catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
    }
}
