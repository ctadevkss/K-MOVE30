package chap19;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample5 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Cafe Program");
		frame.setPreferredSize(new Dimension(600, 300));
		
		// ����
		Color color =  new Color(0, 0, 0);
		frame.getContentPane().setBackground( color );
				
		Container contentPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("�ڹ�"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("īǪġ��"));
		contentPane.add(new JButton("��縶��ƾ"));
		contentPane.add(new JButton("�ݷ����"));
		contentPane.add(new JButton("�Ƹ޸�ī��"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // ȭ�� ���߾� ��ġ

	}

}
