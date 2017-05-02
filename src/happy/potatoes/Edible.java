package happy.potatoes;

/**
 *
 * @author Sad Potatoes
 */
public class Edible extends GridElement{
    private int score;
    private int numLifes;
    private String specialPower;

    public Edible() {
    }

    public Edible(int score, int numLifes, String specialPower, Bound bound, String drawable) {
        super(bound, drawable);
        this.score = score;
        this.numLifes = numLifes;
        this.specialPower = specialPower;
    }

    public Edible(int score, int numLifes, String specialPower, int x, int y, int height, int width, String drawable) {
        super(x, y, height, width, drawable);
        this.score = score;
        this.numLifes = numLifes;
        this.specialPower = specialPower;
    }

    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumLifes() {
        return numLifes;
    }

    public void setNumLifes(int numLifes) {
        this.numLifes = numLifes;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
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
