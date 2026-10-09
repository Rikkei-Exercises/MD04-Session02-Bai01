package com.example.orderservice.service;

import com.example.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getHealthCheck() {
        return "Order Service is Up";
    }
}
