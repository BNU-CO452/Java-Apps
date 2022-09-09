import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
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
        super(800, 600, 1); 
        
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
    private void createWorm(int number)
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
    
    public void endGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
}
