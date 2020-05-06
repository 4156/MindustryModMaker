package ProjectViewer;

import GUI.GUI;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProjectViewer {
    static public String fileString, jsonString, itemString, liquidString, blockString, mechString, unitString, scriptString;
    static public File itemFile,blockFile,liquidFile,mechFile,scriptFile,unitFile;
    boolean can;
    public ProjectViewer() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int i=jfc.showOpenDialog(GUI.j1.getContentPane());
        if(i==JFileChooser.APPROVE_OPTION){
            File file=jfc.getSelectedFile();
            jsonString=file.getPath()+"\\mod.json";
            fileString=file.getPath();
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
                itemFile=new File(itemString);
                blockFile=new File(blockString);
                liquidFile=new File(liquidString);
                mechFile=new File(mechString);
                scriptFile=new File(scriptString);
                unitFile=new File(unitString);
                String[]name=itemFile.list();
                assert name != null;
                for(int x = 0; x<=name.length; x++){
                   GUI.jt1.append(name[x]);
                }




            }

        }
    }
}
