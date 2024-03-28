package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranMouseMotion extends Frame implements MouseMotionListener {
    Label lbl;
    KiranMouseMotion(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        lbl=new Label("");
        lbl.setBounds(150,200,200,30);
        lbl.setFont(new Font("Verdana", Font.PLAIN, 20));
        this.add(lbl);
        this.addMouseMotionListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranMouseMotion();
    }
    @Override
    public void mouseDragged(MouseEvent e){
        lbl.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e){
        lbl.setText("Mouse Moved");
    }
}
