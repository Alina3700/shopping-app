package com.shoppingApp.productservice3.repository;

import com.shoppingApp.productservice3.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> { //String, cause it's the type of Id field

}
