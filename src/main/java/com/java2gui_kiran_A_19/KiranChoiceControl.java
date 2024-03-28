package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranChoiceControl extends Frame {
    Choice kiranCh;
    Label kiranLbl;
    KiranChoiceControl(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranLbl= new Label("Pick your favourite team: ");
        kiranLbl.setBounds(50,60,250,50);
        //instanting choice
        kiranCh=new Choice();
        kiranCh.add("FC Barcelona");
        kiranCh.add("Real Madrid");
        kiranCh.add("Manchester United");
        kiranCh.add("Manchester City");
        kiranCh.add("Liverpool");
        kiranCh.add("Bayern Munich");
        kiranCh.add("Paris Saint German");
        kiranCh.add("Juventus");
        kiranCh.add("Inter Milan");
        kiranCh.add("AC Milan");
        kiranCh.setBounds(50,120,200,50);
        this.add(kiranLbl);
        this.add(kiranCh);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new KiranChoiceControl();
    }
}
