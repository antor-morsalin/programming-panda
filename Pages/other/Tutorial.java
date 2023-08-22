
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Tutorial implements ActionListener
{
    JFrame f ;
    JLabel l ;
    JButton print, var, cal, iF, For, back ;
    Tutorial()
    {
        print = new JButton();
        print.setBounds(80, 30, 510, 78);
        print.setOpaque(false);
        print.setContentAreaFilled(false);
        print.setBorder(BorderFactory.createEmptyBorder());
        print.addActionListener(this);

        var = new JButton();
        var.setBounds(80, 143, 510, 78);
        var.setOpaque(false);
        var.setContentAreaFilled(false);
        var.setBorder(BorderFactory.createEmptyBorder());
        var.addActionListener(this);

        cal = new JButton();
        cal.setBounds(80, 260, 510, 75);
        cal.setOpaque(false);
        cal.setContentAreaFilled(false);
        cal.setBorder(BorderFactory.createEmptyBorder());
        cal.addActionListener(this);

        iF = new JButton();
        iF.setBounds(80, 362, 510, 122);
        iF.setOpaque(false);
        iF.setContentAreaFilled(false);
        iF.setBorder(BorderFactory.createEmptyBorder());
        iF.addActionListener(this);

        For = new JButton();
        For.setBounds(82, 512, 510, 80);
        For.setOpaque(false);
        For.setContentAreaFilled(false);
        For.setBorder(BorderFactory.createEmptyBorder());
        For.addActionListener(this);

        back = new JButton();
        back.setBounds(70, 635, 540, 100);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);



        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Tutorial.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(back);
        l.add(print);
        l.add(var);
        l.add(cal);
        l.add(iF);
        l.add(For);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Tutorial");
        f.add(l);
        
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == print)
        {
            new print_tutorial();
        }
        if(x.getSource() == var)
        {
            new var_tutorial();
        }
        if(x.getSource() == cal)
        {
            new cal_tutorial();
        }
        if(x.getSource() == iF)
        {
            new if_tutorial();
        }
        if(x.getSource() == For)
        {
            new for_tutorial();
        }
    }
	

}
