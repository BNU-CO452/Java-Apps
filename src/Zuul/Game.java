package Zuul;

import Zuul.commands.CommandReader;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.  
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * Modified and extended by Student Name
 */

public class Game 
{
    public static final Map MAP = new Map();

    private CommandReader reader ;
    private boolean gameOver;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    { 
        //MAP = new Map();
        reader = new CommandReader(this);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void run() 
    {            
        printWelcome();
        gameOver = false;

        // Enter the main command loop.  Here we repeatedly 
        // read commands and execute them until the game is over.
                
        while (! gameOver) 
        {
            gameOver = reader.getCommand();
        }
        
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private static void printWelcome()
    {
        System.out.println();
        System.out.println(" Welcome to the World of Zuul!");
        System.out.println(" World of Zuul is a new, incredibly boring adventure game.");
        System.out.println(" Type 'help' if you need help.");
        System.out.println();

        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
}
