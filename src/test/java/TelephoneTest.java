import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.Telephone;

class TelephoneTest {

    @Test
    void whenCreateInvalidTelephoneThrowsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(" "));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("123-1233"));
    }

    @Test
    void whenCreateAValidTelephoneDoNothing(){
        Assertions.assertDoesNotThrow(() -> new Telephone("(99) 99999-9999"));
    }

}