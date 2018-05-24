/**
 * 2018. 5. 24. Dev By Kim.S.S
   chap19
   WindowExample2.java
 */
package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Administrator
 *
 */
public class WindowExample2 {

	public static void main(String[] args) {
	
		JFrame jframe = new JFrame("Hello Program");
		jframe.setPreferredSize(new Dimension(250, 350));
		//jframe.setLocation(500, 400);
		
		ImageIcon image = new ImageIcon("images/java.png");
		JLabel imageLabel = new JLabel(image);
		
		Container container = jframe.getContentPane();
		
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("Hello");
		
		container.add(text, BorderLayout.CENTER);
		container.add(button, BorderLayout.EAST);
		container.add(label, BorderLayout.SOUTH);
		container.add(imageLabel, BorderLayout.NORTH);
				
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null); // 화면 정중앙 배치

	}

}
