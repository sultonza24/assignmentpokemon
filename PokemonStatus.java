import java.awt.*;
import javax.swing.*;
public class PokemonStatus extends JFrame{
    Pokemon pokemon;
    public PokemonStatus(Pokemon pokemon){
        super("Pokomon Status in bag and status");
        this.pokemon = pokemon;


        Container c = getContentPane();
        //layout
        c.setLayout(null);

        //add image pikachu
        JLabel bgpokemon = new JLabel();
        ImageIcon backgroundpikachu = new ImageIcon("D://pikachu.gif");
        bgpokemon.setIcon(backgroundpikachu);
        bgpokemon.setBounds(0, 0, 100, 100);
        bgpokemon.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgpokemon);

        //add labek pikachu
        JLabel name = new JLabel(pokemon.getName());
        name.setBounds(35, 105, 80, 25);
        JLabel hp = new JLabel("HP: " + pokemon.getHp());
        hp.setBounds(35, 120, 80, 25);
        JLabel power = new JLabel("DAMAGE :" + pokemon.getDamage1());
        power.setBounds(25, 135, 80, 25);
        JLabel ability = new JLabel("ABILITY : " + pokemon.getAbility1());
        ability.setBounds(10, 150, 180, 25);
        //JLabel levelpikechu = new JLabel("LEVEL : " + pokemon.getlevel());
        //levelpikechu.setBounds(10, 175, 180, 25);
        //jradio
        JRadioButton radiobth1 = new JRadioButton("LEVEL 1");
        radiobth1.setBounds(10, 170, 100, 20);
        c.add(radiobth1);

        JRadioButton radiobth2 = new JRadioButton("LEVEL 2");
        radiobth2.setBounds(10, 185, 100, 20);
        c.add(radiobth2);

        JRadioButton radiobth3 = new JRadioButton("LEVEL 3");
        radiobth3.setBounds(10, 200, 100, 20);
        c.add(radiobth3);

        //set group for buttonRadio
        ButtonGroup group = new ButtonGroup();
        group.add(radiobth1);
        group.add(radiobth2);
        group.add(radiobth3);

        //add
        c.add(name);
        c.add(hp);
        c.add(power);
        c.add(ability);
        //c.add(levelpikechu);
        //c.add(levelpikechu2);
        //add image fushigidane
        JLabel bgfushigidane = new JLabel();
        ImageIcon backgroundfushigidane = new ImageIcon("D://Fushigidane.jpg");
        bgfushigidane.setIcon(backgroundfushigidane);
        bgfushigidane.setBounds(170, 0, 100, 100);
        bgfushigidane.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgfushigidane);
        
        //add label fushigidane
        JLabel namefushi = new JLabel(pokemon.getName2());
        namefushi.setBounds(180, 105, 80, 25);
        JLabel hpfushi = new JLabel("HP: " + pokemon.getHp2());
        hpfushi.setBounds(180, 120, 80, 25);
        JLabel powerfushi = new JLabel("DAMAGE :" + pokemon.getDamage2());
        powerfushi.setBounds(180, 135, 80, 25);
        JLabel abilityfushi = new JLabel("ABILITY : " + pokemon.getAbility2());
        abilityfushi.setBounds(180, 150, 180, 25);
        /*JLabel levelpikechu1 = new JLabel("LEVEL : " + pokemon.getlevel());
        levelpikechu1.setBounds(180, 175, 180, 25);
        */
        //jradio
        JRadioButton radio1 = new JRadioButton("LEVEL 1");
        radio1.setBounds(180, 175, 100, 20);
        c.add(radio1);

        JRadioButton radio2 = new JRadioButton("LEVEL 2");
        radio2.setBounds(180, 195, 100, 20);
        c.add(radio2);

        JRadioButton radio3 = new JRadioButton("LEVEL 3");
        radio3.setBounds(180, 215, 100, 20);
        c.add(radio3);

        //set group for buttonRadio
        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1);
        group1.add(radio2);
        group1.add(radio3);

        c.add(namefushi);
        c.add(hpfushi);
        c.add(powerfushi);
        c.add(abilityfushi);
        //c.add(levelpikechu1);
        


        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}