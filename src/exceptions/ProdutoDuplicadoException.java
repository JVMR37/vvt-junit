package exceptions;

public class ProdutoDuplicadoException extends RuntimeException {

    public ProdutoDuplicadoException(String message) {
        super(message);
    }
}