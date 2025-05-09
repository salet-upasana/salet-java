package awtcomponentdemo;
import java.applet.Applet;
import java.awt.*; 
public class lebaldemo  extends Applet
   {
      public void process()
      {
          Frame f=new Frame("label example"); 
          Label l1,l2;
          l1=new Label("first label");
          l2=new Label("second label");
          l1.setBounds(50, 100, 100, 30); 
          l2.setBounds(50, 150, 100, 30);
    
          
          f.add(l1);
          f.add(l2);
          f.setSize(400, 400);
          f.setLayout(null);
          f.setVisible(true); 
      } 
}
      
    
   
