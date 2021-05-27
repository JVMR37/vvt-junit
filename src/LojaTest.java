import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.Duration;

@DisplayName("Testes da Classe Loja")
public class LojaTest {

    private static Loja loja;


    @BeforeAll
    static void iniciaConexaoComBanco() {
        System.out.println("=========================================");

        loja = new Loja("Loja de produtos que começam apenas com letras Maiúsculas");

        System.out.println("=========================================");
    }


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

    // O método teste se a chamada retornará com 10ms
    @Test
    void testeComunicacaoComAPIComTimeoutExcedente() {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> {

            String retorno = loja.comunicarComApi1();

            System.out.println(retorno);
        });
    }

    @Test
    void testeComunicacaoComAPIComTimeoutSemExcedente() {
        Assertions.assertTimeout(Duration.ofMillis(20), () -> {

            String retorno = loja.comunicarComApi2();

            System.out.println(retorno);
        });
    }

    @Test
    void testeDeObjetosIguais() {
        Loja loja = new Loja("Loja 1");
        Loja mesmaLoja = loja;
        Assertions.assertSame(loja, mesmaLoja);
    }

    @Test
    void testesDeObjetosDiferentes() {
        Loja loja = new Loja("Loja 1");
        Loja loja2 = new Loja("Loja 2");
        Assertions.assertSame(loja, loja2);
    }

    @Test
    @DisplayName("TESTE DE ADIÇÃO DE PRODUTOS")
    void testeAdicaoDeProdutos() {
        // Dentro de um bloco de código, se uma declaração falhar,
        // o código subsequente no mesmo bloco será ignorado.
        Assertions.assertAll("Adição de produtos",
                () -> {
                    loja.cadastraProduto("Abacaxi");
                    loja.cadastraProduto("Abacate");
                    loja.cadastraProduto("Amaciante");

                    // Em uma asserção agrupada, todas as asserções são executadas
                    // e todas as falhas serão relatadas juntas.
                    Assertions.assertAll("Verficação de cadastro dos produtos",
                            () -> Assertions.assertTrue(loja.verificaProduto("Abacaxi")),
                            () -> Assertions.assertTrue(loja.verificaProduto("Abacate")),
                            () -> Assertions.assertTrue(loja.verificaProduto("Amaciante"))
                    );

                    Assertions.assertFalse(loja.produtos.contains("Banana"));
                }
        );

    }


    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {

        System.out.println("=========================================");

        loja.fecharConexaoComBD();

        System.out.println("=========================================");
    }


}
