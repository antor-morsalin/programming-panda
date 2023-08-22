import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class print_tutorial implements ActionListener
{
    JFrame f ;
    JLabel l ;
    JButton back, try_now ;

    print_tutorial()
    {
        back = new JButton();
        back.setBounds(818, 658, 250, 125);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);

        try_now = new JButton();
        try_now.setBounds(1100, 656, 295, 123);
        try_now.setOpaque(false);
        try_now.setContentAreaFilled(false);
        try_now.setBorder(BorderFactory.createEmptyBorder());
        try_now.addActionListener(this);

        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\print_tut.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(back);
        l.add(try_now);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Tutorial - Print");
        f.add(l);
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == try_now)
        {
            new StartCoding();
        }
    }
	
}
