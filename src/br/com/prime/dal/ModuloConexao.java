package br.com.prime.dal;

import java.sql.*;

public class ModuloConexao {

    //Método responsavel por estabelecer a conexao com o BD
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha abaixo chama o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informaçoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo a conexao com o bd
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
           // System.out.println(e);
            return null;
        }
    }  
        

    }
