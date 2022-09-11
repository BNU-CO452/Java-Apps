package helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 * 
 * Modified by Derek Peacock 13/12/2020
 */
public class InputReader
{
    private static Scanner reader = new Scanner(System.in);

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public static String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nYour input is empty!\n");
        }

        return inputLine;
    }
    
    /**
     * Read a the next int from standard imput (the text terminal),
     * and return it as an interger.
     * 
     * @return Integer typed by user.
     */
    public static int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            try
            {
                number = reader.nextInt();

            } 
            catch(InputMismatchException e)
            {
                System.out.println("That is not a valid integer number!");
            }
        }       
        return number;
    }

    /**
     * Read a the next int from standard imput (the text terminal),
     * and return it as an interger.
     * 
     * @return Integer typed by user.
     */
    public static double getDouble(String prompt)
    {
        double number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            
            try
            {
                number = reader.nextDouble();

            } 
            catch(InputMismatchException e)
            {
                System.out.println("That is not a valid double number!");
            }
        }

        return number;
    }

}
