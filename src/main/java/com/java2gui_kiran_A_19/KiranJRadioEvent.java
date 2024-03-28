package com.java2gui_kiran_A_19;
import java.awt.event.*;
import javax.swing.*;
public class KiranJRadioEvent extends JFrame implements ActionListener{
    JLabel kiranLbl;
    JRadioButton kiranRb1, kiranRb2;
    ButtonGroup kiranBg;
    JButton kiranBtn;
    KiranJRadioEvent(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranBg=new ButtonGroup();
        kiranLbl=new JLabel("Select your gender:");
        kiranLbl.setBounds(30,70,200,30);
        kiranRb1=new JRadioButton("Male");
        kiranRb1.setBounds(30,110,100,30);
        kiranRb2=new JRadioButton("Female");
        kiranRb2.setBounds(30,150,100,30);
        kiranBtn=new JButton("SEND");
        kiranBtn.setBounds(30,200,70,30);
        kiranBtn.addActionListener(this);
        kiranBg.add(kiranRb1); kiranBg.add(kiranRb2);
        this.add(kiranLbl); this.add(kiranRb1);
        this.add(kiranRb2); this.add(kiranBtn);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranJRadioEvent();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(kiranRb1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Male");
        }
        if(kiranRb2.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female");
        }
    }
}
