
import java.util.*;
public class Company
{
  public static void main(String[]args)
    {
        Employees emp1=new Employees(1,"sandy");
        Employees emp2=new Employees(2,"sharmi");
        Employees emp3=new Employees(3,"priya");
        Employees emp4=new Employees(4,"abinaya");
        
        Employees emp5=new Employees(1,"yamuna");
        Employees emp6=new Employees(2,"kaveri");
        Employees emp7=new Employees(3,"narmadha");
        Employees emp8=new Employees(4,"jasmine");
        
          Employees emp10=new Employees(4,"dhiya");
          
        Composition microsoft=new Composition("Microsoft",emp1);
        Composition google=new Composition("Google",emp4);
        Composition amazon=new Composition("amazon",emp3);
        Composition atlassian=new Composition("atlassian",emp2);
        
        microsoft.add(emp5);
        microsoft.add(emp6);
        amazon.add(emp7);
        amazon.add(emp8);

        amazon.setter("Amazon",emp10);
        
        System.out.println(microsoft);
        System.out.println(amazon.getter());
        System.out.println(atlassian.getter());
        System.out.println(google.getter());
        
        
    }
    }
 class Composition{
    private String name;
    private ArrayList<Employees>emp=new ArrayList<Employees>();
    public Composition(String name,Employees emp1)
    {
        this.name=name;
        this.emp.add(emp1);
    }
    public void add(Employees worker)
    {
        this.emp.add(worker);
    }
    public void setter(String name,Employees worker)
    {
        this.name=name;
        this.emp.add(worker);
    }
    public ArrayList getter()
    {
        return this.emp;
    }
    public String toString()
    {
        return this.name+" "+this.emp;
    }
    
  
}
class Employees{
    private int id;
    private String name;
    public Employees(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString()
    {
        return this.id+" "+this.name;
    }
}