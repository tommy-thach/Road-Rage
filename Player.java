import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int delay = 0;
    private int Lane = 2, i, x;
    public static int Invincibility = 0;
    public static int doubleCoins = 0;
    private int PowerupTimer = 0, PowerupTimer2 = 0;
    private int playerX, playerY;
    private boolean isTurning = false, isExploding = false;
    public static boolean gameOver = false;
    private GreenfootImage explosion1 = new GreenfootImage("explosion-1.png");
    private GreenfootImage explosion2 = new GreenfootImage("explosion-2.png");
    private GreenfootImage explosion3 = new GreenfootImage("explosion-3.png");
    private GreenfootImage explosion4 = new GreenfootImage("explosion-4.png");
    GreenfootSound explosion = new GreenfootSound("explosion.wav");
    GreenfootSound endGame = new GreenfootSound("gameOver.wav");
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkLane();
        checkTurn();
        checkCollision();
        checkPowerups();
        setExplosion();
        
 
    }    
    public int returnPowerup()
    {
        return doubleCoins;
    }
    public void checkLane()
    {
        if(getX() == 278)
        {
            Lane = 1;
        }
        else if(getX() == 362)
        {
            Lane = 2;
        }
        else if(getX() == 446)
        {
            Lane = 3;
        }
    }

    public void checkKeys()
    {
        String keyPress = Greenfoot.getKey();
        if("right".equals(keyPress))
        {
         
            if(i > 0)
            {
                i = 1;
            }
            else
            {
                i+=1;
            }
        }
        if("left".equals(keyPress))
        {
       
            if(i < 0)
            {
                i = -1;
            }
            else
            {
                i-=1;
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-6);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+6);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            shoot();
           
        }

    }
    public void shoot()
    {
        delay++;
        if(delay == 25)
        {
                getWorld().addObject(new boolet(), getX(), getY());
                delay = 0;
            }
        }
        
    
        public void checkTurn()
    {
        if(i == 1 && Lane != 3)
        {
            setLocation(getX()+12, getY());
        }
        if(i == 0 && Lane != 2)
        {
            if(Lane == 1)
            {
                setLocation(getX()+12, getY());
            }
            else if(Lane == 3)
            {
                setLocation(getX()-12, getY());
            }
        }
        if(i == -1 && Lane !=1)
        {
            setLocation(getX()-12, getY());
        }
    }

    public void checkCollision()
    {
        if(Invincibility == 0)
        {
            if(isTouching(Enemy.class))
            {
                endGame.play();
                isExploding = true;
            }
        }
        else
        {
            
        }
    }

    public void setExplosion()
    {
        if(isExploding == true)
        {
            x++;
            if(x == 6)
            {
                setImage(explosion1);
            }
            if(x == 12)
            {
                setImage(explosion2);
            }
            if(x == 18)
            {
                setImage(explosion3);
            }
            if(x == 24)
            {
                setImage(explosion4);
            }
            if(x == 30)
            {
                getWorld().removeObject(this);
                gameOver = true;
                
            }
        }
    }
    public void checkPowerups()
    {
        if(Invincibility == 1)
        {
            PowerupTimer++;
            Actor b;
            b = new InvincibilityBubble();
            b.setLocation(playerX,playerY-1);
            Enemy e = new Enemy();
            if(getWorld().getObjects(InvincibilityBubble.class).isEmpty() == true)
            {
                getWorld().addObject(b, getX(), getY());
            }
            if(PowerupTimer == 800)
            {
                Invincibility = 0;
                PowerupTimer = 0;
                getWorld().removeObjects(getWorld().getObjects(InvincibilityBubble.class));
            }
 
        }
        if(doubleCoins == 1)
        {
            PowerupTimer2++;
            if(PowerupTimer2 == 800)
            {
                doubleCoins = 0;
                PowerupTimer2 = 0;
            }
        }
        
    }
    public boolean Return()
    {
        return gameOver;
    }
 
}
