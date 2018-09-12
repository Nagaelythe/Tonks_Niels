import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tonk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tonk extends Actor
{
    int aimDegree, fuel,player,Power;
    String name;
    boolean noBarrel = true;
    public static int hp;
    
    // class constructor int p,String nam
    public Tonk(){
        aimDegree = -45;
        hp = 100;
        Power =20;

    }
    public void act() 
    {   
        if(noBarrel){
            Barrel B = new Barrel(this);
            getWorld().addObject(B,getX(),getY());
            noBarrel = false;
        }
        input();
        if(dedded()){
            getWorld().addObject(new Explosion(getX()), getX(), getY());
            getWorld().removeObject(this);
        }  
    }  
    
    public void input(){
        if(Greenfoot.isKeyDown("left")) {
            setLocation( getX()-1, TonkWorld.world[(getX()-1)]);
            fuel--;
        } if(Greenfoot.isKeyDown("right")) {
            setLocation( getX()+1, TonkWorld.world[(getX()+1)]);
        } if(Greenfoot.isKeyDown("down")){
            aimDegree--;
        } if(Greenfoot.isKeyDown("up")){
            aimDegree++;            //B.aim(aimDegree);            
        } if(Greenfoot.isKeyDown("space")){
            fire();
        }
    }
    
    private void fire(){
        Projectile p = new Projectile(new Vector(aimDegree, Power));
        getWorld().addObject(p, getX(), getY());
       
        
        
    }
    public static void hpLoss(int av){
        hp-=av;
    }
    private boolean dedded(){
        return hp <= 0;
    }
}
