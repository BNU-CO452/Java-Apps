package Zuul.commands;

import Zuul.Game;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * This class holds information about a command that was issued by the user.
 * A command currently consists of two parts: a CommandWord and a string
 * (for example, if the command was "take map", then the two parts
 * are TAKE and "map").
 * 
 * The way this is used is: Commands are already checked for being valid
 * command words. If the user entered an invalid command (a word that is not
 * known) then the CommandWord is UNKNOWN.
 *
 * If the command had only one word, then the second word is <null>.
 * 
 * This replaces the BlueJ Command class and is based
 * on the classic Coomand design pattern
 * 
 * Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public abstract class ZuulCommand
{
    protected Game zuul;
    protected String secondWord;

    /**
     * Constructor for objects of class ZuulCommand
     */
    public ZuulCommand(Game game)
    {
        zuul = game;
    }

    public abstract void execute();
}
