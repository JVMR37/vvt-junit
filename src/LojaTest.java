import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LojaTest {

    private final Loja loja = new Loja("Loja de produtos que começam apenas com A");


    //teste de nulidade de um objeto
    //usado para testar se um objeto foi inicializado corretamente
    @Test
    void verificaNull() {
        String str;
        str = "Ao atribuir um valor, deixa de ser nulo";
        Assertions.assertNotNull(str);
    }

    //o método cadastraProduto retorna true se o produto foi cadastrado com sucesso
    @Test
    void testeInsercaoDeProduto() {
        String produtoCerto = "Abacaxi"; //funciona
        //String produtoErrado = "Pera";   //não funciona
        Assertions.assertTrue(loja.cadastraProduto(produtoCerto));
    }


    //o método addFuncionario cadastra funcionários apenas com idade maior ou igual a 18
    @Test
    void testeAdicionaFuncionario() {
        String funcionario = "Pedro";
        Assertions.assertFalse(loja.addFuncionario(funcionario, 16));
    }
}
