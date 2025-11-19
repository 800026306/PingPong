import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends MyWorld
{
    public static int p=0;
    public static int ai=0;
    public static boolean pscore()
    {
        p++;
        return true;
    }
    public boolean ascore(){
        ai++;
        return true;
    }
    public void gameover(){
        p=0;
        ai=0;
    }
    public boolean pwin(){
        if (p == 21){
            return true;
        }
        return false;
    }
    public boolean aiwin(){
        if (ai==21){
            return true;
        }
        return false;
    }
}
