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
    
    protected abstract boolean inCollision(Bound bound);
    protected abstract boolean move();
    protected abstract boolean isVisible();
    protected abstract boolean joinGrid(Bound bound);
}
