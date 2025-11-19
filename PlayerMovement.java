/**
 * PlayerMovement: The class controls the player's movement, giving them directionality.
 *                 Additionally, the user's speed is also controlled with this class, 
 *                 making them slow them down after surviving for a certain time to increase difficulty.
 * 
 * @Harry Zhou
 * @11/18/2025
 */
import greenfoot.*;
public class PlayerMovement extends Actor{
  private int distance = 10;
  private long start = 0;
  
  public void counter(){
      start = System.currentTimeMillis();
  }
  public void move(){
      if((System.currentTimeMillis()-start)>= 10000){
          start = System.currentTimeMillis();
          distance = distance/2;
      }
      if(Greenfoot.isKeyDown("w")){
          setLocation(getX(),getY()-distance);
      }
      if(Greenfoot.isKeyDown("s")){
          setLocation(getX(),getY()+distance);
      }
      if(Greenfoot.isKeyDown("a")){
          setLocation(getX()-distance,getY());
    }
    if(Greenfoot.isKeyDown("d")){
        setLocation(getX()+distance,getY());
    }
  }
    
    
    

}
