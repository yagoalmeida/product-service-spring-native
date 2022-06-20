package com.github.yagoalmeida.productservice.service;

import com.github.yagoalmeida.productservice.entity.Product;
import com.github.yagoalmeida.productservice.exceptions.ProductNotFoundException;
import com.github.yagoalmeida.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ProductService(ProductRepository repository) {

    public Product getById(final Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void crate(final Product product) {
        repository.save(product);
    }

    public void deleteById(final Long id) {
        repository.deleteById(id);
    }
}