package br.com.cleanarch.school.core.domain.student;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Telephone {

    private String telephone;

    public Telephone(String telephone){
        if(telephone == null || !telephone.matches("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$")){
            throw new IllegalArgumentException("Telephone is not valid!");
        }
        this.telephone = telephone;
    }
}
