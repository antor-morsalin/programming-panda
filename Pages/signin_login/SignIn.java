import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignIn implements ActionListener
{
    JFrame f ;
    JLabel l ;
    JLabel fl, ll, ul, pl , rl ;
    JTextField fn, ln, un, pass, rpass ;
    JButton sb , sp ;
    public static int k = 0 ;

    private static String firstName = "" ;
    private static String lastName = "";
    private static String userName = "" ;
    private static String password = "" ;
    private String retypedPassword = "" ;
    private static String Name ;

    SignIn()
    {
        fl = new JLabel();
        fl.setText("First name");
        fl.setLayout(null);
        fl.setFont(new Font("Consolas", Font.BOLD, 16));
        fl.setBounds(590, 350, 300, 30);

        ll = new JLabel();
        ll.setText("Last name");
        ll.setLayout(null);
        ll.setFont(new Font("Consolas", Font.BOLD, 16));
        ll.setBounds(755, 350, 300, 30);

        ul = new JLabel();
        ul.setText("Set Username");
        ul.setLayout(null);
        ul.setFont(new Font("Consolas", Font.BOLD, 16));
        ul.setBounds(590, 430, 300, 30);

        pl = new JLabel();
        pl.setText("Set password");
        pl.setLayout(null);
        pl.setFont(new Font("Consolas", Font.BOLD, 16));
        pl.setBounds(590, 510, 300, 30);

        rl = new JLabel();
        rl.setText("Retype Password");
        rl.setLayout(null);
        rl.setFont(new Font("Consolas", Font.BOLD, 16));
        rl.setBounds(590, 590, 300, 30);


        fn = new JTextField();
        fn.setLayout(null);
        fn.setBounds(590, 377, 135, 38);
        fn.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        fn.setHorizontalAlignment(JTextField.CENTER);
        fn.setBackground(new Color(255, 102, 102));
        //fn.setForeground(Color.white);
        fn.setBorder(BorderFactory.createEmptyBorder());

        ln = new JTextField();
        ln.setLayout(null);
        ln.setBounds(755, 377, 135, 38);
        ln.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        ln.setHorizontalAlignment(JTextField.CENTER);
        ln.setBackground(new Color(255, 102, 102));
        //ln.setForeground(Color.white);
        ln.setBorder(BorderFactory.createEmptyBorder());

        un = new JTextField();
        un.setLayout(null);
        un.setBounds(590, 457, 300, 38);
        un.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        un.setHorizontalAlignment(JTextField.CENTER);
        un.setBackground(new Color(255, 102, 102));
        //un.setForeground(Color.white);
        un.setBorder(BorderFactory.createEmptyBorder());

        pass = new JTextField();
        pass.setLayout(null);
        pass.setBounds(590, 537, 300, 38);
        pass.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setBackground(new Color(255, 102, 102));
        //pass.setForeground(Color.white);
        pass.setBorder(BorderFactory.createEmptyBorder());

        rpass = new JTextField();
        rpass.setLayout(null);
        rpass.setBounds(590, 617, 300, 38);
        rpass.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        rpass.setHorizontalAlignment(JTextField.CENTER);
        rpass.setBackground(new Color(255, 102, 102));
        //rpass.setForeground(Color.white);
        rpass.setBorder(BorderFactory.createEmptyBorder());

        sb = new JButton();
        sb.setText("Sign in");
        sb.setBounds(590, 700, 300, 45);
        sb.setFocusable(false);
        sb.setBackground(new Color(170, 0, 104));
        sb.setFont(new Font("Consolas", Font.BOLD, 16));
        sb.setForeground(Color.WHITE);
        sb.addActionListener(this);

        sp = new JButton();
        sp.setBounds(110, 660, 250,110);
        sp.setOpaque(false);
        sp.setContentAreaFilled(false);
        sp.setBorder(BorderFactory.createEmptyBorder());
        sp.addActionListener(this);

        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\fs.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));

        l.add(fl);
        l.add(ll);
        l.add(ul);
        l.add(pl);
        l.add(rl);
        l.add(fn);
        l.add(ln);
        l.add(un);
        l.add(pass);
        l.add(rpass);
        l.add(sb);
        l.add(sp);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Sign in");
        f.add(l);
        
    }

    public static String getName()
    {
        return SignIn.Name;
    }

    public static String getUserName()
    {
        return SignIn.userName;
    }

    public static String getPassword()
    {
        return SignIn.password;
    }

    public static String getFirstName()
    {
        return SignIn.firstName;
    }

    public static String getLastName()
    {
        return SignIn.lastName;
    }

    public static void setFirstName(String n)
    {
        SignIn.firstName = n ;
    }

    public static void setLastName(String n)
    {
        SignIn.lastName = n ;
    }

    public static void setName(String n)
    {
        SignIn.Name = n ;
    }

    public static void setUserName(String n)
    {
        SignIn.userName = n ;
    }

    public static void setPassword(String n)
    {
        SignIn.password = n ;
    }

    public void actionPerformed(ActionEvent x)
    {
        firstName = fn.getText();
        lastName = ln.getText();
        userName = un.getText();
        password = pass.getText();
        retypedPassword = rpass.getText();
        Name = firstName + " " + lastName;

        if(x.getSource() == sb)
        {
            if(password.equals(this.retypedPassword))
            {
                if( fn.getText().equals("") || ln.getText().equals("") || un.getText().equals("") || pass.getText().equals("") || rpass.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "You have to fill all the information", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    SignIn.k = 1 ;
                    f.setVisible(false);
                    new StartPage();
                    JOptionPane.showMessageDialog(null, "Account has been registered, You may login now", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Password and retyped password does not match", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(x.getSource() == sp)
        {
            this.f.setVisible(false);
            new StartPage();
        }
    }
	
	
    

}
