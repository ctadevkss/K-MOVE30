package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;


class WindowExample8 {
    public static void main(String[] args) {
    	
    	// DB����(����, ��ȸ, ����, �߰� Ŭ����) 
    	JDBC_Manager jdbcManager = new JDBC_Manager();
    	
        JFrame frame = new JFrame("������ ��� ���α׷�");
        frame.setPreferredSize(new Dimension(430, 200));
        frame.setLocation(500, 400);
        
        Container contentPane = frame.getContentPane();
        String colNames[] = { "�̸�", "����", "����" };
        DefaultTableModel model = new DefaultTableModel(colNames, 0);
        JTable table = new JTable(model);         
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel panel = new JPanel();
        
        JTextField text1 = new JTextField(3);
        JTextField text2 = new JTextField(3);
        JTextField text3 = new JTextField(2);
        
        JButton selectBtn = new JButton("��ȸ");
        JButton button1 = new JButton("�߰�");
        JButton button2 = new JButton("����");
        
        panel.add(new JLabel("�̸�"));
        panel.add(text1);
        panel.add(new JLabel("����"));
        panel.add(text2);
        panel.add(new JLabel("����"));
        panel.add(text3);
        
        panel.add(selectBtn);
        panel.add(button1);
        panel.add(button2);
        contentPane.add(panel, BorderLayout.SOUTH);

        // ��ȸ��ư �̺�Ʈ������ ���
        //selectBtn.addActionListener(null);
        selectBtn.addActionListener(new SelectActionListener(jdbcManager, table));
        button1.addActionListener(new AddActionListener(table, text1, text2, text3));
        button2.addActionListener(new RemoveActionListener(jdbcManager, table));
        

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("���α׷� ����");
        
        
        
        try {
        	
        	jdbcManager.DBConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/mysql", "root", "12345");
        	System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
        	frame.setTitle("������ ��� ���α׷� - DB���� ����");
        	
        }catch (ClassNotFoundException cnfe) {
                System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                cnfe.getMessage());
                frame.setTitle("������ ��� ���α׷� - DB���� ����");
        
        }catch (Exception e) {
			e.getMessage();
			frame.setTitle("������ ��� ���α׷� - DB���� ����");
		}
    }
}
