import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel extends Actor
{
    private Tonk tonk;
 
    public Barrel(Tonk tonk) {
        this.tonk = tonk;
    }
 
    public void act() {
        setRotation(tonk.aimDegree);
        setLocation(tonk.getX(),tonk.getY()-tonk.tonkHeight);
    }
    
}

