package com.project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.service.GenericService;


public class GenericRestController<T> {
	
	public GenericService<T> service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> list() {
		return service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody T entity) {
		service.save(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public void update(@RequestBody T entity) {
		service.update(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody T entity) {
		service.delete(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public T get(@PathVariable(value = "id") long id) {
		return service.getByID(id);
	}
}