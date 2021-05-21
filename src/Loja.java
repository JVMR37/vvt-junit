public class Loja {
	public int funcCont = 0;
	public int prodCont = 0;
    public String nome;
    public String[] funcionarios;
    public String[] produtos;
    
    public Loja(String nome) {
        this.nome = nome;
        this.funcionarios = new String[10];
        this.produtos = new String[10];
        this.funcCont = 0;
        this.prodCont = 0;
    }

    public Loja(String nome, int qtdProdutos, int qtdFuncionarios) {
        this.nome = nome;
        this.funcionarios = new String[qtdFuncionarios];
        this.produtos = new String[qtdProdutos];
        this.funcCont = 0;
        this.prodCont = 0;
    }

    public boolean cadastraProduto(String nomeProduto) {
        if (this.prodCont == produtos.length) {
        	return false;
        }
        else {
        	this.produtos[prodCont] = nomeProduto;
        	return true;
        }
    }
    
    public boolean addFuncionario(String funcionario, int idade) {
    	if (idade >= 18) {
    		this.funcionarios[funcCont] = funcionario;
    		this.funcCont++;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}