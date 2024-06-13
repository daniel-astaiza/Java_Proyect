// package com.example.Models;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.sql.ResultSet;

// public class traerDatos {
//     private Connection connection;

//     public void connect() throws SQLException {
        
//         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/conexion_java", "root", "");
//     }

//     public void executeQuery(String sql) throws SQLException {
     
//         try (Statement statement = connection.createStatement()) {
        
//             try (ResultSet resultSet = statement.executeQuery(sql)) {
             
//                 while (resultSet.next()) {
//                     int id = resultSet.getInt("id");
//                     String marca = resultSet.getString("marca");
//                     String modelo = resultSet.getString("modelo");
//                     String color = resultSet.getString("color");

//                     System.out.println("ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
//                 }
//             }
//         }
//     }

//     public void disconnect() throws SQLException {
//         if (connection != null && !connection.isClosed()) {
//             connection.close();
//         }
//     }
// }
