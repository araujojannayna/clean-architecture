package br.com.cleanarch.school.core.exceptions;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String document){
        super("Student with the document number " + document + " not found!");
    }
}
