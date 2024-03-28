package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiranCardLayout extends Frame implements ActionListener{
    CardLayout kirancLayout;
    Button b1, b2,b3,b4,b5;
    public KiranCardLayout(){
        this.setTitle("Kiran Khanal-10413/19");
       kirancLayout = new CardLayout();
       this.setLayout(kirancLayout);
       b1 = new Button("CARD 1");        
       b2 = new Button("CARD 2");
       b3 = new Button("CARD 3");
       b4 = new Button("CARD 4");
       b5 = new Button("CARD 5");
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       this.add("a",b1);
       this.add("b",b2);
       this.add("c",b3);
       this.add("d",b4);
       this.add("e",b5);
       this.setSize(700,600);
       this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        kirancLayout.next(this);
    }
    
    public static void main(String [] args){
      KiranCardLayout kirancLayout1 =  new KiranCardLayout();
    }
}
