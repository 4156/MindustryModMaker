//傻瓜理解版
package GUI;

import Listener.*;
import ProjectViewer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class GUI extends JFrame {
    public static JFrame j1;//主窗口
    public static Container c1;//主窗口的容器
    public static Container pv1,pv2,pv3,pv4,pv5,pv6;//项目管理器的容器
    public static JTextArea jt1;//写字区域
    public static JList jlt1;//代码提示窗口
    public static JList pvl1,pvl2,pvl3,pvl4,pvl5,pvl6;//项目管理器窗口栏
    public static Vector vector1;//代码提示容器
    public static Vector pvv1,pvv2,pvv3,pvv4,pvv5,pvv6;//项目管理器容器
    public static JMenuBar jm1;//菜单栏
    public static JMenu jmu1;//菜单容器
    public static JMenuItem jmi1,jmi2,jmi3,jmi4;//仨菜单按钮
    public static JTabbedPane jp1;//项目结构
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
        //仨按钮
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
        jmi3=new JMenuItem("打开项目");
        jmi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProjectViewer pj=new ProjectViewer();
            }
        });
        jmi4=new JMenuItem("项目管理器");
        jmi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProjectManagement pj=new ProjectManagement("项目管理器");
            }
        });

        //
        pv1=new Container();
        pv2=new Container();
        pv3=new Container();
        pv4=new Container();
        pv5=new Container();
        pv6=new Container();
        //
        jmu1.add(jmi1);
        jmu1.add(jmi2);
        jmu1.add(jmi3);
        jmu1.add(jmi4);
        jmi2=new JMenuItem();//打开
        //项目管理器
        jp1=new JTabbedPane();
        jp1.setBounds(0,300,300,300);
        jp1.addTab("items",pv1);
        jp1.addTab("liquids",pv2);
        jp1.addTab("blocks",pv3);
        jp1.addTab("mechs",pv4);
        jp1.addTab("units",pv5);
        jp1.addTab("scripts",pv6);
        //
        pvv1=new Vector();
        pvv2=new Vector();
        pvv3=new Vector();
        pvv4=new Vector();
        pvv5=new Vector();
        pvv6=new Vector();
        //
        pvl1=new JList(pvv1);
        pvl1.setSize(300,300);
        pvl1.addListSelectionListener(new ItemProjectListener());
        pvl2=new JList(pvv2);
        pvl2.setSize(300,300);
        pvl2.addListSelectionListener(new LiquidProjectListener());
        pvl3=new JList(pvv3);
        pvl3.setSize(300,300);
        pvl3.addListSelectionListener(new BlockProjectListener());
        pvl4=new JList(pvv4);
        pvl4.setSize(300,300);
        pvl4.addListSelectionListener(new MechProjectListener());
        pvl5=new JList(pvv5);
        pvl5.setSize(300,300);
        pvl5.addListSelectionListener(new UnitProjectListener());
        pvl6=new JList(pvv6);
        pvl6.setSize(300,300);
        pvl6.addListSelectionListener(new ScriptProjectListener());
        //
        pv1.add(pvl1);
        pv2.add(pvl2);
        pv3.add(pvl3);
        pv4.add(pvl4);
        pv5.add(pvl5);
        pv6.add(pvl6);



        c1.add(jp1);
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
