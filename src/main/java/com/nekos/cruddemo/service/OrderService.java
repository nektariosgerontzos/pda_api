package com.nekos.cruddemo.service;

import com.nekos.cruddemo.entity.CafeTables;
import com.nekos.cruddemo.entity.Order;
import com.nekos.cruddemo.entity.OrderDetails;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService {

    List<Order> findAll();
    Order findById(int id);
    Order save(Order order);
    void deleteById(int id);
    Order update(int id, Order order);
    List<Order> findOrdersByTable(int id); // id defines the Table id

    List<OrderDetails> getOrderDetails(Integer orderId);

}
