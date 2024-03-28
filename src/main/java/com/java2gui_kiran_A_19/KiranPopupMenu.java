package com.java2gui_kiran_A_19;
import java.awt.*;
import java.awt.event.*;
public class KiranPopupMenu{
    PopupMenu kiranpopup;
    KiranPopupMenu(){
        Frame f = new Frame();
        f.setTitle("Kiran Khanal-10413/19");
        f.setSize(700,600);
        f.setLayout(null);
        kiranpopup=new PopupMenu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem newf = new MenuItem("New");
        MenuItem save = new MenuItem("Save");
        MenuItem saveas = new MenuItem("Save as");
        kiranpopup.add(open); kiranpopup.add(newf);
        kiranpopup.add(save); kiranpopup.add(saveas);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                kiranpopup.show(f, e.getX(),e.getY());
            }
        });
        f.add(kiranpopup);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new KiranPopupMenu();
    }
}
