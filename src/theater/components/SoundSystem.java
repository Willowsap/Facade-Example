package theater.components;

public interface SoundSystem
{
    public void power();
    public void connectToPlayer(Player player);
    public Player getConnectedPlayer();
    public void turnUp();
    public void turnDown();
    public void setVolume(double volume);
    public double getVolume();
}
