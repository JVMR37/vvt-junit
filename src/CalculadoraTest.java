import exceptions.DivisaoPorZeroException;
import org.junit.jupiter.api.*;

public class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    static void inicializacao() {
        calculadora = new Calculadora();
        System.out.println("Passou por aqui antes do teste");
    }

    @BeforeEach
    void init() {
        System.out.println("=========== Passou no BeforeEach ===========");
    }


    @Test
    void testeSomar() {

        Assertions.assertEquals(2, calculadora.soma(1, 1));
    }

    @Test
    void testeDivisaoPorZero() {
        Exception exception = Assertions.assertThrows(DivisaoPorZeroException.class, () -> calculadora.divisao(7.0, 0.0));

        Assertions.assertEquals(exception.getMessage(), "Não é possível dividir um númnero por zero.");
    }

//    @Test(expected = DivisaoPorZeroException.class)
//    public void whenExceptionThrown_thenExpectationSatisfied() {
//        calculadora.divisao(7.0, 0.0);
//    }

    //exemplo de assertEquals com delta, que testa se a diferença entre os valores
    //é menor que o delta fornecido
    @Test
    void testeRaizInversa() {
        Assertions.assertEquals(Calculadora.invSqrt(4), Calculadora.fastInvSqrt(4), 0.5);
    }

    //verifica que os valores retornados não são iguais
    @Test
    // @Disabled("Não roda esse teste aqui. É só pra demonstração")
    void testeNotEquals() {
        Assertions.assertNotEquals(Calculadora.invSqrt(4), Calculadora.fastInvSqrt(4));
    }

}
