package happy.potatoes;

/**
 *
 * @author Sad Potateos
 */
public abstract class GridElement {
    private Bound bound;
    private String drawable;

    public GridElement(Bound bound, String drawable) {
        this.bound = bound;
        this.drawable = drawable;
    }

     public GridElement(int x, int y, int height, int width, String drawable) {
        this.bound = new Bound(x, y, height, width);
        this.drawable = drawable;
    }
    public GridElement() {
    }

    public Bound getBound() {
        return bound;
    }

    public void setLocation(Bound bound) {
        this.bound = bound;
    }

    public String getDrawable() {
        return drawable;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }
    
    protected boolean inCollision(Bound bound){
        if(408 >= this.bound.getX() && this.bound.getX() >= 204 &&bound.getY()==this.bound.getY()){
            return true;
        }
        return false;
    }
    protected abstract boolean move();
    protected abstract boolean isVisible();
    protected abstract boolean joinGrid(Bound bound);
}
