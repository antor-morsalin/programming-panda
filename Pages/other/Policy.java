import javax.swing.*;
import java.awt.*;

class Policy 
{
    JFrame f ;
    JLabel l ;
    Policy()
    {
        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Policy.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        

        ImageIcon icon = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Terms and Policy");
        f.setIconImage(icon.getImage());
        f.setLayout(null);
        f.setBounds(470, 60, 530, 750);
        f.add(l);
    }
	
}
