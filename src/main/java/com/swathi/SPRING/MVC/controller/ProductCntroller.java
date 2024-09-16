package com.swathi.SPRING.MVC.controller;

import com.swathi.SPRING.MVC.entity.Product;
import com.swathi.SPRING.MVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductCntroller {

    @Autowired
    private ProductService productService;



    @GetMapping("/showNewProductForm")
    public String Form(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "Add_Product";
    }

    @PostMapping("/save")
    public String saveProduct(Model model, Product product){
        model.addAttribute("product",product);
        productService.save(product);
        return "Add_Product";
    }
    @GetMapping("/")
    public String fetchAll(Model m){
        m.addAttribute("list",productService.getAll());
        return "index";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable(value=" id") Integer id,Model model){
        Product product=productService.getProductById(id);
        model.addAttribute(" product" ,product);
        return "Edit_Product";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value=" id") Integer id,Model model){
       this.productService.getProductById(id);
        return "redirect:/";
    }




}
