package com.java2gui_kiran_A_19;
import java.applet.*;
import java.awt.*;
public class KiranParamApplet extends Applet {
    public void paint(Graphics g){
        String name = getParameter("name");
        String address = getParameter("address");
        g.drawString(name, 150, 150);
        g.drawString(address,150, 200);
    }
}
