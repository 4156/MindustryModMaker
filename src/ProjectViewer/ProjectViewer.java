package ProjectViewer;

import GUI.GUI;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProjectViewer {
    static public String fileString, jsonString, itemString, liquidString, blockString, mechString, unitString, scriptString,itemSpriteString,spriteString;
    static public File itemFile,blockFile,liquidFile,mechFile,scriptFile,unitFile,spriteFile,itemSpriteFile,blockSpriteFile,liquidSpriteFile,mechSpriteFile,unitSpriteFile;
    boolean can;
    public ProjectViewer() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int i=jfc.showOpenDialog(GUI.j1.getContentPane());
        if(i==JFileChooser.APPROVE_OPTION){
            File file=jfc.getSelectedFile();
            jsonString=file.getPath()+"\\mod.json";
            fileString=file.getPath();
            spriteString=file.getPath()+"\\sprites";
            File mod =new File(jsonString);
            if(mod.exists()){
                System.out.println(mod.getPath());
                can=true;
            }
            if(can){
                File content=new File(fileString+"\\content");
                itemString=content.getPath()+"\\items";
                blockString=content.getPath()+"\\blocks";
                liquidString=content.getPath()+"\\liquids";
                mechString=content.getPath()+"\\mechs";
                unitString=content.getPath()+"\\units";
                scriptString=file.getPath()+"\\scripts";
                //
                itemFile=new File(itemString);
                blockFile=new File(blockString);
                liquidFile=new File(liquidString);
                mechFile=new File(mechString);
                scriptFile=new File(scriptString);
                unitFile=new File(unitString);
                spriteFile=new File(spriteString);
                //
                itemSpriteFile=new File(spriteString+"\\items");
                blockSpriteFile=new File(spriteString+"\\blocks");
                liquidSpriteFile=new File(spriteString+"\\liquids");
                mechSpriteFile=new File(spriteString+"\\mechs");
                unitSpriteFile=new File(spriteString+"\\units");
                spriteFile=new File(spriteString);
                //
                String[]name=itemFile.list();
                assert name != null;
                for(int x = 0; x<name.length; x++){
                   GUI.pvv1.add(name[x]);
                   GUI.pvl1.setListData(GUI.pvv1);
                }
                //
                String[]name1=liquidFile.list();
                assert name1 != null;
                for(int x = 0; x<name1.length; x++){
                    GUI.pvv2.add(name1[x]);
                    GUI.pvl2.setListData(GUI.pvv2);
                }
                //
                String[]name2=blockFile.list();
                assert name2 != null;
                for(int x = 0; x<name2.length; x++){
                    GUI.pvv3.add(name2[x]);
                    GUI.pvl3.setListData(GUI.pvv3);
                }
                //
                String[]name3=mechFile.list();
                assert name3 != null;
                for(int x = 0; x<name3.length; x++){
                    GUI.pvv4.add(name3[x]);
                    GUI.pvl4.setListData(GUI.pvv4);
                }
                //
                String[]name4=unitFile.list();
                assert name4 != null;
                for(int x = 0; x<name4.length; x++){
                    GUI.pvv5.add(name4[x]);
                    GUI.pvl5.setListData(GUI.pvv5);
                }
                //
                String[]name5=scriptFile.list();
                assert name5 != null;
                for(int x = 0; x<name5.length; x++){
                    GUI.pvv6.add(name5[x]);
                    GUI.pvl6.setListData(GUI.pvv6);
                }




            }

        }
    }
}
