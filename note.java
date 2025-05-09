package notepad;
import javax.swing.*;
public class note {
    public void pro()
    {
       JMenu file,edit,view,zoom;
       JMenuItem i1,i2,i3,i4;
       JFrame f=new JFrame("my notepad");
       JMenuBar mb=new JMenuBar();
       file=new JMenu("file");
       edit=new JMenu("edit");
       view=new JMenu("view");
       zoom=new JMenu("zoom");
       
       i1=new JMenuItem("new");
       i2=new JMenuItem("cut");
       i3=new JMenuItem("find");
       i4=new JMenuItem("zoom in");
       
       file.add(i1);
       edit.add(i2);
       view.add(i3);
       zoom.add(i4);
       view.add(zoom);
       
       mb.add(file);
       mb.add(edit);
       mb.add(view);
       f.setJMenuBar(mb);
       f.setLayout(null);
       f.setSize(400,400);
       f.setVisible(true);
       
               
    }
    }