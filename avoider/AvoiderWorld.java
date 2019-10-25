import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
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
        AvoiderGameOverWorld go = new AvoiderGameOverWorld();
        Greenfoot.setWorld(go);
    }
}
