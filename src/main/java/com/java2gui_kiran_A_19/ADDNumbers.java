/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java2gui_kiran_A_19;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ADDNumbers extends JFrame implements ActionListener{
     JTextField f1, f2, f3;
     JButton b1;
     ADDNumbers(){
         this.setTitle("Add Numbers");
         this.setSize(500,500);
         this.setLayout(null);
         f1= new JTextField("");
         f1.setBounds(200,100,250,25);
         this.add(f1);
         f2=new JTextField("");
         f2.setBounds(200,140,250,25);
         this.add(f2);
         f3=new JTextField("");
         f3.setBounds(200,180,250,25);
         this.add(f3);
         b1=new JButton("ADD");
         b1.setBounds(200,220,100,25);
         this.add(b1);
         b1.addActionListener(this);
         this.setVisible(true);
     }
     public static void main(String [] args){
         new ADDNumbers();
     }
     @Override
     public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(f1.getText());        
        int num2 = Integer.parseInt(f2.getText());
        int sum = num1+num2;
        f3.setText("The sum is: "+sum);
    }
}
