package com.tf.upcstore.clientes.domain.events;

import com.tf.upcstore.clientes.domain.aggregates.product.NameProduct;

public class ProductoEncontrado extends BaseEvent<String> {
    private NameProduct nombre;

    public ProductoEncontrado(String id,NameProduct name) {
        super(id);
        nombre = name;
    }
}
