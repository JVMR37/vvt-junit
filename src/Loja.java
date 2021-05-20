public class Loja {
    public String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public boolean cadastraProduto(String nomeProduto) {
        if (nomeProduto.startsWith("A")) {
            return true;
        }

        else {
            return false;
        }
    }
}