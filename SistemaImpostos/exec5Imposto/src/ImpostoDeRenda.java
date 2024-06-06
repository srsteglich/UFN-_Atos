public class ImpostoDeRenda {
    private Pessoa pessoa;
    private int faixaIR;
    private double imposto;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.faixaIR = FaixaImpostoDeRenda.marcarFaixa(pessoa.getSalario());
        calcularImposto();
    }

    private void calcularImposto() {
        switch (faixaIR) {
            case 1:
                imposto = 0;
                break;
            case 2:
                imposto = (pessoa.getSalario() * 0.075) - 53.59;
                break;
            case 3:
                imposto = (pessoa.getSalario() * 0.15) - 138.66;
                break;
            case 4:
                imposto = (pessoa.getSalario() * 0.225) - 56.01;
                break;
            case 5:
                imposto = pessoa.getSalario() * 0.275;
                break;
        }
    }


    public void imprimir() {
        System.out.println("O " + pessoa.getNome() + ", o seu salário é R$ " + String.format("%.2f",pessoa.getSalario()) + ".");
        System.out.println("A sua faixa de imposto é " + faixaIR + " e o valor do Imposto de Renda a ser pago é: R$ " + String.format("%.2f",imposto) + ".");
        double salLiquido = pessoa.getSalario() - imposto;
        System.out.println("Seu salario liquido é R$ " + String.format("%.2f",salLiquido));

    }

}
