package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranFrameClosing extends WindowAdapter {
    Frame f;
    KiranFrameClosing(){
        f=new Frame("Kiran Khanal-10413/19");
        f.setSize(700,600);
        f.setLayout(null);
        Label lbl = new Label("Click 'X' to close the frame");
        lbl.setBounds(100,200,300,30);
        lbl.setFont(new Font("Verdana", Font.PLAIN, 20));
        f.add(lbl);
        f.addWindowListener(this);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new KiranFrameClosing();
    }
    public void windowClosing(WindowEvent e){
        f.dispose();
    }
}
