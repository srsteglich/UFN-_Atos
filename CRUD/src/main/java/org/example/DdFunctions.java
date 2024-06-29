package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DdFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,pass);
            if (conn != null) {
                System.out.println("Banco de Dados conectado com sucesso!\n");
            } else {
                System.out.println(" Conexão falhou!");
            }
        }catch(Exception e){
            System.out.println("Não foi possível conectar: "+e.getMessage());
        }
        return conn;
    }
    // Criar a tabela no Banco de Dados
    public void createTable(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "create table "+ table_name +"(cod_emp SERIAL, nome varchar(100), endereco varchar(100), primary key(cod_emp))";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tabela criada");
        } catch (Exception e) {
            System.out.println("Não foi possível criar tabela: "+e.getMessage());
        }
    }

    public void insert_row(Connection conn, String table_name, String nome, String endereco) {
        Statement statement;
        try {                           //'%s' serve para inserir os valores em string, como fosse "marcador de posição" e %d para numeros inteiros "
            String query = String.format("insert into %s(nome, endereco) values('%s', '%s');", table_name,nome,endereco);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Funcionário cadastrado!");
        } catch (Exception e) {
            System.out.println("Não foi possível inserir funcionário: "+e.getMessage());
        }
    }

    public void read_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("select * from %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString("cod_emp")+ " ");
                System.out.print(rs.getString("nome")+ " - ");
                System.out.println(rs.getString("endereco"));
                System.out.println("--------------------------------");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível consultar funcionário: "+e.getMessage());
        }
    }

    public void update_name(Connection conn, String table_name, String old_nome, String new_nome) {
        Statement statement;
        try {
            String query = String.format("update %s set nome='%s' where nome='%s'", table_name,new_nome,old_nome);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Funcionário alterado!");
        } catch (Exception e) {
            System.out.println("Não foi possível alterar funcionário: "+e.getMessage());
        }
    }

    public void search_name(Connection conn, String table_name, String nome) {
        Statement statement;
        ResultSet rs = null;
        try {                    //'%s' serve para inserir os valores em string, como fosse "marcador de posição" e %d para numeros inteiros "
            String query = String.format("select * from %s where nome ilike '%%%s%%'", table_name, nome);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString("cod_emp")+ " ");
                System.out.print(rs.getString("nome")+ " - ");
                System.out.println(rs.getString("endereco"));
                System.out.println("------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível consultar o nome do funcionário: "+e.getMessage());
        }
    }

    public void delete_name(Connection conn, String table_name, String nome) {
        Statement statement;
        try {
            String query = String.format("delete from %s where nome='%s'", table_name, nome);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Funcionário excluido!\n");
        } catch (Exception e) {
            System.out.println("Não foi possível deletar o nome do funcionário: " + e.getMessage());
        }
    }

    public void delete_table(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = String.format("drop table %s", table_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tabela excluida!\n");
        } catch (Exception e) {
            System.out.println("Não foi possível excluir a tabela: " + e.getMessage());
        }
    }


}
