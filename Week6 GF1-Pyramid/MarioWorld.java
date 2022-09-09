import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;

/**
 * A new version of the Mario Game which just contains
 * a platform for Mario to walk left to right and a Pyramid
 * 
 * @author Derek Peacock 
 * @version 1.0
 */
public class MarioWorld extends World
{
    public static final int MAXN_COLUMNS = 24;
    public static final int MAXN_ROWS = 20;
    public static final int TILE_SIZE = 30; // pixels
    
    private Mario mario;
    
    /**
     * Setup the world with MAXN_COLUMNS x MAXN_ROWS
     * of tiles, with a tiles being squares TILE_SIZE pixels
     * 
     */
    public MarioWorld()
    {    
        // Create a new world with 24 x 20 tiles of 30 pixels each
        
        super(MAXN_COLUMNS, MAXN_ROWS, TILE_SIZE); 
        
        drawPath();
        
        mario = new Mario();
        addObject(mario, 1, 17);
        
        buildPyramid();
    }
    
    /**
     * Create a path at the bottom of the screen which is
     * 2 tiles high and goes right across the whole widh of
     * the screen.
     */
    private void drawPath()
    {
        int yStart = MAXN_ROWS - 1; // 19
        int yEnd = MAXN_ROWS - 2; // 18
        
        for(int y = yStart; y >= yEnd; y--)
        {
            for(int x = 0; x < MAXN_COLUMNS; x++)
            {
                Block Block = new Block();
                addObject(Block, x, y);
            }
        }
    }
    
    /**
     * Ask the user to enter the size of the pyramid in
     * blocks between 1 to 8 inclusive
     */
    private int getPyramidSize()
    {
        String reply = Greenfoot.ask("Enter the pyramid size (1-8) > ");
        int size = Integer.parseInt(reply); 

        return size;
    } 
    
    
    /**
     * Build a pyramid of blocks.  The pyramid base is twice
     * the size, and the pyramid is size blocks high.
     * There is a gap of 2 blocks in the centre
     */
    public void buildPyramid()
    {
        int pyramidSize = getPyramidSize();
        
        int x = 4; int y = 17;
        Block Block = new Block();
        addObject(Block, x, y);
    }
    
}
