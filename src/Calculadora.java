import erros.DivisaoPorZeroException;

public class Calculadora {
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double multiplica(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2)  {
        if(num2 == 0.0) throw new DivisaoPorZeroException("Não é possível dividir um númnero por zero.");
        return num1 / num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

}
