package com.Ecommerce.Shopnow.controllers;
import com.Ecommerce.Shopnow.dto.order.OrderRequest;
import com.Ecommerce.Shopnow.dto.order.OrderResponse;
import com.Ecommerce.Shopnow.services.order.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("")
    public ResponseEntity<OrderResponse> createOrder(@Valid @RequestBody OrderRequest orderRequest) {
        OrderResponse createdOrder = orderService.createOrder(orderRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable int id){
        OrderResponse orderResponse = orderService.getOrder(id);
        return ResponseEntity.status(HttpStatus.OK).body(orderResponse);
    }
}
