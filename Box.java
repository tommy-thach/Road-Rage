import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends Text
{
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public Box()
    {
        GreenfootImage image = new  GreenfootImage(350, 50);
        image.setColor(Color.WHITE);
        image.fill();
        setImage(image);
        
    }
    public void act() 
    {
        timer++;
        if(timer == 60)
        {
            getWorld().removeObject(this);
        }
    }    
}
