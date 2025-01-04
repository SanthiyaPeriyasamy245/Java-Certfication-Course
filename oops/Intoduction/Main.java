public class Main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.createobj();
        Singleton obj2=Singleton.createobj();
        System.out.println(obj1 +" "+ obj2);
    }
}
