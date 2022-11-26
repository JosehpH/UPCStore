package com.tf.upcstore.clientes.application.mappers;

import com.tf.upcstore.clientes.application.dtos.request.AgregarFavoritoRequest;
import com.tf.upcstore.clientes.domain.aggregates.product.*;
import com.tf.upcstore.clientes.infrastructure.persistance.entities.FavoritosEntity;
import com.tf.upcstore.clientes.infrastructure.persistance.entities.ProductoEntity;

public class ProductMapper{
  public  Product EntitytoDomain(ProductoEntity productoEntity){
       NameProduct nombre= new NameProduct();
       Supermarket supermercado = new Supermarket();
       Precio precio = new Precio();
       Category categoria = new Category();
       Marca marca = new Marca();

       nombre.setNombre(productoEntity.getNombre());
       supermercado.setNombre(productoEntity.getSupermercado());
       precio.setPrecio(productoEntity.getPrecio());
       categoria.setCategory(productoEntity.getCategoria());
       marca.setMarca(productoEntity.getMarca());

      Product producto = new Product();
      producto.setNombre(nombre);
      producto.setMarca(marca);
      producto.setPrecio(precio);
      producto.setCategoria(categoria);
      producto.setSupermercado(supermercado);

      return producto;
  }
  public  FavoritosEntity IdProductoToFavoritoEntity(IdProduct id){
      FavoritosEntity favorito = new FavoritosEntity();
      favorito.setFavorito(id.getId());
      return favorito;
  }

}
