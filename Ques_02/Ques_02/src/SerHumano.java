public class SerHumano extends Animal {
    public String nome;
    public int idade;

    public SerHumano(String nome, int idade, String tipo) {
        super(tipo);
        this.nome = nome;
        this.idade = idade;
    }

    public void falar() {
        System.out.println("Nem todos falam");
    }
}
