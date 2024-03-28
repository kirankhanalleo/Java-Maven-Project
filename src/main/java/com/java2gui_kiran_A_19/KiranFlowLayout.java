package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranFlowLayout extends Frame {
    Label kiranLabel1, kiranLabel2, kiranLabel3;
    KiranFlowLayout(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(500,500);
        kiranLabel1 = new Label("Demonstrating Flow Layout");
        kiranLabel2 = new Label("Hello I am Kiran");
        kiranLabel3 = new Label("Speed 1 terahertz, memory 1 zigabyte");
        this.add(kiranLabel1); this.add(kiranLabel2); this.add(kiranLabel3);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,150,30);        
        this.setLayout(fl);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranFlowLayout();
    }
}
