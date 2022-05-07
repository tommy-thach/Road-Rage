import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends highScoreBoard
{
    public Score()
    {
        setImage(new GreenfootImage("Score: 0", 40,  Color.BLACK, new Color(0,0,0,0)));
    }

    public void act() 
    {
        updateScore();
    }    

    public void updateScore()
    {
        Enemy e = new Enemy();
        setImage(new GreenfootImage("Score: " + e.Points, 40,  Color.BLACK, new Color(0,0,0,0)));
    }
}