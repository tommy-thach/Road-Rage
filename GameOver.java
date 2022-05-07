import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends highScoreBoard
{
    public GameOver()
    {
        GreenfootImage image = getImage();
        setImage(new GreenfootImage("Game Over", 65,  Color.BLACK, new Color(255,255,255,0)));
    }
    public void act() 
    {
    }    
}
