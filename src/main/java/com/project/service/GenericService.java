package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface GenericService<T> {
	T getByID(Long id);
	void save(T t);
	List<T> getAll();
	void delete(T t);
	void update(T t);	
}
