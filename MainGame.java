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

        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        
        //menu1
        JMenu menu1 = new JMenu("Menu 1");
        //menuitem
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");
        //------------------------------------------------
        //make event handler for open and exit 
        //open
        open.setMnemonic(KeyEvent.VK_O);
        open.setToolTipText("Open Application");
        open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){

            }
        });
        //exit
        exit.setMnemonic(KeyEvent.VK_E);
        exit.setToolTipText("Open Application");
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });

         //add other
         menu1.add(open);
         menu1.addSeparator();
         menu1.add(exit);
         //add menubar--------------------------
         menuBar.add(menu1);
         //-----------------------
         setJMenuBar(menuBar);


        //addimage status
        JLabel bgstatus = new JLabel();
        ImageIcon backgroundstatus = new ImageIcon("D://pokemoninbag.jpg");
        bgstatus.setIcon(backgroundstatus);
        bgstatus.setBounds(0, 0, 200, 200);
        bgstatus.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgstatus);

        JButton buttonstatus = new JButton("Click");
        buttonstatus.setBounds(60, 205, 80, 25);
        c.add(buttonstatus);
        
        buttonstatus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
            }
        });

        //add image feed
        JLabel bgfeed = new JLabel();
        ImageIcon backgroundfeed = new ImageIcon("D://feed.jpg");
        bgfeed.setIcon(backgroundfeed);
        bgfeed.setBounds(200, 0, 200, 200);
        bgfeed.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgfeed);

        JButton buttonfeed = new JButton("Click");
        buttonfeed.setBounds(270, 205, 80, 25);
        c.add(buttonfeed);

        buttonfeed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                PokemonFeed fd = new PokemonFeed(trainer.getBag().get(0));
            }
        });

        //image your name
        JLabel bgname = new JLabel();
        ImageIcon backgroundname = new ImageIcon("D://yourname.jpg");
        bgname.setIcon(backgroundname);
        bgname.setBounds(400, 0, 200, 200);
        bgname.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgname);

        JButton buttonname = new JButton("Click");
        buttonname.setBounds(460, 205, 80, 25);
        c.add(buttonname);

        buttonname.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                Createname cn = new Createname(trainer.getBag().get(0));
            }
        });

        //pokemon state
        JLabel bgstate = new JLabel();
        ImageIcon backgroundstate = new ImageIcon("D://checklist.jpg");
        bgstate.setIcon(backgroundstate);
        bgstate.setBounds(0, 240, 200, 200);
        bgstate.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgstate);

        JButton buttonstate = new JButton("Click");
        buttonstate.setBounds(60, 450, 80, 25);
        c.add(buttonstate);

        buttonstate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                Statepokemon sp = new Statepokemon(trainer.getBag().get(0));
            }
        });


        //pokemon catch
        JLabel bgcatch = new JLabel();
        ImageIcon backgroundcatch = new ImageIcon("D://cacthpokemon.jpg");
        bgcatch.setIcon(backgroundcatch);
        bgcatch.setBounds(200, 240, 200, 200);
        bgcatch.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgcatch);

        JButton buttoncatch = new JButton("Click");
        buttoncatch.setBounds(270, 450, 80, 25);
        c.add(buttoncatch);

        buttoncatch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ec){
                Catch ch = new Catch(trainer.getBag().get(0));
            }
        });

        //pokemon number
        JLabel bgnumber = new JLabel();
        ImageIcon backgroundnumber = new ImageIcon("D://imagegallary.jpg");
        bgnumber.setIcon(backgroundnumber);
        bgnumber.setBounds(400, 240, 200, 200);
        bgnumber.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        c.add(bgnumber);

        JButton buttonnumber = new JButton("Click");
        buttonnumber.setBounds(470, 450, 80, 25);
        c.add(buttonnumber);
        
        buttonnumber.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent hdd){
                ImageGallary hc = new ImageGallary(trainer.getBag().get(0));
            }
        });
    
        setSize(620, 550);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}