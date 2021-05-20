import erros.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();
    private final Loja loja = new Loja("Loja de produtos que começam apenas com A");

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

    //teste de nulidade de um objeto
    //usado para testar se um objeto foi inicializado corretamente
    @Test
    void testeNull() {
        String str;
        str = "Ao atribuir um valor, deixa de ser nulo";
        Assertions.assertNotNull(str);
    }
    
    //o método cadastraProduto retorna true se o produto foi cadastrado com sucesso
    @Test
    void testeBoolean() {
    	String produtoCerto = "Abacaxi"; //funciona
    	String produtoErrado = "Pera";   //não funciona
        Assertions.assertTrue(loja.cadastraProduto("Abacaxi"));
    }
    
    

}
