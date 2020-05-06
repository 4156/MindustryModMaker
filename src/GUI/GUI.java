//傻瓜理解版
package GUI;

import Listener.CodeLIstener;
import Listener.ListLIstener;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.Buffer;
import java.util.Vector;

public class GUI extends JFrame {
    public static JFrame j1;//主窗口
    public static Container c1;//主窗口的容器
    public static JTextArea jt1;//写字区域
    public static JList jlt1;//代码提示窗口
    public static Vector vector1;//代码提示容器
    public static JMenuBar jm1;//菜单栏
    public static JMenu jmu1;//菜单容器
    public static JMenuItem jmi1,jmi2;//俩菜单按钮
    public GUI(){
        //给主窗口设置它的属性
        j1=new JFrame("Mindustry Mod Maker");//创建新对象
        j1.setLayout(null);//更改组件的排序(null是不自动排序)
        j1.setSize(1500,800);//窗口大小
        j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//点击退出按钮的时候发生什么
        c1=j1.getContentPane();//把c1这个容器设置成j1用的(容器是用来装组件的)
        //菜单栏的设置
        jm1=new JMenuBar();;
        //下拉内容的设置
        jmu1=new JMenu("选项");
        jm1.add(jmu1);
        //俩按钮
        jmi1=new JMenuItem("保存");//保存
        jmi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
                int i=jfc.showOpenDialog(getContentPane());
                if(i==JFileChooser.APPROVE_OPTION){
                    File file=jfc.getSelectedFile();
                    try {
                        FileWriter f=new FileWriter(file);
                        f.write(jt1.getText());
                        f.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        jmi2=new JMenuItem("打开");
        jmi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
                int i=jfc.showOpenDialog(getContentPane());
                if(i==JFileChooser.APPROVE_OPTION) {
                    File file=jfc.getSelectedFile();
                    StringBuilder result = new StringBuilder();
                    try {
                        BufferedReader bf=new BufferedReader(new FileReader(file));
                        String s;
                        while((s = bf.readLine())!=null){
                            result.append(System.lineSeparator()+s);
                        }
                        bf.close();
                        jt1.setText(result.toString());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        jmu1.add(jmi1);
        jmu1.add(jmi2);

        jmi2=new JMenuItem();//打开
        // 给写字的地方设置属性
        jt1=new JTextArea();
        jt1.setBounds(325,25,750,700);
        jt1.addKeyListener(new CodeLIstener());
        c1.add(jt1);
        //向量初始化
        vector1=new Vector();
        //代码提示
        jlt1=new JList(vector1);
        jlt1.addListSelectionListener(new ListLIstener());
        jlt1.setBounds(0,0,300,300);
        c1.add(jlt1);
        j1.setJMenuBar(jm1);
        j1.setVisible(true);//主窗口是否可见(放在最后免得刷新)



    }
}
