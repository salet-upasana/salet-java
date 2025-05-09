package awtcomponentdemo;
import java.applet.Applet;
import java.awt.*;
public class buttondemo extends Applet
{
    public void process()
    {
        Frame f = new Frame("buttonexample");
        Button b1=new Button("hello");
        b1.setBounds(50,100,60,30);
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
    

