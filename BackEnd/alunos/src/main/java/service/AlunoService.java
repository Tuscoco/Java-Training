package service;

import java.sql.SQLException;
import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class AlunoService {
    
    private AlunoDAO alunoD = new AlunoDAO();

    public boolean salvarAluno(Aluno aluno){

        try{

            alunoD.salvarAluno(aluno);

            return true;

        }catch(Exception e){

            e.printStackTrace();

            return false;

        }

    }

    public List<Aluno> getTodos() throws SQLException{

        return alunoD.getTodos();

    }

}
