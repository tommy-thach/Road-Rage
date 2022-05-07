import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoadLines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoadLines extends Environment
{
    /**
     * Act - do whatever the RoadLines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        removeLines();
    }    
    public void removeLines()
    {
        if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
    }
}
