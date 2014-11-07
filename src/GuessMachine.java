
public class GuessMachine 
{
    private int number;
    private int numGuesses;
    private int guess;
    
    public GuessMachine()
    {
        number=(int)(Math.random()*100)+1;
        guess=0;
        numGuesses=0;   
    }
    
    public String giveHint()
    {
        if(guess==number)return "You got it";
        else if(guess<number && guess>=0) return "You guessed to low";
        else  return "You guessed to high";   
    }
    
    public boolean setGuess(int number)
    {
        if (number<0 || number>100) return false;
       
       else 
       {
           numGuesses+=1; 
           guess=number;
           return true;
       }
                
    } 
   
    public int getNumGuesses()
    {
        return numGuesses;
    }
}
