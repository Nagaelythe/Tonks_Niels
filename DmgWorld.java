import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DmgWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DmgWorld extends World
{
    public static final int LENGTH = 1200;
    public static final int HEIGTH = 560;
    private GreenfootImage background = getBackground();
    static Tonk Tonk1;
    static Tonk Tonk2;
    static int[] world;    
    public DmgWorld(Tonk tonk1,Tonk tonk2, int[] mesh)
    {    
        super(1200, 560, 1); 
        drawWorld(mesh);
        world = mesh;
        loadTonks(tonk1,tonk2);
    }
    public void drawWorld(int[] mesh){
        for(int i =0; i < mesh.length-1;i++){
            for(int j = 559; j>= mesh[i];j--){
                background.setColorAt(i, j, Color.GREEN.darker());
            }
        }
    }
    
    
    private void loadTonks(Tonk tonk1,Tonk tonk2){

        Tonk1 = tonk1;
        Tonk2 = tonk2;
        Tonk1.noBarrel = true;
        Tonk2.noBarrel = true;
    if(!Tonk1.Dedded){
        addObject(Tonk1, tonk1.X, WORLD(tonk1.X)-Tonk.worldAlign);
    }
        if(!Tonk2.Dedded){
        addObject(Tonk2, tonk2.X, WORLD(tonk2.X)-Tonk.worldAlign);
    }
    }
    
    public static int WORLD(int x){
        return world[x];
    }
}