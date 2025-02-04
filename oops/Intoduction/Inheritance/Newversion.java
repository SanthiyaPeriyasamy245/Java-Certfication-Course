
import java.util.*;
public class Newversion extends Gameoldversion
{
  
    private int rating=0;
    
    ArrayList<String>members=new ArrayList<>();
    
    public Newversion(String name,int rating)
    {
        super(name);
        this.rating=rating;
        this.members.add(name);
        
    }
    public String toString()
    {
        return this.rating+" "+this.members;
    }
     public void removeplayer(String name)
    {
        members.remove(members.indexOf(name));
    }
     public void addplayer(String player)
    { 
      members.add(player);  
    }
   
   
    
    
}