package com.tf.upcstore.clientes.infrastructure.persistance.repositories;

import com.tf.upcstore.clientes.domain.aggregates.favoritos.Favoritos;
import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;
import com.tf.upcstore.clientes.domain.aggregates.product.Product;
import com.tf.upcstore.clientes.infrastructure.persistance.entities.FavoritosEntity;
import com.tf.upcstore.clientes.infrastructure.persistance.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface  FavoritosEntityRepository extends CrudRepository<FavoritosEntity,Long> {


}
