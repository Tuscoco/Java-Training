package app;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import model.Professor;
import service.ProfessorService;

public class App 
{

    public static void main( String[] args )
    {

        port(4567);

        ProfessorService service = new ProfessorService();
        Gson gson = new Gson();
        staticFiles.externalLocation("src/main/resources/public");

        get("/", (req,res) -> {

            return "<h1>Bem Vindo! Acesse o <a href = '/index.html'>Sistema de gerenciamento de Professores</a></h1>";

        });

        post("/submitdata", (req,res) -> {

            res.type("application/json");

            Professor professor = gson.fromJson(req.body(), Professor.class);
            boolean success = service.salvarAluno(professor);

            if(success){

                return gson.toJson("Dados enviados com sucesso!");

            }else{

                return gson.toJson("Falha ao enviar os dados!");

            }

        });

    }

}
