package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranGridLayout extends Frame {
    Button kiranB1, kiranB2, kiranB3, kiranB4;
    KiranGridLayout(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        kiranB1=new Button("Button 1");
        kiranB2=new Button("Button 2");
        kiranB3=new Button("Button 3");
        kiranB4=new Button("Button 4");
        GridLayout gl = new GridLayout(2,2);
        this.setLayout(gl);
        this.add(kiranB1); this.add(kiranB2);
        this.add(kiranB3); this.add(kiranB4);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranGridLayout();
    }
}
