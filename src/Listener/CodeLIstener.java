package Listener;

import GUI.GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class CodeLIstener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_N) {
            GUI.vector1.add("\"name\"");
            GUI.vector1.add("\"namen\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
