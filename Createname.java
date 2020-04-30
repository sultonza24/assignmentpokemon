import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Createname extends JFrame{
    Pokemon pokemon;

    public Createname(Pokemon pokemon){
        super("Pokemon Game Create by sulton");

        this.pokemon = pokemon;
        Container c = getContentPane();
        //layout
        c.setLayout(null);
        
        //add image  
        JLabel bgnameall = new JLabel();
        ImageIcon backgroundnameall = new ImageIcon("D://all.jpg");
        bgnameall.setIcon(backgroundnameall);
        bgnameall.setBounds(100, 15, 200, 100);
        bgnameall.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgnameall);


        //Jtextfield
        JTextField txt = new JTextField();
        txt.setBounds(130, 140, 144, 20);
        c.add(txt);
        txt.setColumns(10);

        //lable for JTextFiled
        JLabel lb1 = new JLabel("Create name pokemon");
        lb1.setBounds(110, 190, 220, 20);
        c.add(lb1);

        //button for Jtextfiled
        JButton btntext = new JButton("Click");
        btntext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                lb1.setText("hello new name pokemon: " + txt.getText());
            }
        });
        btntext.setBounds(140, 165, 120, 20);
        c.add(btntext);
        
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}