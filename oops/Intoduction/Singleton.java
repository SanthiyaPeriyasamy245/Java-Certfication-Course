public class Singleton{

    private Singleton()
    {

    }
    static private Singleton obj;

    public static Singleton createobj() {
        if(obj==null)
        {
            obj=new Singleton();
        }
       
            return obj;
        
        
    }
}