package com.meuprimeiroprojeto.dio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meuprimeiroprojeto.dio.entities.Category;
import com.meuprimeiroprojeto.dio.entities.Product;
import com.meuprimeiroprojeto.dio.repositories.CategoryRepository;
import com.meuprimeiroprojeto.dio.repositories.ProductRepository;


@SpringBootApplication
public class DioApplication implements CommandLineRunner{
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private ProductRepository productRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(DioApplication.class, args);
    }
    
    @Override
    public void rud(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");

        Product p1 = new Product(null, "TV", 2200.00, cat1);
        Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
        Product p3 = new Product(null, "PS5", 2800.00, cat1);
        Product p4 = new Product(null, "Docker", 100.00, cat2);

        cat1.getProducts().addAll(Arrays.asList(p1, p3));
        cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
		
        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
    }
}
