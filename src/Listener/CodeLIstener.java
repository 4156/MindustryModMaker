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
        GUI.vector1.clear();
        GUI.jlt1.setListData(GUI.vector1);
        
        if(e.getKeyCode() == KeyEvent.VK_N) {
            GUI.vector1.add("\"name\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_O) {
            GUI.vector1.add("\"outputItem\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_A) {
            GUI.vector1.add("\"amount\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_I) {
            GUI.vector1.add("\"items\"");
            GUI.vector1.add("\"idleSound\"");
            GUI.vector1.add("\"idleSoundVolumes\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_U) {
            GUI.vector1.add("\"updateEffect\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_P) {
            GUI.vector1.add("\"power\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_T) {
            GUI.vector1.add("\"type\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_D) {
            GUI.vector1.add("\"description\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_L) {
            GUI.vector1.add("\"liquid\"");
            GUI.vector1.add("\"lead\"");
            GUI.vector1.add("\"liquidCapacity\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_R) {
            GUI.vector1.add("\"requirements\"");
            GUI.vector1.add("\"research\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_S) {
            GUI.vector1.add("\"size\"");
            GUI.vector1.add("\"silicon\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_H) {
            GUI.vector1.add("\"hasItems\"");
            GUI.vector1.add("\"hasLiquids\"");
            GUI.vector1.add("\"hasPower\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
        if(e.getKeyCode() == KeyEvent.VK_C) {
            GUI.vector1.add("\"craftTime\"");
            GUI.vector1.add("\"consumes\"");
            GUI.vector1.add("\"category\"");
            GUI.vector1.add("\"crafting\"");
            GUI.jlt1.setListData(GUI.vector1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
