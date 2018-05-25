package chap19;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample3 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Zoo Program");
		frame.setPreferredSize(new Dimension(600, 300));
		
		//frame.setLocation(1200, 800);
		
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(3, 2);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�ڻԼ�"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���̿���"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // ȭ�� ���߾� ��ġ
		
	}

}
