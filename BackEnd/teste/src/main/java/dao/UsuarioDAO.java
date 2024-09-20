package dao;

import model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private String url = "jdbc:postgresql://localhost:5432/bancodeusuarios";
    private String user = "lucasmarinho";
    private String senha = "senhanova";


    public void salvar(Usuario user) throws SQLException{

        try (Connection conn = DriverManager.getConnection(url, this.user, senha)){

            String sql = "INSERT INTO usuarios (name,email) VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.executeUpdate();

        }

    }

    public List<Usuario> getTodos() throws SQLException{

        List<Usuario> lista = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url, this.user, this.senha)){

            String sql = "SELECT * FROM usuarios";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){

                Usuario user =  new Usuario(rs.getString("name"), rs.getString("email"));
                lista.add(user);

            }

        }

        return lista;

    }

}
