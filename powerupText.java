import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class powerupText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class powerupText extends Box
{
    /**
     * Act - do whatever the powerupText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public powerupText()
    {
        String string = "Powerups: ";
        setImage(new GreenfootImage(string, 30,  Color.BLACK, new Color(255,255,255,0)));
    }
    public void act() 
    {
        
    }    
}
