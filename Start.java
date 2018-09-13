import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Menu
{
    public Start()
    {
        setImage(new GreenfootImage("Start", 50, Color.WHITE,Color.LIGHT_GRAY));
    }
    public void act() 
    {
    
        if(Greenfoot.mouseClicked(this))
            {
                getWorld().addObject(MyWorld.og,320,300);
                getWorld().addObject(MyWorld.two,320,50);
                getWorld().addObject(MyWorld.three,320,100);
            
                getWorld().removeObject(this);
            }
    
    }    
}
