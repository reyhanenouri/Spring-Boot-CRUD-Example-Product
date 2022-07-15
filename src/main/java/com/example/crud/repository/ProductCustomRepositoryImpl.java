package com.example.crud.repository;

import com.example.crud.domain.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
@Transactional(readOnly = true)
public class ProductCustomRepositoryImpl implements ProductCustomRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Product> getProductsLike(String name) {
        Query query = entityManager.createNativeQuery("SELECT pr.* FROM product as pr WHERE pr.product_name LIKE ?", Product.class);
        query.setParameter(1, name + "%");

        return query.getResultList();
    }
}
