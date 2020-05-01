public class PokemonGame 
{   
    public static void main(String args[])
    {
        System.out.println("Hello Pokemon Game");
        Trainer t = new Trainer("KJI");
        MainGame mg = new MainGame(t);
        
        //System.out.println("End Pokemon Game");

    }
}