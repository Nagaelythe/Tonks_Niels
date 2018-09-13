import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public static Start start = new Start();
    public static twoPlayers two= new twoPlayers();
    public static threePlayers three = new threePlayers();
    public static ogog og = new ogog();
    
    public MyWorld()
    {    
        super(600, 400, 1);
        addObject(start,320,310);
    }
}
