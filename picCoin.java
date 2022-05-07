import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class picCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class picCoin extends pic
{
    /**
     * Act - do whatever the picCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public picCoin()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
