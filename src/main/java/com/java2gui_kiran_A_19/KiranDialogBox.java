package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranDialogBox {
    
    KiranDialogBox(){
        Frame f = new Frame("Kiran Khanal - 10413/19");
//        Dialog d = new Dialog(f,"Kiran Khanal -10413/19",true);
        FileDialog fd = new FileDialog(f,"Select File");
//        Button b1,b2,b3;
        Label l = new Label("Choose a file to upload");
//        b1 = new Button("YES");
//        b2 = new Button("NO");
//        b3 = new Button("CANCEL");
        l.setBounds(20,35,200,30);
        fd.add(l);
//        b1.setBounds(20,75,60,20);
//        d.add(b1);
//        b2.setBounds(90,75,60,20);
//        d.add(b2);
//        b3.setBounds(160,75,60,20);
//        d.add(b3);
        fd.setLayout(null);
        f.setSize(700,600);
        f.setVisible(true);
        fd.setSize(250,130);
        fd.setVisible(true);
    }
    
    public static void main(String[] args) {
        new KiranDialogBox();
    }
}  
