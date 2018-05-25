package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener {
	
	JTextField text;
	JLabel label;
		
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		super();
		this.text = text;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 버튼이 클릭되었을 때 발생
		String name = text.getText();
		
		if(!name.equals("이름을 입력하세요."))
			label.setText("Hi ," + name);
		else
			label.setText("Hi ");
	}
}
