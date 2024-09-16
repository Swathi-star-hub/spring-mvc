package com.swathi.SPRING.MVC.repo;

import com.swathi.SPRING.MVC.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
