import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class UpdateUserInfo implements ActionListener
{
    JFrame f ;
    JTextField fn, ln, un, pass, opass ;
    JLabel l ;
    JLabel firstName, lastName, userName, newPassword, oldPassword ;
    JButton save, back ;
    private String pfname, plname, pun, ppass, ufname = "", ulname = "", uun = "", upass = "", NAME = ""; // previous and updated
    public static int v ;
    UpdateUserInfo(int pp)
    {
        v = pp ;
        save = new JButton();
        save.setBounds(80, 427, 213, 125);
        save.setOpaque(false);
        save.setContentAreaFilled(false);
        save.setBorder(BorderFactory.createEmptyBorder());
        save.addActionListener(this);

        back = new JButton();
        back.setBounds(80, 585, 220, 125);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);


        pfname = SignIn.getFirstName();
        plname = SignIn.getLastName();
        pun = SignIn.getUserName();
        ppass = SignIn.getPassword();

        fn = new JTextField();
        fn.setLayout(null);
        fn.setBounds(490, 140, 200, 65);
        fn.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
        fn.setHorizontalAlignment(JTextField.LEFT);
        fn.setBackground(new Color(255, 102, 102));
        fn.setBorder(BorderFactory.createEmptyBorder());
        fn.setOpaque(false);
        fn.setText(pfname);

        ln = new JTextField();
        ln.setLayout(null);
        ln.setBounds(777, 140, 200, 65);
        ln.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
        ln.setHorizontalAlignment(JTextField.LEFT);
        ln.setBackground(new Color(255, 102, 102));
        ln.setBorder(BorderFactory.createEmptyBorder());
        ln.setOpaque(false);
        ln.setText(plname);

        un = new JTextField();
        un.setLayout(null);
        un.setBounds(490, 297, 500, 65);
        un.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
        un.setHorizontalAlignment(JTextField.LEFT);
        un.setBackground(new Color(255, 102, 102));
        un.setBorder(BorderFactory.createEmptyBorder());
        un.setOpaque(false);
        un.setText(pun);

        pass = new JTextField();
        pass.setLayout(null);
        pass.setBounds(490, 458, 500, 65);
        pass.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
        pass.setHorizontalAlignment(JTextField.LEFT);
        pass.setBackground(new Color(255, 102, 102));
        pass.setBorder(BorderFactory.createEmptyBorder());
        pass.setOpaque(false);
        if(v==1)
        {
            pass.setEditable(false);
        }

        opass = new JTextField();
        opass.setLayout(null);
        opass.setBounds(490, 619, 500, 65);
        opass.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
        opass.setHorizontalAlignment(JTextField.LEFT);
        opass.setBackground(new Color(255, 102, 102));
        opass.setBorder(BorderFactory.createEmptyBorder());
        opass.setOpaque(false);
        if(v==1)
        {
            opass.setEditable(false);
        }
        


        firstName = new JLabel("First name");
        firstName.setLayout(null);
        firstName.setBounds(490, 125, 200, 20);
        firstName.setFont(new Font("Consolas", Font.PLAIN, 22));

        lastName = new JLabel("Last name");
        lastName.setLayout(null);
        lastName.setBounds(777, 125, 200, 20);
        lastName.setFont(new Font("Consolas", Font.PLAIN, 22));

        userName = new JLabel("User name");
        userName.setLayout(null);
        userName.setBounds(490, 282, 200, 20);
        userName.setFont(new Font("Consolas", Font.PLAIN, 22));

        newPassword = new JLabel("New password");
        newPassword.setLayout(null);
        newPassword.setBounds(490, 443, 200, 20);
        newPassword.setFont(new Font("Consolas", Font.PLAIN, 22));

        oldPassword = new JLabel("Retype current password");
        oldPassword.setLayout(null);
        oldPassword.setBounds(490, 601, 400, 20);
        oldPassword.setFont(new Font("Consolas", Font.PLAIN, 22));



        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\UpdateUserInfo.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(firstName);
        l.add(lastName);
        l.add(userName);
        l.add(newPassword);
        l.add(oldPassword);
        l.add(fn);
        l.add(ln);
        l.add(un);
        l.add(pass);
        l.add(opass);
        l.add(save);
        l.add(back);


        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Update information");
        f.add(l);
    }

    public void actionPerformed(ActionEvent x)
    {
        this.ufname = fn.getText();
        this.ulname = ln.getText();
        this.upass = pass.getText();
        this.uun = un.getText();
        String inputPass = opass.getText();

        if(x.getSource() == save && v == 1)
        {
            if(ufname.equals("") || ulname.equals("") || uun.equals(""))
            {
                JOptionPane.showMessageDialog(null, "You can not fill any empty field", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                this.NAME = this.ufname + " " + this.ulname;
                SignIn.setFirstName(this.ufname);
                SignIn.setLastName(this.ulname);
                SignIn.setName(this.NAME);
                SignIn.setUserName(uun);
                JOptionPane.showMessageDialog(null, "Information updated successfully", "Updated", JOptionPane.PLAIN_MESSAGE);
            }
            
        }
        if(x.getSource() == save && v == 2)
        {
            if(ufname.equals("") || ulname.equals("") || upass.equals("") || uun.equals(""))
            {
                JOptionPane.showMessageDialog(null, "You can not fill any empty field", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(!inputPass.equals(ppass))
                {
                    JOptionPane.showMessageDialog(null, "Given current password is wrong", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    this.NAME = this.ufname + " " + this.ulname;
                    SignIn.setFirstName(this.ufname);
                    SignIn.setLastName(this.ulname);
                    SignIn.setName(this.NAME);
                    SignIn.setPassword(upass);
                    SignIn.setUserName(uun);
                    JOptionPane.showMessageDialog(null, "Information updated successfully", "Updated", JOptionPane.PLAIN_MESSAGE);

                }
            }
            
        }
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
    }
	
	


}
