package app;

import model.Pokemon;
import service.PokemonService;
import static spark.Spark.*;
import com.google.gson.Gson;

public class App 
{

    public static void main( String[] args )
    {

        port(4567);

        PokemonService service = new PokemonService();
        Gson gson = new Gson();
        staticFiles.externalLocation("src/main/resources/public");


        get("/", (req, res) -> {

            return "<h1>Bem vindo! Acesse <a href = '/index.html'>a Pokedéx</a>.</h1>";

        });

        post("/submitdata", (req, res) -> {

            res.type("application/json");

            System.out.println("Recebendo dados: " + req.body());

            Pokemon pokemon = gson.fromJson(req.body(), Pokemon.class);
            boolean success = service.salvarPokemon(pokemon);

            if(success){

                return gson.toJson("Dados enviados!");

            }else{

                return gson.toJson("Falha no envio!");

            }

        });

    }

}
