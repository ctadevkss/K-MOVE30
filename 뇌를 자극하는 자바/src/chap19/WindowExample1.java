package chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.swing.SwingAccessor;

public class WindowExample1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello Java Program");
		
		//frame.setLocation(500, 400);
		
		frame.setPreferredSize(new Dimension(300, 200));
		Container contentPane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello, Java", SwingConstants.CENTER);
		contentPane.add(label);
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // 화면 정중앙 배치

	}

}
