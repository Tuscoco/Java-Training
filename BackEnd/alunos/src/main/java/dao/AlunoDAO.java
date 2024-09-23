package dao;

import model.Aluno;
import java.sql.*;
import java.util.*;

public class AlunoDAO {
    
    private String url = "jdbc:postgresql://localhost:5432/escola";
    private String user = "lucasmarinho";
    private String password = "senhanova";


    public void salvarAluno(Aluno aluno) throws SQLException{

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "INSERT INTO alunos (id,name,email) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, getNextId());
            pstmt.setString(2, aluno.getName());
            pstmt.setString(3, aluno.getEmail());

            pstmt.executeUpdate();

        }

    }

    public int getNextId() throws SQLException{

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String slq = "SELECT MAX(id) AS max_id FROM alunos";
            PreparedStatement pstmt = conn.prepareStatement(slq);
            ResultSet result = pstmt.executeQuery();

            if(result.next()){

                return result.getInt("max_id") + 1;

            }

        }

        return 1;

    }

    public List<Aluno> getTodos() throws SQLException{

        List<Aluno> lista = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "SELECT * FROM alunos";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();

            while(result.next()){

                Aluno aluno = new Aluno(result.getInt("id"),result.getString("name"),result.getString("email"));
                lista.add(aluno);

            }

        }

        return lista;

    }

}
