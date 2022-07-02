package com.products.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
