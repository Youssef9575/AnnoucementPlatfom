package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
