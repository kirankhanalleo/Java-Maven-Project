package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranGridBagLayout extends Frame{
    Button kiranB1, kiranB2, kiranB3;
    GridBagLayout kirangbl;
    GridBagConstraints kirangbc;
    KiranGridBagLayout(){
        this.setTitle("Kiran Khanal - 10413/19");
        this.setSize(700,600);
        kirangbl = new GridBagLayout();
        kirangbc = new GridBagConstraints();
        kiranB1=new Button("Button 1");
        kiranB2=new Button("Button 2");
        kiranB3=new Button("Button 3");
        this.setLayout(kirangbl);
        kirangbc.fill=GridBagConstraints.HORIZONTAL;
        
        kirangbc.gridx = 0;
        kirangbc.gridy = 0;
        this.add(kiranB1,kirangbc);
        
        kirangbc.gridx=1;
        kirangbc.gridy=0;
        this.add(kiranB2,kirangbc);
        
        kirangbc.gridx=0;
        kirangbc.gridy=1;
        kirangbc.gridwidth=2;
        this.add(kiranB3,kirangbc);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranGridBagLayout();
    }
}
