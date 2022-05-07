import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public static int scoreMultiplier = 1;
    private int speed, i;
    private boolean isExploding = false;
    public static  boolean isAddingText = false;
    public static int Points, highScore;
    private GreenfootImage explosion1 = new GreenfootImage("explosion-1.png");
    private GreenfootImage explosion2 = new GreenfootImage("explosion-2.png");
    private GreenfootImage explosion3 = new GreenfootImage("explosion-3.png");
    private GreenfootImage explosion4 = new GreenfootImage("explosion-4.png");
    GreenfootSound explosion = new GreenfootSound("explosion.wav");
    public void act() 
    {
        setMovement();
        checkCollision(); 
        updateHighScore();
        addText();
    }    

    public Enemy()
    {
        speed = 7+Greenfoot.getRandomNumber(6);
        if(Greenfoot.getRandomNumber(3) == 0)
        {
            setImage("car01-n.png");
        }
        if(Greenfoot.getRandomNumber(3) == 1)
        {
            setImage("car02-n.png");
        }
        if(Greenfoot.getRandomNumber(3) == 2)
        {
            setImage("car03-n.png");
        }
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/6, image.getHeight()/6);
        setImage(image);
    }

    public void setMovement()
    {
        setLocation(getX(), getY() + speed);
    }

    public void checkCollision()
    {
        if(isTouching(Enemy.class) || isTouching(Player.class) || isTouching(boolet.class))
        {
            explosion.play();
            setExplosion();
            isExploding = true;
        }
        else if(getY() > 838)
        {
            addPoints();
            getWorld().removeObject(this);
        }
    }

    public void addPoints()
    {
        if(scoreMultiplier == 1)
        {
            Points+=1;
        }
        else if(scoreMultiplier == 2)
        {
            Points+=2;;
        }
        else if(scoreMultiplier == 3)
        {
            Points+=3;
        }
    }

    public void setExplosion()
    {
        if(isExploding == true)
        {
            i++;
            if(i == 7)
            {
                setImage(explosion1);
            }
            if(i == 14)
            {
                setImage(explosion2);
            }
            if(i == 21)
            {
                setImage(explosion3);
            }
            if(i == 28)
            {
                setImage(explosion4);
            }
            if(i >= 35)
            {
                getWorld().removeObject(this);
            }
        }
        else
        {
            i = 0;
        }
    }
    
    public void updateHighScore()
    {
        if(Points > highScore)
        {
            highScore = Points;
        }
 
    }
    
    public int returnHS()
    {
        return highScore;
    }

   public void addText()
    {
        
    }
}

  


