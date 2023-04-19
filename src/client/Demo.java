package client;
import java.util.Scanner;

import theater.TheaterFacade;
import theater.components.BluRayPlayer;
import theater.components.Player;
import theater.components.Projector;
import theater.components.Screen;
import theater.components.SoundSystem;
import theater.components.SurroundSound;

/**
 * Demo to play with the theater system.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Demo
{
    /**
     * Runs the demo
     * 
     * @param args unused
     */
    public static void main(String[] args)
    {
        // the player in our theater
        Player player = new BluRayPlayer();
        // the projector in our theater
        Projector projector = new Projector();
        // the screen in our theater
        Screen screen = new Screen();
        // the sound system in our theater
        SoundSystem soundSystem = new SurroundSound();
        // instead of calling a bunch of methods on all the components
        // we will make a facade to make our life easier
        TheaterFacade theater = new TheaterFacade(player, projector, screen, soundSystem);

        Scanner kb = new Scanner(System.in);
        System.out.println("What would you like to watch?");
        String movie = kb.nextLine();
        theater.playMovie(movie);
        System.out.println("Hit enter to stop watching");
        kb.nextLine();
        theater.cleanUp();
        kb.close();
    }
}
