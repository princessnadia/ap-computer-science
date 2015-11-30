import java.util.Random;
public class NotFound
{
    public String toString()
    {
        Random rng = new Random();
        
        switch(rng.nextInt(6))
        {
            case 0:
            return "I am not sure what that means.";
            case 1:
            return "I wish I knew what that phrase meant.";
            case 2:
            return "I cannot understand what you are saying.";
            case 3:
            return "That statement does not make sense to me.";
            case 4:
            return "I wish I knew what that phrase meant.";
            case 5:
            return "Try another phrase, please.";
            default:
            return "Sorry, come again?";
        }
    }
}