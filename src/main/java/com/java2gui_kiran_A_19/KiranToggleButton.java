package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KiranToggleButton extends JFrame implements ItemListener {
    JToggleButton kiranBtn;
    KiranToggleButton(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranBtn=new JToggleButton("");
        kiranBtn.setBounds(200,200,70,30);
        this.add(kiranBtn);
        kiranBtn.addItemListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranToggleButton();
    }
    @Override 
    public void itemStateChanged(ItemEvent e){
        if(kiranBtn.isSelected()){
            kiranBtn.setText("OFF");
        }
        else{
            kiranBtn.setText("ON");
        }
    }
}
