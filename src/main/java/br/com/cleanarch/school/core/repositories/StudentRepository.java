package br.com.cleanarch.school.core.repositories;

import br.com.cleanarch.school.core.domain.student.Student;

import java.util.List;

public interface StudentRepository {

    public void register(Student student);

    public Student findByDocument(String document);

    public List<Student> findAll();
}
