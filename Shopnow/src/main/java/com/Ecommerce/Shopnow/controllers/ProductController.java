package com.Ecommerce.Shopnow.controllers;
import com.Ecommerce.Shopnow.dto.product.ProductRequest;
import com.Ecommerce.Shopnow.dto.product.ProductResponse;
import com.Ecommerce.Shopnow.services.product.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {this.productService = productService; }

    @PostMapping("")
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody ProductRequest productRequest) {
       ProductResponse createdProduct = productService.createProduct(productRequest);
       return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @GetMapping("")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        List<ProductResponse> products = productService.getProducts();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable int id) {
        ProductResponse productResponse = productService.getproduct(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
}
