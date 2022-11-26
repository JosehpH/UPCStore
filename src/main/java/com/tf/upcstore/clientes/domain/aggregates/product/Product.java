package com.tf.upcstore.clientes.domain.aggregates.product;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.spring.stereotype.Aggregate;

@Data
@Slf4j
public class Product {
    private IdProduct id;
    private NameProduct nombre;
    private Supermarket supermercado;
    private Precio precio;
    private Category categoria;
    private Marca marca;
}
