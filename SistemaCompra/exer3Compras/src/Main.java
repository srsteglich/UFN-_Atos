import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;
    private  int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("  Nome        " + " Valor Unitario  " + "  Quantidade  " + "  Sub-total");
        System.out.println("--------------------------------------------------------------------");
        double total = 0;
        for (Produto produto : produtos) {
            double subtotal = produto.getPreco() * produto.getQuantidade();
            System.out.printf("%s        " + "  R$ %.2f     " + "     %d   " +"   R$ %.2f\n", produto.getNome(), produto.getPreco(), produto.getQuantidade(), subtotal);
            total = total + subtotal;
        }
        System.out.println();
        System.out.printf("                                     Total: R$ %.2f\n", total);
    }
}


public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto mouseGamer = new Produto("Mouse Gamer ", 110.00,2);
        Produto teclado = new Produto("Mini Teclado ", 80.00, 1);
        Produto headset = new Produto("Pen-Drive 1Gb", 150.00, 2);

        carrinho.adicionarProduto(mouseGamer);
        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(headset);

        carrinho.listarProdutos();
    }

}
