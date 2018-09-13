import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Menu
{
  
    public Counter(){
        setImage(new GreenfootImage(CounterPlus.counter+"", 50, Color.BLACK,Color.WHITE));
    }
    
  
    public void act() 
    {
           setImage(new GreenfootImage(CounterPlus.counter+"", 50, Color.BLACK,Color.WHITE));
    }    

}
