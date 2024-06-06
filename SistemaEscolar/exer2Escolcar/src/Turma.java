import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String codigo;
    private List<Aluno> alunos;

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void  listarAluno() {
        System.out.println("Alunos na turma " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("  " + aluno.getNome());
        }
    }

}
