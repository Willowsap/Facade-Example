package theater.components;

/**
 * Absurdly simple representation of a projector.
 * 
 * @author Willow Sapphire
 * @version 04/19/2023
 */
public class Screen
{
    /**
     * True if the screen is down.
     * False if the screen is up.
     */
    private boolean down;

    /**
     * Brings the projector down.
     */
    public void bringDown()
    {
        System.out.println("Bringing screen down...");
        down = true;
    }

    /**
     * Puts the projector up.
     */
    public void putUp()
    {
        System.out.println("Putting screen up...");
        down = false;
    }

    /**
     * Checks if the projector is down.
     * 
     * @return true if the projector is down. False otherwise
     */
    public boolean isDown()
    {
        return down;
    }
}
