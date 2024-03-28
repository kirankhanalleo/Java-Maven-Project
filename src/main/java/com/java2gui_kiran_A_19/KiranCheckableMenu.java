package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranCheckableMenu {
    KiranCheckableMenu() {
        Frame f = new Frame("Kiran Khanal-10413/19");
        f.setSize(700,600);
        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);
        Menu m1 = new Menu("Contacts");
        MenuItem mi1 = new MenuItem("Phone");
        MenuItem mi2 = new MenuItem("Email");
        mb.add(m1);
        m1.add(mi1);
        m1.add(mi2);
        m1.addSeparator();
        MenuItem mi3 = new CheckboxMenuItem("Facebook");
        MenuItem mi4 = new CheckboxMenuItem("Instagram");
        MenuItem mi5 = new CheckboxMenuItem("Twitter");
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new KiranCheckableMenu();

    }
}