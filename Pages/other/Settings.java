import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Settings implements ActionListener
{
    public static JFrame f ;
    JLabel l ;
    JButton ui, gi, p , back, exit ;

    Settings()
    {
        ui = new JButton();
        ui.setBounds(60, 57, 535, 140);
        ui.setOpaque(false);
        ui.setContentAreaFilled(false);
        ui.setBorder(BorderFactory.createEmptyBorder());
        ui.addActionListener(this);

        gi = new JButton();
        gi.setBounds(60, 235, 680, 140);
        gi.setOpaque(false);
        gi.setContentAreaFilled(false);
        gi.setBorder(BorderFactory.createEmptyBorder());
        gi.addActionListener(this);

        p = new JButton();
        p.setBounds(60, 412, 570, 142);
        p.setOpaque(false);
        p.setContentAreaFilled(false);
        p.setBorder(BorderFactory.createEmptyBorder());
        p.addActionListener(this);

        back = new JButton();
        back.setBounds(935, 632, 213, 115);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);

        exit = new JButton();
        exit.setBounds(1250, 632, 170, 115);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.addActionListener(this);



        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Settings.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(back);
        l.add(exit);
        l.add(ui);
        l.add(gi);
        l.add(p);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Settings");
        f.add(l);
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == exit)
        {
            new Exit();
        }
        if(x.getSource() == ui)
        {
            new UpdateUserInfo(1);
        }
        if(x.getSource() == gi)
        {
            new UpdateGuardianInfo();
        }
        if(x.getSource() == p)
        {
            new UpdateUserInfo(2);
        }
    }
	
}
