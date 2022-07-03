package com.products.products.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.products.models.Categoria;
import com.products.products.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
