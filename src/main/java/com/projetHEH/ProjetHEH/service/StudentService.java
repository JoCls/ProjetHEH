package com.projetHEH.ProjetHEH.service;

import com.projetHEH.ProjetHEH.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();


}
