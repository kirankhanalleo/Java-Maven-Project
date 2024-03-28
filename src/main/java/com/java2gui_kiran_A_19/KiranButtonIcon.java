package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
public class KiranButtonIcon extends JFrame{
    JButton kiranIc1, kiranIc2;
    KiranButtonIcon(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,200,50));
        kiranIc1=new JButton("Download");
        kiranIc1.setIcon(new ImageIcon("E:\\download.jpg"));
        kiranIc2=new JButton("Search");
        kiranIc2.setIcon(new ImageIcon("E:\\search.png"));
        this.add(kiranIc1); this.add(kiranIc2);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranButtonIcon();
    }
}

