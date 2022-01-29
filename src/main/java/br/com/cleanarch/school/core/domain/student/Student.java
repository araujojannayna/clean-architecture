package br.com.cleanarch.school.core.domain.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Student {

    private String name;
    private Document document;
    private Email email;
    private List<Telephone> telephones = new ArrayList<>();

    public void addTelephone(Telephone telephone){
        this.telephones.add(telephone);
    }

}
