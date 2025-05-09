package awtcomponentdemo;
import java.applet.Applet;
import java.awt.*;
public class scrollbardemo extends Canvas
{
  public void process()
  {
   Frame f=new Frame("scrollbar");
   Scrollbar s=new Scrollbar(); 
   s.setBounds(100,100,50,100);
   f.add(s);
   f.setSize(400,400);
   f.setLayout(null);
   f.setVisible(true); 
  }
}
