<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="pt_BR">
<head>
    <meta charset="UTF-8">
    <title>Lista dos Livros</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.html">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CreateAndFind">Lista de Livros</a>
                    </li>
                </ul>
                <form action="CreateAndFind" method="GET" class="d-flex">
                    <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite Livro-Categoria" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Pesquisar</button>
                </form>
            </div>
        </div>
    </nav>
    <br>
    <div class="container">
        <div class="row">
            <div class="cold-md-7">
                <hr>
                <h3>Listagem dos Livros</h3>
                <hr>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ISBN</th>
                            <th>Nome</th>
                            <th>Categoria</th>
                            <th>Quantidade</th>
                            <th>Operação</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${livros}" var="livro">
                            <tr>
                                <td>${livro.isbn}</td>
                                <td>${livro.nome}</td>
                                <td>${livro.categoria}</td>
                                <td>${livro.quantidade}</td>
                                <td>
                                    <button class="btn btn-primary" onclick="location.href='LivroUpdate?livroisbn=${livro.isbn}'">Atualizar</button>
                                    <button class="btn btn-danger" onclick="location.href='LivroDestroy?livroisbn=${livro.isbn}'">Deletar</button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <br>
                <button id="myButton" class="btn btn-success" type="submit">Inserir livro</button>
            </div>
        </div>
</div>
    <script>
        document.getElementById('myButton').addEventListener('click', function() {
            window.location.href = "index.html";
        });
    </script>
    <!-- JavaScript Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>