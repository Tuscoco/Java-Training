package app;

import static spark.Spark.*;
import com.google.gson.Gson;
import model.Usuario;
import service.UsuarioService;

public class App 
{

    public static void main( String[] args )
    {

        port(4567);

        UsuarioService userService = new UsuarioService();
        Gson gson = new Gson();
        staticFiles.externalLocation("src/main/resources/public");


        get("/", (req, res) -> {
            return "<h1>Bem-vindo! Acesse <a href='/index.html'>o formulário</a>.</h1>";
        });
        

        post("/submitdata", (req, res) -> {
            res.type("application/json");

            System.out.println("Recebendo dados: " + req.body());

            Usuario user = gson.fromJson(req.body(), Usuario.class);
            boolean success = userService.salvarUsuario(user);

            if (success) {
                return gson.toJson(new ResponseMessage("Dados enviados com sucesso!", true));
            } else {
                return gson.toJson(new ResponseMessage("Erro ao enviar os dados.", false));
            }

        });

    }

    static class ResponseMessage{

        private String message;
        private boolean success;

        public ResponseMessage(String message,boolean success){
            this.message = message;
            this.success = success;
        }

        public String getMessage(){
            return this.message;
        }

        public boolean isSuccess(){
            return this.success;
        }

    }

}
