package awtcomponentdemo;
import java.applet.Applet;
import java.awt.*;
public class listdemo extends Applet
{
  public void process()
  {
     Frame f=new Frame("list demo"); 
     List l=new List(5);
     l.setBounds(100, 100, 75, 75);
     l.add("1");
     l.add("2");
     l.add("3");
     l.add("4"); 
     l.add("5");
     f.add(l); 
     f.setSize(400, 400);
     f.setLayout(null);
     f.setVisible(true); 
  }
}
