import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingSprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    protected int width;
    protected int height;
    
    protected int speed = 3;
    protected int turnAngle = 4;
    
    protected GreenfootImage image;
    
    private CrabWorld world;
    
    public Crab()
    {
        image = getImage();
        
        width = image.getWidth();
        height = image.getHeight();
        image.scale((int)(width * 0.8), (int)(height * 0.8));
        
        setRotation(90);
    }
    
    /**
     * This method allows the user to move the crab so that when
     * it collides with a worm the worm is removed and the score
     * is increase
     */
    public void act()
    {
        move4Ways();  // or moveAndTurn
    }
    
    /**
     * This method rotates the worm a small amount to the
     * left or to the right, and then the worm moves in that
     * direction
     */
    public void moveAndTurn()
    {
    }
    
    /**
     * This method moves the crab around in four directions
     * left, right, up and down using coordinate positions. 
     * It must not move off the screen.
     */
    public void move4Ways()
    {
    }
}
