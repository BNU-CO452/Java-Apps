import greenfoot.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Animal. This is the base class for all animals. In addition to the standard Actor
 * methods, it provides methods to check for being at the edge of the world, as well as
 * seeing and eating other classes.
 * 
 * @author Michael Kolling
 * @version 2.0
 */
public class Animal extends Actor
{
    private static final int WALKING_SPEED = 5;

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        while(!atWorldEdge())
            move(WALKING_SPEED);
    }

    
    /**
     * Test if we are close to one of the edges of the world. 
     * Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    
    /**
     * Return actor if we can see an object of class 'anyClass' 
     * right where we are. 
     */
    public Actor canSee(Class anyClass)
    {
        Actor actor = getOneObjectAtOffset(0, 0, anyClass);
        return actor;        
    }
    
    /**
     * Try to eat an object of class 'foodClass'. 
     * This is only successful if there is such an object 
     * where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat(Class foodClass)
    {
        Actor actor = canSee(foodClass);
        
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}