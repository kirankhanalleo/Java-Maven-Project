package com.java2gui_kiran_A_19;
import javax.swing.*;
import java.awt.*;
public class KiranJComboBox extends JFrame {
    JComboBox kiranList;
    JLabel kiranLbl;
    KiranJComboBox(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranLbl= new JLabel("Pick your favourite team: ");
        kiranLbl.setBounds(50,60,250,50);
        String clubs[]={"FC Barcelona","Real Madrid","Juventus","Manchester City",
            "Manchester United","Bayern Munich","Boca Juniors","River Plate"};
        kiranList=new JComboBox(clubs);
        kiranList.setBounds(50,120,200,30);
        this.add(kiranLbl);
        this.add(kiranList);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranJComboBox();
    }
}
