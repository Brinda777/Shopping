package com.brindabhattarai.Shopping.services;

import com.brindabhattarai.Shopping.entity.Order;
import com.brindabhattarai.Shopping.pojo.OrderPojo;

import java.io.IOException;
import java.util.List;

public interface OrderService {
    OrderPojo saveOrder(OrderPojo orderPojo) throws IOException;

    List<Order> fetchAll();

    Order fetchById(Integer id);


    List<Order> findBookingById(Integer id);
}
