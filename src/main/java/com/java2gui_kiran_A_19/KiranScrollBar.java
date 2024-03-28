package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranScrollBar extends Frame {
    Scrollbar kiranSbH, kiranSbV;
    KiranScrollBar(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
        //Instanting Scrollbar
        kiranSbH = new Scrollbar(Scrollbar.HORIZONTAL);
        kiranSbV = new Scrollbar(Scrollbar.VERTICAL);
        this.add(kiranSbH); this.add(kiranSbV);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranScrollBar();
    }
}
