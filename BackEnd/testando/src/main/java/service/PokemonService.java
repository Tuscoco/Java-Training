package service;

import dao.PokemonDao;
import model.Pokemon;

public class PokemonService {
    
    private PokemonDao pokemonDao = new PokemonDao();

    public boolean salvarPokemon(Pokemon pokemon){

        try{

            pokemonDao.salvarPokemon(pokemon);

            return true;

        }catch(Exception e){

            e.printStackTrace();

            return false;

        }

    }

}
