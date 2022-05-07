import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class highScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class highScore extends highScoreBoard
{
    /**
     * Act - do whatever the highScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public highScore() 
    {
    }
    public void act() 
    {
        updateScore();
    }    
    public void updateScore()
    {
        Enemy e = new Enemy();
        setImage(new GreenfootImage("High Score: " + e.highScore, 40,  Color.BLACK, new Color(255,255,255,0)));
    }
}
