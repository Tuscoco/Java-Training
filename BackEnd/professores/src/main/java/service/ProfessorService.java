package service;

import model.Professor;
import dao.ProfessorDAO;
import java.sql.*;
import java.util.*;


public class ProfessorService {
    
    private ProfessorDAO profD = new ProfessorDAO();

    public boolean salvarAluno(Professor professor){

        try{

            profD.salvarProfessor(professor);

            return true;

        }catch(Exception e){

            e.printStackTrace();

            return false;

        }

    }

    /*public List<Professor> getTodos() throws SQLException{

        return profD.getTodos();

    }*/

}
