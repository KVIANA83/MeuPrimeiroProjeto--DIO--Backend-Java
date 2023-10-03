package com.meuprimeiroprojeto.dio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuprimeiroprojeto.dio.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
