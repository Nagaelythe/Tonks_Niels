import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class twoPlayers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class twoPlayers extends Menu
{
 public twoPlayers()
    {
        setImage(new GreenfootImage("Two Player Game Mode.", 50, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            TonkWorld.PLAYERS= 1;
        }
   }    
}
