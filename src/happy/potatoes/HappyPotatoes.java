package happy.potatoes;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

public class HappyPotatoes {
    public static Grid gameGrid = new Grid(new NyanCat(new Bound(0, 10, 408, 160), "nyan.gif"));
    public static String[] normals = {"tuna.png", "dry.png", "mouse.png", "chicken.png", "kosa.png", "brocc.png", "naizak.png"};
    public static String[] specials = {"pot.png", "mar.png"};
    public static int score = 0;
    
    
    public static void addNormals(){
        Random rand = new Random();
        int ind = rand.nextInt(7);
        String normalName = normals[ind];
        if(normalName.equals("tuna.png") || normalName.equals("dry.png") || normalName.equals("mouse.png") || normalName.equals("chicken.png")){
            gameGrid.getEdibles().add(new Edible(100, 0, null, 1200, 0, 160, 160, normalName));
        }
        
        else if(normalName.equals("kosa.png")){
            gameGrid.getEdibles().add(new Edible(0, -1, null, 1200, 0, 160, 160, normalName));
        }
        
        else if(normalName.equals("brocc.png")){
            gameGrid.getEdibles().add(new Edible(-100, 0, null, 1200, 0, 160, 160, normalName));
        }
        
        else if(normalName.equals("naizak.png")){
            gameGrid.getEdibles().add(new Edible(0, -3, null, 1200, 0, 160, 160, normalName));
        }
    }
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        addNormals();
        f.setSize(1440, 900);
        f.setLocationRelativeTo(null);
        f.getContentPane().add(gameGrid);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        gameGrid.setFocusable(true);
        gameGrid.nyan.drugNyan();

    }
    
    
}
