package com.example.crud.service;

import com.example.crud.entity.Product;
import com.example.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public Product updateProduct(Product product){
        Product exProduct = repository.findById(product.getId()).orElse(null);
        exProduct.setName(product.getName());
        exProduct.setPrice(product.getPrice());
        exProduct.setId(product.getId());
        return repository.save(exProduct);
    }

    public String deleteProductById(int id){
        repository.deleteById(id);
        return "product removed!!";
    }


}
