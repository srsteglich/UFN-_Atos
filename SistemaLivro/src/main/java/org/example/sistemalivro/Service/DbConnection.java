package org.example.sistemalivro.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final Object lock = new Object();
    private static Connection con = null;
    public DbConnection(){
    }

    public static Connection createConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Encontrado Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Falha ao carregar PostgreSQL JDBC Driver", e);
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proj_MVC", "postgres", "123");
            System.out.println("Conectado ao banco de dados");
            return connection;
        } catch (SQLException e) {
            System.out.println("Não conectado ao banco de dados." + e.getMessage());
            return null;
        }
    }
}
