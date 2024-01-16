package com.Ecommerce.Shopnow.services.product;
import com.Ecommerce.Shopnow.dto.product.ProductRequest;
import com.Ecommerce.Shopnow.dto.product.ProductResponse;
import com.Ecommerce.Shopnow.entities.Product;
import com.Ecommerce.Shopnow.exceptions.RecordNotFoundException;
import com.Ecommerce.Shopnow.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductResponse mapProductToResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(Math.toIntExact(product.getId()));
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setStockQuantity(product.getStockQuantity());
        return response;
    }

    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        Product newProduct = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .stockQuantity(productRequest.getStockQuantity())
                .build();

        Product savedProduct = productRepository.save(newProduct);

        return mapProductToResponse(savedProduct);
    }

    @Override
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();

        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product product : products) {
            ProductResponse productResponse = mapProductToResponse(product);
            productResponses.add(productResponse);
        }

        return productResponses;
    }

    @Override
    public ProductResponse getproduct(int id) {
        return null;
    }


    @Override
    public ProductResponse getProduct(int productId) {
        String errorMessage = String.format("Product with id %d not found", productId);
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RecordNotFoundException(errorMessage));

        return mapProductToResponse(product);
    }
}
