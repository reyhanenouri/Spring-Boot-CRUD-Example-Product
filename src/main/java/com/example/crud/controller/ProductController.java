package com.example.crud.controller;

import com.example.crud.domain.Product;
import com.example.crud.repository.ProductRepository;
import com.example.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    @Autowired
    private ProductRepository repo;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/findAllProduct")
    public List<Product> findAllProduct() {
        return service.getAllProducts();
    }

    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/findProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateExProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProductById(id);
    }

    @RequestMapping("/findProductsLike/{name}")
    public List<Product> findProductsLike(@PathVariable String name) {
        return repo.getProductsLike(name);
    }
}
