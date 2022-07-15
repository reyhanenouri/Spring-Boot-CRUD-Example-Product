package com.example.crud.repository;

import com.example.crud.domain.Product;

import java.util.List;

public interface ProductCustomRepository {

    List<Product> getProductsLike(String name);
}
