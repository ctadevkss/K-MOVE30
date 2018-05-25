package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Exercise19_3_Listener implements ActionListener {

	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	public Exercise19_3_Listener(JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("확인")) {
			String strNum1 = text1.getText();
			String strNum2 = text2.getText();
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			int total = num1 + num2;
			System.out.println(total);
			
			text3.setText(String.valueOf(total));	
		}
		else {
		    // 초기화
			text1.setText("");
			text2.setText("");
			text3.setText("");
		}	
	}
}