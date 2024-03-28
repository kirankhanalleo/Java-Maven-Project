package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranEventInner extends Frame{
    TextField kiranTf;
    KiranEventInner(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranTf=new TextField("");
        kiranTf.setBounds(200,150,250,25);
        this.add(kiranTf);
        this.addMouseListener(new MyAdapter());
        this.setVisible(true);
    }
    class MyAdapter extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            kiranTf.setText("Mouse is Clicked");
        }
        public void mousePressed(MouseEvent e){
            kiranTf.setText("Mouse Pressed");
        }
    }
    public static void main(String [] args){
        new KiranEventInner();
    }
}
