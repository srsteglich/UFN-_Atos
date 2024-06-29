package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DdFunctions db = new DdFunctions();
        Connection conn = db.connect_to_db("Locadora", "postgres", "123");
        // Criar Tabela no Banco de Dados
        // db.createTable(conn, "funcionario");    // O nome para criar a tabela, pelo DdFuncitions.java( createTable, linha 24)

        // Incluir os dados na Tabela
        // db.insert_row(conn, "funcionario", "Sérgio Renato", "Rua das Baleias Franca"); // (vai la no DdFunctions, linha 36)

        // Alterar os dados na Tabela
        //db.update_name(conn, "funcionario", "$s","Rodrigo");

        // Pesquisar os nomes na Tabela (especial apenas duas letras)
        //db.search_name(conn, "funcionario", "sé");

        // Excluir o nome na Tabela
        //db.delete_name(conn, "funcionario", "Rodrigo");

        // Mostrar todos os nomes na Tabela
        //db.read_data(conn, "funcionario");

        // Excluir a Tabela
        //db.delete_tabela(conn, "funcionario");
    }
}