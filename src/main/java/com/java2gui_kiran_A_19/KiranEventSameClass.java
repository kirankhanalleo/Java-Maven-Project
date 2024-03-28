package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranEventSameClass extends Frame implements ActionListener {
    Button kiranbtn;
    KiranEventSameClass(){
     this.setTitle("Kiran Khanal-10413/19");
     this.setSize(700,600);
     this.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
     kiranbtn=new Button("CLOSE WINDOW");
     this.add(kiranbtn);
     kiranbtn.addActionListener(this);
     this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranEventSameClass();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        this.dispose();
    }
}
