package org.example.sistemalivro.Controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.sistemalivro.DAO.DAOLivro;
import org.example.sistemalivro.Model.Livro;

import java.io.IOException;
import java.util.List;

@WebServlet("/CreateAndFind")
public class LivroCreateAndFind extends HttpServlet {

    public LivroCreateAndFind() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pesquisa = request.getParameter("pesquisa");
        if (pesquisa == null) {
            pesquisa = "";
        }

        List<Livro> livros = DAOLivro.find(pesquisa);
        request.setAttribute("livros", livros);
        RequestDispatcher resquesDispatcher = request.getRequestDispatcher("lista.jsp");
        resquesDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Livro livro = new Livro();

        livro.setIsbn(request.getParameter("isbn"));
        livro.setNome(request.getParameter("nome"));
        livro.setCategoria(request.getParameter("categoria"));
        String quantidadeStr = request.getParameter("quantidade");
        try {
            int quantidade = Integer.parseInt(quantidadeStr);
            livro.setQuantidade(quantidade);
        } catch (NumberFormatException e) {
            livro.setQuantidade(0);
        }
        DAOLivro.insertLivro(livro);
        // apos de salvar, retorna na lista (linha28)
        doGet(request, response);
    }
}
