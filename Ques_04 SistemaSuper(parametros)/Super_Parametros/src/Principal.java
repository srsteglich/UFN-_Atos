public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Felipe", 987654);
        Aluno aluno = new Aluno("Ricardo", 321456, "Aluno0011");
        Professor professor = new Professor("Lucas Alberto", 123456, "Prof00120", 87500.00);

        pessoa.colocarDados();
        aluno.colocarDados();
        professor.colocarDados();
    }
}
