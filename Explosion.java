import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.*;

/**
 * An explosion. It starts by expanding and then collapsing. 
 * The explosion will explode other obejcts that the explosion intersects.
 * 
 * @author Poul Henriksen
 * @author Michael Kölling
 * @version 1.1
 */
public class Explosion extends Actor
{
    /** How many images should be used in the animation of the explostion */
    private final static int IMAGE_COUNT= 8;
    
    /** 
     * The images in the explosion. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images;
    
    /** Current size of the explosion */
    private int imageNo = 0;
    
    /** How much do we increment the index in the explosion animation. */
    private int increment=1;
    private int Rad = 20;
    private int loc;
    /**
     * Create an explosion.
     */
    public Explosion(int x) {
        
        initialiseImages();
        setImage(images[0]);        
        Greenfoot.playSound("Explosion.wav");
        loc =x;
  
    }    
    
    /** 
     * Create the images for explosion.
     */
    public synchronized static void initialiseImages() 
    {
        if (images == null) {
            GreenfootImage baseImage = new GreenfootImage("explosion-big.png");
            int maxSize = baseImage.getWidth()/3;
            int delta = maxSize / IMAGE_COUNT;
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for (int i=0; i < IMAGE_COUNT; i++) {
                size = size + delta;
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    
    public void Destroy(){
        int x = loc;
        int y = TonkWorld.WORLD(x);
        if(x == TonkWorld.LENGTH || x+Rad >= TonkWorld.LENGTH){    
            for(int i = TonkWorld.LENGTH-1; i>=x-Rad ; i --){
                TonkWorld.world[i]+= Rad-Math.abs(i-x);
            }
            for(int i = 1; i<= Rad; i ++){
               List<Tonk> tonks = getObjectsInRange(i, Tonk.class);
               if(tonks.size() > 0) {
               for (Tonk t : tonks){
                    t.hpLoss(1);   
                } 

            } 
            }
            

        }
        else if(x == 0 || x-Rad <=0){    
            for(int i = 0; i<=Rad+x ; i ++){
                TonkWorld.world[i]+=Rad-Math.abs(i-x);             
            }
            for(int i = 1; i<= Rad; i ++){
               List<Tonk> tonks = getObjectsInRange(i, Tonk.class);
               if(tonks.size() > 0) {
               for (Tonk t : tonks){
                    t.hpLoss(1);   
                }  
            }
            }
        }
        else{   
            for(int i = x-Rad; i<=Rad+x ; i ++){
                TonkWorld.world[i]+=Math.floor((Math.abs(x-i) - Rad )* (TonkWorld.HEIGTH/TonkWorld.LENGTH));               
            }
        }
            for(int i = 1; i<= Rad; i ++){
               List<Tonk> tonks = getObjectsInRange(i, Tonk.class);
               if(tonks.size() > 0) {
               for (Tonk t : tonks){
                    t.hpLoss(1);   
                } 
            }
        }
    }
    
    /**
     * EXPLODE!
     */
    public void act()
    { 
        setImage(images[imageNo]);
        Destroy();
        imageNo += increment;
        if (imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
        }
        
        if (imageNo < 0) {
            getWorld().removeObject(this);
        }
    }
    
    

}