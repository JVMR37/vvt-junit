import java.util.ArrayList;
import java.util.List;

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

    public boolean cadastraProduto(String nomeProduto) {
        if (Character.isUpperCase(nomeProduto.charAt(0))) {
            produtos.add(nomeProduto);
            return true;
        } else {
            return false;
        }
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

    private void  iniciarConexaoComBanco(){
        System.out.println("CONEXÃO COM O BANCO EFETUADA COM SUCESSO !");
    }

    public void fecharConexaoComBD() {
        System.out.println("CONEXÃO COM O BANCO ENCERRADA COM SUCESSO !");
    }


}