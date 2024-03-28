package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranAwtControls extends Frame{
    Button kiranBtn;
    TextArea kiranTA;
    TextField kiranTf1, kiranTf2, kiranTf3;
    Label kiranL1, kiranL2, kiranL3, kiranL4, kiranL5,kiranL6;
    Checkbox kiranC1, kiranC2, kiranC3;
    KiranAwtControls(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        //Label
        kiranL1=new Label("Registration Form");
        kiranL1.setBounds(40,35,100,50);
        kiranL2=new Label("Full Name");
        kiranL2.setBounds(20,100,80,20);
        //TextField
        kiranTf1=new TextField("");
        kiranTf1.setBounds(110,100,180,20);
        kiranL3=new Label("Email");
        kiranL3.setBounds(20,130,80,20);
        kiranTf2=new TextField("");
        kiranTf2.setBounds(110,130,180,20);
        kiranL4=new Label("Address");
        kiranL4.setBounds(20,160,80,20);
        kiranTf3=new TextField();
        kiranTf3.setBounds(110,160,180,20);
        kiranL5=new Label("About");
        kiranL5.setBounds(20,190,80,20);
        //TextArea
        kiranTA=new TextArea("",5,120,TextArea.SCROLLBARS_VERTICAL_ONLY);
        kiranTA.setBounds(110,190,180,50);
        kiranL6=new Label("Course");
        kiranL6.setBounds(20,250,80,20);
        //Checkbox
        kiranC1=new Checkbox("BIM");
        kiranC1.setBounds(110,250,50,20);
        kiranC2=new Checkbox("BBA");
        kiranC2.setBounds(170,250,50,20);
        kiranC3=new Checkbox("BBM");
        kiranC3.setBounds(230,250,50,20);
        //Button
        kiranBtn = new Button("REGISTER");
        kiranBtn.setBounds(50,290,150,30);
        this.add(kiranL1); this.add(kiranL2);
        this.add(kiranTf1); this.add(kiranL3);
        this.add(kiranTf2); this.add(kiranL4);
        this.add(kiranTf3); this.add(kiranL5);
        this.add(kiranTA); this.add(kiranL6);
        this.add(kiranC1); this.add(kiranC2);
        this.add(kiranC3); this.add(kiranBtn);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranAwtControls();
    }
}
