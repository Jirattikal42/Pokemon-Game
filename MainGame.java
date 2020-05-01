import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainGame extends JFrame
{
        private Trainer trainer;
        
        
        
       
        public MainGame(Trainer trainer){
        //super("Pokemon Game");
        
        this.trainer = trainer;
        
        
        
        setTitle("Pokemon Game");
        setContentPane(new JLabel(new ImageIcon("Pokemon.png")));
        setLayout(new FlowLayout());
        
        
        JButton jb1 = new JButton("NEW POKEMON");
        JButton jb2 = new JButton("BATTLE");
        JButton jb3 = new JButton("BAG");
        JButton jb4 = new JButton("SHOP");
        JButton jb5 = new JButton("Exit");
        
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        
        
        
        Box buttonBox = Box.createVerticalBox();
       
        buttonBox.add(jb1);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb2);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb3);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb4);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb5);
        

        

        jb1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb5.setAlignmentX(JButton.CENTER_ALIGNMENT);
        
        addItem(panel1, buttonBox, 3, 4, 1, 1, GridBagConstraints.CENTER);
        
        
        jb1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(trainer.slot().size() == 0){
                NewPokemon Newpokemon = new NewPokemon(trainer);
                Newpokemon.setVisible(true);
                setVisible(false);
                }
        }});
        
        jb2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                Battle battle = new Battle(trainer);
                battle.setVisible(true);
                setVisible(false);
        }});
        
        jb3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                PokemonStatus Status = new PokemonStatus(trainer);
                Status.setVisible(true);
                setVisible(false);
       
        }});
        
        jb4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                Shop shop = new Shop(trainer);
                shop.setVisible(true);
                setVisible(false);
      
        }});

        jb5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.exit(0);
                
        
        }});
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        pack();
        setSize(1280, 720);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        setVisible(true);
        


    }
    private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
        GridBagConstraints gc = new GridBagConstraints();
        
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = width;
        gc.gridheight = height;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = GridBagConstraints.CENTER;
        p.add(c, gc);
        
        // JLabel l1;
        // l1=new JLabel("Welcome Pokemon"); 
        // setLayout(new BorderLayout());
        //setLayout(new BorderLayout());
        // setLayout(new FlowLayout());
        // add(l1);
    }
    
} 
