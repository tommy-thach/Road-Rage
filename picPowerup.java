import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class picPowerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class picPowerup extends pic
{
    /**
     * Act - do whatever the picPowerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public picPowerup()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
