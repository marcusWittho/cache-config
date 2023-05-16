package com.demo.cache.repository;

import com.demo.cache.model.ProductModel;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

  public Map<Long, ProductModel> getProducts() {

    Map<Long, ProductModel> products = new HashMap<>() {
      {
        put(1L, new ProductModel(1L, "product01", "product01 description"));
        put(2L, new ProductModel(2L, "product02", "product02 description"));
        put(3L, new ProductModel(3L, "product03", "product03 description"));
        put(4L, new ProductModel(4L, "product04", "product04 description"));
        put(5L, new ProductModel(5L, "product05", "product05 description"));
      }
    };

    return products;
  }
}
