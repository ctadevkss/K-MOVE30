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
		
		// ��ư�� Ŭ���Ǿ��� �� �߻�
		String name = text.getText();
		
		if(!name.equals("�̸��� �Է��ϼ���."))
			label.setText("Hi ," + name);
		else
			label.setText("Hi ");
	}
}
