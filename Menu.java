import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    GreenfootSound music = new GreenfootSound("music.mp3");
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        addButton();
        addText();
        music.playLoop();
    }
    public void addButton()
    {
        addObject(new playButton(), getWidth()/2, 350);
    }
    public void addText()
    {
        addObject(new Title(), getWidth()/2, 200);
        addObject(new Instruction(), getWidth()/2, 600);
        addObject(new picCoin(), 370, 698);
        addObject(new picPowerup(), 627, 698);
    }
}
