package com.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Professor;
import com.project.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController extends GenericRestController<Professor>{

	public ProfessorController() {
		super.service = new ProfessorService();
	}
}
