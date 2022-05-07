import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoadLines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Environment
{
    /**
     * Act - do whatever the RoadLines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("collectCoin.wav");
    public Coin()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act() 
    {
        setLocation(getX(), getY()+5);
        removeCoin();
    }    
    public void removeCoin()
    {
        if(isTouching(Player.class))
        {            
            sound.play();
            getWorld().removeObject(this);
            Enemy e = new Enemy();
            Player p = new Player();
            if(p.doubleCoins == 1)
            {
                e.Points = e.Points + 2;
            }
            else
            {
                e.addPoints();
            }
        }
        else if(getY() >= 839)
        {
            getWorld().removeObject(this);
        }
        }
    }

