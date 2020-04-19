package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Student;
import com.project.repositories.StudentRepository;

@Service
public class StudentService implements GenericService<Student>{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getByID(Long id) {
		return studentRepository.getOne(id);
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public void delete(Student student) {
		studentRepository.delete(student);
	}

	@Override
	public void update(Student student) {
		studentRepository.save(student);
	}
	

}
