package awtcomponentdemo;
import java.applet.*; 
import java.awt.*;
public class Textfeilddemo extends Applet
{
    public void process()
    {
   Frame f=new Frame("textfield example");
   TextField t1,t2;
   t1=new TextField("welcome to java");
   t2=new TextField("awt tutorial");
   t1.setBounds(50, 100, 200, 30); 
   t2.setBounds(50, 150, 200, 30);
   f.add(t1);
   f.add(t2); 
   f.setSize(400, 400);
   f.setLayout(null); 
   f.setVisible(true);
}
}