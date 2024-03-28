package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KiranJSwing extends JFrame{
    JLabel kiranL1, kiranL2, kiranL3;
    JTextField kiranTf;
    JPasswordField kiranPf;
    JTextArea kiranTa;
    JButton kiranBtn;
    KiranJSwing(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranL1=new JLabel("Full Name");
        kiranL1.setBounds(20,100,80,20);
        kiranTf=new JTextField("");
        kiranTf.setBounds(110,100,180,20);
        kiranL2=new JLabel("Password");
        kiranL2.setBounds(20,130,80,20);
        kiranPf=new JPasswordField("");
        kiranPf.setBounds(110,130,180,20);
        kiranL3=new JLabel("Comment");
        kiranL3.setBounds(20,160,80,20);
        kiranTa=new JTextArea("",5,120);
        kiranTa.setBounds(110,160,180,50);
        kiranBtn=new JButton("SUBMIT");
        kiranBtn.setBounds(100,230,100,30);
        kiranBtn.setBorder(BorderFactory.createBevelBorder(1,Color.RED,Color.BLUE));
        this.add(kiranL1); this.add(kiranL2);
        this.add(kiranL3); this.add(kiranTf);
        this.add(kiranPf); this.add(kiranTa);
        this.add(kiranBtn);
        this.addMouseListener(new MyAdapter());
        this.setVisible(true);
    }
    class MyAdapter extends MouseAdapter{
        public void mouseEntered(MouseEvent e){
            kiranBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        }
        public void mouseExited(MouseEvent e){
            kiranBtn.setBorder(BorderFactory.createLoweredBevelBorder());
        }
    }
    public static void main(String [] args){
        new KiranJSwing();
    }
}
