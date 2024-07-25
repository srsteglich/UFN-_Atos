package org.example.sistemalivro.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.sistemalivro.DAO.DAOLivro;

import java.io.IOException;

@WebServlet({"/LivroDestroy"})
public class LivroDelete extends HttpServlet {

    public LivroDelete() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String livroisbn = request.getParameter("livroisbn");
        DAOLivro.deleteLivro(livroisbn);
        LivroCreateAndFind livroCreateAndFind = new LivroCreateAndFind();
        livroCreateAndFind.doGet(request, response);

    }

}
