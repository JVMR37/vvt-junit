public class Loja {
	public static int funcCont = 0;
    public String nome;
    public String[] funcionarios;

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
    
    public boolean addFuncionario(String funcionario, int idade) {
    	if (idade >= 18) {
    		funcionarios[funcCont] = funcionario;
    		funcCont++;
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    }
}