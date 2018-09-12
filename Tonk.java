<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tonk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tonk extends Actor
{
    int aimDegree, hp, fuel,player,Power;
    String name;
    boolean noBarrel = true;
    int tonkHeight = 5;
    int barrelLength = 32;
    int worldAlign = 6;
    
    // class constructor int p,String nam
    public Tonk(){
        aimDegree = -45;
        hp = 100;
        Power = 20;

    }
    public void act() 
    {   
        if(noBarrel){
            Barrel B = new Barrel(this);
            getWorld().addObject(B,getX(),getY()-tonkHeight);
            noBarrel = false;

        }
        input();
        if(dedded()){
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);
        }  
    }  
    
    public void input(){
        if(Greenfoot.isKeyDown("left")) {
            setLocation( getX()-1, TonkWorld.WORLD(getX()-1)-worldAlign);
        } if(Greenfoot.isKeyDown("right")) {
            setLocation( getX()+1, TonkWorld.WORLD(getX()+1)-worldAlign);
        } if(Greenfoot.isKeyDown("down")){
            aimDegree--;
        } if(Greenfoot.isKeyDown("up")){
            aimDegree++;            //B.aim(aimDegree);            
        } if(Greenfoot.isKeyDown("space")){
            fire();
        }

    }
    
    private void fire(){
        Projectile p = new Projectile(new Vector(aimDegree,Power));
        Vector Bar = new Vector(aimDegree, barrelLength);
        getWorld().addObject(p, getX() + (int) Bar.getX(), getY() - tonkHeight + (int) Bar.getY());    
        
    }
    public void hpLoss(int av){
        hp-=av;
    }
    private boolean dedded(){
        return hp <= 0;
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tonk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tonk extends Actor
{
    int aimDegree, hp, fuel,player,Power;
    String name;
    boolean noBarrel = true;
    int tonkHeight = 5;
    int barrelLength = 32;
    int worldAlign = 6;
    
    // class constructor int p,String nam
    public Tonk(){
        aimDegree = -45;
        hp = 100;
        Power = 20;

    }
    public void act() 
    {   
        if(noBarrel){
            Barrel B = new Barrel(this);
            getWorld().addObject(B,getX(),getY()-tonkHeight);
            noBarrel = false;

        }
        input();
        if(dedded()){
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);
        }  
    }  
    
    public void input(){
        if(Greenfoot.isKeyDown("left")) {
            setLocation( getX()-1, TonkWorld.WORLD(getX()-1)-worldAlign);
        } if(Greenfoot.isKeyDown("right")) {
            setLocation( getX()+1, TonkWorld.WORLD(getX()+1)-worldAlign);
        } if(Greenfoot.isKeyDown("down")){
            aimDegree--;
        } if(Greenfoot.isKeyDown("up")){
            aimDegree++;            //B.aim(aimDegree);            
        } if(Greenfoot.isKeyDown("space")){
            fire();
        }

    }
    
    private void fire(){
        Projectile p = new Projectile(new Vector(aimDegree,Power));
        Vector Bar = new Vector(aimDegree, barrelLength);
        getWorld().addObject(p, getX() + (int) Bar.getX(), getY() - tonkHeight + (int) Bar.getY());    
        
    }
    public void hpLoss(int av){
        hp-=av;
    }
    private boolean dedded(){
        return hp <= 0;
    }
}
>>>>>>> 36ca5b7d3f0725c432da348a6d1ca30f559278fb
