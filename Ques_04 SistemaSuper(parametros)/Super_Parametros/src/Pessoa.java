public class Pessoa {
    public String nome;
    public int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public void colocarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("RG: " + rg);
    }
}



