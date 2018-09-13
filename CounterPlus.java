import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CounterPlus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CounterPlus extends Menu
{
    public static int counter = 2;
    
    public CounterPlus(){
        
    }
    
    public void act() 
    {
           if(Greenfoot.mouseClicked(this))
            {
                 if(!(CounterPlus.counter >= 4)){
                   
                counter++;
            }
                
            }
    }    
}
