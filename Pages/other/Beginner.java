
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Beginner implements ActionListener
{
    JFrame f ;
    JLabel l ;
    JButton yes, no ;

    Beginner() 
    {
        yes = new JButton();
        yes.setBounds(700, 495, 210, 145);
        yes.setOpaque(false);
        yes.setContentAreaFilled(false);
        yes.setBorder(BorderFactory.createEmptyBorder());
        yes.addActionListener(this);

        no = new JButton();
        no.setBounds(1020, 495, 210, 145);
        no.setOpaque(false);
        no.setContentAreaFilled(false);
        no.setBorder(BorderFactory.createEmptyBorder());
        no.addActionListener(this);



        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Beginner.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(yes);
        l.add(no);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Beginner?");
        f.add(l);
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == yes)
        {
            this.f.setVisible(false);
            new Tutorial();
        }
        if(x.getSource() == no)
        {
            this.f.setVisible(false);
            new StartCoding();
        }
    }
	


}
