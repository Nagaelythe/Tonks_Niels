import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TonkWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TonkWorld extends World
{

    public static final int LENGTH = 1200;
    public static final int HEIGTH = 560;
    
    
    public TonkWorld()
    {    
        super(1200, 560, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.LIGHT_GRAY);
        background.fill();
        for(int i =0 ; i < LENGTH; i++){
               background.setColorAt(i, WORLD(i), Color.BLACK);
        }
        addObject(new Tonk(), 100, WORLD(100)-6);
    }
    
    public static int WORLD(int x){
        return HEIGTH-60;
    }


    private int[] createMesh(int size){
        int[] mesh = new int[size];
        return mesh;
        
        
    }
}