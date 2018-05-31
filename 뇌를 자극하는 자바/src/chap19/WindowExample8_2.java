package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;


class WindowExample8_2 {
    public static void main(String[] args) {
    	
    	// DB����(����, ��ȸ, ����, �߰� Ŭ����) 
    	JDBC_Manager jdbcManager = new JDBC_Manager();
    	
        JFrame frame = new JFrame("������ ��� ���α׷�");
        frame.setPreferredSize(new Dimension(540, 200));
        frame.setLocation(500, 400);
        
        Container contentPane = frame.getContentPane();
        
        String colNames[] = { "�̸�", "����", "����" };
        String genders[] = {"����", "��", "��"};
        
        DefaultTableModel model = new DefaultTableModel(colNames, 0);
        JTable table = new JTable(model);         
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel panel = new JPanel();
        
        
        JTextField text1 = new JTextField(3);
        JTextField text2 = new JTextField(3);
        JComboBox<String> genderCombox  = new JComboBox<String>(genders); 
        //JTextField text3 = new JTextField(2);
        
        JButton selectBtn = new JButton("��ȸ");
        JButton button1   = new JButton("�߰�");
        JButton updateBtn = new JButton("����");
        JButton button2   = new JButton("����");
        
        panel.add(new JLabel("�̸�"));
        panel.add(text1);
        panel.add(new JLabel("����"));
        panel.add(text2);
        panel.add(new JLabel("����"));
        panel.add(genderCombox);
        //panel.add(text3);
        
        panel.add(selectBtn);
        panel.add(button1);
        panel.add(updateBtn);
        panel.add(button2);
        contentPane.add(panel, BorderLayout.SOUTH);

        // ��ȸ��ư �̺�Ʈ������ ���
        table.addMouseListener(new MyMouseListener(text1, text2, genderCombox));
        selectBtn.addActionListener(new SelectActionListener(jdbcManager, table));
        button1.addActionListener(new AddActionListener(jdbcManager, table, text1, text2, genderCombox));
        updateBtn.addActionListener(new UpdateActionListener(jdbcManager, text1, text2));
        button2.addActionListener(new RemoveActionListener(jdbcManager, table));
        
              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("���α׷� ����");
        
        
        
        try {
        	
        	jdbcManager.DBConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf8", "root", "12345");
        	System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
        	frame.setTitle("������ ��� ���α׷� - DB���� ����");
        	
        }catch (ClassNotFoundException cnfe) {
                System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
                frame.setTitle("������ ��� ���α׷� - DB���� ����");
        
        }catch (Exception e) {
			System.out.println(e.getMessage());
			frame.setTitle("������ ��� ���α׷� - DB���� ����");
		}
    }
}
