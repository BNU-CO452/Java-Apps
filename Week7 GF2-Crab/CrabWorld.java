import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this game the player controls a crab which
 * can move around the world and eat worms.  There
 * is a lobster in the world that can eat crabs if
 * it intersects with a crab.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public static final int MAX_WIDTH = 800;
    public static final int MAX_HEIGHT = 600;
    public static final int MAXN_WORMS = 20;
    
    private Crab crab;
    private Lobster lobster;
    
    private Worm[] worms;
    private int wormSize;
    private int remainingWorms = MAXN_WORMS;
    
    private Counter score;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(MAX_WIDTH, MAX_HEIGHT, 1); 
        
        crab = new Crab();
        addObject(crab, 200, 200);
        
        lobster = new Lobster();
        addObject(lobster, 600, 400);
        
        worms = new Worm[MAXN_WORMS];
        
        wormSize = 30;
        addWorms();
        
        setupScore();
    }
    
    /**
     * Add MAXN_WORMS to the world in random positions
     */
    public void addWorms()
    {

    }
    
    /**
     * This method creates & adds a single worm to a random position in
     * the world that is not too near the edge of the screen
     */
    private void createWorm()
    {
    }
    
    public void score()
    {
    }
    
    private void setupScore()
    {
        score = new Counter("Score: ");
        addObject (score, 60, 30);
    }
    
    public void loseGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
    public void winGame()
    {
        showText("Game Over: You have Won!", 400, 300);
    }
    
}
