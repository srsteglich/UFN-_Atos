import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o salário: ");
        double salario = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, salario);
        ImpostoDeRenda ir = new ImpostoDeRenda(pessoa);

        ir.imprimir();
        scanner.close();         
    }
}
