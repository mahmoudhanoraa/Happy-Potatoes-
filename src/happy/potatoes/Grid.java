package happy.potatoes;

import java.util.ArrayList;

/**
 *
 * @author Sad Potateos
 */
public class Grid {
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
    
}
