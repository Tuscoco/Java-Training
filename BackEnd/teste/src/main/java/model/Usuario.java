package model;

public class Usuario {
    
    private String name;
    private String email;


    public Usuario(String name,String email){
        this.name = name;
        this.email = email;    
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

}
