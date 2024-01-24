package com.projetHEH.ProjetHEH.repository;

import com.projetHEH.ProjetHEH.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>{
}
