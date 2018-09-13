
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
    public static Tonk Tonk3;
    public static Tonk Tonk4;
    public TonkWorld(int x)
    {    
        super(1200, 560, 1); 
<<<<<<< HEAD
        PLAYERS = x;
=======
        
        
>>>>>>> be48e7d8dbddc1f4dac25df0863657e957ba8d28
        int[] mesh = createMesh(LENGTH);
        createWorld(mesh);
        drawWorld(mesh);
        world = mesh;
        createTree(15);
        Tonk1 = new Tonk(0);
        Tonk2 = new Tonk(1);  
        Tonk3 = new Tonk(2);
        Tonk4 = new Tonk(3);
        Random r = new Random();
        int pos;
        switch(PLAYERS){
            case 1:
                pos = r.nextInt(LENGTH);
                addObject(Tonk1, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk2, pos, WORLD(pos)-Tonk.worldAlign);
                break;
            case 2:
                pos = r.nextInt(LENGTH);
                addObject(Tonk1, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk2, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk3, pos, WORLD(pos)-Tonk.worldAlign);
                break;
            case 3:
                pos = r.nextInt(LENGTH);
                addObject(Tonk1, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk2, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk3, pos, WORLD(pos)-Tonk.worldAlign);
                pos = r.nextInt(LENGTH);
                addObject(Tonk4, pos, WORLD(pos)-Tonk.worldAlign);
                break;
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
        
        for(int i = 0; i <LENGTH; i+=sections){
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
            for(int j = 559; j>= mesh[i];j--){
                background.setColorAt(i, j, Color.GREEN.darker());
            }
        }
    }
    
    public void createTree(int n){
        Random r = new Random();
       
        for(int i = 0; i < n; i++){
            int rx = r.nextInt(LENGTH);
            addObject(new Tree(), rx, WORLD(rx)-20);
        }
    }
    
    }



