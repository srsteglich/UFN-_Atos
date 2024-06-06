public class FaixaImpostoDeRenda {
    public static int marcarFaixa(double salario) {
        if(salario >= 4664.69) {
            return 5;
        } else if (salario > 3751.06 && salario <= 4664.68) {
            return 4;
        } else if (salario > 2826.66 && salario <= 3751.06) {
            return 3;
        } else if (salario > 2112 && salario <= 2826.66) {
            return 2;
        } else {
            return 1;
        }
    }

}
