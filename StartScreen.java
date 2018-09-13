import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 560, 1);
        
        addObject(new SelectNumberOfPlayers(), 600, 180);
        addObject(new Start(), 600, 440);
        addObject(new Counter(), 610, 300);
        addObject(new CounterPlus(), 700, 300);
        addObject(new CounterMinus(), 500, 300);
       
        
        
    }
}
