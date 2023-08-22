
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Admin implements ActionListener
{
    JLabel l, userInfo, name, password, guardian, contact ;
    JButton erase, back;
    JTextField un, nm, pass, pn, con ;
    JFrame f ;
    Admin()
    {
        back = new JButton("Back");
        back.setBounds(780, 410, 612, 162);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setFont(new Font("Consolas", Font.PLAIN, 60));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setFocusable(false);
        back.addActionListener(this);

        erase = new JButton("Erase User Account");
        erase.setBounds(780, 588, 612, 162);
        erase.setOpaque(false);
        erase.setContentAreaFilled(false);
        erase.setFont(new Font("Consolas", Font.PLAIN, 55));
        erase.setBorder(BorderFactory.createEmptyBorder());
        erase.setFocusable(false);
        erase.addActionListener(this);


        userInfo = new JLabel("User Information");
        userInfo.setBounds(250, 130, 450, 40);
        userInfo.setFont(new Font("Consolas", Font.PLAIN, 32));
        userInfo.setForeground(Color.WHITE);

        name = new JLabel("Name     : " + SignIn.getName());
        name.setBounds(130, 240, 600, 50);
        name.setFont(new Font("Consolas", Font.PLAIN, 30));

        password = new JLabel("Password : " + SignIn.getPassword());
        password.setBounds(130, 340, 600, 50);
        password.setFont(new Font("Consolas", Font.PLAIN, 30));

        guardian = new JLabel("Guardian : " + setGuardianInfo.GuardianName);
        guardian.setBounds(130, 440, 600, 50);
        guardian.setFont(new Font("Consolas", Font.PLAIN, 30));

        contact = new JLabel("Contact  : " + setGuardianInfo.Contact);
        contact.setBounds(130, 540, 600, 50);
        contact.setFont(new Font("Consolas", Font.PLAIN, 30));


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\Admin.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(userInfo);
        l.add(name);
        l.add(password);
        l.add(guardian);
        l.add(contact);
        l.add(back);
        l.add(erase);



        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Admin");
        f.add(l);
    }

    public void actionPerformed(ActionEvent x)
    {
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == erase)
        {
            StartPage.mark = 0 ;
            SignIn.setUserName("5989892359353975399393379836397393986936969568969986969489");
            SignIn.setPassword("98399589f989nv93v9n9vy vy9v 9y v5y v5 yv3y635678v67864896v 8945769");
            this.f.setVisible(false);
        }
    }
	
	
	
}
