package theater.components;

public class SurroundSound implements SoundSystem
{
    /**
     * True if the sound system is on.
     * False if the sound system is off.
     */
    private boolean on;

    /**
     * The volume of the sound system. 
     */
    private double volume;

    /**
     * The player connected to this sound system.
     */
    private Player player;

    /**
     * Connects a player to this sound system.
     * 
     * @param player the player to connect.
     */
    public void connectToPlayer(Player player)
    {
        System.out.println("Connecting sound system to player...");
        this.player = player;
    }

    /**
     * Getter for the player connected to the sound system.
     * 
     * @return the connected player
     */
    public Player getConnectedPlayer()
    {
        return this.player;
    }

    /**
     * Turns the sound sytem on or off.
     */
    public void power()
    {
        on = !on;
        System.out.println("Turning sound system " + (on ? "on" : "off"));
    }

    /**
     * Getter for the current volume;
     * 
     * @return the volume
     */
    public double getVolume()
    {
        return volume;
    }

    /**
     * Turns the volume up.
     */
    public void turnUp()
    {
        System.out.printf("Turning up volume. Now at %.2f\n", volume);
        volume++;
    }

    /**
     * Turns the volume down.
     */
    public void turnDown()
    {
        System.out.printf("Turning down volume. Now at %.2f\n", volume);
        volume--;
    }

    /**
     * Sets the volume of the sound system to a specific value.
     * 
     * @param volume the volume to set it to
     */
    public void setVolume(double volume)
    {
        System.out.printf("Setting the volume to %.2f\n", volume);
        this.volume = volume;
    }
}
