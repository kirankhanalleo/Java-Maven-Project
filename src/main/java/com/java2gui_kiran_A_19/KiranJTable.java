package com.java2gui_kiran_A_19;
import javax.swing.*;
public class KiranJTable extends JFrame{
     JTable tbl;
    JScrollPane jsp;
    String header[]={"S.N","Name","Marks"};
    String data[][]={{"1","Kiran","100"},
        {"2","Manjul","105"},{"3","Nishan","90"},
        {"4","Daya","100"}
    };
    public KiranJTable(){
        this.setTitle("Kiran Khanal -10413/19");
        this.setSize(700,600);
        this.setLayout(null);
        tbl=new JTable(data,header);
        tbl.setBounds(10,50,500,40);
        jsp = new JScrollPane(tbl);
        jsp.setBounds(10,10,520,220);
        this.add(jsp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new KiranJTable();
    }
}
