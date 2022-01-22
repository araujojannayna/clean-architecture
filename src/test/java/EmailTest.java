import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    public void whenCreateAnInvalidEmailThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email(" "));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid_email"));
    }

    @Test
    public void whenCreatAValidEmailDoNothing(){
        assertDoesNotThrow(() -> new Email("teste@email.com"));
    }

}