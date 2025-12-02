import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Shubhay Shah
 * @version 1.0.0
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 580, 1); 
        prepare();
        
        // Converting scores to strings
        String playerScoreString = String.valueOf(Scoreboard.playerScore);
        String botScoreString = String.valueOf(Scoreboard.botScore);
        
        showText(playerScoreString, 350, 50);
        showText(botScoreString, 650, 50); 
 
        Ball gameBall = new Ball();
        addObject(gameBall, 450, 290);
        
        paddleUser uPad = new paddleUser(); addObject(uPad, 70, 290); 
        paddleBot bPad = new paddleBot(); addObject(bPad, 810, 290);
        
        bomb fbomb = new bomb();
        int x = (int)(Math.random() * 581);
        addObject(fbomb, 900, x);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
    }
}
