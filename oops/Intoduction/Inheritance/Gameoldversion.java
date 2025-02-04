
import java.util.*;

public class Gameoldversion{
    
    
    private String player;
    
    private static int teamno=0;
    
    private ArrayList<String>members=new ArrayList<>();
    
    public Gameoldversion(String name)
    {
     this.player=name;
     this.members.add(name);
     teamno+=1;
     
    }
    public String toString()
    {
        return this.members+" "+this.player+" "+this.teamno;
    }

   public void moveforward()
    {
       System.out.print(" Move forward");
    }
    
    public void  backward()
    {
       System.out.print(" Move backward");
    }
    public void pause()
    {
       System.out.print("stop");
    }
    public void  resume()
    {
       System.out.print("move");
    }
}