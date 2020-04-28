import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame extends JFrame{
    private Trainer trainer;

    public MainGame(Trainer trainer){
        super("Pokemon Game Create by sulton");

        this.trainer = trainer;
        Container c = getContentPane();
        //layout
        c.setLayout(null);
        //addimage
        JLabel bgstatus = new JLabel();
        ImageIcon backgroundstatus = new ImageIcon("D://pokemoninbag.jpg");
        bgstatus.setIcon(backgroundstatus);
        bgstatus.setBounds(0, 0, 200, 200);
        bgstatus.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgstatus);

        //JLabel trainerNameLabel = new JLabel(this.trainer.getName());
        //JLabel pokemonName = new JLabel();
        //JButton firstPokemon = new JButton(trainer.getBag().get(0).getName() + " Status");
        JButton buttonstatus = new JButton("Click");
        buttonstatus.setBounds(60, 205, 80, 25);
        //add
        //c.add(pokemonName);
        c.add(buttonstatus);
        
        /*
        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }
        pokemonName.setText(pName);
        */
        buttonstatus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
            }
        });
        //system
        setSize(500, 450);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}