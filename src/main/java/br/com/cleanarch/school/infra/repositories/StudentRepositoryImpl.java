package br.com.cleanarch.school.infra.repositories;

import br.com.cleanarch.school.core.domain.student.Student;
import br.com.cleanarch.school.core.exceptions.StudentNotFoundException;
import br.com.cleanarch.school.core.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private List<Student> students = new ArrayList<>();

    @Override
    public void register(Student student) {
        this.students.add(student);
    }

    @Override
    public Student findByDocument(String document) {
        return this.students.stream().filter(x -> document.equals(x.getDocument().getNumber()))
                .findFirst().orElseThrow(() -> new StudentNotFoundException(document));
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }
}
