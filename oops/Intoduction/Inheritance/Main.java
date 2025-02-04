public class Main{
    
    public static void main(String[]args)
    {
     Newversion game=new Newversion("sandy",5);
    game.pause();
    game.addplayer("gowthu");
    game.addplayer("siva");
    game.addplayer("asdsf");
    System.out.println(game);
    game.removeplayer("asdsf");
    game.moveforward();
    System.out.println(game);
    
    }
}