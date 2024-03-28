package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranWordCount extends Frame implements KeyListener{
    TextField kiranTf;
    Label kiranLbl;
    KiranWordCount(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranTf=new TextField("");
        kiranTf.setBounds(200,100,300,25);
        this.add(kiranTf);
        kiranLbl=new Label();
        kiranLbl.setBounds(200,130,200,25);
        this.add(kiranLbl);
        kiranTf.addKeyListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranWordCount();
    }
    @Override
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        String txt=kiranTf.getText();
        String words[]=txt.split("\\s");
        kiranLbl.setText("Words Count = "+words.length);}
    public void keyTyped(KeyEvent e){}
}
