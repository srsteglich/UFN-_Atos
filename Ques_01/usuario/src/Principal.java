import java.util.Scanner;

public class Principal extends Usuario {

    public Principal(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

   public void solicitarUsiarios() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        this.email = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        this.telefone = scanner.nextLine();

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        scanner.close();
    }

    void exibirUsuarios() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    public static void main(String[] args) {
        Principal principal = new Principal("","","");
        principal.solicitarUsiarios();
        principal.exibirUsuarios();
    }

}
