import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleCoins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleCoins extends Powerups
{
    /**
     * Act - do whatever the DoubleCoins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Timer = 0;
    public DoubleCoins()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void act() 
    {
        setLocation(getX(), getY()+5);
        removePowerup();
    }    
    public void removePowerup()
    {
        Player p = new Player();
        if(isTouching(Player.class))
        {
            p.doubleCoins = 1;
            getWorld().removeObject(this);
        }
        else if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
    }
}
