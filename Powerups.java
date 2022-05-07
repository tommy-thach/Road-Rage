import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerups here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerups extends Actor
{
    /**
     * Act - do whatever the Powerups wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        removePowerup();
    }    
    public void removePowerup()
    {
        if(isTouching(Player.class))
        {
            getWorld().removeObject(this);
        }
        else if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
    }
}
