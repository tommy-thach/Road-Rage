import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvincibilityBubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvincibilityBubble extends PowerupFX
{
    private int playerX, playerY;
    /**
     * Act - do whatever the InvincibilityBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void act() 
    {
        if(!getWorld().getObjects(Player.class).isEmpty())
        {
            Actor Player = (Actor)getWorld().getObjects(Player.class).get(0);
            int playerX = Player.getX();
            int playerY = Player.getY();
            setLocation(playerX,playerY);
        }
        
    }
    public int returnX()
    {
        return playerX;
    }
    public int returnY()
    {
        return playerY;
    }
    }    

