package com.Ecommerce.Shopnow.services.product;

import com.Ecommerce.Shopnow.dto.product.ProductRequest;
import com.Ecommerce.Shopnow.dto.product.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getProducts();

    ProductResponse getproduct(int id);

    ProductResponse getProduct(int productId);
}
