import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PokemonFeed extends JFrame{
    Pokemon pokemon;
    public int levelup = 0;
    public PokemonFeed(Pokemon pokemon){
        super("Feed");
        this.pokemon = pokemon;
        Container c = getContentPane();
        //layout
        c.setLayout(null);
        //label
        JLabel namefushi = new JLabel("--- Select pokemon for feed ---");
        namefushi.setBounds(110, 20, 200, 25);
        c.add(namefushi);
        //Jcommobox
        String[] petStrings = {pokemon.getName(),pokemon.getName2()};
        JComboBox comboBox = new JComboBox(petStrings);
        comboBox.setSelectedItem(2);
        comboBox.setBounds(140, 48, 120, 23);
        comboBox.getSelectedItem(); //get select item
        c.add(comboBox);

        //buttom for JcomboBox
        JButton btncombo1 = new JButton("Select");
        btncombo1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg1){
                JOptionPane.showMessageDialog(null, "You select : " + comboBox.getSelectedItem());
            }
        });
        btncombo1.setBounds(150, 80, 100, 30);
        c.add(btncombo1);
        //-------------------------------------------------------------------
        JLabel namefeed = new JLabel("--- Click buttom for feed to pokemon ---");
        namefeed.setBounds(80, 120, 260, 25);
        c.add(namefeed);

        JButton btncombofeed = new JButton("Click");
        btncombofeed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg1){
                JOptionPane.showMessageDialog(null, "you feed to pokemon +1");
                levelup++;
                if(levelup == 10){
                    JOptionPane.showMessageDialog(null, "Level Up");
                }
            }
        });
        btncombofeed.setBounds(150, 150, 100, 30);
        c.add(btncombofeed);


        JLabel text = new JLabel(" Click 10 time for level up");
        text.setBounds(120, 180, 260, 25);
        c.add(text);



        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}