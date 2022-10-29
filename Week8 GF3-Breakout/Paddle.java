import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the paddle in four directions, up, down
 * left and right with the arrow keys
 * 
 * @author Derek Peacock
 * @version 0
 */
public class Paddle extends ShapeSprite
{
    protected int speed = 4;
    
    /**
     * Create a blue rectangle using a Greenfoot Image
     * 
     */
    public Paddle(int width, int height)
    {
         super(Shapes.Rectangle, width, height);
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    
    /**
     * This method moves the paddle around in two directions
     * using coordinate positions.  
     */
    public void move()
    {
        int x = getX(); int y = getY();
        
        if(Greenfoot.isKeyDown("down") && !isAtEdge())
        {
            y += speed;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > speed)
        {
            y -= speed;
        }
        
        setLocation(x, y);
    }
 
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
