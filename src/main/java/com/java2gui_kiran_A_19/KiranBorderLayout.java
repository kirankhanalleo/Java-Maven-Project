package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranBorderLayout extends Frame {
    Button kiranButton1, kiranButton2, kiranButton3, kiranButton4, kiranButton5;
    KiranBorderLayout(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        kiranButton1=new Button("EAST");
        kiranButton2=new Button("WEST");
        kiranButton3=new Button("NORTH");
        kiranButton4=new Button("SOUTH");
        kiranButton5=new Button("CENTER");
        this.setLayout(new BorderLayout());
        this.add(kiranButton1, BorderLayout.EAST);
        this.add(kiranButton2, BorderLayout.WEST);        
        this.add(kiranButton3, BorderLayout.NORTH);
        this.add(kiranButton4, BorderLayout.SOUTH);
        this.add(kiranButton5, BorderLayout.CENTER);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranBorderLayout();
    }
}
