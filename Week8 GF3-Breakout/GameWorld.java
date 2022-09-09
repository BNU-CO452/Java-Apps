import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private Paddle paddle;
    private Ball ball;
    
    private Counter score;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        paddle = new Paddle(10, 80);
        ball = new Ball(20,20);
        
        addObject(paddle, 10, 200);
        addObject(ball, 100, 200);
        
        score = new Counter("Score: ");
        addObject(score, 60, 20);
        
        setupBricks();
    }
    
    public void endGame(boolean winGame)
    {
        if(winGame)
        {
            showText("Game Over: You Won!",300, 200);
        }
        else
            showText("Game Over: You Lost!",300, 200);

    }
    
    private void setupBricks()
    {
    }
    
    public void increaseScore()
    {
        score.add(10);
    }
}
