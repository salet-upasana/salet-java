package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator  implements ActionListener
{
    TextField tf1,tf2,tf3;
    Button b1,b2,b3,b4;

     public void pro()
    {
        Frame f = new Frame();
        tf1=new TextField();
        tf1.setBounds(50,50,150,20);
        tf2=new TextField();
        tf2.setBounds(50,100,150,20);
        tf3=new TextField();
        tf3.setBounds(50,150,150,20);
        b1=new Button("+");
        b1.setBounds(50,200,50,50);
        b2=new Button("-");
        b2.setBounds(120,200,50,50);
        b3=new Button("*");
        b3.setBounds(190,200,50,50);
        b4=new Button("/");
        b4.setBounds(260,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1)
        {
        c=a+b;
        }
        else if(e.getSource()==b2)
        {
        c=a-b;
        }
        else if(e.getSource()==b3)
        {
        c=a*b;
        }
        else if(e.getSource()==b4)
        {
        c=a/b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }

    
}
