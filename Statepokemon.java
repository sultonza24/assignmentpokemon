import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Statepokemon extends JFrame{
    Pokemon pokemon;
    public Statepokemon(Pokemon pokemon){
        super("state pokemon");
        Container c = getContentPane();
        //layout
        c.setLayout(null);
        //add state
        JLabel state = new JLabel("Pokemon state");
        state.setBounds(40, 5, 180, 25);
        c.add(state);

        JLabel state1 = new JLabel("Pokemon state : 1");
        state1.setBounds(40, 30, 180, 25);
        c.add(state1);

        JLabel state2 = new JLabel("Pokemon state : 2");
        state2.setBounds(40, 55, 180, 25);
        c.add(state2);

        JLabel state3 = new JLabel("Pokemon state : 3");
        state3.setBounds(40, 80, 180, 25);
        c.add(state3);

        JLabel state4 = new JLabel("Pokemon state : 4");
        state4.setBounds(40, 105, 180, 25);
        c.add(state4);

        JLabel state5 = new JLabel("Pokemon state : 5");
        state5.setBounds(40, 130, 180, 25);
        c.add(state5);


        //add JRadiobuttom
        JLabel pass = new JLabel("if you pass you can click");
        pass.setBounds(190, 5, 280, 25); 
        c.add(pass);

        JCheckBox chkBox1 = new JCheckBox("pass");
        chkBox1.setBounds(190, 40, 100, 10);
        chkBox1.isSelected();
        c.add(chkBox1);

        JCheckBox chkBox2 = new JCheckBox("pass");
        chkBox2.setBounds(190, 65, 100, 10);
        chkBox2.isSelected();
        c.add(chkBox2);

        JCheckBox chkBox3 = new JCheckBox("pass");
        chkBox3.setBounds(190, 90, 100, 10);
        chkBox3.isSelected();
        c.add(chkBox3);

        JCheckBox chkBox4 = new JCheckBox("pass");
        chkBox4.setBounds(190, 115, 100, 10);
        chkBox4.isSelected();
        c.add(chkBox4);

        JCheckBox chkBox5 = new JCheckBox("pass");
        chkBox5.setBounds(190, 140, 100, 10);
        chkBox5.isSelected();
        c.add(chkBox5);



        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}