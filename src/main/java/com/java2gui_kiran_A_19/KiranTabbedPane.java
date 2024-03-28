package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
public class KiranTabbedPane extends Frame {
    KiranTabbedPane(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        JTextArea kiranTa=new JTextArea(200,200);
        JPanel kiranp1=new JPanel();
        JPanel kiranp2=new JPanel();
        JPanel kiranp3=new JPanel();
        kiranp1.add(kiranTa);
        JTabbedPane kiranJtp=new JTabbedPane();
        kiranJtp.setBounds(50,50,200,200);
        kiranJtp.add("Home",kiranp1);        
        kiranJtp.add("About",kiranp2);
        kiranJtp.add("Contact",kiranp3);
        this.add(kiranJtp);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranTabbedPane();
    }
}
