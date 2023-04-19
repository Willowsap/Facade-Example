package theater;

import theater.components.Player;
import theater.components.Projector;
import theater.components.Screen;
import theater.components.SoundSystem;

/**
 * Facacde to help simplify the Theater.
 * 
 * @author Willow Sapphire
 * 
 */
public class TheaterFacade
{
    /**
     * The player of the system.
     */
    public Player player;

    /**
     * The projector of the system.
     */
    public Projector projector;

    /**
     * The screen of the sysem.
     */
    public Screen screen;

    /**
     * The soundSystem of the system.
     */
    public SoundSystem soundSystem;

    /**
     * Create a new facade to help simplify the theater system.
     * 
     * @param player the player of the system
     * @param projector the projector of the system
     * @param screen the screen of the system
     * @param soundSystem the soundSystem of the system
     */
    public TheaterFacade(Player player, Projector projector,
        Screen screen, SoundSystem soundSystem)
    {
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.soundSystem = soundSystem;
    }

    /**
     * Plays a provided movie.
     * 
     * @param movie the movie to play
     */
    public void playMovie(String movie)
    {
        screen.bringDown();
        projector.connectToPlayer(player);
        soundSystem.connectToPlayer(player);
        projector.power();
        soundSystem.power();
        soundSystem.setVolume(50);
        player.power();
        player.insertDisc(movie);
        player.play();
    }

    public String cleanUp()
    {
        screen.putUp();
        projector.power();
        soundSystem.power();
        player.power();
        return player.eject();
    }
}
