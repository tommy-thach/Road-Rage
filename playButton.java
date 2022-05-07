import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends Buttons
{
    private boolean isPlaying = false;
    private boolean isHovering;
    /**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseClick();
        checkHover();
    }    
    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            startGame();
        }
    }
    public void startGame()
    {
        getWorld().removeObject(this);
        Greenfoot.setWorld(new Level1());
    }
    public void checkHover()
    {
        if(Greenfoot.mouseMoved(null))
            {
                if(isHovering != Greenfoot.mouseMoved(this))
                {
                    isHovering = !isHovering;
                    if(isHovering)
                    {
                        setImage("buttonPlayHover.png");
                    }
                    else
                    {
                        setImage("buttonPlay.png");
                    }
                }
            }
    }
}
