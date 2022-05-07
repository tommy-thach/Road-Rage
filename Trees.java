import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trees extends Environment
{
    /**
     * Act - do whatever the Trees wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+5);
        removeTrees();
    }
    public Trees()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2 , image.getHeight() / 2);
        setImage(image);
    }    
    public void removeTrees()
    {
        if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
    }
}
