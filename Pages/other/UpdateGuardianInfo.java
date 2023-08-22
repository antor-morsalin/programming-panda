
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UpdateGuardianInfo implements ActionListener
{
    JFrame f ;
    JLabel l, name, contact, address ;
    JTextField nameF , contactF , addressF ;
    JButton back, save ;
    String gname = "", gcontact = "", gaddress = "" ;

    UpdateGuardianInfo()
    {
        nameF = new JTextField();
        nameF.setLayout(null);
        nameF.setBounds(810, 120, 525, 65);
        nameF.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 26));
        nameF.setHorizontalAlignment(JTextField.LEFT);
        nameF.setBorder(BorderFactory.createEmptyBorder());
        nameF.setOpaque(false);
        nameF.setForeground(Color.WHITE);
        nameF.setText(setGuardianInfo.GuardianName);

        contactF = new JTextField();
        contactF.setLayout(null);
        contactF.setBounds(810, 335, 525, 65);
        contactF.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 26));
        contactF.setHorizontalAlignment(JTextField.LEFT);
        contactF.setBorder(BorderFactory.createEmptyBorder());
        contactF.setOpaque(false);
        contactF.setForeground(Color.WHITE);
        contactF.setText(setGuardianInfo.Contact);

        addressF = new JTextField();
        addressF.setLayout(null);
        addressF.setBounds(810, 550, 525, 65);
        addressF.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 26));
        addressF.setHorizontalAlignment(JTextField.LEFT);
        addressF.setBorder(BorderFactory.createEmptyBorder());
        addressF.setOpaque(false);
        addressF.setForeground(Color.WHITE);
        addressF.setText(setGuardianInfo.Address);



        name = new JLabel("Guardian Name");
        name.setLayout(null);
        name.setBounds(810, 100, 450, 40);
        name.setFont(new Font("Consolas", Font.PLAIN, 24));
        name.setForeground(Color.WHITE);

        contact = new JLabel("Contact");
        contact.setLayout(null);
        contact.setBounds(810, 315, 200, 25);
        contact.setFont(new Font("Consolas", Font.PLAIN, 24));
        contact.setForeground(Color.WHITE);

        address = new JLabel("Address");
        address.setLayout(null);
        address.setBounds(810, 530, 200, 25);
        address.setFont(new Font("Consolas", Font.PLAIN, 24));
        address.setForeground(Color.WHITE);



        back = new JButton();
        back.setBounds(100, 515, 225, 235);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);

        save = new JButton();
        save.setBounds(385, 515, 225, 235);
        save.setOpaque(false);
        save.setContentAreaFilled(false);
        save.setBorder(BorderFactory.createEmptyBorder());
        save.addActionListener(this);


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\UpdateGuardianInfo.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(back);
        l.add(save);
        l.add(name);
        l.add(contact);
        l.add(address);
        l.add(nameF);
        l.add(contactF);
        l.add(addressF);



        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Update Guardian Information");
        f.add(l);
    }

    public void actionPerformed(ActionEvent x)
    {
        this.gname = nameF.getText();
        this.gcontact = contactF.getText();
        this.gaddress = addressF.getText();
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == save)
        {
            if(this.gname.equals("") || this.gaddress.equals("") || this.gcontact.equals(""))
            {
                JOptionPane.showMessageDialog(null, "You can not leave any field empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else 
            {
                setGuardianInfo.Address = this.gaddress;
                setGuardianInfo.Contact = this.gcontact;
                setGuardianInfo.GuardianName = this.gname;
                JOptionPane.showMessageDialog(null, "Guardian information updated successfully", "Updated", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
	


}
