import erros.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private final Loja loja = new Loja("Loja de produtos que começam apenas com A", 2, 3);

    //para int
    @Test
    void testeSomar() {
    	Assertions.assertEquals(2, Calculadora.soma(1, 1));
    }
    
    //para double
    @Test
    void testeMultiplicar() {
    	Assertions.assertEquals(4, Calculadora.multiplica(2, 2));
    }

    @Test
    void testeDivisaoPorZero() {
        Exception exception = Assertions.assertThrows(DivisaoPorZeroException.class, () -> Calculadora.divisao(7.0, 0.0));

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
    void testeTrue() {
    	String produto = "Abacaxi"; //funciona
        Assertions.assertTrue(loja.cadastraProduto(produto));
    }
    
    
    //o método addFuncionario cadastra funcionários apenas com idade maior ou igual a 18
    @Test
    void testeFalse() {
    	String funcionario = "Pedro";
    	Assertions.assertFalse(loja.addFuncionario(funcionario, 16));
    }
    
    
    //verifica que os valores retornados não são iguais
    @Test
    void testeNotEquals() {
        Assertions.assertNotEquals(Calculadora.invSqrt(4), Calculadora.fastInvSqrt(4));
    }
    
    @Test
    void assertSame() {
    	Loja loja = new Loja("Loja 1");
    	Loja mesmaLoja = loja;
    	Assertions.assertSame(loja, mesmaLoja);
    }
    
    @Test
    void assertNotSame() {
    	Loja loja = new Loja("Loja 1");
    	Loja loja2 = new Loja("Loja 2");
    	Assertions.assertSame(loja, loja2);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
