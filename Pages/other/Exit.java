import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Exit implements ActionListener
{
    JFrame f ;
    JLabel l ;
    JButton yes, no ;
    JButton lo ;
    Exit()
    {

        yes = new JButton();
        yes.setBounds(750, 522, 250, 254);
        yes.setOpaque(false);
        yes.setContentAreaFilled(false);
        yes.setBorder(BorderFactory.createEmptyBorder());
        yes.addActionListener(this);


        no = new JButton();
        no.setBounds(1085, 522, 250, 254);
        no.setOpaque(false);
        no.setContentAreaFilled(false);
        no.setBorder(BorderFactory.createEmptyBorder());
        no.addActionListener(this);

        lo = new JButton();
        lo.setBounds(110, 605, 330,110);
        lo.setOpaque(false);
        lo.setContentAreaFilled(false);
        lo.setBorder(BorderFactory.createEmptyBorder());
        lo.addActionListener(this);


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Exit.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(yes);
        l.add(no);
        l.add(lo);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Confirm Exit");
        f.add(l);
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == yes)
        {
            System.exit(0);
        }
        if(x.getSource() == no)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == lo)
        {
            StartPage.mark = 0 ;
            this.f.setVisible(false);
            HomePage.f.setVisible(false);
            new StartPage();
        }
    }

}

