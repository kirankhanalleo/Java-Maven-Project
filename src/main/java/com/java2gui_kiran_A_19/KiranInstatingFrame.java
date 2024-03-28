package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranInstatingFrame {
    Frame f;
    Label kiranLabel1, kiranLabel2;
    KiranInstatingFrame(){
        f = new Frame("Kiran Khanal-10413/19");
        f.setSize(500,500);
        f.setLayout(null);
        kiranLabel1 = new Label("Kiran Khanal");
        kiranLabel1.setBounds(40,40,100,30);
        kiranLabel2 = new Label("Mechinagar Municipality -04, Jhapa");
        kiranLabel2.setBounds(40,80,400,30);
        f.add(kiranLabel1); f.add(kiranLabel2);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new KiranInstatingFrame();
    }
}
