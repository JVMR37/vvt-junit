import erros.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testeSomar() {
        assertEquals(2, calculadora.soma(1, 1));
    }

    @Test
    void testeDivisaoPorZero() {
        Exception exception = assertThrows(DivisaoPorZeroException.class, () -> calculadora.divisao(7.0, 0.0));

        Assertions.assertEquals(exception.getMessage(), "Não é possível dividir um númnero por zero.");
    }

}
