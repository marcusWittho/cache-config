package com.demo.cache.controller;

import com.demo.cache.model.ProductModel;
import com.demo.cache.service.ProductService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

  @GetMapping("/hello")
  @Cacheable("products")
  public List<ProductModel> getAllProducts() {
    ProductService service = new ProductService();
    return service.productsList();
  }

  @GetMapping("/cancel")
  @CacheEvict(cacheNames = "products")
  public String cleanCache() {
    System.out.println("Limpando o cache...");
    return "Cache removido";
  }
}
