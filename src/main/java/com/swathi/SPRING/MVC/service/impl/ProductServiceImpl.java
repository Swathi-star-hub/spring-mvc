package com.swathi.SPRING.MVC.service.impl;

import com.swathi.SPRING.MVC.entity.Product;
import com.swathi.SPRING.MVC.repo.ProductRepo;
import com.swathi.SPRING.MVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo repo;
    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public Product getProductById(Integer  id) {
        Optional<Product> optional= repo.findById(id);
        Product product = null;
        if(optional.isPresent()){
           product= optional.get();
        }else{
            throw new RuntimeException("product not found for id"+id);
        }
        return product;
    }
}
