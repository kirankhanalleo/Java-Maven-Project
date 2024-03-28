package com.java2gui_kiran_A_19;
import java.applet.*;
import java.awt.*;
public class KiranArithmeticApplet extends Applet{
    public void paint(Graphics g){
        int n1=Integer.parseInt(getParameter("n1"));
        int n2=Integer.parseInt(getParameter("n2"));
        int sum=n1+n2;
        int diff=n1-n2;
        int product=n1*n2;
        g.drawString("Sum: "+sum, 50, 50);        
        g.drawString("Difference: "+diff, 50, 100);
        g.drawString("product: "+product, 50, 150);
    }
}
