import java.util.*;
public class PokemonRandomizer{
    public static ArrayList<Pokemon> getPokemons(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }

        int pokemonNumber = (int)(Math.random()*num +1); //random pokemon in wild

        for(int i=0 ; i<pokemonNumber ; ++i){ //can add pokemon
            int type = (int)(Math.random()*3);
            if(type==0)
                pokemons.add(new Pikachu("Wild Pikachu"));
            else if(type == 1)
                pokemons.add(new Pikachu("Wild Richu"));
            else if(type==2)
                pokemons.add(new Kabigon("Wild kabigon"));
        }
    return pokemons;
    }
}