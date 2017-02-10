package me.ele.pmo.soa.sample.service;

import me.ele.pmo.soa.sample.model.Order;

import java.util.List;

/**
 * Created by leo on 06/02/2017.
 */
public interface OrderService {
    int save(Order order);

    Order get(int id);

    List<Order> all();
}
