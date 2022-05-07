import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Environment
{
    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Road()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 40, image.getHeight() + 5000);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
