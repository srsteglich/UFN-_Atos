import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dos funcionários:");
        for (int i = 1; i <= 3; i++) {

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Setor: ");
            String setor = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Função: ");
            String funcao = scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, telefone, setor, cargo, funcao);
            System.out.print("\n      Funcionário " + i + ": ");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("Telefone: " + funcionario.getTelefone());

            System.out.println("Setor: " + funcionario.getSetor());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.println("---------------------------------------");

        }
        scanner.close();
    }
}
