package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
      
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conexion_java", "root", "")) {
          
            String sql = "SELECT * FROM carritos";

           
            try (Statement statement = conexion.createStatement()) {
               
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                   
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String marca = resultSet.getString("marca");
                        String modelo = resultSet.getString("modelo");
                        String color = resultSet.getString("color");
                        
                        System.out.println("ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }
}
