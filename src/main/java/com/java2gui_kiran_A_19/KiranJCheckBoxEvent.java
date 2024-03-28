package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KiranJCheckBoxEvent extends JFrame{
    JCheckBox kiranc1, kiranc2, kiranc3;
    JLabel kiranLbl,kiranLbl2,kiranLbl3,kiranLbl4;
    KiranJCheckBoxEvent(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranLbl=new JLabel("Select courses of your interests");
        kiranLbl.setBounds(30,70,200,30);
        kiranc1=new JCheckBox("BIM",false);
        kiranc1.setBounds(30,110,100,30);
        kiranc2=new JCheckBox("BBA",false);
        kiranc2.setBounds(30,150,100,30);
        kiranc3=new JCheckBox("BBM",false);
        kiranc3.setBounds(30,190,100,30);
        kiranLbl2=new JLabel();
        kiranLbl2.setBounds(30,250,200,30);
        kiranLbl3=new JLabel();
        kiranLbl3.setBounds(30,290,200,30);
        kiranLbl4=new JLabel();
        kiranLbl4.setBounds(30,330,200,30);
        this.add(kiranLbl); this.add(kiranc1);
        this.add(kiranc2); this.add(kiranc3);
        this.add(kiranLbl2); this.add(kiranLbl3);
        this.add(kiranLbl4);
        kiranc1.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent e){
            kiranLbl2.setText("BIM:"+(e.getStateChange()==1?"Checked":"Unhecked"));
        }});
        kiranc2.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent e){
            kiranLbl3.setText("BBA:"+(e.getStateChange()==1?"Checked":"Unchecked"));
        }
        });
        kiranc3.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent e){
            kiranLbl4.setText("BBM:"+(e.getStateChange()==1?"Checked":"Unchecked"));
        }
        });
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranJCheckBoxEvent();
    }
}
