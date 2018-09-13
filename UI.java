import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UI extends Actor
{
    /**
     * Act - do whatever the UI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int hp = Tonk.hp;
    public int fuel = Tonk.fuel;
  
    public void act(){
     UI();   
    }
    
    
    public void UI(){
     setLocation( 125 * TonkWorld.PLAYERS, 100); 
     GreenfootImage john = new GreenfootImage("Player "+TonkWorld.PLAYERS+ '\n'+" Hp = " + hp + '\n' + "Fuel = "+ fuel,12 , Color.GREEN, Color.BLACK);
     setImage(john);

    }
}
