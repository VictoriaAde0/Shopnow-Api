package com.Ecommerce.Shopnow.repositories;
import com.Ecommerce.Shopnow.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order>{
}
