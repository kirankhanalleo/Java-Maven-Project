package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranMenus extends Frame{
    MenuBar kiranMbr;
    Menu kiranm1,kiranm2,kiranm3,kiransbm;
    MenuItem kiranmi1,kiranmi2,kiranmi3,kiranmi4;
    KiranMenus(){
        this.setTitle("Kiran Khanal-104413/19");
        this.setSize(700,600);
        this.setLayout(null);
        //MenuBar
        kiranMbr = new MenuBar();
        //Menu
        kiranm1=new Menu("File");
        kiranm2=new Menu("Edit");
        kiranm3=new Menu("Help");
        kiransbm=new Menu("Export");
        kiranMbr.add(kiranm1); kiranMbr.add(kiranm2);
        kiranMbr.add(kiranm3);
        //MenuItems
        kiranmi1=new MenuItem("New");
        kiranmi2=new MenuItem("Open");
        kiranmi3=new MenuItem("Close");
        kiranmi4=new MenuItem("ZIP");
        kiranm1.add(kiranmi1); kiranm1.add(kiranmi2); kiranm1.add(kiranmi3);
        kiranm1.add(kiransbm);
        //SubMenu
        kiransbm.add(kiranmi4);
        this.setMenuBar(kiranMbr);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranMenus();
    }
}
