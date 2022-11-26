package com.tf.upcstore.clientes.application.handlers.queries;

import com.tf.upcstore.clientes.infrastructure.persistance.repositories.ProductEntityRepository;
import org.springframework.http.ResponseEntity;

public class GetProductHandler {
    private final ProductEntityRepository productRepository;
    public GetProductHandler(ProductEntityRepository productRepository){
        this.productRepository = productRepository;
    }
    public ResponseEntity<Object> getAllProducts(){
        return (ResponseEntity<Object>)productRepository.findAll();
    }
}
