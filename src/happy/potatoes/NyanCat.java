package happy.potatoes;

/**
 *
 * @author Sad Potateos
 */
public class NyanCat extends GridElement{
    private boolean drugged;
    private String sound;
    private boolean singing;
    private int numLifes;
    
    public NyanCat(Bound bound, String drawable){
        super(bound, drawable);
    }

    // todo check drugged usage
    public NyanCat(boolean drugged, String sound, boolean singing, int numLifes, Bound bound, String drawable) {
        super(bound, drawable);
        this.drugged = drugged;
        this.sound = sound;
        this.singing = singing;
        this.numLifes = numLifes;
    }

    public NyanCat(boolean drugged, String sound, boolean singing, int numLifes, int x, int y, int height, int width, String drawable) {
        super(x, y, height, width, drawable);
        this.drugged = drugged;
        this.sound = sound;
        this.singing = singing;
        this.numLifes = numLifes;
    }

   

    public boolean isDrugged() {
        return drugged;
    }

    public void drugged(boolean drugged) {
        this.drugged = drugged;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isSinging() {
        return singing;
    }

    public void setSinging(boolean singing) {
        this.singing = singing;
    }

    public int getNumLifes() {
        return numLifes;
    }

    public void setNumLifes(int numLifes) {
        this.numLifes = numLifes;
    }
    
    // todo open the music file Nyan's song
    public void sing(boolean b){}
    
    // todo fire when game mode is space invadeors
    public void fire(Bound bound){}

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
