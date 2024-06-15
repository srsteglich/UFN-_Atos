import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        CarrinhoDeCompras car1 = new CarrinhoDeCompras();
        CarrinhoDeCompras car2 = new CarrinhoDeCompras();

        car1.adicionarItem(new Eletronico("Ipad Plus IV", 2500, 5, 1));
        car1.adicionarItem(new Roupa("Camisa Polos", 55.50, 2, "M", "Branca"));
        car1.adicionarItem(new Alimento("Feijão Preto", 12.50, 2, "20/10/2026"));
        System.out.println(" ");
        car2.adicionarItem(new Eletronico("TV 60pol", 3500, 1,4));
        car2.adicionarItem(new Roupa("Par Meia",6.00, 5, "M", "Branca"));
        car2.adicionarItem(new Alimento("Carne 1º", 55.55, 2, "15/08/2024"));

        car1.listarItens();
        System.out.println("Total da Compra1: " + String.format("%.2f",car1.calcularTotal()) + "\n");

        car2.listarItens();
        System.out.println("Total da Compra2: " + String.format("%.2f",car2.calcularTotal()));

        car1.gerarArquivosTexto("car1.txt");
        car2.gerarArquivosTexto("car2.txt");

    }
}
