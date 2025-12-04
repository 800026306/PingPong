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
    private Ball gameBall;
    private paddleUser uPad;
    private paddleBot bPad;
    private start startButton;
    private int xChange = -5;
    private int yChange = 0;
    private boolean isRunning = true;
    
    private int playerScore = Scoreboard.playerScore; 
    private int botScore = Scoreboard.botScore; 
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 580, 1);
        prepare();

        // Initialize and add objects
        gameBall = new Ball();
        addObject(gameBall, 450, 290);
        uPad = new paddleUser();
        addObject(uPad, 70, 290);
        bPad = new paddleBot();
        addObject(bPad, 810, 290);

        // Randomly spawning in bombs
        bomb fbomb = new bomb();
        int x = (int)(Math.random() * 581);
        addObject(fbomb, 900, x);
        
        paddleUser uPad = new paddleUser(); addObject(uPad, 70, 290); 
        paddleBot bPad = new paddleBot(); addObject(bPad, 810, 290);
        
        startButton = new start();
        addObject(startButton, 450,290);
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
        started();
    }
    
    public void act() {
        if (!isRunning) {
            return; // Stop game logic if the game is over
        }

        // Converting scores to strings and displaying (can be updated here if scores change)
        String playerScoreString = String.valueOf(Scoreboard.playerScore);
        String botScoreString = String.valueOf(Scoreboard.botScore);
        showText(playerScoreString, 300, 50);
        showText(botScoreString, 600, 50);
        showText("LEVEL: "+String.valueOf(Scoreboard.level()),450,50);

        // Range of constantly-changing values (get current locations in each act cycle)
        int xPaddleUser = uPad.getX() + 10; 
        int yMinPaddleUserUpper = uPad.getY() - 50;
        int yMinPaddleUserLower = uPad.getY() + 50;
    
        int xPaddleBot = bPad.getX() - 10; // Get bot's X position (adjust offset as needed)
        int yMinPaddleBotUpper = bPad.getY() - 50;
        int yMinPaddleBotLower = bPad.getY() + 50;
        
        // Check collision with User Paddle (left side)
        // Both X position MUST match AND Y position MUST be in range
        if ((gameBall.getX() - 28 <= xPaddleUser) && (gameBall.getY() >= yMinPaddleUserUpper && gameBall.getY() <= yMinPaddleUserLower)) {
            xChange = 5; // Change direction to move right
            if (Greenfoot.isKeyDown("down")) {
                yChange = -2;
            }
            if (Greenfoot.isKeyDown("up")) {
                yChange = 2;
            }
        }
    
        // Check collision with Bot Paddle (right side)
        // Both X position MUST match AND Y position MUST be in range
        if ((gameBall.getX() + 28 >= xPaddleBot) && (gameBall.getY() >= yMinPaddleBotUpper && gameBall.getY() <= yMinPaddleBotLower)) {
            xChange = -5; // Change direction to move left
            if (Greenfoot.isKeyDown("down")) {
                yChange = -2;
            }
            if (Greenfoot.isKeyDown("up")) {
                yChange = 2;
            }
        }
        
        // Check if the ball goes off the side walls
        if (gameBall.getX() + 28 > 900) {
            playerScore++;
            showText(String.valueOf(playerScore), 300, 50);
            isRunning = false;
        }
        if (gameBall.getX() - 28 < 0) { // Check both boundaries
            botScore++;
            showText(String.valueOf(botScore), 600, 50);
            isRunning = false; // Game over
        }
        if (gameBall.getY() - 28 < 0) {
            yChange = 2;
        }
        if (gameBall.getY() + 28 > 600) {
            yChange = -2;
        }
    
        // Move the ball horizontally
        gameBall.setLocation(gameBall.getX() + xChange, gameBall.getY() + yChange);
    }
    
    @Override
    public void started() {
        isRunning = true;
    }
    
    @Override
    public void stopped() {
        isRunning = false;
    }
    
}
