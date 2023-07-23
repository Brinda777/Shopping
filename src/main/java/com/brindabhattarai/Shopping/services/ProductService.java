package com.brindabhattarai.Shopping.services;

import com.brindabhattarai.Shopping.entity.Product;
import com.brindabhattarai.Shopping.pojo.ProductPojo;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    ProductPojo saveProduct(ProductPojo productpojo) throws IOException;

    Product fetchById(Integer id);

    List <Product> fetchAll();

    void deleteById(Integer id);



}
