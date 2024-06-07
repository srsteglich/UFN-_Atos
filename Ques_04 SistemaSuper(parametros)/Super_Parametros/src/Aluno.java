public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, int rg, String matricula) {
        super(nome, rg);
        this.matricula = matricula;
    }

    @Override
    public void colocarDados() {
        super.colocarDados();
        System.out.println("Matricula: " + matricula);

    }
}