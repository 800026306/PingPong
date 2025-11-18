public class Scoreboard  
{
    private int p=0;
    private int ai=0;
    public void pscore()
    {
        p++;
    }
    public void ascore(){
        ai++;
    }
    public int getpscore(){
        return p;
    }
    public int getaiscore(){
        return ai;
    }
    public void gameover(){
        p=0;
        ai=0;
    }
    public boolean pwin(){
        if (p==10){
            return true;
        }
        return false;
    }
    public boolean aiwin(){
        if (ai==10){
            return true;
        }
        return false;
    }
}
