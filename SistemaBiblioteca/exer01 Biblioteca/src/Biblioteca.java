import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println();
        System.out.println("                     Sistema de Biblioteca");
        for (Livro livro : livros) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Tilulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor() + " - " + "Ano de Publicação: " + livro.getAnoPublicacao());
        }
    }
}
