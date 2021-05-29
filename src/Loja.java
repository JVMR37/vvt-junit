import exceptions.ProdutoDuplicadoException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Loja {
    public static int funcCont = 0;
    public String nome;
    public String[] funcionarios;
    public List<String> produtos;

    public Loja(String nome) {
        this.nome = nome;
        produtos = new ArrayList<String>();
        iniciarConexaoComBanco();
    }

    public boolean cadastrarProduto(String nomeProduto) {
        if (Character.isLowerCase(nomeProduto.charAt(0))) {
            return false;
        } else if (produtos.contains(nomeProduto)) {
            throw new ProdutoDuplicadoException("Um produto com esse nome"
                    + " já foi cadastrado!");
        } else {
            produtos.add(nomeProduto);
            System.out.printf("Produto %s foi cadastrado com sucesso !\n", nomeProduto);
            return true;
        }
    }

    public void listarProdutos() {
        ListIterator<String> listIterator = produtos.listIterator();
        int coutProduto = 0;

        System.out.println("\n.:Listagem de produtos:.");
        System.out.println("-------------------------------");

        while (listIterator.hasNext()) {

            String produto = listIterator.next();
            System.out.println(++coutProduto + " - " + produto);

        }

        System.out.println("-------------------------------\n");

    }

    public boolean addFuncionario(String funcionario, int idade) {
        if (idade >= 18) {
            funcionarios[funcCont] = funcionario;
            funcCont++;
            return true;
        } else {
            return false;
        }
    }

    public String comunicarComApi1() throws InterruptedException {
        Thread.sleep(100);

        return "Retorno da comunicação com a API";
    }

    public String comunicarComApi2() throws InterruptedException {
        Thread.sleep(10);

        return "Retorno da comunicação com a API";
    }

    public boolean verificaProduto(String nomeProduto) {
        return produtos.contains(nomeProduto);
    }

    private void iniciarConexaoComBanco() {
        System.out.println("CONEXÃO COM O BANCO FOI ESTABELECIDA COM SUCESSO !");
    }

    public void fecharConexaoComBD() {
        System.out.println("CONEXÃO COM O BANCO ENCERRADA COM SUCESSO !");
    }
}