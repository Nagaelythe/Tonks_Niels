        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        /**
         * Write a description of class Tonk here.
         * 
         * @author (your name) 
         * @version (a version number or a date)
         */
 public class Tonk extends Actor
 {
            int aimDegree, hp, fuel, player,Power;
            String name;
            boolean noBarrel = true;
            int tonkHeight = 5;
            int barrelLength = 32;
            protected static int worldAlign = 6;
            int Player;
            boolean fired,Dedded;
            int posX,posY;
            // class constructor int p,String nam
        public Tonk(int player){
        aimDegree = -45;
        hp = 1;
        Power = 20;
        Player = player;
        fuel = 100;
        
    }
    public void act() 
    {   
        updPos();
        if(noBarrel){
            Barrel B = new Barrel(this);
            getWorld().addObject(B,getX(),getY()-tonkHeight);
            noBarrel = false;
            Dedded = false;
        }
        
        if(TonkWorld.turn == Player){

        input();
  
        }
        if(Dedded){
            getWorld().addObject(new Explosion(getX()), getX(), getY());
        }
            
 }
    
    public void input(){

        if(Greenfoot.isKeyDown("left") && fuel > 0 && getX() > 0) {
            setLocation( getX()-1, TonkWorld.WORLD(getX()-1)-worldAlign);
            fuel--;
        } if(Greenfoot.isKeyDown("right") && fuel > 0 && getX() < TonkWorld.LENGTH-1) {
            setLocation( getX()+1, TonkWorld.WORLD(getX()+1)-worldAlign);
            fuel--;
        } if(Greenfoot.isKeyDown("down")){
            aimDegree--;
        } if(Greenfoot.isKeyDown("up")){
            aimDegree++;                  
        } 
          if(Greenfoot.getKey()=="space"){
            fire();
            TonkWorld.turn = (TonkWorld.turn+1)%2;
            fuel = 100;
        }

        Dedded = isDedded();

    }
    private void updPos(){
        posY = getY();
        posX = getX();
    }
    private void fire(){
        Projectile p = new Projectile(new Vector(aimDegree,Power));
        Vector Bar = new Vector(aimDegree, barrelLength);
        getWorld().addObject(p, getX() + (int) Bar.getX(), getY() - tonkHeight + (int) Bar.getY());    
        
    }
    public void hpLoss(int av){
        hp-=av;
    }
    private boolean isDedded(){
        return hp <= 0;
    }

}