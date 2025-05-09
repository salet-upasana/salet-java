package awtcomponentdemo;

import java.applet.Applet;
import java.awt.*;
public class choicedemo extends Applet
{
   public void process()
   {
    Frame f=new Frame("choice example");
    Choice c=new Choice();
    c.setBounds(100, 100, 75, 75);
    c.add("item 1");
    c.add("item 2");
    c.add("item 3");
    c.add("item 4"); c.add("item 5");
    f.add(c);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true); 
   }
}
