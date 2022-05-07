import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Text
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Title()
    {
        String string = "Road Rage";
        setImage(new GreenfootImage(string, 100,  Color.BLACK, new Color(255,255,255,0)));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
