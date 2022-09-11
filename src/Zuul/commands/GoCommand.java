package Zuul.commands;

import Zuul.Game;
import Zuul.Location;
import Zuul.Map;

/**
 * This command transfers the player from
 * one location to another location provided the
 * two locations are linked by a valid exit
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class GoCommand extends ZuulCommand
{
    String direction;
    
    public GoCommand(Game zuul, String direction)
    {
        super(zuul);
        this.direction = direction;
    }    

    public void execute()
    {
        if(direction == null) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        Map map = new Map();
        
        // Try to leave current room.
        Location currentLocation = map.getCurrentLocation();
        Location nextLocation = currentLocation.getExit(direction);

        if (nextLocation == null) 
        {
            System.out.println("There is no exit in this direction!");
        }
        else 
        {
            map.enterLocation(nextLocation);
            System.out.println(map.getCurrentLocation().getLongDescription());
        }
    }
}
