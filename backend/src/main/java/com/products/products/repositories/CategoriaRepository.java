package com.products.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
