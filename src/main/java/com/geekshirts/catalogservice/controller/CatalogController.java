package com.geekshirts.catalogservice.controller;

import com.geekshirts.catalogservice.domain.Product;
import com.geekshirts.catalogservice.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @Autowired
    private ProductRepository repository;

    @GetMapping(path = "/bestSellers")
    public List<Product> bestSellers() {
        return repository.findAll();
    }

    @PostMapping(path = "/addProduct")
    public void addProduct(@RequestBody Product product) {
        repository.save(product);
    }
}
