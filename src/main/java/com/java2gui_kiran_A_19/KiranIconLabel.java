package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
public class KiranIconLabel extends JFrame{
    JButton kiranIc;
    KiranIconLabel(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        kiranIc=new JButton("Upload Picture");
        kiranIc.setIcon(new ImageIcon("C:\\download.png"));
        this.add(kiranIc);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranIconLabel();
    }
}
