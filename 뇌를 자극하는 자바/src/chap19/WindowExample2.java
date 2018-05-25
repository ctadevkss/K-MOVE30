/**
 * 2018. 5. 24. Dev By Kim.S.S
   chap19
   WindowExample2.java
 */
package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Administrator
 *
 */
public class WindowExample2 {

	public static void main(String[] args) {
	
		JFrame jframe = new JFrame("Hello Program");
		jframe.setPreferredSize(new Dimension(200, 90));
		//jframe.setLocation(500, 400);
		
		//ImageIcon image = new ImageIcon("images/java.png");
		//JLabel imageLabel = new JLabel(image);
		
		Container container = jframe.getContentPane();
		
		JTextField text = new JTextField("�̸��� �Է��ϼ���.");
		JButton button = new JButton("Ȯ��");
		JLabel label = new JLabel("Hello");
		
		container.add(text, BorderLayout.CENTER);
		container.add(button, BorderLayout.EAST);
		container.add(label, BorderLayout.SOUTH);
		//container.add(imageLabel, BorderLayout.NORTH);
		
		//ActionListener listener = new ConfirmButtonActionListener(text, label); 
		//button.addActionListener(listener);
		button.addActionListener(new ConfirmButtonActionListener(text, label));
		text.addActionListener(new ConfirmButtonActionListener(text, label));
		
		container.setFocusable(true); 				// �����̳ʿ� ��Ŀ���� ����
		
		text.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {  // �ؽ�Ʈ�ʵ尡 ��Ŀ���� ������ 
		          text.setText("");                  // �̸��� �Է��ϼ���. ���ڿ� ����
			}

		    public void focusLost(FocusEvent e) { }
		 });
		
		text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed");
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("VK_ENTER");
				}
			}
		});
			
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null); // ȭ�� ���߾� ��ġ

	}

}
