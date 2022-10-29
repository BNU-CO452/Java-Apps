import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a basic Actor where the image
 * is a drawn shape such as a Rectangle or Oval.
 * 
 * @author Derek Peacock
 * @version 0
 */
public class ShapeSprite extends Actor
{
    protected Shapes shape;
    
    protected int width;
    protected int height;
    
    protected int speed = 4;
    
    protected GreenfootImage image;
    
    public ShapeSprite(Shapes shape, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.shape = shape;
        
        image = new GreenfootImage(width, height);

        if(shape == Shapes.Rectangle)
        {
            setColor(Color.RED);            
        }
        else setColor(Color.BLUE);
        
        setImage(image);
    }
    
    /**
     * Act - do whatever the Sprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void setColor(Color color)
    {
        image.setColor(color);
        
        if(shape == Shapes.Rectangle)
            image.fill();
        else
            image.fillOval(0, 0, width, height);
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
