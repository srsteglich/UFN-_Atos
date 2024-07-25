
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="pt_BR">
<head>
    <meta charset="UTF-8">
    <title>Alterar livro</title>
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
                <h3>Alterar Livro</h3>
                <hr>
                <form action="LivroUpdate" method="POST">
                    <div class="form-floating mb-3">
                        <input value="${livro.isbn}" name="isbn" maxlength="22" type="text" class="form-control" id="floatingInput1">
                        <label>Número do ISBN</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input value="${livro.nome}" name="nome" maxlength="50" type="text" class="form-control">
                        <label>Nome do Livro</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input value="${livro.categoria}" name="categoria" maxlength="30" type="text" class="form-control">
                        <label>Categoria</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input value="${livro.quantidade}" name="quantidade" maxlength="10" type="number" class="form-control">
                        <label>Quantidade</label>
                    </div>
                    <button class="btn btn-success" type="submit">Atualizar Livro</button>
                    <button class="btn btn-secondary" type="reset">Limpar Formulário</button>
                </form>
                <br>
                <button id="myButton" class="btn btn-info" type="submit">Lista de Livros</button>
            </div>
        </div>
    </div>
    <script>
        document.getElementById('myButton').addEventListener('click', function() {
            window.location.href = "CreateAndFind";
        });
    </script>
    <!-- JavaScript Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

</html>
