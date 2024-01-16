package com.Ecommerce.Shopnow.services.order;
import com.Ecommerce.Shopnow.dto.order.OrderRequest;
import com.Ecommerce.Shopnow.dto.order.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest orderRequest);
    List<OrderResponse> getOrders();
    OrderResponse getOrder(int orderId);
}
