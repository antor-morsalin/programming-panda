import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HomePage implements ActionListener
{
    static JFrame f ;
    JLabel l ;
    JButton sc, tut, ui, po, ex ;
    JButton settings ;
    HomePage()
    {

        settings = new JButton();
        settings.setBounds(50, 660, 170, 125);
        settings.setOpaque(false);
        settings.setContentAreaFilled(false);
        settings.setBorder(BorderFactory.createEmptyBorder());
        settings.addActionListener(this);

        sc = new JButton();
        sc.setBounds(122, 50, 440, 110);
        sc.setOpaque(false);
        sc.setContentAreaFilled(false);
        sc.setBorder(BorderFactory.createEmptyBorder());
        sc.addActionListener(this);

        tut = new JButton();
        tut.setBounds(115, 250, 324, 110);
        tut.setOpaque(false);
        tut.setContentAreaFilled(false);
        tut.setBorder(BorderFactory.createEmptyBorder());
        tut.addActionListener(this);

        ui = new JButton();
        ui.setBounds(120, 450, 330, 105);
        ui.setOpaque(false);
        ui.setContentAreaFilled(false);
        ui.setBorder(BorderFactory.createEmptyBorder());
        ui.addActionListener(this);

        po = new JButton();
        po.setBounds(320, 647, 290, 103);
        po.setOpaque(false);
        po.setContentAreaFilled(false);
        po.setBorder(BorderFactory.createEmptyBorder());
        po.addActionListener(this);

        ex = new JButton();
        ex.setBounds(974, 658, 455, 130);
        ex.setOpaque(false);
        ex.setContentAreaFilled(false);
        ex.setBorder(BorderFactory.createEmptyBorder());
        ex.addActionListener(this);

        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\homePage.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(sc);
        l.add(tut);
        l.add(ui);
        l.add(po);
        l.add(ex);
        l.add(settings);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Home");
        f.add(l);
    }

    public void actionPerformed(ActionEvent x)
    {
        if(x.getSource() == po)
        {
            new Policy();
        }
        if(x.getSource() == ex)
        {
            new Exit();
        }
        if(x.getSource() == ui)
        {
            new UserInfo();
        }
        if(x.getSource() == settings)
        {
            new Settings();
        }
        if(x.getSource() == tut)
        {
            new Tutorial();
        }
        if(x.getSource() == sc)
        {
            new Beginner();
        }
    }
	
}
