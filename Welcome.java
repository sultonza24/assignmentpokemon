import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Welcome extends JFrame{
    
    public Welcome(){
        super("Pokemon Game Beta");
        Trainer t = new Trainer("sulton");
        Container c = getContentPane();
        //label for background
        JLabel bg = new JLabel();
        ImageIcon background = new ImageIcon("D://pokemon_welcome.jpg");
        bg.setIcon(background);
        bg.setBounds(0, -75, 500, 550);
        bg.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bg);

        c.setLayout(null);
        //add button
        JButton	btn1 = new JButton("PLAY");
        btn1.setBounds(200, 240, 100, 30);
        btn1.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                MainGame mg = new MainGame(t);
            }
        });
        c.add(btn1);
		
        JButton btn2 = new JButton("ABOUT US");
        btn2.setBounds(200, 280, 100, 30);
        btn2.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, " Hi I'm sulton waekachi 6110110107");
            }
        });
		c.add(btn2);
		
        JButton btn3 = new JButton("QUIT");
        btn3.setBounds(200, 320, 100, 30);
        btn3.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
		c.add(btn3);
        

        //system
        setSize(500,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}