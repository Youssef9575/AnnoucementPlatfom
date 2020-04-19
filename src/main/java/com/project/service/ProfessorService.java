package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Professor;
import com.project.repositories.ProfessorRepository;

@Service
public class ProfessorService implements GenericService<Professor>{
	@Autowired
	ProfessorRepository professorRepository;

	 public ProfessorService() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Professor getByID(Long id) {
		return professorRepository.getOne(id);
	}

	@Override
	public void save(Professor professor) {
		professorRepository.save(professor);
	}

	@Override
	public List<Professor> getAll() {
		return professorRepository.findAll();
	}

	@Override
	public void delete(Professor professor) {
		professorRepository.delete(professor);
	}

	@Override
	public void update(Professor professor) {
		professorRepository.save(professor);
	}
	

}
