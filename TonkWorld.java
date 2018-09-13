
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
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
    private GreenfootImage background = getBackground();
    public static int[] world;
    public static int turn = 0;
    public static int PLAYERS = 0;
    public static Tonk Tonk1;
    public static Tonk Tonk2;
    public TonkWorld(int x)
    {    
        super(1200, 560, 1); 
        
        background.setColor(Color.LIGHT_GRAY);
        background.fill();

        int[] mesh = createMesh(LENGTH);
        createWorld(mesh);
        drawWorld(mesh);
        world = mesh;
        Tonk1 = new Tonk(0);
        Tonk2 = new Tonk(1);        
        Tonk[] Tonks = {Tonk1,Tonk2};
        addObject(Tonk1, 100, WORLD(100)-Tonk.worldAlign);
        addObject(Tonk2, 800, WORLD(800)-Tonk.worldAlign);
    }
    public  void reDraw(){
        GreenfootImage bob = getBackground();
        bob.setColor(Color.LIGHT_GRAY);
        bob.fill();
        for(int i =0; i < world.length-1;i++){
            bob.setColorAt(i, world[i], Color.BLACK); 
        }
    }
    
    public static int WORLD(int x){
        return world[x];
    }

    private int[] createMesh(int size){
        int[] mesh = new int[size];
        return mesh;  
    }

    private void createWorld(int[] mesh){
        mesh[0] = HEIGTH/2;
        Random R = new Random();
        int sections = mesh.length/12;
        int terrain;
        for(int i =0; i <LENGTH;i+=sections){
            terrain = R.nextInt(3);
            for(int j = 0; j < sections; j++){
                if(i == 0 && j ==0) {mesh[i+j] = HEIGTH-150;}
                else{
                   while( mesh[i+j-1] == 1 && terrain == 0 || mesh[(i+j)-1]+1 == HEIGTH-1 && terrain == 2 ) {terrain = R.nextInt(3);}
                switch(terrain){
                        case 0:
                            mesh[i+j] = mesh[(i+j)-1]-1;
                            break;
                        case 1:
                            mesh[i+j] = mesh[(i+j)-1];
                            break;
                        case 2:
                            mesh[i+j] = mesh[(i+j)-1]+1;
                            break;
                        }
                    }
                    
            }
            
            
        }
    }
    
    public void drawWorld(int[] mesh){
        for(int i =0; i < mesh.length-1;i++){
            background.setColorAt(i, mesh[i], Color.BLACK); 
        }
    }
    
    

}



