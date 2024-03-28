package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KiranEnterKeyEvent extends JFrame implements KeyListener{
    JTextField kiranTf;
    JLabel kiranLbl;
    KiranEnterKeyEvent(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranTf=new JTextField("");
        kiranTf.setBounds(150,150,150,30);
        kiranLbl=new JLabel("");
        kiranLbl.setBounds(150,200,150,30);
        this.add(kiranTf); this.add(kiranLbl);
        kiranTf.addKeyListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranEnterKeyEvent();
    }
    @Override
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_ENTER){
            kiranLbl.setText("Enter key pressed");
        }
    }
}
