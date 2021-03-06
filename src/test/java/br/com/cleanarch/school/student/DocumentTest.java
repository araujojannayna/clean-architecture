package br.com.cleanarch.school.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.com.cleanarch.school.core.domain.student.Document;


class DocumentTest {

    @Test
    void whenCreateInvalidDocumentThrowsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(" "));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document("123-1233"));
    }

    @Test
    void whenCreateAValidDocumentDoNothing(){
        Assertions.assertDoesNotThrow(() -> new Document("100.080.654-54"));
    }

}