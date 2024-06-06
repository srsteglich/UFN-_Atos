public class Pessoa {
    private String nome;
    private double salario;

    //Contructor
    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
