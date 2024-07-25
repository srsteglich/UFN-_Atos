package org.example.sistemalivro.DAO;

import org.example.sistemalivro.Service.DbConnection;
import org.example.sistemalivro.Model.Livro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOLivro implements LivroInterface {
    private static Connection connection = DbConnection.createConnection();
    private static String sql;
    public DAOLivro() {
    }
  public static void insertLivro(Livro livro) {
        sql = "INSERT INTO projeto1(isbn, nome, categoria, quantidade) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, livro.getIsbn());
            preparedStatement.setString(2, livro.getNome());
            preparedStatement.setString(3, livro.getCategoria());
            preparedStatement.setInt(4, livro.getQuantidade());
            preparedStatement.executeUpdate();
            System.out.println("Está salvo no Banco de Dados");
        } catch (SQLException e) {
            System.out.println("Não foi salvo no Banco de Dados. " + e.getMessage());
        }
    }
    public static void updateLivro(Livro livro) {
        sql = "UPDATE projeto1 SET nome = ?, categoria = ?, quantidade = ? WHERE isbn = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, livro.getNome());
            preparedStatement.setString(2, livro.getCategoria());
            preparedStatement.setInt(3, livro.getQuantidade());
            preparedStatement.setString(4, livro.getIsbn());
            preparedStatement.executeUpdate();
            System.out.println("O registro do Livro foi alterado!");
        } catch (SQLException e) {
            System.out.println("Não foi alterado. " + e.getMessage());
        }
    }
    public static void deleteLivro(String isbn) {
        sql = "DELETE FROM projeto1 WHERE isbn = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, isbn);
            preparedStatement.executeUpdate();
            System.out.println("Foi apagado o livro");
        } catch (SQLException e) {
            System.out.println("O livro não foi apagado. " + e.getMessage());
        }
    }

    public static Livro findByPk(String livroisbn) {
        sql = "SELECT * FROM projeto1 WHERE isbn = ?";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Livro livro = new Livro();

            while (resultSet.next()) {
                livro.setIsbn(resultSet.getString("isbn"));
                livro.setNome(resultSet.getString("nome"));
                livro.setCategoria(resultSet.getString("categoria"));
                livro.setQuantidade(resultSet.getInt("quantidade"));
            }
            System.out.println("Encontrado livros");
            return livro;
        } catch (SQLException e) {
            System.out.println("Não encontrado livros. " + e.getMessage());
            return null;
        }
    }
    public static List<Livro> find(String pesquisa) {
        //sql = String.format ("SELECT * FROM projeto1 WHERE nome LIKE '%S%%' OR categoria LIKE '%S%%' ", pesquisa, pesquisa);
        sql = String.format ("SELECT * FROM projeto1 WHERE nome LIKE ? OR categoria LIKE ?", pesquisa, pesquisa);
        List<Livro> livros = new ArrayList();
        try {
            // Passagem dos parâmetros para a consulta
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + pesquisa + "%");
            preparedStatement.setString(2, "%" + pesquisa + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                Livro livro = new Livro();
                livro.setIsbn(resultSet.getString("isbn"));
                livro.setNome(resultSet.getString("nome"));
                livro.setCategoria(resultSet.getString("categoria"));
                livro.setQuantidade(resultSet.getInt("quantidade"));
                livros.add(livro);
            }
            System.out.println("Encontrados livros");
            return livros;
        } catch (SQLException e) {
            System.out.println("Livro não encontrado. " + e.getMessage());
            return null;
        }
    }
}
