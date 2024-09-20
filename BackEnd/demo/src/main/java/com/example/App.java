package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;


public class App 
{
    
    private static void consultaDados(java.sql.Statement stm){

        String query = "SELECT * FROM usuario";

        try {

            ResultSet result = stm.executeQuery(query);

            while(result.next()){

                System.out.println("Nome: " + result.getString("name") + ", Email: " + result.getString("email") + ", age: " + result.getInt("age"));

            }

        }catch(SQLException e){

            e.printStackTrace();

        }

    }

    private static void insereDados(java.sql.Statement stm){

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String email = scan.nextLine();
        int age = scan.nextInt();

        String sql = "INSERT INTO usuario (name,email,age) VALUES ('" + name + "' , '" + email + "' , '" + age + "')";

        try{

            stm.executeUpdate(sql);

        }catch(SQLException e){

            e.printStackTrace();

        }

        scan.close();

    }
    
    public static void main( String[] args )
    {
        
        try{

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_aula", "lucasmarinho","senhanova");

            if(conexao != null){

                System.out.println("Conexão efetuada com sucesso!");

                java.sql.Statement stm = conexao.createStatement();

                consultaDados(stm);

                insereDados(stm);

                consultaDados(stm);

            }else{

                System.out.println("Conexão falhou!");

            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
