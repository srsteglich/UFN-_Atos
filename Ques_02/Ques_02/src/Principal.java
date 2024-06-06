import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ditige teu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Ditige tua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ditige teu tipo: ");
        String tipo = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, tipo);

        System.out.println("Nome " + pessoa.nome);
        System.out.println("Idade " + pessoa.idade);
        System.out.println("Tipo " + pessoa.tipo);


        pessoa.falar();
        pessoa.andar();

    }
}
