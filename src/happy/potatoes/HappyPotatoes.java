package happy.potatoes;

import java.util.ArrayList;
import javax.swing.JFrame;

public class HappyPotatoes {
    public static Grid gameGrid = new Grid(new NyanCat(new Bound(0, 10, 408, 160), "nyan.gif"));
    public static String[] normals = {"tuna", "dry", "mouse", "chicken", "kosa", "brocc", "naizak"};
    public static String[] specials = {"pot", "mar"};
    public static int score = 0;
    
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
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
