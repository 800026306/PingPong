/**
 * Write a description of class Movement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Movement extends MyWorld 
{
    // instance variables - replace the example below with your own
    private double xPos;
    private double yPos;
    private double xSpeed;
    private double ySpeed;
    private boolean isTouching;
    private GreenfootImage object;
    

    /**
     * Constructor for objects of class Movement
     */
    public Movement(GreenfootImage object)
    {
        this.object = object;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getXPos()
    {
        return xPos;
    }
    
    public double getYPos() {
        return yPos;
    }
    
    public double getXSpeed() {
        return xSpeed;
    }
    
    public double getYSpeed() {
        return ySpeed;
    }
    
    public static void moveUp() {
        
    }
 }
