package Components;

import ProjectViewer.ItemViewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectButton extends JButton {
    public ProjectButton(String name,String path,String into){
        setSize(100,100);
        setText(name);
        setIcon(new ImageIcon(path));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ItemViewer iw=new ItemViewer(path,name,into);
            }
        });
    }
}
