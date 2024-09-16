package com.swathi.SPRING.MVC.service;

import com.swathi.SPRING.MVC.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
    Product getProductById(Integer  id);
}
