import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends World
{

    /**
     * Constructor for objects of class Menu2.
     * 
     */
    public Menu2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        addButtons();
        addText();
    }
    public void addText()
    {
        addObject(new selectDiffText(), getWidth()/2, 150);
    }
    public void addButtons()
    {
        addObject(new diffEasy(), getWidth()/2, 300);
        addObject(new diffNormal(), getWidth()/2, 450);
        addObject(new diffHard(), getWidth()/2, 600);
    }
}
