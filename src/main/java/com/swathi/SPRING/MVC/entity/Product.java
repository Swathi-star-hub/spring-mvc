package com.swathi.SPRING.MVC.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product_dtls")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="price")
    private Double price;

    @Column(nullable= true,length= 64)
    private String photos;

    @Transient
    public String getPhotosImagePath() {
        if(photos == null)
            return null;
        return "/product-photos/"+ id+ "/" +photos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }






}
