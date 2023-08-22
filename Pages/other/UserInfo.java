
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserInfo implements ActionListener
{
    JButton back, exit ;
    public static JFrame f ;
    JLabel l ;
    JLabel name, username, guardian, contact, password ;
    private String nm, unm, pass , gn, gc;
    UserInfo()
    {
        this.nm = SignIn.getName();
        this.unm = SignIn.getUserName();
        this.pass = SignIn.getPassword();
        this.gn = setGuardianInfo.GuardianName ;
        this.gc = setGuardianInfo.Contact;
        
        back = new JButton();
        back.setBounds(875, 465, 205, 125);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);

        exit = new JButton();
        exit.setBounds(875, 624, 180, 125);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.addActionListener(this);
        

        name = new JLabel("Name     : " + nm);
        name.setBounds(200, 240, 600, 50);
        name.setFont(new Font("Consolas", Font.PLAIN, 30));

        username = new JLabel("Username : " + unm);
        username.setBounds(200, 320, 600, 50);
        username.setFont(new Font("Consolas", Font.PLAIN, 30));

        guardian = new JLabel("Guardian : " + gn);
        guardian.setBounds(200, 400, 600, 50);
        guardian.setFont(new Font("Consolas", Font.PLAIN, 30));

        contact = new JLabel("Contact  : " + gc);
        contact.setBounds(200, 480, 600, 50);
        contact.setFont(new Font("Consolas", Font.PLAIN, 30));
        
        password = new JLabel("Password : " + pass);
        password.setBounds(200, 560, 600, 50);
        password.setFont(new Font("Consolas", Font.PLAIN, 30));


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\UserInfo.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(name);
        l.add(username);
        l.add(password);
        l.add(guardian);
        l.add(contact);
        l.add(back);
        l.add(exit);
       

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("User Info");
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
    }
	
}
