package awtcomponentdemo;
 import java.applet.*;
import java.awt.*; 
public class checkboxdemo extends Applet
{
    public void process()
    {
Frame f=new Frame("label example"); 
Checkbox c1,c2; 
c1=new Checkbox("cpp");
c2=new Checkbox("java");
c1.setBounds(100, 100, 50, 50);
c2.setBounds(100, 150, 150, 50);
f.add(c1); 
f.add(c2);
f.setSize(400, 400);
f.setLayout(null);
f.setVisible(true);   
}
}