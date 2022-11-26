package com.tf.upcstore.clientes.domain.aggregates.product;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
public class IdProduct {
    private Long id;
    IdProduct(Long _id){
        id = _id;
    }
}
