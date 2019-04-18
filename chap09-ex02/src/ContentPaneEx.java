import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
   public ContentPaneEx () {
      setTitle("Content Pane and JFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container ContentPane = getContentPane();
      ContentPane.setBackground(Color.RED);
      ContentPane.setLayout(new FlowLayout());
      
      ContentPane.add(new JButton("OK"));
      ContentPane.add(new JButton("CANCLE"));
      ContentPane.add(new JButton("IGNORE"));
      
      setSize(300, 200);
      setVisible(true);
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new ContentPaneEx();
   }

}