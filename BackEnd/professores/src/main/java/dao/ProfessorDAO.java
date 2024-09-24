package dao;

import java.sql.*;
import java.util.*;
import model.Professor;

public class ProfessorDAO {
    
    private String url = "jdbc:postgresql://localhost:5432/escola2";
    private String user = "lucasmarinho";
    private String password = "senhanova";


    public void salvarProfessor(Professor professor) throws SQLException{

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "INSERT INTO professor (id,name,subject,email) VALUES (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, getNextId());
            pstmt.setString(2, professor.getName());
            pstmt.setString(3, professor.getSubject());
            pstmt.setString(4, professor.getEmail());

            pstmt.executeUpdate();

        }

    }

    public int getNextId() throws SQLException{

        try(Connection conn = DriverManager.getConnection(url, user, password)){

            String sql = "SELECT MAX(id) AS max_id FROM professor";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();

            if(result.next()){

                return result.getInt("max_id") + 1;

            }

        }

        return 1;

    }

    //public List<Professor> getTodos() throws SQLException{}

}
