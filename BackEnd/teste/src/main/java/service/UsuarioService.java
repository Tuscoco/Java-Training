package service;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioService {
    
    private UsuarioDAO userD = new UsuarioDAO();

    public boolean salvarUsuario(Usuario user){

        try{

            userD.salvar(user);

            return true;

        }catch(Exception e){

            e.printStackTrace();

            return false;

        }

    }

}
