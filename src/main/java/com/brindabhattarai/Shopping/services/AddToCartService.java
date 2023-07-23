package com.brindabhattarai.Shopping.services;

import com.brindabhattarai.Shopping.entity.MyCart;
import com.brindabhattarai.Shopping.pojo.AddToCartPojo;

import java.util.List;

public interface AddToCartService {

    List<MyCart> fetchAll(Integer id);



    AddToCartPojo saveToCart(AddToCartPojo addToCartPojo);

    MyCart fetchById(Integer id);

    String updateQuantity(MyCart productCart);

    void deleteFromCart(Integer id);
    MyCart fetchOne(Integer id);

    AddToCartPojo save(AddToCartPojo productCartPojo);
}
