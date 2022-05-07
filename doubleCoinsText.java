import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doubleCoinsText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doubleCoinsText extends Box
{
    /**
     * Act - do whatever the doubleCoinsText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String string = "Double Coins";
    public doubleCoinsText()
    {
        setImage(new GreenfootImage(string, 30,  new Color(0,0,0,0), new Color(255,255,255,0)));
    }
    public void act() 
    {
        Player p = new Player();
        if(p.doubleCoins == 1 && p.Invincibility == 0)
        {
            setLocation(119, 100);
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,255), new Color(255,255,255,0)));
        }
        else if(p.doubleCoins == 1 && p.Invincibility == 1)
        {
            setLocation(119, 125);
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,255), new Color(255,255,255,0)));
        }
        else if(p.doubleCoins == 0)
        {
            setImage(new GreenfootImage(string, 30,  new Color(0,0,0,0), new Color(255,255,255,0)));
        }
    }    
}
