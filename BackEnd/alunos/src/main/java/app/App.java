package app;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import service.AlunoService;
import model.Aluno;

public class App 
{

    public static void main( String[] args )
    {

        port(4567);

        AlunoService service = new AlunoService();
        Gson gson = new Gson();
        staticFiles.externalLocation("src/main/resources/public");

        get("/", (req, res) -> {

            return "<h1>Bem vindo! Acesse ao <a src = '/index.html'>Sistema de gerenciamento de alunos</a></h1>";

        });

        get("/fetchdata", (req,res) -> {

            res.type("application/json");
            
            List<Aluno> lista = service.getTodos();

            return new Gson().toJson(lista);

        });

        post("/submitdata", (req, res) -> {

            res.type("application/json");
            
            Aluno aluno = gson.fromJson(req.body(), Aluno.class);
            boolean success = service.salvarAluno(aluno);

            if(success){

                return gson.toJson("Dados enviados");

            }else{

                return gson.toJson("Falha no envio!");

            }

        });

    }

}
