import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CounterMinus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CounterMinus extends Menu
{
    public CounterMinus(){
        
    }
    
    
    public void act() 
    {
           if(Greenfoot.mouseClicked(this))
            {   
               if(!(CounterPlus.counter <= 2)){
                   
                CounterPlus.counter--;
            }
            }
    }    
}
