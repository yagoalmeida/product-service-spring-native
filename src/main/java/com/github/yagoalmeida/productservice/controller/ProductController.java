package com.github.yagoalmeida.productservice.controller;

import com.github.yagoalmeida.productservice.entity.Product;
import com.github.yagoalmeida.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public record ProductController(ProductService service) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody final Product product) {
        service.crate(product);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product getProduct(@PathVariable("id") final Long id) {
        return service.getById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Product> list() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable("id") final Long id) {
        service.deleteById(id);
    }
}
