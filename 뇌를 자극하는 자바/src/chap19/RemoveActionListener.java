package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
    JTable table;
    RemoveActionListener(JTable table) {
        this.table = table;
    }
    public void actionPerformed(ActionEvent e) {
        int row = table.getSelectedRow();
        if (row == -1)
            return;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(row);        
    }
}
