/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranExtendingFrame extends Frame {
    Label kiranLabel1, kiranLabel2, kiranLabel3;
    KiranExtendingFrame(){
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(500,500);
        this.setLayout(null);
        kiranLabel1= new Label("Kiran Khanal");
        kiranLabel1.setBounds(40,40,100,30);
        kiranLabel2= new Label("Section: A");
        kiranLabel2.setBounds(40,70,100,30);
        kiranLabel3= new Label("Roll No: 19");
        kiranLabel3.setBounds(40,100,100,30);
        this.add(kiranLabel1); this.add(kiranLabel2);
        this.add(kiranLabel3);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new KiranExtendingFrame();
    }
}
