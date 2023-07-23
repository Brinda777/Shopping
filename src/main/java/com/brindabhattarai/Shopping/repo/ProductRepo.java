package com.brindabhattarai.Shopping.repo;

import com.brindabhattarai.Shopping.entity.Order;
import com.brindabhattarai.Shopping.entity.Product;
import com.brindabhattarai.Shopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository < Product, Integer>{
//    Optional<Product> findProductByName(String name);
}


