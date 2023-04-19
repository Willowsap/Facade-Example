package theater.components;

/**
 * Absurdly simple representation of a projector.
 * 
 * @author Willow Sapphire
 * @version 04/19/2023
 */
public class Projector
{
    /**
     * True if the projector is on.
     * False if the projector is off.
     */
    private boolean on;

    /**
     * The player connected to this projector.
     */
    private Player player;

    /**
     * Connects a player to this projector.
     * 
     * @param player the player to connect.
     */
    public void connectToPlayer(Player player)
    {
        System.out.println("Connecting projector to player...");
        this.player = player;
    }

    /**
     * Getter for the player connected to the projector.
     * 
     * @return the connected player
     */
    public Player getConnectedPlayer()
    {
        return this.player;
    }

    /**
     * Turns the projector on or off.
     */
    public void power()
    {
        on = !on;
        System.out.println("Turning projector " + (on ? "on" : "off"));
    }
}
