package happy.potatoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class HappyPotatoes {
    public static Grid gameGrid = new Grid(new NyanCat(new Bound(0, 0, 408, 160), "nyan.gif", 3));
    public static String[] normals = {"tuna.png", "dry.png", "mouse.png", "chicken.png", "kosa.png", "brocc.png", "naizak.png"};
    public static String[] specials = {"potato.png", "mar.png"};
    public static int score = 0;
    
    
    public static void addNormals(){
        Random rand = new Random();
        int ind = rand.nextInt(7);
        String normalName = normals[ind];
        if(normalName.equals("tuna.png") || normalName.equals("dry.png") || normalName.equals("mouse.png") || normalName.equals("chicken.png")){
            gameGrid.getEdibles().add(new Edible(100, 0, null, 1440, rand.nextInt(5)*170, 160, 160, normalName));
        }
        
        else if(normalName.equals("kosa.png")){
            gameGrid.getEdibles().add(new Edible(0, -1, null, 1440, rand.nextInt(5)*170, 160, 160, normalName));
        }
        
        else if(normalName.equals("brocc.png")){
            gameGrid.getEdibles().add(new Edible(-100, 0, null, 1440, rand.nextInt(5)*170, 160, 160, normalName));
        }
        
        else if(normalName.equals("naizak.png")){
            gameGrid.getEdibles().add(new Edible(0, -3, null, 1440, rand.nextInt(5)*170, 160, 160, normalName));
        }
    }
    
    public static void addSpecials(){
        Random rand = new Random();
        int ind = rand.nextInt(2);
        String spName = specials[ind];
        if(spName.equals("potato.png")){
            gameGrid.getEdibles().add(new Edible(100, 0, null, 1440, rand.nextInt(5)*170, 160, 160, spName));
        }
        else{
            gameGrid.getEdibles().add(new Edible(100, 1, null, 1440, rand.nextInt(5)*170, 160, 160, spName));
        }
    }
        
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setSize(1440, 1000);
        JLabel scoreLabel = new JLabel(""+score);
        scoreLabel.setBounds(0,950,30,30);
        f.getContentPane().add(scoreLabel);
        f.setLocationRelativeTo(null);
        gameGrid.setBounds(0, 0, 1440, 900);
        f.getContentPane().add(gameGrid);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        gameGrid.setFocusable(true);
        Timer timerNorm;
        timerNorm = new Timer(900, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                addNormals();
                // Code to be executed
            }
        });
        timerNorm.setRepeats(true); // Only execute once
        timerNorm.start(); // Go go go!
        
        Timer timerSp;
        timerSp = new Timer(5500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                addSpecials();
                // Code to be executed
            }
        });
        timerSp.setRepeats(true); // Only execute once
        timerSp.start(); // Go go go!
        
        Timer timerMove;
        timerMove = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Code to be executed
                for(Edible edible : gameGrid.getEdibles()){
                    edible.move();
                }
                gameGrid.repaint();
                int colliderInd = gameGrid.collisionWithEdible();
                if(colliderInd != -1){ 
                    Edible collider = gameGrid.getEdibles().get(colliderInd);
                    
                    if(collider.getDrawable().equals("mar.png")){
                        gameGrid.nyan.drugNyan();
                    }
                    
                   
                    gameGrid.getNyan().setNumLifes(gameGrid.getNyan().getNumLifes()+collider.getNumLifes());
                    
                    if(gameGrid.getNyan().getNumLifes() > 3){
                        gameGrid.getNyan().setNumLifes(3);
                    }
                    
                    score += collider.getScore();
                    System.out.println(score);
                    gameGrid.getEdibles().remove(colliderInd);
                    scoreLabel.setText(""+score);
                    f.repaint();

                }
                
                if(gameGrid.getNyan().getNumLifes() <= 0){
                    JOptionPane.showMessageDialog(null, "Game Over " + score);
                    System.exit(0);
                }
//                scoreLabel.setText(""+score);
//                f.repaint();

            }
            
        });
        timerMove.setRepeats(true); // Only execute once
        timerMove.start(); // Go go go!
        
        
        //moved keylistener from grid to main class because it was getting repainted inside paint() method million times which caused exceptions 
        //after few seconds of run time
            gameGrid.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_UP){
                   if(gameGrid.nyan.isDrugged()) gameGrid.nyan.nyanDown();
                   else gameGrid.nyan.nyanUp();
                   System.out.println("up");
                   gameGrid.repaint();
                   e.setKeyCode(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                   if(gameGrid.nyan.isDrugged()) gameGrid.nyan.nyanUp();
                   else gameGrid.nyan.nyanDown();
                   System.out.println("down");
                   gameGrid.repaint();
                   e.setKeyCode(0);
                }
             }
        });
    }
    
    
}
