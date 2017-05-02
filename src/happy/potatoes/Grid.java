package happy.potatoes;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sad Potateos
 */
public class Grid extends JPanel implements ActionListener{
    //changed the line below to prtoected so i can modify it from HappyPotatoes.java
    protected NyanCat nyan;
    private ArrayList<Edible> edibles;
    private ArrayList<Shoot> shoots;

    public Grid() {
        
    }

    public Grid(NyanCat nyan) {
        this.nyan = nyan;
        this.edibles = new ArrayList<Edible>();
        this.shoots = new ArrayList<Shoot>();
    }

    public NyanCat getNyan() {
        return nyan;
    }

    public ArrayList<Edible> getEdibles() {
        return edibles;
    }

    public ArrayList<Shoot> getShoots() {
        return shoots;
    }
    
   // todo
   public Shoot collisionWithShoot(){return null;}
   // tode
   public Edible collisionWithEdible(){return null;}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon bg = new ImageIcon("./Drawables/bg.gif");
        g.drawImage(bg.getImage(), 0, 0, 1440, 960, this);
        //renamed ImageIcon nyan to nyanIcon because it conflicted with object nyan from clas nyanCat
        ImageIcon nyanIcon = new ImageIcon("./Drawables/" + this.nyan.getDrawable());
        //int nyanHeight = this.nyan.getBound().getHeight();
        //int nyanWidth = this.nyan.getBound().getWidth();
        //int nyanX = this.nyan.getBound().getX();          i don't really find them usefull as they don't change the
        //int nyanY = this.nyan.getBound().getY();          real position of the cat, and it will cause redundancy if we change both
        
        
        g.drawImage(nyanIcon.getImage(),nyan.getBound().getX() , nyan.getBound().getY(), nyan.getBound().getHeight(), nyan.getBound().getWidth(), this);
        //mazen adding keylistener for the cat inside the grid
        this.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_UP){
                   if(nyan.isDrugged()) nyan.nyanDown();
                   else nyan.nyanUp();
                   System.out.println("up");
                   repaint();
                   e.setKeyCode(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                   if(nyan.isDrugged()) nyan.nyanUp();
                   else nyan.nyanDown();
                   System.out.println("down");
                   repaint();
                   e.setKeyCode(0);
                }
             }
        });
    }
    
}
