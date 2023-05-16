package com.demo.cache.service;

import com.demo.cache.model.ProductModel;
import com.demo.cache.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

  public ProductService() {}

  private void latency() {
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public ProductModel getProductById(Long id) {
    ProductRepository repository = new ProductRepository();
    System.out.println("loading...");
    latency();
    return repository.getProducts().get(id);
  }

  @Bean
  public List<ProductModel> productsList() {
    List<ProductModel> list = new ArrayList<>();

    list.add(getProductById(1L));
    list.add(getProductById(2L));
    list.add(getProductById(3L));
    list.add(getProductById(4L));
    list.add(getProductById(5L));

    return list;
  }
}
