import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DocumentTest {

    @Test
    void whenCreateInvalidDocumentThrowsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(null, DocumentType.RG));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document("", DocumentType.RG));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(" ", DocumentType.RG));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document("123-1233", DocumentType.RG));

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(null, DocumentType.CPF));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document("", DocumentType.CPF));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document(" ", DocumentType.CPF));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Document("112145531T53535", DocumentType.CPF));
    }

    @Test
    void whenCreateAValidDocumentDoNothing(){
        Assertions.assertDoesNotThrow(() -> new Document("1234456", DocumentType.RG));
        Assertions.assertDoesNotThrow(() -> new Document("100.080.654-54", DocumentType.CPF));
    }

}