import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class LogIn implements ActionListener
{
    
    JFrame f ;
    private String U = "" ;
    private String P = "" ;
    JTextField un, pass ;
    JLabel ul, pl , yet ;
    JLabel l ;
    JButton lb , sa, sp ;
    LogIn()
    {
    
        this.U = SignIn.getUserName();
        this.P = SignIn.getPassword();

        ul = new JLabel();
        ul.setText("Username");
        ul.setLayout(null);
        ul.setFont(new Font("Consolas", Font.BOLD, 16));
        ul.setBounds(590, 380, 300, 30);

        pl = new JLabel();
        pl.setText("Password");
        pl.setLayout(null);
        pl.setFont(new Font("Consolas", Font.BOLD, 16));
        pl.setBounds(590, 465, 300, 30);

        un = new JTextField();
        un.setLayout(null);
        un.setBounds(590, 407, 300, 38);
        un.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        un.setHorizontalAlignment(JTextField.CENTER);
        un.setBackground(new Color(255, 102, 102));
        //un.setForeground(Color.white);
        un.setBorder(BorderFactory.createEmptyBorder());


        pass = new JTextField();
        pass.setLayout(null);
        pass.setBounds(590, 492, 300, 38);
        pass.setFont(new Font("Arial Nova Light", Font.BOLD, 17));
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setBackground(new Color(255, 102, 105));
        //pass.setForeground(Color.white);
        pass.setBorder(BorderFactory.createEmptyBorder());

        yet = new JLabel();
        yet.setText("Don't have an account? Click here to sign in");
        yet.setLayout(null);
        yet.setFont(new Font("Consolas", Font.BOLD, 10));
        yet.setBounds(590, 650, 600, 30);

        sa = new JButton();
        sa.setText("Sign in");
        sa.setBounds(590, 675, 300, 45);
        sa.setFocusable(false);
        sa.setBackground(new Color(170, 0, 104));
        sa.setFont(new Font("Consolas", Font.BOLD, 16));
        sa.setForeground(Color.WHITE);
        sa.addActionListener(this);

        sp = new JButton();
        sp.setBounds(110, 660, 250,110);
        sp.setOpaque(false);
        sp.setContentAreaFilled(false);
        sp.setBorder(BorderFactory.createEmptyBorder());
        sp.addActionListener(this);

        lb = new JButton();
        lb.setText("Log in");
        lb.setBounds(590, 575, 300, 45);
        lb.setFocusable(false);
        lb.setBackground(new Color(153, 0, 76));
        lb.setFont(new Font("Consolas", Font.BOLD, 16));
        lb.setForeground(Color.WHITE);
        lb.addActionListener(this);


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\fl.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(ul);
        l.add(pl);
        l.add(un);
        l.add(pass);
        l.add(lb);
        l.add(yet);
        l.add(sa);
        l.add(sp);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Log in");
        f.add(l);
    }

    @Override
    public void actionPerformed(ActionEvent x)
    {
        if(x.getSource() == lb)
        {
            if(P.equals(pass.getText()) && U.equals(un.getText()))
            {
                StartPage.mark = 1 ;
                f.setVisible(false);
                new StartPage();
                JOptionPane.showMessageDialog(null, "Login Successful, press play to begin", "Login Completed", JOptionPane.PLAIN_MESSAGE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid username and password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(x.getSource() == sa)
        {
            new SignIn();
            f.setVisible(false);
        }
        if(x.getSource() == sp)
        {
            this.f.setVisible(false);
            new StartPage();
        }
    }
	

}
