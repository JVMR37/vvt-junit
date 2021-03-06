import exceptions.DivisaoPorZeroException;

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

    public static double fastInvSqrt(double x) {
        double xhalf = 0.5d * x;
        long i = Double.doubleToLongBits(x);
        i = 0x5fe6ec85e7de30daL - (i >> 1);
        x = Double.longBitsToDouble(i);
        x *= (1.5d - xhalf * x * x);
        return x;
    }

    public static double invSqrt(double x) {
        return 1 / Math.sqrt(x);
    }

}
