import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diffHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diffHard extends Buttons
{
    /**
     * Act - do whatever the diffHard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isHovering;
    public void act() 
    {
        if(Greenfoot.mouseMoved(null))
        {
            if(isHovering != Greenfoot.mouseMoved(this))
            {
                isHovering = !isHovering;
                if(isHovering)
                {
                    setImage("diffHardHover.png");
                }
                else
                {
                    setImage("hard.png");
                }
            }
        }

        mouseClick();
    }    

    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
            Level1 l = new Level1();
            Enemy e = new Enemy();
            l.Difficulty = 6;
            e.scoreMultiplier = 3;
        }
    }
}
