package com.shoppingApp.productservice3.service;

import com.shoppingApp.productservice3.repository.ProductRepository;
import com.shoppingApp.productservice3.dto.ProductRequest;
import com.shoppingApp.productservice3.dto.ProductResponse;
import com.shoppingApp.productservice3.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);  // saving product in database
        log.info("Product {} is saved", product.getId());
    }
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
        log.info("Product {} is deleted", productId);
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
