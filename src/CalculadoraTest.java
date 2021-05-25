import erros.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testeSomar() {
        Assertions.assertEquals(2, calculadora.soma(1, 1));
    }

    @Test
    void testeDivisaoPorZero() {
        Exception exception = Assertions.assertThrows(DivisaoPorZeroException.class, () -> calculadora.divisao(7.0, 0.0));

        Assertions.assertEquals(exception.getMessage(), "Não é possível dividir um númnero por zero.");
    }

    //exemplo de assertEquals com delta, que testa se a diferença entre os valores
    //é menor que o delta fornecido
    @Test
    void testeRaizInversa() {
        Assertions.assertEquals(Calculadora.invSqrt(4), Calculadora.fastInvSqrt(4), 0.5);
    }

    //verifica que os valores retornados não são iguais
    @Test
    void testeNotEquals() {
        Assertions.assertNotEquals(Calculadora.invSqrt(4), Calculadora.fastInvSqrt(4));
    }

}
