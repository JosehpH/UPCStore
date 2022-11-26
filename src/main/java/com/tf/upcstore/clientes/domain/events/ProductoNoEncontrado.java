package com.tf.upcstore.clientes.domain.events;

import com.tf.upcstore.clientes.domain.aggregates.product.NameProduct;


public class ProductoNoEncontrado extends BaseEvent<String> {
    private NameProduct nombre;

    public ProductoNoEncontrado(NameProduct nombre,String idBase) {
        super(idBase);
        this.nombre = nombre;
    }
}
