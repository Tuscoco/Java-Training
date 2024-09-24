package model;

public class Professor {
    
    private int id;
    private String name;
    private String subject;
    private String email;


    public Professor(){
        id = 0;
        name = "";
        subject = "";
        email = "";
    }

    public Professor(int id, String name, String subject, String email){
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getSubject(){
        return this.subject;
    }

    public String getEmail(){
        return this.email;
    }

}
