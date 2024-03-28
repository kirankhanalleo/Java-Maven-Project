package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranStringLength extends Frame implements ActionListener {
    TextField kiranTf;
    Button kiranBtn;
    Label kiranLbl;
    KiranStringLength(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        kiranTf=new TextField("");
        kiranTf.setBounds(200,100,250,25);
        this.add(kiranTf);
        kiranBtn=new Button("Find Length");
        kiranBtn.setBounds(200,140,100,25);
        this.add(kiranBtn);
        kiranLbl=new Label();
        kiranLbl.setBounds(200,170,200,25);
        this.add(kiranLbl);
        kiranBtn.addActionListener(this);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranStringLength();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String text = kiranTf.getText();
        int len = text.length();
        kiranLbl.setText("The length of string is: "+len);
    }
}
