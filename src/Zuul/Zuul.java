package Zuul;

public class Zuul 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    public static final Game game = new Game();

    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("by Michael Kölling and David J. Barnes ");
        System.out.println("Book (2016): Objects First with Java ");
        System.out.println();

        game.run();
    } 
} 