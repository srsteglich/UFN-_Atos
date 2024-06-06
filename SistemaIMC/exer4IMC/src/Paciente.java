public class Paciente {
    private double peso;
    private double altura;
    private String nome;

    // Constructor
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Formula
    public double calculaIMC() {
        double res = Math.round(peso / (altura * altura) * 100.0) / 100.0;
        return res;
    }

    public String diagnostico() {
        double imc = calculaIMC();
        if (imc >= 40) {
            return "Obesidade grau III (obesidade mórbida)";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade grau II";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade grau I";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Baixo peso";
        } else if (imc >= 16 && imc <= 16.99) {
            return "Baixo peso grave";
        } else {
            return "Baixo peso muito grave";
        }
    }

    public String getNome() {
        return nome;
    }
}

