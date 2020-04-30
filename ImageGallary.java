import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageGallary extends JFrame{
    private Trainer trainer;
    Pokemon pokemon;
    public ImageGallary(Pokemon pokemon){
        super("Image Gallary");
        this.pokemon = pokemon;
        Container c = getContentPane();
        //layout
        c.setLayout(null);

        JLabel bgall = new JLabel();
        ImageIcon backgroundall = new ImageIcon("D://all.jpg");
        bgall.setIcon(backgroundall);
        bgall.setBounds(0, -50, 400, 200);
        bgall.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgall);
        

        JLabel bgall1 = new JLabel();
        ImageIcon backgroundall1 = new ImageIcon("D://1.jpg");
        bgall1.setIcon(backgroundall1);
        bgall1.setBounds(200, 0, 100, 100);
        bgall1.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgall1);

        JLabel bgall2 = new JLabel();
        ImageIcon backgroundall2 = new ImageIcon("D://2.jpg");
        bgall2.setIcon(backgroundall2);
        bgall2.setBounds(200, 100, 100, 100);
        bgall2.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgall2);

        JLabel bgall3 = new JLabel();
        ImageIcon backgroundall3 = new ImageIcon("D://3.jpg");
        bgall3.setIcon(backgroundall3);
        bgall3.setBounds(0, 100, 100, 100);
        bgall3.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgall3);

        JLabel bgall4 = new JLabel();
        ImageIcon backgroundall4 = new ImageIcon("D://4.jpg");
        bgall4.setIcon(backgroundall4);
        bgall4.setBounds(100, 100, 100, 100);
        bgall4.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgall4);



        setSize(350, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }


}