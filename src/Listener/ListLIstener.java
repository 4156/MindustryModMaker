package Listener;

import GUI.GUI;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListLIstener implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
            GUI.jt1.append(GUI.vector1.elementAt(GUI.jlt1.getSelectedIndex()).toString());
            GUI.vector1.clear();
            GUI.jlt1.setListData(GUI.vector1);
    }
}
