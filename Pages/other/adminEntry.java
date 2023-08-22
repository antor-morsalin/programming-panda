import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class adminEntry implements ActionListener
{
    JFrame f ;
    JLabel l, adminEntry, username, password ;
    JTextField un, pass ;
    JButton enter ;

    adminEntry()
    {
        enter = new JButton();
        enter.setText("Enter");
        enter.setBounds( 830, 630, 470, 50);
        enter.setFocusable(false);
        enter.setBackground(new Color(170, 0, 104));
        enter.setFont(new Font("Consolas", Font.BOLD, 16));
        enter.setForeground(Color.WHITE);
        enter.addActionListener(this);


        un = new JTextField();
        un.setLayout(null);
        un.setBounds(844, 265, 460, 65);
        un.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 25));
        un.setHorizontalAlignment(JTextField.LEFT);
        un.setBackground(new Color(255, 102, 102));
        un.setBorder(BorderFactory.createEmptyBorder());
        un.setOpaque(false);
        un.setForeground(Color.WHITE);

        pass = new JTextField();
        pass.setLayout(null);
        pass.setBounds(844, 467, 460, 65);
        pass.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 25));
        pass.setHorizontalAlignment(JTextField.LEFT);
        pass.setBackground(new Color(255, 102, 102));
        pass.setBorder(BorderFactory.createEmptyBorder());
        pass.setOpaque(false);
        pass.setForeground(Color.WHITE);


        adminEntry = new JLabel("Admin Entry");
        adminEntry.setBounds(950, 130, 450, 40);
        adminEntry.setFont(new Font("Consolas", Font.PLAIN, 32));
        adminEntry.setForeground(Color.WHITE);

        username = new JLabel("Username");
        username.setBounds(845, 224, 450, 40);
        username.setFont(new Font("Consolas", Font.PLAIN, 22));
        username.setForeground(Color.WHITE);

        password = new JLabel("Password");
        password.setBounds(845, 427, 450, 40);
        password.setFont(new Font("Consolas", Font.PLAIN, 22));
        password.setForeground(Color.WHITE);


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\adminEntry.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        
        l.add(adminEntry);
        l.add(username);
        l.add(password);
        l.add(un);
        l.add(pass);
        l.add(enter);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Admin Entry");
        f.add(l);
    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == enter)
        {
            if(un.getText().equals("admin") && pass.getText().equals("admin"))
            {
                this.f.setVisible(false);
                new Admin();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid credentials", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
   
}
