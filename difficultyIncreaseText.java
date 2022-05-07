import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DifficultyIncrease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class difficultyIncreaseText extends Box
{
    private int timer = 0;
    public difficultyIncreaseText()
    {
        setImage(new GreenfootImage("Difficulty increased!", 40,  Color.BLACK, new Color(255,255,255,0)));
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
