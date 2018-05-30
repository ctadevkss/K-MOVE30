package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;

import com.kosea.kmove30.JDBC_Manager;

public class UpdateActionListener implements ActionListener {

	JDBC_Manager jdbcManager;
	JTextField text1,text2; //  JTextField textAge; 
	
	public UpdateActionListener(JDBC_Manager jdbcManager, 
								JTextField text1, JTextField text2) {
		super();
		this.jdbcManager = jdbcManager;
		this.text1 = text1; 
		this.text2 = text2;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
        try {
    		// DB수정 작업
        	String name = text1.getText();
        	String age  = text2.getText();
    		jdbcManager.updateTable(name, age);

        }catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	
}
