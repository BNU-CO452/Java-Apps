import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    private GreenfootImage image;
    
    public Mario()
    {
        image = getImage();
        int size = MarioWorld.TILE_SIZE;
        image.scale(size, size);
    }
    
    public void act()
    {
        move(1);
    }
}
