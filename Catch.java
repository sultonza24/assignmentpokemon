import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Catch extends JFrame{
    Pokemon pokemon;
    Trainer t = new Trainer("");
        public Catch(Pokemon pokemon){
        super("Catch pokemon");
        this.pokemon = pokemon;
        Container c = getContentPane();
        //layout
        JLabel bgcatch = new JLabel();
        ImageIcon backgroundcatch = new ImageIcon("D://pokeoncc.png");
        bgcatch.setIcon(backgroundcatch);
        bgcatch.setBounds(-10, 0, 400, 200);
        bgcatch.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgcatch);
        c.setLayout(null);
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

        t.play();
        


        }

}

