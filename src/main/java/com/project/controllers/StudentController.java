package com.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Student;
import com.project.service.StudentService;

@RestController
@RequestMapping(value = "/student")

public class StudentController extends GenericRestController<Student>{

	public StudentController() {
		super.service = new StudentService();
	}
}
