package school;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Email {

    private String address;

    public Email(String address){
        if(address == null || !address.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("school.Email is not valid!");
       }
        this.address = address;
    }
}
