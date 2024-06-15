import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void removerItem(Produto produto) {
        itens.removeIf(item -> item.getNome().equals(produto.getNome()) && item.getQuantidade() == produto.getQuantidade());
    }

    public void listarItens() {
        for (Produto item : itens) {
            System.out.println(item.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos(){
        return  new ArrayList<>(itens);
    }

    public  double calcularTotal() {
        double total = 0;
        for(Produto item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return  total;
    }

    public void gerarArquivosTexto(String nomeArquivo) throws IOException {
/*      try {
            FileWriter writer = new FileWriter(nomeArquivo);
            for (Produto item : itens) {
                writer.write(item.getNome() + " - " + item.getQuantidade() + " - " + item.getPreco() + " - " + (item.getPreco() * item.getQuantidade()));
            }
            writer.write("Total: " + calcularTotal());
            writer.close();
        } catch (IOException e) {
            System.out.println(" Informando um erro ");
        }   */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Item -  Nome    -  Preço  - Quant -  Subtotal: \n");
            double subtotal = 0;
            for (int i = 1; i <= itens.size(); i++) {
                Produto item = itens.get(i - 1);
                writer.write(" " + i + "   |  "  + item.getNome() + "   " + String.format("%.2f",item.getPreco())+ "   "  + item.getQuantidade() + "   " + String.format("%.2f",(item.getPreco() * item.getQuantidade())));
                subtotal += item.getPreco() * item.getQuantidade();
                if (i!= itens.size()) {
                    writer.write("\n");
                }
            }
            writer.write("\nTotal:  " + String.format("%.2f",subtotal) + " \n");
        } catch (IOException e) {
            System.err.println("Informa erro");
        }
    }
}
