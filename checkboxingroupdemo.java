package awtcomponentdemo;
import java.applet.*;
import java.awt.*; 
public class checkboxingroupdemo extends Applet
{
    public void process()
    {
    Frame f=new Frame("checkbox group example"); 
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox c1,c2;
    c1=new Checkbox("cpp",cbg,false);
    c2=new Checkbox("java",cbg,true);
    c1.setBounds(100, 100, 50, 50); 
    c2.setBounds(100, 150, 150, 50);
    f.add(c1);
    f.add(c2);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true); 
    }

    }
