package theater.components;

/**
 * Absurdly basic representation of a BluRay Player.
 * 
 * @author Willow Sapphire
 * @version 04/19/2023
 */
public class BluRayPlayer implements Player
{
    /**
     * The disc in the player.
     * Null if the player is empty.
     */
    private String disc;

    /**
     * True if the player is on.
     * False if the player is off.
     */
    private boolean on;

    /**
     * Puts a disc in the player
     * 
     * @param disc the disc to insert
     */
    public void insertDisc(String disc)
    {
        System.out.printf("Putting %s into the BlueRay Player\n", disc);
        this.disc = disc;
    }

    /**
     * Ejects the disc in the player.
     * 
     * @return the disc in the player or null if there was none
     */
    public String eject()
    {
        String ejectedDisc = null;
        if (disc == null)
        {
            System.out.println("There is no disc to eject");
        }
        else
        {
            System.out.printf("Ejecting %s\n", disc);
            ejectedDisc = disc;
            disc = null;
        }
        return ejectedDisc;
    }

    /**
     * Plays the inserted disc.
     */
    public void play()
    {
        if (disc == null)
        {
            System.out.println("You need to insert a disc first");
        }
        else
        {
            System.out.println("Playing " + disc);
        }
    }

    /**
     * Turns the player on or off.
     */
    public void power()
    {
        on = !on;
        System.out.println("Turning BlueRay player " + (on ? "on" : "off"));
    }
}
