package br.com.cleanarch.school.core.domain.student;

import lombok.Getter;

@Getter
public class StudentFactory {

    private Student student;

    public StudentFactory withNameAndDocumentAndEmail(String name, String document, String email){
        if(this.student == null) this.student = Student.builder().build();
        this.student.setName(name);
        this.student.setDocument(Document.builder().number(document).build());
        this.student.setEmail(Email.builder().address(email).build());
        return this;
    }

    public StudentFactory withTelephone(String telephone){
        if(this.student == null) this.student = Student.builder().build();
        this.student.addTelephone(Telephone.builder().telephone(telephone).build());
        return this;
    }
}
