package school;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Document {

    private String number;

    public Document(String number){
        if(number == null || !number.matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))
            throw new IllegalArgumentException("school.Document is not valid!");
        this.number = number;
    }
}
