public class Principal {
    public static void main(String[] args) {

        Paciente pac1 = new Paciente(55, 1.78);
        pac1.setNome("Lucas Gomes");
        Paciente pac2 = new Paciente(72.5, 1.86);
        pac2.setNome("Sérgio Renato");
        Paciente pac3 = new Paciente(95, 1.50);
        pac3.setNome("Carlos Eduardo");

        System.out.println("\n"+ "         **** HealthCare **** ");
        System.out.println("O Paciente " + pac1.getNome() + " é " + pac1.diagnostico() + " o IMC: "+ pac1.calculaIMC());
        System.out.println("O Paciente " + pac2.getNome() + " é " + pac2.diagnostico() + " o IMC: "+ pac2.calculaIMC());
        System.out.println("O Paciente " + pac3.getNome() + " é " + pac3.diagnostico() + " o IMC: "+ pac3.calculaIMC());

    }
}
