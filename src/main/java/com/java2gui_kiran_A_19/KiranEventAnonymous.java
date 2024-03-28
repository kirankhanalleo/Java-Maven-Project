package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranEventAnonymous extends Frame {
    Button kiranBtn;
    TextField kiranTf;
    KiranEventAnonymous(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranTf=new TextField("");
        kiranTf.setBounds(200,150,250,25);
        this.add(kiranTf);
        kiranBtn=new Button("CLICK ME");
        kiranBtn.setBounds(200,190,80,25);
        this.add(kiranBtn);
        kiranBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                kiranTf.setText("Event Handling using Anonymous Class");
            }
        });
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranEventAnonymous();
    }
}
