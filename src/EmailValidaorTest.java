import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidaorTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "mail", "mail@mail", "mail@mail.com"})
    public void verificaSeEmailEhValido(String email) {
        assertTrue(EmailValidador.validar(email), "Valor a ser testado: " + email);
    }
}
