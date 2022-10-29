import greenfoot.*;

/**
 * This is based on the class game of Atari Breakout
 * Game first released in 1976.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 400; 
    
    private Paddle paddle;
    private Ball ball;
    
    private Counter score;
    
    /**
     * Set the screen size, then create a paddle, ball
     * and a score button. Setup lines of bricks.
     */
    public GameWorld()
    {    
        super(SCREEN_WIDTH, SCREEN_HEIGHT, 1); 
        
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
