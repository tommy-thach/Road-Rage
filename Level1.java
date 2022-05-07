import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    public static int Difficulty = 0;
    private int Lane1 = 278, Lane2 = 362, Lane3 = 446;
    private int Lane;
    private int Fabio = 0;
    private int timer = 0;
    private int timer2 = 0;
    private int timer3 = 0;
    private boolean addText = false;
    private int textTimer = 0;
    private GreenfootImage fabioPic = new GreenfootImage("fab.gif");
    /**
     * Constructor for objects of class Map.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 840, 1); 
        Player p = new Player();
        Enemy e = new Enemy();
        e.Points = 0;
        e.isAddingText = false;
        e.scoreMultiplier = 1;
        p.gameOver = false;
        p.Invincibility = 0;
        p.doubleCoins = 0;
        Difficulty = 0;
        
        setPaintOrder(GameOver.class, Score.class, highScore.class, highScoreBoard.class, Score.class,difficultyIncreaseText.class, Box.class, Trees.class, InvincibilityBubble.class, Player.class, Enemy.class, Invincibility.class, DoubleCoins.class, RoadLines.class);
        addRoads();
        addPlayer();
        addScore();
        addPowerupText();
        for(int i = 0;i<10;i++)
        {
            addObject(new Trees(), Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(840));
            addObject(new Trees(), 530+Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(840));
        }
    }

    public void act()
    {
        addEnemy();
        addTrees();
        checkGameOver();
        addRoadLines();
        addCoins();
        addPowerups();
        checkDifficulty();
        checkFabio();
    }
    public void checkFabio()
    {
        if(Greenfoot.isKeyDown("F"))
        {
            Fabio = 1;
        }
        if(Greenfoot.isKeyDown("A"))
        {
            Fabio = 2;
        }
        if(Greenfoot.isKeyDown("B"))
        {
            Fabio = 3;
        }
        if(Greenfoot.isKeyDown("I"))
        {
            Fabio = 4;
        }
        if(Greenfoot.isKeyDown("O"))
        {
            Fabio = 5;
        }
        if(Fabio == 5)
        {
            setBackground(fabioPic);
            
        }
    }
    
    public void addRoads()
    {
        for(int i = 0;i<3;i++)
        {
            addObject(new Road(), 275+(i*86), 0);
        }
        for(int i = 0;i<9;i++)
        {
            addObject(new RoadLines(), getWidth()/2, 0+(i*125));
        }
    }

    public void addPlayer()
    {
        addObject(new Player(), 362, 790);
    }

    public void checkDifficulty()
    {
        Enemy e = new Enemy();
        if(e.Points == 20 && !addText)
        {
            if(Difficulty == 1){Difficulty = 2;}
            else if(Difficulty == 2){Difficulty = 3;}
            else if(Difficulty == 3){Difficulty = 4;}
            else if(Difficulty == 4){Difficulty = 5;}
            else if(Difficulty == 5){Difficulty = 6;}
            else if(Difficulty == 6){Difficulty = 6;}

            addObject(new Box(), getWidth()/2, getHeight()/2);
            addObject(new difficultyIncreaseText(), getWidth()/2, getHeight()/2);
        }
        else if(e.Points == 40 && !addText)
        {
            if(Difficulty == 1){Difficulty = 2;}
            else if(Difficulty == 2){Difficulty = 3;}
            else if(Difficulty == 3){Difficulty = 4;}
            else if(Difficulty == 4){Difficulty = 5;}
            else if(Difficulty == 5){Difficulty = 6;}
            else if(Difficulty == 6){Difficulty = 6;}
            addObject(new Box(), getWidth()/2, getHeight()/2);
            addObject(new difficultyIncreaseText(), getWidth()/2, getHeight()/2);
        }
        else if(e.Points == 60 && !addText)
        {
            if(Difficulty == 1){Difficulty = 2;}
            else if(Difficulty == 2){Difficulty = 3;}
            else if(Difficulty == 3){Difficulty = 4;}
            else if(Difficulty == 4){Difficulty = 5;}
            else if(Difficulty == 5){Difficulty = 6;}
            else if(Difficulty == 6){Difficulty = 6;}
            addObject(new Box(), getWidth()/2, getHeight()/2);
            addObject(new difficultyIncreaseText(), getWidth()/2, getHeight()/2);
        }
        else if(e.Points == 80 && !addText)
        {
            if(Difficulty == 1){Difficulty = 2;}
            else if(Difficulty == 2){Difficulty = 3;}
            else if(Difficulty == 3){Difficulty = 4;}
            else if(Difficulty == 4){Difficulty = 5;}
            else if(Difficulty == 5){Difficulty = 6;}
            else if(Difficulty == 6){Difficulty = 6;}
            addObject(new Box(), getWidth()/2, getHeight()/2);
            addObject(new difficultyIncreaseText(), getWidth()/2, getHeight()/2);
        }
        else if(e.Points == 100 && !addText)
        {
            if(Difficulty == 1){Difficulty = 2;}
            else if(Difficulty == 2){Difficulty = 3;}
            else if(Difficulty == 3){Difficulty = 4;}
            else if(Difficulty == 4){Difficulty = 5;}
            else if(Difficulty == 5){Difficulty = 6;}
            else if(Difficulty == 6){Difficulty = 6;}
            addObject(new Box(), getWidth()/2, getHeight()/2);
            addObject(new difficultyIncreaseText(), getWidth()/2, getHeight()/2);
        }
    }

    public void addEnemy()
    {
        Enemy e = new Enemy();
        timer++;
        if(Difficulty == 0)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 12)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty == 1)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 16)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty == 2)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 20)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty == 3)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 24)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty == 4)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 28)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty == 5)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 32)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
        else if(Difficulty >= 6)
        {
            if(timer == 25)
            {
                timer = 0;
                if(Greenfoot.getRandomNumber(100) < 45)
                {
                    if(Greenfoot.getRandomNumber(3) == 0)
                    {
                        addObject(new Enemy(), 278, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 1)
                    {
                        addObject(new Enemy(), 362, 0);
                    }
                    else if(Greenfoot.getRandomNumber(3) == 2)
                    {
                        addObject(new Enemy(), 448, 0);
                    }
                }
            }
        }
    }

    public void addTrees()
    {
        timer2++;
        if(timer2 == 5)
        {
            timer2 = 0;
            if(Greenfoot.getRandomNumber(100) < 30)
            {
                addObject(new Trees(), Greenfoot.getRandomNumber(200), 0);
                addObject(new Trees(), 530+Greenfoot.getRandomNumber(200), 0);
            }
        }
    }

    public void addScore()
    {
        addObject(new Score(), 100, 45);
    }

    public void checkGameOver()
    {
        Player p = new Player();
        if(p.gameOver == true)
        {

            addObject(new highScoreBoard(), getWidth()/2, getHeight()/2);
            addObject(new GameOver(), getWidth()/2, (getHeight()/2)-120);
            addObject(new Score(), getWidth()/2, getHeight()/2-25);
            addObject(new highScore(), getWidth()/2, getHeight()/2+25);
            Greenfoot.stop();
        }
    }

    public void addRoadLines()
    {
        timer3++;
        if(timer3 == 25)
        {
            timer3 = 0;
            addObject(new RoadLines(), getWidth()/2, 0);
        }
    }

    public void addCoins()
    {
        timer++;
        if(timer == 5)
        {
            timer = 0;
            if(Greenfoot.getRandomNumber(100) < 6)
            {
                if(Greenfoot.getRandomNumber(3) == 0)
                {
                    addObject(new Coin(), 278, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 1)
                {
                    addObject(new Coin(), 362, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 2)
                {
                    addObject(new Coin(), 448, 0);
                }
            }
        }
    }
    public void addPowerups()
    {
        if(Greenfoot.getRandomNumber(700) < 1)
        {
            if(Greenfoot.getRandomNumber(2) == 0)
            {
                if(Greenfoot.getRandomNumber(3) == 0)
                {
                    addObject(new Invincibility(), 278, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 1)
                {
                    addObject(new Invincibility(), 362, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 2)
                {
                    addObject(new Invincibility(), 448, 0);
                }
            }
            else if(Greenfoot.getRandomNumber(2) == 1)
            {
                if(Greenfoot.getRandomNumber(3) == 0)
                {
                    addObject(new DoubleCoins(), 278, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 1)
                {
                    addObject(new DoubleCoins(), 362, 0);
                }
                else if(Greenfoot.getRandomNumber(3) == 2)
                {
                    addObject(new DoubleCoins(), 448, 0);
                }
            }
        }
        
    }
    public void addPowerupText()
    {
        addObject(new powerupText(), 104, 75);
        addObject(new invincibilityText(), 109, 100);
        addObject(new doubleCoinsText(), 119, 125);
    }
    public int returnDifficulty()
    {
        return Difficulty;
    }
}

