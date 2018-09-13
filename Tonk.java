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
            private Vector course = new Vector(0,0);
            private GreenfootImage greenTonk = new GreenfootImage("greenTonk.png");
            private GreenfootImage tonk = new GreenfootImage("tonk.png");
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
        if(isFloaty()){
            tonkFalls();
        }
        
        if(noBarrel){
            Barrel B = new Barrel(this);
            getWorld().addObject(B,getX(),getY()-tonkHeight);
            noBarrel = false;
            Dedded = false;
        }
        
        if(TonkWorld.turn == Player){
<<<<<<< HEAD
<<<<<<< HEAD
            getWorld().addObject(new UI(), 0,-50);
=======
            setImage(greenTonk);
>>>>>>> e5ea0b8c1979eaee1ee52bc00cb4a5ec19c901db
            input();
=======

        input();
>>>>>>> parent of 501cf20... temp UI
  
        }
        if(Dedded){
            getWorld().addObject(new Explosion(getX()), getX(), getY());
        }
<<<<<<< HEAD
            
<<<<<<< HEAD
     }
=======
        course =new Vector(0,0);    
 }
>>>>>>> e5ea0b8c1979eaee1ee52bc00cb4a5ec19c901db
=======
 }
>>>>>>> parent of 501cf20... temp UI
    
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
            TonkWorld.turn = (TonkWorld.turn+1)%(TonkWorld.PLAYERS+1);
            fuel = 100;
            setImage(tonk);
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
<<<<<<< HEAD
<<<<<<< HEAD
    

    
    
    }
=======
    private boolean isFloaty(){
        return posY != TonkWorld.WORLD(posX)-worldAlign;
    }
    private void tonkFalls(){
        Physics.Gravity(course);
        if( posX < 0 || posX > TonkWorld.LENGTH){
            getWorld().removeObject(this);
        } else{
        setLocation( (int) (posX+course.getX()), (int) (posY+course.getY()));        
    }
}
}
>>>>>>> e5ea0b8c1979eaee1ee52bc00cb4a5ec19c901db
=======

}
>>>>>>> parent of 501cf20... temp UI
