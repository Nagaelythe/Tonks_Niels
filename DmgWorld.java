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
    static Tonk Tonk3;
    static Tonk Tonk4;
    static int[] world;    
    public DmgWorld(Tonk tonk1,Tonk tonk2, int[] mesh)
    {    
        super(1200, 560, 1); 
        drawWorld(mesh);
        world = mesh;
        loadTonks(tonk1,tonk2);
    }
    public DmgWorld(Tonk tonk1,Tonk tonk2,Tonk tonk3, int[] mesh)
    {    
        super(1200, 560, 1); 
        drawWorld(mesh);
        world = mesh;
        loadTonks(tonk1,tonk2,tonk3);
    }
    public DmgWorld(Tonk tonk1,Tonk tonk2,Tonk tonk3, Tonk tonk4, int[] mesh)
    {    
        super(1200, 560, 1); 
        drawWorld(mesh);
        world = mesh;
        loadTonks(tonk1,tonk2,tonk3,tonk4);
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
        addObject(Tonk1, tonk1.posX, tonk1.posY);
    }
        if(!Tonk2.Dedded){
        addObject(Tonk2, tonk2.posX, tonk2.posY);
    }
    }
        private void loadTonks(Tonk tonk1,Tonk tonk2,Tonk tonk3){

        Tonk1 = tonk1;
        Tonk2 = tonk2;
        Tonk3 = tonk3;
        Tonk1.noBarrel = true;
        Tonk2.noBarrel = true;
        Tonk3.noBarrel = true;
        if(!Tonk1.Dedded){
            addObject(Tonk1, Tonk1.posX, Tonk1.posY);
        }
        if(Tonk1.Dedded&& TonkWorld.turn == tonk1.player){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}
        
        if(!Tonk2.Dedded){
            addObject(Tonk2, tonk2.posX, tonk2.posY);
        }
        if(Tonk2.Dedded&& TonkWorld.turn == tonk2.player){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}

        if(!Tonk3.Dedded){
            addObject(Tonk3, tonk3.posX, tonk3.posY);;
        }
        if(Tonk3.Dedded&& TonkWorld.turn == tonk3.player){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}

    }
        private void loadTonks(Tonk tonk1,Tonk tonk2,Tonk tonk3,Tonk tonk4){

        Tonk1 = tonk1;
        Tonk2 = tonk2;
        Tonk3 = tonk3;
        Tonk4 = tonk4;
        Tonk1.noBarrel = true;
        Tonk2.noBarrel = true;
        tonk3.noBarrel = true;
        tonk4.noBarrel = true;
        if(!Tonk1.Dedded){
            addObject(Tonk1, tonk1.posX, tonk1.posY);
        }
        if(Tonk1.Dedded && TonkWorld.turn == 0){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}
        
        if(!Tonk2.Dedded){
            addObject(Tonk2, tonk2.posX, tonk2.posY);
        }
        if(Tonk2.Dedded&& TonkWorld.turn == 1){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}

        if(!Tonk3.Dedded){
            addObject(Tonk3, tonk3.posX, tonk3.posY);
        }
        if(Tonk3.Dedded&& TonkWorld.turn == 2){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}

        if(!Tonk4.Dedded){
            addObject(Tonk4, tonk4.posX, tonk4.posY);
        }
        if(Tonk4.Dedded && TonkWorld.turn == 3){TonkWorld.turn=(TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);}
    }    
    
    
    
    public static int WORLD(int x){
        return world[x];
    }
}