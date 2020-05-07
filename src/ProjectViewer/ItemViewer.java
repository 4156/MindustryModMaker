package ProjectViewer;

import Components.ProjectButton;
import GUI.GUI;

import javax.swing.*;
import java.awt.*;

import static ProjectViewer.ProjectViewer.*;

public class ItemViewer extends JFrame {
    public static JLabel picture,name,introduction;
    public static Container c1;
    public ItemViewer(String iconPath,String na,String into){
        c1=getContentPane();
        setLayout(null);
        setSize(500,500);
        picture=new JLabel();
        picture.setBounds(50,50,150,150);
        picture.setIcon(new ImageIcon(iconPath));
        c1.add(picture);
        name=new JLabel();
        name.setBounds(50,200,150,100);
        name.setText(na);
        c1.add(name);
        introduction=new JLabel();
        introduction.setBounds(250,0,250,250);
        introduction.setText(into);
        c1.add(introduction);
        setVisible(true);


    }
}
