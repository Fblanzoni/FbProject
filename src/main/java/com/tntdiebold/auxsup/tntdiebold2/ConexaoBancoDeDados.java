package com.tntdiebold.auxsup.tntdiebold2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBancoDeDados {
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }   

}

    
