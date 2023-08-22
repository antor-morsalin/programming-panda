
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner ;

public class StartCoding implements ActionListener
{
    JFrame f ;
    JLabel l ;
    public static JTextArea code, console ;
    JLabel Code, Console ;
    JButton back , save, load, run ;
    

    StartCoding()
    {
        code = new JTextArea();
        code.setBounds(38, 130, 670, 510);
        code.setLineWrap(true);
        code.setWrapStyleWord(true);
        code.setFont(new Font("Consolas", Font.PLAIN, 20));
        code.setOpaque(false);

        console = new JTextArea();
        console.setBounds(770, 130, 670, 510);
        console.setLineWrap(true);
        console.setWrapStyleWord(true);
        console.setFont(new Font("Consolas", Font.PLAIN, 20));
        console.setOpaque(false);


        Code = new JLabel("Your Code");
        Code.setLayout(null);
        Code.setBounds(300, 50, 450, 40);
        Code.setFont(new Font("Consolas", Font.PLAIN, 27));
        Code.setForeground(Color.WHITE);

        Console = new JLabel("Console");
        Console.setLayout(null);
        Console.setBounds(1050, 50, 450, 40);
        Console.setFont(new Font("Consolas", Font.PLAIN, 27));
        Console.setForeground(Color.WHITE);


        back = new JButton();
        back.setBounds(1110, 640, 310, 145);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);

        save = new JButton();
        save.setBounds(50, 640, 310, 145);
        save.setOpaque(false);
        save.setContentAreaFilled(false);
        save.setBorder(BorderFactory.createEmptyBorder());
        save.addActionListener(this);

        load = new JButton();
        load.setBounds(386, 640, 310, 145);
        load.setOpaque(false);
        load.setContentAreaFilled(false);
        load.setBorder(BorderFactory.createEmptyBorder());
        //load.addActionListener(this);

        run = new JButton();
        run.setBounds(830, 640, 180, 200);
        run.setOpaque(false);
        run.setContentAreaFilled(false);
        run.setBorder(BorderFactory.createEmptyBorder());
        run.addActionListener(this);


        l = new JLabel();
        ImageIcon li = new ImageIcon("E:\\Programming Panda\\icons\\StartCoding.png");
        l.setLayout(null);
        l.setBounds(0, 0, 1510, 830);
        l.setIcon(li);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setVerticalAlignment(JLabel.TOP);
        l.setPreferredSize(new Dimension(li.getIconWidth(), li.getIconHeight()));
        l.add(back);
        l.add(save);
        l.add(load);
        l.add(Code);
        l.add(Console);
        l.add(code);
        l.add(console);
        l.add(run);

        ImageIcon title = new ImageIcon("E:\\Programming Panda\\icons\\title.png");
        f = new JFrame();
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setBounds(30, 0, 1490, 830);
        f.setIconImage(title.getImage());
        f.setTitle("Start Coding");
        f.add(l);

    }

    public void actionPerformed (ActionEvent x)
    {
        if(x.getSource() == back)
        {
            this.f.setVisible(false);
        }
        if(x.getSource() == save)
        {
            try
            {
             File file = new File("E:/Programming Panda/File Code/code.txt");
             FileWriter writer = new FileWriter(file);
             writer.write(code.getText());
             writer.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        if(x.getSource() == run)
        {
            console.setText("");         
            new Compile(10000000, "E:/Programming Panda/File Code/code.txt");
            
        }
    }
	
	


}
