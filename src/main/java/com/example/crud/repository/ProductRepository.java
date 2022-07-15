package com.example.crud.repository;

import com.example.crud.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>,ProductCustomRepository {
    Product findByName(String name);

}
