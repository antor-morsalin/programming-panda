import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage implements ActionListener
{
    public static int c = 0 , mark = 0 ;
    JFrame sf ;
    JLabel sl ;
    JButton sign, log, play ;
    JButton admin;
    StartPage()
    {
        sign = new JButton();
        log = new JButton();
        play = new JButton();
        admin = new JButton();

        sign.setBounds(25, 645, 510, 130);
        sign.setOpaque(false);
        sign.setContentAreaFilled(false);

        log.setBounds(588, 645, 475, 130);
        log.setOpaque(false);
        log.setContentAreaFilled(false);
        
        play.setBounds(1095, 645, 377, 130);
        play.setOpaque(false);
        play.setContentAreaFilled(false);

        admin.setBounds(80, 398, 110, 120);
        admin.setOpaque(false);
        admin.setContentAreaFilled(false);


        sign.addActionListener(this);
        log.addActionListener(this);
        play.addActionListener(this);
        admin.addActionListener(this);

        sign.setBorder(BorderFactory.createEmptyBorder());
        log.setBorder(BorderFactory.createEmptyBorder());
        play.setBorder(BorderFactory.createEmptyBorder());
        admin.setBorder(BorderFactory.createEmptyBorder());
        

        sl = new JLabel();
        ImageIcon si = new ImageIcon("E:\\Programming Panda\\icons\\StartPage.png");
        sl.setLayout(null);
        sl.setBounds(0, 0, 1510, 830);
        sl.setIcon(si);
        sl.setHorizontalAlignment(JLabel.LEFT);
        sl.setVerticalAlignment(JLabel.TOP);


        sl.add(sign);
        sl.add(log);
        sl.add(play);
        sl.add(admin);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        sf = new JFrame();
        sf.setTitle("Start");
        sf.setIconImage(title.getImage());
        sf.setVisible(true);
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sf.setLayout(null);
        sf.setBounds(30, 0, 1510, 830);
        sf.setResizable(false);
        sf.add(sl);
    }

    @Override
    public void actionPerformed(ActionEvent x)
    {
        if(x.getSource() == sign)
        {
            this.sf.setVisible(false);
            new SignIn();
        }
        if(x.getSource() == log)
        {
           
            if(SignIn.k == 1)
            {
                StartPage.c = 1 ;
                this.sf.setVisible(false);
                new LogIn();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You have to sign in first", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(x.getSource() == play)
        {
            if(StartPage.c==1 && mark == 1)
            {
                this.sf.setVisible(false);
                if(setGuardianInfo.gmark == 0)
                {
                    new setGuardianInfo();
                }
                else 
                {
                    new HomePage();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You have to log in first", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(x.getSource() == admin)
        {
            //this.sf.setVisible(false);
            new adminEntry();
        }
    }
	
	public static void main(String [] arg)
	{
		new StartPage();
	}
   

}
