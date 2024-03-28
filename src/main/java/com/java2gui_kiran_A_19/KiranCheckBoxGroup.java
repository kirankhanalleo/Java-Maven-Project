package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranCheckBoxGroup extends Frame{
    CheckboxGroup kiranCbg;
    Checkbox kiranC1, kiranC2, kiranC3;
    Label kiranL1;
    Button kiranBtn;
    KiranCheckBoxGroup(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,80,30);
        this.setLayout(fl);
        kiranL1= new Label("Select Course of your interest:");
        kiranCbg=new CheckboxGroup();
        kiranC1=new Checkbox("BIM",kiranCbg,false);
        kiranC2=new Checkbox("BBA",kiranCbg,false);
        kiranC3=new Checkbox("BBM",kiranCbg,false);
        kiranBtn=new Button("REGISTER");
        this.add(kiranL1); this.add(kiranC1); 
        this.add(kiranC2); this.add(kiranC3);
        this.add(kiranBtn);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranCheckBoxGroup();
    }
}
