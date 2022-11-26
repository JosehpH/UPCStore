package com.tf.upcstore.clientes.domain.aggregates.favoritos;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;
import com.tf.upcstore.clientes.domain.aggregates.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Favoritos {
    private ArrayList<Product>favoritos;
}
