import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends Text
{
    /**
     * Act - do whatever the Instruction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instruction()
    {
        String string = "Controls:\nUp - Move up\nDown - Move down\nLeft - Move left\nRight - Move right\n\nCollect coins (    ) & Powerups (    )\nSurvive as long as possible";
        setImage(new GreenfootImage(string, 40,  Color.BLACK, new Color(255,255,255,0)));
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
