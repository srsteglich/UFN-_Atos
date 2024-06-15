public class Roupa extends ProdutoBase{
    private String tamanho, cor;

    public Roupa(String nome, double preco, int quantidade, String tamanho, String cor) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa() {
       super();
    }

    @Override
    public String getTipo() {
        return "Roupa";
    }

    @Override
    public String exibirDetalhes() {
        return "Roupa: " + nome + ", Tamanho: " + tamanho + " e a Cor: " + cor;
    }
}
