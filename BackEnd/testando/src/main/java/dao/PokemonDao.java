package dao;

import model.Pokemon;
import java.sql.*;
import java.util.*;

public class PokemonDao {
    
    private String url = "jdbc:postgresql://localhost:5432/pokedex";
    private String user = "lucasmarinho";
    private String password = "senhanova";


    public void salvarPokemon(Pokemon pokemon) throws SQLException{

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "INSERT INTO pokemon (name,type) VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, pokemon.getName());
            pstmt.setString(2, pokemon.getType());
            pstmt.executeUpdate();

        }

    }

    public List<Pokemon> getTodos() throws SQLException{

        List<Pokemon> lista = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "SELECT * FROM pokemon";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();


            while(result.next()){

                Pokemon pokemon = new Pokemon(result.getString("name"), result.getString("type"));
                lista.add(pokemon);

            }

        }

        return lista;

    }

}
