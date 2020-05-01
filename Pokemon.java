public class Pokemon
{
    private int level =0;
    private int Exp = 0;

    private int HP = 0;
    private int Damage = 0;
    private String nameP = ".";
    private String name = "/////";
    public static void main(String[] args){
    
    }
      
    public String getnameP(){ 
        return nameP; 
    }

    public String getname(){ 
        return name; 
    }

    public void expup(int exp){
        Exp += exp;
    }

    

    public void levelup(){
        Exp -= 100;
        level ++;
        HP += 100;
        Damage += 10;
    }

    public  int getexp(){ 
        return Exp; 
    }

    public  int getlevel(){ 
        return level; 
    }

    public int getHP(){ 
        return HP; 
    }

    public int getDamage(){ 
        return Damage; 
    }

    public void Name(String name){
        this.name = name;
    }

    public void catchpokemon(Pokemon pokemon){
        nameP = pokemon.getnameP();
        level = pokemon.getlevel();
        HP = pokemon.getHP();
        Damage = pokemon.getDamage();
    }
    
    public void Nopoke()
    {
        nameP ="--";
        level = 0;
        HP = 0;
        Damage = 0;
    }
   
    public void poke(int NumP,int n){
        if(NumP == 0){
            nameP ="Pikachu";
            level = n;
            HP = 100 + (10*(n-1));
            Damage = 10 + n-1;
        }
        else if(NumP == 1){
            nameP ="Jigglypuff";
            level = n;
            HP = 90 + (5*(n-1));
            Damage = 6 + n-1;
        }
        else if(NumP == 2){
            nameP ="Psyduck";
            level = n;
            HP = 110 + (5*(n-1));
            Damage = 4 + n-1;
        }
        else if(NumP == 3){
            nameP ="Wartotle";
            level = n;
            HP = 100 + (5*(n-1));
            Damage = 4 + n-1;
        }
        else if(NumP == 4){
            nameP ="Growlithe";
            level = n;
            HP = 102 + (5*(n-1));
            Damage = 1 + n-1;
        }
        else if(NumP == 5){
            nameP ="Flareon";
            level = n;
            HP = 110 + (5*(n-1));
            Damage = 5 + n-1;
        }
        
    }
}