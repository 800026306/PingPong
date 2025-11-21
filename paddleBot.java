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
    public void act()
    {
        paddleBot actor = new paddleBot();
        GreenfootImage botPaddleImage = getImage();
        botPaddleImage.scale(20,100);
    }
}
