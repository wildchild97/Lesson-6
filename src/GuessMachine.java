
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
        if(guess==number)return "You got it!";
        else if(guess<number && guess>=0) return "You guessed to low";
        else if(guess>number && guess<=100) return "You guessed to low";
        
    }
    
    public int gotNumGuesses()
    {
        return
    }
    
    public boolean setGuess()
    {
        return
    }
    //to do - add methods:
    //giveHint(), setGuess(), getNumGuessses()
}
