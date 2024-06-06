public class Main {
    public static void main(String[] args) {
        Livro li1 = new Livro("Marley, e Eu","John Grogan", 2005);
        Livro li2 = new Livro("O Senhor dos Anéis","J.R.R.", 1954);
        Livro li3 = new Livro("A Revolução dos Bichos ","George Orwell", 1945);
        Livro li4 = new Livro("Dominando o Delphi 4 - a Biblia","Marco Cantu", 1999);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(li4);
        biblioteca.adicionarLivro(li1);
        biblioteca.adicionarLivro(li3);
        biblioteca.adicionarLivro(li2);

        biblioteca.listarLivros();
    }
}
