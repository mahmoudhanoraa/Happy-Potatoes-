package happy.potatoes;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sad Potateos
 */
public class Grid extends JPanel implements ActionListener{
    private NyanCat nyan;
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
        ImageIcon nyan = new ImageIcon("./Drawables/" + this.nyan.getDrawable());
        int nyanHeight = this.nyan.getBound().getHeight();
        int nyanWidth = this.nyan.getBound().getWidth();
        int nyanX = this.nyan.getBound().getX();
        int nyanY = this.nyan.getBound().getY();
        g.drawImage(nyan.getImage(),nyanX , nyanY, nyanHeight, nyanWidth, this);
    }
    
}
