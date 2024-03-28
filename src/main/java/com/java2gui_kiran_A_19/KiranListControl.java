package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranListControl extends Frame {
    List kiranList;
    Label kiranLbl;
    KiranListControl(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranLbl= new Label("Pick your favourite team: ");
        kiranLbl.setBounds(50,60,250,50);
        //instanting list
        kiranList=new List();
        kiranList.add("FC Barcelona");
        kiranList.add("Real Madrid");
        kiranList.add("Manchester United");
        kiranList.add("Manchester City");
        kiranList.add("Liverpool");
        kiranList.add("Bayern Munich");
        kiranList.add("Paris Saint German");
        kiranList.add("Juventus");
        kiranList.add("Inter Milan");
        kiranList.add("AC Milan");
        kiranList.setBounds(50,120,200,100);
        this.add(kiranLbl);
        this.add(kiranList);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new KiranListControl();
    }
}
