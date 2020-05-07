package ProjectViewer;

import Components.ProjectButton;

import javax.swing.*;
import java.awt.*;

import static ProjectViewer.ProjectViewer.*;

public class ProjectManagement extends JFrame {

    public static Container c1;
    public ProjectManagement(String name){
       setLayout(null);
       setTitle(name);
       setSize(1500,800);
       setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
       c1=getContentPane();
       setVisible(true);
        String[]namen=itemFile.list();
        String[]path=itemSpriteFile.list();
        int x1=0;
        int y1=0;
        assert namen != null;
        for(int x = 0; x<namen.length; x++){
            assert path != null;
            ProjectButton p=new ProjectButton(namen[x],itemSpriteFile.getPath()+"\\"+path[x],"xxx");
            p.setVisible(true);
            p.setBounds(x1,y1,100,100);
            c1.add(p);
            x1=x1+100;
        }
        //
        String[]namea=blockFile.list();
        String[]patha=blockSpriteFile.list();
        int x1a=0;
        int y1a=100;
        assert namea != null;
        for(int x = 0; x<namea.length; x++){
            assert patha != null;
            ProjectButton p=new ProjectButton(namea[x],blockSpriteFile.getPath()+"\\"+patha[x],"xxx");
            p.setVisible(true);
            p.setBounds(x1a,y1a,100,100);
            c1.add(p);
            x1a=x1a+100;
        }
        //
        String[]nameb=liquidFile.list();
        String[]pathb=itemSpriteFile.list();
        int x1b=0;
        int y1b=200;
        assert nameb != null;
        for(int x = 0; x<nameb.length; x++){
            assert pathb != null;
            ProjectButton p=new ProjectButton(nameb[x],itemSpriteFile.getPath()+"\\"+nameb[x],"xxx");
            p.setVisible(true);
            p.setBounds(x1b,y1b,100,100);
            c1.add(p);
            x1b=x1b+100;
        }
        //
        String[]namec=unitFile.list();
        String[]pathc=unitSpriteFile.list();
        int x1c=0;
        int y1c=300;
        assert namec != null;
        for(int x = 0; x<namec.length; x++){
            assert pathc != null;
            ProjectButton p=new ProjectButton(namec[x],unitSpriteFile.getPath()+"\\"+pathc[x],"xxx");
            p.setVisible(true);
            p.setBounds(x1c,y1c,100,100);
            c1.add(p);
            x1c=x1c+100;
        }
        //
        String[]named=mechFile.list();
        String[]pathd=mechSpriteFile.list();
        int x1d=0;
        int y1d=400;
        assert named != null;
        for(int x = 0; x<named.length; x++){
            assert pathd != null;
            ProjectButton p=new ProjectButton(named[x],mechSpriteFile.getPath()+"\\"+pathd[x],"xxx");
            p.setVisible(true);
            p.setBounds(x1d,y1d,100,100);
            c1.add(p);
            x1d=x1d+100;
        }

    }
    public void ad(Component c){
        c1.add(c);
    }
}
