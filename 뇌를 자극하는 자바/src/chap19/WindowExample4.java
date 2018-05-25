package chap19;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample4 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setPreferredSize(new Dimension(600, 300));
		
		// ����
		Color color =  new Color(205, 250, 100);
		frame.getContentPane().setBackground( color );
				
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // ȭ�� ���߾� ��ġ

	}

}
