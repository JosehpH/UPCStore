package com.tf.upcstore.clientes.infrastructure.persistance.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "favoritos")
public class FavoritosEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long favorito;
}
