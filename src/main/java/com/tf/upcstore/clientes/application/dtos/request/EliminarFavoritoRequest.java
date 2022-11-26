package com.tf.upcstore.clientes.application.dtos.request;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;
import lombok.Data;

@Data
public class EliminarFavoritoRequest {
    private Long id;
    public EliminarFavoritoRequest(Long _id){
        id = _id;
    }
    public  Long getIdProduct(){
        return id;
    }
}
