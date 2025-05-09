package awtcomponentdemo;
import java.applet.Applet;
import java.awt.*;
public class paneldemo extends Applet
{
    public void process()
    {
       Frame f=new Frame("panel ex");
       Panel p=new Panel();
       p.setBounds(40, 80, 200, 200);
       p.setBackground(Color.gray);
       Button b1=new Button("button 1");
       b1.setBackground(Color.yellow);
       b1.setBounds(50, 100, 80, 30);
       Button b2=new Button("button 2");
       b2.setBackground(Color.green);
       b2.setBounds(100, 100, 80, 30);
       p.add(b1); p.add(b2); f.add(p);
       f.setSize(500, 500);
       f.setLayout(null); 
       f.setVisible(true); 

    }
}
