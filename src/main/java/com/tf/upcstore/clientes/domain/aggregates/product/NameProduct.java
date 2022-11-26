package com.tf.upcstore.clientes.domain.aggregates.product;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
public class NameProduct {
    private String nombre;
}
