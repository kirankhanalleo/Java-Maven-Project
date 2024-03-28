package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranText extends Frame{
    TextField kiranTf;
    TextArea kiranTa;
    Label kiranLbl1, kiranLbl2;
    KiranText(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranLbl1 = new Label("Hello! I'm TextBox");
        kiranLbl1.setBounds(30,70,100,30);
        kiranTf = new TextField();
        kiranTf.setBounds(160,70,150,30);
        kiranLbl2 = new Label("Hello! I'm TextArea");
        kiranLbl2.setBounds(30,110,100,30);
        kiranTa = new TextArea("",5,120,TextArea.SCROLLBARS_VERTICAL_ONLY);
        kiranTa.setBounds(160,110,150,30);
        this.add(kiranLbl1); this.add(kiranLbl2);
        this.add(kiranTf); this.add(kiranTa);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranText();
    }
}
