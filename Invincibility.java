import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invincibility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invincibility extends Powerups
{
    public Invincibility()
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
            p.Invincibility = 1;
            getWorld().removeObject(this);
        }
        else if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
    }
}
