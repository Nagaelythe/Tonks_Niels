import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class threePlayers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class threePlayers extends Menu
{
 public threePlayers()
    {
        setImage(new GreenfootImage("Three Player Game Mode.", 50, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            TonkWorld.PLAYERS= 2;
        }
   }    
}
