public class Alimento extends ProdutoBase{
    private String dataValidade;

    public Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public Alimento()  {
        super();
    }

    @Override
    public String getTipo() {
        return "Alimento";
    }

    @Override
    public String exibirDetalhes() {
        return "Alimento: " + nome + ", com Validade ate: " + dataValidade;
    }
}
