package happy.potatoes;

/**
 *
 * @author Sad Potateos
 */
public class Shoot extends GridElement{
    private int lossInLifes;

    public Shoot(int lossInLifes) {
        this.lossInLifes = lossInLifes;
    }

    public Shoot(int lossInLifes, Bound bound, String drawable) {
        super(bound, drawable);
        this.lossInLifes = lossInLifes;
    }

    public Shoot(int lossInLifes, int x, int y, int height, int width, String drawable) {
        super(x, y, height, width, drawable);
        this.lossInLifes = lossInLifes;
    }

   
    public int getLossInLifes() {
        return lossInLifes;
    }

    public void setLossInLifes(int lossInLifes) {
        this.lossInLifes = lossInLifes;
    }

    @Override
    protected boolean inCollision(Bound bound) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean isVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean joinGrid(Bound bound) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
