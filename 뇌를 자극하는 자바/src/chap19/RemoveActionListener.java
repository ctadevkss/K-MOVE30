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
        
		int confirm = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", 
				    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		System.out.println("confirm: " + confirm);
		
		if(confirm  == 1) // 아니오를 선택하면 
			return;       // 종료   
		
		
		int row = table.getSelectedRow();
       
        if (row == -1)
            return;
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        //////// 삭제될 이름 
        Object name = table.getValueAt(row, 0);
        String deleteName = name.toString();
        System.out.println(deleteName);
        //////////////////////////////////
        
        model.removeRow(row);  // 선택된 행을 삭제 
        
        try {
        	// DB 테이블 레코드(데이터) 삭제 
        	jdbcManager.deleteTable(deleteName);
        }catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
    }
}
