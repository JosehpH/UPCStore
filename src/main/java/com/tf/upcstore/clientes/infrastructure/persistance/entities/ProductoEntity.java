package com.tf.upcstore.clientes.infrastructure.persistance.entities;

import com.tf.upcstore.clientes.domain.aggregates.product.*;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="products")
public class ProductoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String  nombre;
    private String supermercado;
    private double precio;
    private String categoria;
    private String marca;
}
