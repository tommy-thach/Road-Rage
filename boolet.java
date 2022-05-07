import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boolet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boolet extends Actor
{
    GreenfootSound baby = new GreenfootSound("baby.wav");
    public boolet()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*5, image.getHeight()*2);
        setImage(image);
    }
    public void act() 
    {
        baby.play();
        setLocation(getX(),getY()-3);
        if(getY() < 1)
        {
            getWorld().removeObject(this);
        }
        turn(50);
    }    
}
