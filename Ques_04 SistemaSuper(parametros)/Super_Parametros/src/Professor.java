public class Professor extends Pessoa{
    public String matricula;
    public double salario;

    public Professor(String nome, int rg, String matricula, double salario) {
        super(nome, rg);
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public void colocarDados() {
        super.colocarDados();
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + String.format("%.2f", salario));
    }
}
