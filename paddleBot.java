import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddleBot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddleBot extends Actor
{
    /**
     * Act - do whatever the paddleBot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int speed = 10;
    public void act()
    {
        paddleBot actor = new paddleBot();
        GreenfootImage botPaddleImage = getImage();
        botPaddleImage.scale(20,100);
        
        Ball Ball=(Ball) getWorld().getObjects(Ball.class).get(0);
        int ballY=Ball.getY();
        if(ballY>getY())
        {
            setLocation(getX(),getY()+7);
        }
        
        if(ballY<getY())
        {
            setLocation(getX(),getY()-7);
        }
    }
}
