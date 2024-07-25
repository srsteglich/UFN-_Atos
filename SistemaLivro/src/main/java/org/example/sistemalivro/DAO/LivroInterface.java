package org.example.sistemalivro.DAO;

import org.example.sistemalivro.Model.Livro;

import java.util.List;

public interface LivroInterface {
    static void insertLivro(Livro livro) {};
    static void updateLivro(Livro livro) {};
    static void deleteLivro(String isbn) {};

    static Livro findByPk(String livroisbn) {return null;};
    static List<Livro> find(String pesquisa) {return null;}
}
