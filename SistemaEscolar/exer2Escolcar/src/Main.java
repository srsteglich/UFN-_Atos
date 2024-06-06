public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro Geromel", 32, 111);
        Aluno aluno2 = new Aluno("Maria José", 22, 222);
        Aluno aluno3 = new Aluno("Mathias Villasanti", 31, 333);
        Aluno aluno4 = new Aluno("Ana Paula", 21, 444);
        Aluno aluno5 = new Aluno("Gustavo Nunes", 27, 555);

        Turma turmaA = new Turma("Turma A", "1A");
        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno4);

        Turma turmaB = new Turma("Turma B", "2B");
        turmaB.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno3);
        turmaB.adicionarAluno(aluno5);

        System.out.println("\n ------ Alunos da Turma A ------");
        turmaA.listarAluno();
        System.out.println("\n ------ Alunos da Turma B ------");
        turmaB.listarAluno();
    }
}
