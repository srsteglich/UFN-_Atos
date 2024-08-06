$(document).ready(function () {
    $('#meuModal').addClass('is-active');

    $('.delete').click(function (event) {
        event.preventDefault();
        window.location.href = "/pessoa/listar";
    });

    document.getElementById('myButton').addEventListener('click', function (event) {
        event.preventDefault();
        window.location.href = "/pessoa/listar";
    });
});

