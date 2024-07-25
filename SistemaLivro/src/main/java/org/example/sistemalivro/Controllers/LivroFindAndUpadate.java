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
import java.rmi.ServerException;

@WebServlet({"/LivroUpdate"})
public class LivroFindAndUpadate extends HttpServlet {

    public LivroFindAndUpadate() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String livroisbn = request.getParameter("livroisbn");
        Livro livro = DAOLivro.findByPk(livroisbn);
        request.setAttribute("livro", livro);
        RequestDispatcher resquestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
        resquestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Livro livro = new Livro();

        livro.setIsbn(request.getParameter("isbn"));
        livro.setNome(request.getParameter("nome"));
        livro.setCategoria(request.getParameter("categoria"));
        String quantidadeStr = request.getParameter("quantidade");
        DAOLivro.updateLivro(livro);
        LivroCreateAndFind livroCreateAndFind = new LivroCreateAndFind();
        livroCreateAndFind.doGet(request, response);
    }
}
