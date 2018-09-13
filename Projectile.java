import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{

    private Vector course;
    private double x = 0;
    private double y = 0;
    private int KAPOW =10;
    // Creator for the class. Takes the power the bullet flies with as a vector, and the direction in degrees as an int.
    public Projectile(Vector v ){
        
        course = v;
        setRotation(v.direction);
        
    }
    public void act() 
    {
        x = getX()+course.getX();
        y = getY()+course.getY();
        
        setLocation( (int) x, (int) y);
        Physics.Gravity(course);
        
        if(hitsGround()){
            getWorld().addObject(new Explosion(getX()), getX(), TonkWorld.WORLD(getX()));
            getWorld().removeObject(this);
        }
    } 
    
    private boolean hitsGround(){
        return y>=TonkWorld.WORLD(getX());
    }
}
