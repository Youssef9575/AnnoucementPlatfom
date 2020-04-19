package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
