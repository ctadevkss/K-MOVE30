package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class WindowExample7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("������ ��� ���α׷�");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setLocation(500, 400);
        Container contentPane = frame.getContentPane();
        String colNames[] = { "�̸�", "����", "����" };
        Object data[][] = { { "��ö��", 24, '��' }, 
                            { "�̼���", 21, '��' }, 
                            { "������", 26, '��' } };
        
        JTable table = new JTable(data, colNames);         
        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        
        JButton button = new JButton("���");
        button.addActionListener(new PrintActionListener(table));
        contentPane.add(button, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
