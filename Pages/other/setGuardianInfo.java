import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class setGuardianInfo implements ActionListener
{
    public static int gmark = 0 ;
    JFrame f ;
    JLabel l;
    JLabel guardianName, address, contact ;
    JTextField gn, ad, con;
    JButton next ;
    public static String GuardianName = "", Address = "", Contact = "" ;
    setGuardianInfo()
    {
        next = new JButton();
        next.setBounds(1030, 600, 390, 150);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorder(BorderFactory.createEmptyBorder());
        next.addActionListener(this);

        gn = new JTextField();
        gn.setLayout(null);
        gn.setBounds(110, 320, 540, 65);
        gn.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 26));
        gn.setHorizontalAlignment(JTextField.LEFT);
        gn.setBorder(BorderFactory.createEmptyBorder());
        gn.setOpaque(false);

        ad = new JTextField();
        ad.setLayout(null);
        ad.setBounds(110, 485, 540, 65);
        ad.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 24));
        ad.setHorizontalAlignment(JTextField.LEFT);
        ad.setBorder(BorderFactory.createEmptyBorder());
        ad.setOpaque(false);

        con = new JTextField();
        con.setLayout(null);
        con.setBounds(110, 650, 540, 65);
        con.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 26));
        con.setHorizontalAlignment(JTextField.LEFT);
        con.setBorder(BorderFactory.createEmptyBorder());
        con.setOpaque(false);


        guardianName = new JLabel("Guardian Name");
        guardianName.setLayout(null);
        guardianName.setBounds(110, 305, 200, 25);
        guardianName.setFont(new Font("Consolas", Font.PLAIN, 24));

        address = new JLabel("Address");
        address.setLayout(null);
        address.setBounds(110, 470, 200, 25);
        address.setFont(new Font("Consolas", Font.PLAIN, 24));

        contact = new JLabel("Contact no");
        contact.setLayout(null);
        contact.setBounds(110, 635, 200, 25);
        contact.setFont(new Font("Consolas", Font.PLAIN, 24));


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\setGuardianInfo.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(guardianName);
        l.add(address);
        l.add(contact);
        l.add(gn);
        l.add(ad);
        l.add(con);
        l.add(next);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Set Guardian Information");
        f.add(l);

    }

    public static void setGuardianName(String n)
    {
        setGuardianInfo.GuardianName = n ;
    }
    public static void setContact(String n)
    {
        setGuardianInfo.Contact = n ;
    }
    public static void setAddress(String n)
    {
        setGuardianInfo.Address = n ;
    }

    public static String getGuardianName()
    {
        return setGuardianInfo.GuardianName;
    }
    public static String getContact()
    {
        return setGuardianInfo.Contact ;
    }
    public static String getAddress()
    {
        return setGuardianInfo.Address;
    }



    public void actionPerformed (ActionEvent x)
    {
        setGuardianInfo.GuardianName = gn.getText();
        setGuardianInfo.Address = ad.getText();
        setGuardianInfo.Contact = con.getText();
        
        if(x.getSource() == next)
        {
            if(GuardianName.equals("") || Address.equals("") || Contact.equals("") )
            {
                JOptionPane.showMessageDialog(null, "You can not leave any field empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                gmark = 1 ;
                this.f.setVisible(false);
                new HomePage();
            }
        }
    }
	
	
}
