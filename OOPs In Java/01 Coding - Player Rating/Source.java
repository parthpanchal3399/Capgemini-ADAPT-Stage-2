abstract class Player
{
    String firstName;
    String lastName;
    
    Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getName()
    {
        return (this.firstName + " " + this.lastName);
    }
    
    public abstract int getRating();
}

class CricketPlayer extends Player
{
    double averageRuns;
    
    CricketPlayer(String firstName, String lastName, double averageRuns)
    {
        super(firstName, lastName);
        this.averageRuns = averageRuns;
    }
    
    public int getRating()
    {
        if(this.averageRuns > 55)
            return 7;
        else if(this.averageRuns > 50)
            return 6;
        else if(this.averageRuns > 40)
            return 5;
        else if(this.averageRuns > 30)
            return 3;
        else if(this.averageRuns > 20)
            return 2;
        else if(this.averageRuns <= 20)
            return 1;
        
        return -1;
    }
}

class FootballPlayer extends Player
{
    int goals;
    
    FootballPlayer(String firstName, String lastName, int goals)
    {
        super(firstName, lastName);
        this.goals = goals;
    }
    
    public int getRating()
    {
        if(this.goals > 20)
            return 5;
        else if(this.goals > 15)
            return 4;
        else if(this.goals > 10)
            return 3;
        else if(this.goals > 5)
            return 2;
        else if(this.goals <= 5)
            return 1;
            
        return -1;
    }
}

public class Source{
    public static void main(String[] args){
        // keeping this blank as the code is filled by the test cases
    }
}

