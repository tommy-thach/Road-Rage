import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class invincibilityText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class invincibilityText extends Box
{
    /**
     * Act - do whatever the invincibilityText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String string = "Invincibility";
    public invincibilityText()
    {
        setImage(new GreenfootImage(string, 30,  new Color(0,0,0,0), new Color(255,255,255,0)));
    }
    public void act() 
    {
        Player p = new Player();
        if(p.Invincibility == 1 && p.doubleCoins == 0)
        {
            setLocation(109, 100);
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,255), new Color(255,255,255,0)));
        }
        else if(p.Invincibility == 1 && p.doubleCoins == 1)
        {
            setLocation(109, 100);
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,255), new Color(255,255,255,0)));
        }
        else if(p.Invincibility == 0)
        {
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,0), new Color(255,255,255,0)));
        }
    }    
}
