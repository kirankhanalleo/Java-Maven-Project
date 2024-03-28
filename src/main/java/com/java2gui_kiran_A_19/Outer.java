package com.java2gui_kiran_A_19;
import java.awt.event.*;
class Outer implements ActionListener {
    KiranEventOuter obj;
    Outer(KiranEventOuter obj){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.kiranTf.setText("Hello World");
    }
}
