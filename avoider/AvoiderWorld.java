import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{
    private GreenfootSound bkgMusic;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Initialize the music
        bkgMusic = new GreenfootSound("sounds/UFO_T-Balt.mp3");
        bkgMusic.playLoop(); //Play the music
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Avatar avatar = new Avatar();
        addObject(avatar,429,160);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000) < 10) //Sólo el 2% de las veces que actua 
        {
            Enemy e = new Enemy();
            int x = Greenfoot.getRandomNumber(getWidth()-20) + 10;
            int y = -30;
            super.addObject(e, x , y);
        }
    }
    
    public void endGame()
    {
        bkgMusic.stop();
        AvoiderGameOverWorld go = new AvoiderGameOverWorld();
        Greenfoot.setWorld(go);
    }
}
