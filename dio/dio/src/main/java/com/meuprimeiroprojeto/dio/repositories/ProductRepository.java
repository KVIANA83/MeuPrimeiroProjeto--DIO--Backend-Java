package com.meuprimeiroprojeto.dio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuprimeiroprojeto.dio.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}